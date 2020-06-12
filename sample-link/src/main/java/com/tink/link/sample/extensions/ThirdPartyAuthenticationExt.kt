package com.tink.link.sample.extensions

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.tink.link.sample.R
import com.tink.model.authentication.ThirdPartyAppAuthentication

fun ThirdPartyAppAuthentication.launch(activity: Activity, onCancel: (() -> Unit)? = null) {
    val thirdPartyAuthenticationAndroid = requireNotNull(android)

    val thirdPartyIntent = Intent().apply {
        action = Intent.ACTION_VIEW
        data = Uri.parse(thirdPartyAuthenticationAndroid.intent)
        addCategory("android.intent.category.BROWSABLE")
        addCategory("android.intent.category.DEFAULT")
    }

    try {
        activity.startActivityForResult(thirdPartyIntent, 0)
    } catch (exception: ActivityNotFoundException) {
        val launchByPackageIntent = activity.packageManager
            .getLaunchIntentForPackage(thirdPartyAuthenticationAndroid.packageName)
        if (launchByPackageIntent != null) {
            activity.startActivityForResult(launchByPackageIntent, 0)
        } else {
            showInstallDialog(
                activity,
                downloadTitle,
                downloadMessage,
                thirdPartyAuthenticationAndroid.packageName,
                onCancel
            )
        }
    }
}

private fun showInstallDialog(
    activity: Activity,
    title: String,
    message: String,
    packageName: String,
    onCancel: (() -> Unit)? = null
) {
    MaterialAlertDialogBuilder(activity)
        .apply {
            setTitle(title)
            setMessage(message)
            setPositiveButton(
                activity.getString(R.string.third_party_authentication_download_app_positive)
            ) { _, _ ->
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("https://play.google.com/store/apps/details?id=$packageName")
                    setPackage("com.android.vending")
                }
                activity.startActivity(intent)
            }
            setNegativeButton(
                activity.getString(R.string.third_party_authentication_download_app_negative)
            ) { _, _ -> onCancel?.invoke() }
        }
        .show()
}