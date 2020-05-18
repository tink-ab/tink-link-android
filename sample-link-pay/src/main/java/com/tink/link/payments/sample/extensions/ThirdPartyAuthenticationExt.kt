package com.tink.link.payments.sample.extensions

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
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
            TODO()
        }
    }
}
