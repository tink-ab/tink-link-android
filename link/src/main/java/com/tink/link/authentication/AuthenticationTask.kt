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

/**
 * Represents an authentication that needs to be completed by the user.
 *
 * The possible values are [SupplementalInformation] and [ThirdPartyAppAuthentication]
 */
sealed class AuthenticationTask : Parcelable {
    internal abstract val credentials: Credentials

    /**
     * Indicates that there is additional information required from the user to proceed. This can
     * for example be an OTP sent via SMS or authetication app.
     * First the [fields] should be made accessible to the user for example as text input fields.
     * Then [submit] should be called as soon as the fields have been validated and the user is
     * ready to send the information.
     *
     */
    @Parcelize
    data class SupplementalInformation(
        override val credentials: Credentials
    ) : AuthenticationTask() {

        /**
         * The fields that need to be displayed to the user for input
         */
        @IgnoredOnParcel
        val fields: List<Field> = credentials.supplementalInformation
            .also {
                require(it.isNotEmpty()) { "Supplemental information fields were empty." }
            }

        /**
         * Submit supplemental information for the authentication to Tink.
         * Should be called as soon as the fields have been validated and the user is
         * ready to send the information.
         *
         * @param filledFields A key-value map of the supplemental information. The key should
         * always be [Field.name] from [fields] and the value should be the user input of that
         * field.
         */
        fun submit(filledFields: Map<String, String>, resultHandler: ResultHandler<Unit>) {
            Tink.requireUserContext().credentialsRepository
                .supplementInformation(credentials.id, filledFields, resultHandler)
        }

        /**
         * Cancel the ongoing supplemental information task. This can be used to fail the
         * authentication should the user back out of the authentication. If not called, the
         * authentication will time out on its own. This is a shortcut to be able to get into a
         * failed state faster and thus be able to retry more quickly.
         */
        fun cancel(resultHandler: ResultHandler<Unit>) {
            Tink.requireUserContext().credentialsRepository
                .cancelSupplementalInformation(credentials.id, resultHandler)
        }
    }

    /**
     * Indicates that there is an authentication in a third party app or in the browser necessary
     * to proceed with the authentication.
     * The user can be sent to redirected by calling [launch], or you can provide a custom redirection
     * logic with the use of the data in [thirdPartyAppAuthentication]
     */
    @Parcelize
    data class ThirdPartyAuthentication(
        override val credentials: Credentials
    ) : AuthenticationTask() {
        @IgnoredOnParcel
        val thirdPartyAppAuthentication = requireNotNull(credentials.thirdPartyAppAuthentication) {
            "Third party authentication data could not be found."
        }

        /**
         * Try to redirect the user to the third party app for authentication.
         *
         * @return a [LaunchResult] that indicates if the user was successfully redirected.
         */
        fun launch(
            activity: Activity
        ): LaunchResult {
            with(thirdPartyAppAuthentication) {
                val thirdPartyAuthenticationAndroid = requireNotNull(android)
                val packageName = thirdPartyAuthenticationAndroid.packageName

                if (appNeedsUpgrade(activity, thirdPartyAuthenticationAndroid)) {
                    return LaunchResult.AppNeedsUpgrade(
                        packageName = packageName,
                        title = upgradeTitle,
                        message = upgradeMessage
                    )
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
                    val launchByPackageIntent =
                        activity.packageManager.getLaunchIntentForPackage(packageName)
                    if (launchByPackageIntent != null) {
                        activity.startActivityForResult(launchByPackageIntent, 0)
                    } else {
                        // The activity was not found on the device.
                        return LaunchResult.AppNotInstalled(
                            packageName = packageName,
                            title = downloadTitle,
                            message = downloadMessage
                        )
                    }
                }
                return LaunchResult.Success
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

        /**
         * Indicates if the user was successfully redirected when [launch] was called.
         *
         * Possible values are [Success], [AppNotInstalled], and [AppNeedsUpgrade]
         *
         */
        sealed class LaunchResult : Parcelable {

            /**
             * The user has successfully been redirected to the third party app.
             */
            @Parcelize
            object Success : LaunchResult()

            /**
             * The app necessary for authentication is not installed on the user's device.
             *
             * Properties [packageName], [title], and [message] can be used for example to show
             * a dialog to the user prompting to install the app.
             *
             */
            @Parcelize
            data class AppNotInstalled(
                val packageName: String,
                val title: String,
                val message: String
            ) : LaunchResult()

            /**
             * The app necessary for authentication is installed on the users device but needs to
             * be updated.
             *
             * Properties [packageName], [title], and [message] can be used for example to show
             * a dialog to the user prompting to upgrade the app.
             *
             */
            @Parcelize
            data class AppNeedsUpgrade(
                val packageName: String,
                val title: String,
                val message: String
            ) : LaunchResult()
        }
    }

    /**
     * Helper function comparing two [AuthenticationTask]s to see if one is newer than
     * that the other. This can be used to determine if a new update should be sent.
     * This is for internal use in the Tink Sdk and it should not be necessary to use it otherwise.
     */
    fun isNewerThan(other: AuthenticationTask): Boolean {
        return credentials.statusUpdated > other.credentials.statusUpdated
    }
}
