package com.tink.link.authentication

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Parcelable
import com.tink.core.Tink
import com.tink.link.requireUserContext
import com.tink.model.authentication.ThirdPartyAppAuthentication
import com.tink.model.credentials.Credentials
import com.tink.model.misc.Field
import com.tink.service.handler.ResultHandler
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize

sealed class AuthOperation: Parcelable {
    internal abstract val credentials: Credentials

    @Parcelize
    data class SupplementalInformation(
        override val credentials: Credentials
    ) : AuthOperation() {
        @IgnoredOnParcel
        val fields: List<Field> = credentials.supplementalInformation
            .also {
                require(it.isNotEmpty()) { "Supplemental information fields were empty."}
            }

        fun submit(filledFields: Map<String, String>, resultHandler: ResultHandler<Unit>) {
            Tink.requireUserContext().credentialsRepository
                .supplementInformation(credentials.id, filledFields, resultHandler)
        }

        fun cancel(resultHandler: ResultHandler<Unit>) {
            Tink.requireUserContext().credentialsRepository
                .cancelSupplementalInformation(credentials.id, resultHandler)
        }
    }

    @Parcelize
    data class ThirdPartyAuthentication(
        override val credentials: Credentials
    ) : AuthOperation() {
        @IgnoredOnParcel
        val thirdPartyAppAuthentication = requireNotNull(credentials.thirdPartyAppAuthentication) {
            "Third party authentication data could not be found."
        }

        fun launch(
            activity: Activity,
            onAppNotInstalled: (AppInfo) -> Unit,
            onAppNeedsUpgrade: (AppInfo) -> Unit
        ) {
            with(thirdPartyAppAuthentication) {
                val thirdPartyAuthenticationAndroid = requireNotNull(android)
                val packageName = thirdPartyAuthenticationAndroid.packageName

                if (appNeedsUpgrade(activity, thirdPartyAuthenticationAndroid)) {
                    onAppNeedsUpgrade(
                        AppInfo(
                            packageName = packageName,
                            title = upgradeTitle,
                            message = upgradeMessage
                        )
                    )
                    return@launch
                }

                // Creates a launch intent from the intent uri
                val thirdPartyIntent = Intent().apply {
                    action = Intent.ACTION_VIEW
                    data = Uri.parse(thirdPartyAuthenticationAndroid.intent)
                    addCategory("android.intent.category.BROWSABLE")
                    addCategory("android.intent.category.DEFAULT")
                }

                // Attempt to start the third party app activity defined by the intent.
                try {
                    activity.startActivityForResult(thirdPartyIntent, 0)
                } catch (exception: ActivityNotFoundException) {
                    // See if it works by package name instead.
                    val launchByPackageIntent = activity.packageManager
                        .getLaunchIntentForPackage(packageName)
                    if (launchByPackageIntent != null) {
                        activity.startActivityForResult(launchByPackageIntent, 0)
                    } else {
                        // The activity was not found on the device.
                        onAppNotInstalled(
                            AppInfo(
                                packageName = packageName,
                                title = downloadTitle,
                                message = downloadMessage
                            )
                        )
                        return@launch
                    }
                }
            }
        }

        /**
         * Check if the app is already installed and has version lower than the minimum allowed.
         * This means that we need to upgrade.
         */
        private fun appNeedsUpgrade(
            activity: Activity,
            thirdPartyAuthenticationAndroid: ThirdPartyAppAuthentication.Android
        ): Boolean =
            thirdPartyAuthenticationAndroid.packageName
                .takeIf { it.isNotBlank() }
                ?.let { activity.packageManager.getPackageInfo(it, 0) }
                ?.takeIf { it.versionCode < thirdPartyAuthenticationAndroid.requiredMinimumVersion }
                ?.let { true } ?: false

        @Parcelize
        data class AppInfo(
            val packageName: String,
            val title: String,
            val message: String
        ) : Parcelable
    }

    fun isNewerThan(other: AuthOperation): Boolean {
        return credentials.statusUpdated > other.credentials.statusUpdated
    }
}
