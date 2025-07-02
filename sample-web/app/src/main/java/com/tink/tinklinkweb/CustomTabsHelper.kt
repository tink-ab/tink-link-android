package com.tink.tinklinkweb
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import androidx.browser.customtabs.CustomTabColorSchemeParams
import androidx.browser.customtabs.CustomTabsCallback
import androidx.browser.customtabs.CustomTabsClient
import androidx.browser.customtabs.CustomTabsIntent
import androidx.browser.customtabs.CustomTabsServiceConnection
import androidx.browser.customtabs.CustomTabsSession
import androidx.core.graphics.toColorInt
import androidx.core.net.toUri

/**
* Helper class for managing Android Custom Tabs functionality.
*
* This class provides a simplified interface for working with Custom Tabs, including
* service binding, URL preloading, and launching custom tabs with predefined styling.
* Custom Tabs provide a faster and more integrated web browsing experience within apps.
* Implementation based on:
* [Android Custom Tabs Guide](https://developer.chrome.com/docs/android/custom-tabs/guide-get-started)
*/
class CustomTabsHelper() {

    private var mPreloadURLs: Array<String>? = null
    private var mClient: CustomTabsClient? = null
    private var mSession: CustomTabsSession? = null

    private val mConnection = object : CustomTabsServiceConnection() {
        override fun onCustomTabsServiceConnected(
            name: ComponentName,
            client: CustomTabsClient
        ) {
            mClient = client
            mClient?.warmup(0L)
            mSession = mClient?.newSession(CustomTabsCallback())
            mPreloadURLs?.forEach { url ->
                mSession?.mayLaunchUrl(url.toUri(), null, null)
            }
        }

        override fun onServiceDisconnected(name: ComponentName) {
            mClient = null
            mSession = null
        }
    }

    /**
     * Checks if Custom Tabs functionality is available on the device.
     *
     * This method queries the system to determine if there's a browser
     * installed that supports Custom Tabs service.
     *
     * @param context The context used to query the package manager
     * @return true if Custom Tabs is supported, false otherwise
    */
    fun isCustomTabsAvailable(context: Context): Boolean {
        return CustomTabsClient.getPackageName(context, null) != null
    }

    /**
     * Initializes and warms up the Custom Tabs service with URL preloading.
     * @param context The context used for service binding (Activity or Application)
     * @param preloadURLs Array of URLs to preload for faster access
     */
    fun warmupCustomTabService(context: Context, preloadURLs: Array<String>) {
        if (mClient != null && isCustomTabsAvailable(context)) {
            return
        }

        val packageName = CustomTabsClient.getPackageName(context, null)
        if (packageName == null) {
            return
        }
        mPreloadURLs = preloadURLs
        CustomTabsClient.bindCustomTabsService(context, packageName, mConnection)
    }

    /**
     * Opens a URL in a Custom Tab with predefined styling and behavior.
     * The Custom Tab will use the preloaded session if available, providing faster loading for URLs that were preloaded during warmup.
     * @param url The URL to open in the Custom Tab (must be a valid HTTP/HTTPS URL)
     * @param context The context used to launch the Custom Tab (typically an Activity)
     */
    fun openCustomTab(url: String, context: Context) {
        val customTabsIntent = CustomTabsIntent.Builder(mSession)
            .setDefaultColorSchemeParams(
                CustomTabColorSchemeParams.Builder()
                    .setToolbarColor("#1434CB".toColorInt())
                    .setNavigationBarColor("#FCC015".toColorInt())
                    .build()
            )
            .setShowTitle(true)
            .build()
        customTabsIntent.intent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS)
        customTabsIntent.intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
        customTabsIntent.intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        customTabsIntent.launchUrl(context, url.toUri())
    }
}