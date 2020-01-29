package com.tink.link.model.authentication

import android.os.Parcelable
import android.net.Uri
import android.content.Intent
import kotlinx.android.parcel.Parcelize

/**
 * This model contains information required for third party authentication flow.
 *
 * @property downloadMessage A user-friendly text requesting the user to download the application for third party app authentication
 * @property downloadTitle The title of the download application prompt shown to the users
 * @property upgradeMessage A user-friendly text requesting the user to upgrade the application for third party app authentication
 * @property upgradeTitle The title of the upgrade application prompt shown to the users
 * @property android The object containing Android specific information required to launch the third party application.
 */
@Parcelize
data class ThirdPartyAppAuthentication(
    val downloadMessage: String,
    val downloadTitle: String,
    val upgradeMessage: String,
    val upgradeTitle: String,
    val android: Android? = null
) : Parcelable {

    /**
     * This model contains Android specific information required to launch the third party application.
     *
     * @property intent A uri string that can be parsed into [Uri] and set as `data` for the [Intent] to launch the third party application. See [Intent.setData]
     * @property packageName The package name of the third party application
     * @property requiredMinimumVersion The minimum version of the third party application that needs to be installed on the device for the authentication flow
     */
    @Parcelize
    data class Android(
        val intent: String,
        val packageName: String,
        val requiredMinimumVersion: Int
    ) : Parcelable
}
