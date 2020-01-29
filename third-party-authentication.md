# Redirecting to the third party application for authentication

When we [observe the credentials](/USAGE.md) and the credential status changes to `AWAITING_MOBILE_BANKID_AUTHENTICATION` or `AWAITING_THIRD_PARTY_APP_AUTHENTICATION`,
the credential will have a valid `ThirdPartyAuthentication` attribute value required to handle the redirection towards the third party application
```kotlin
val thirdPartyAuthentication = requireNotNull(credential.thirdPartyAuthentication)
val thirdPartyAuthenticationAndroid = thirdPartyAuthentication.android

val thirdPartyIntent = Intent().apply {
    action = Intent.ACTION_VIEW
    data = Uri.parse(thirdPartyAuthenticationAndroid.intent)
    addCategory("android.intent.category.BROWSABLE")
    addCategory("android.intent.category.DEFAULT")
}

try {
    activity.startActivityForResult(thirdPartyIntent, 0)
} catch (exception: ActivityNotFoundException) {
    // If the uri provided by the thirdPartyAuthenticationAndroid is not recognized, try to launch app by package intent
    val launchByPackageIntent = activity.packageManager
        .getLaunchIntentForPackage(thirdPartyAuthenticationAndroid.packageName)
    if (launchByPackageIntent != null) {
        activity.startActivityForResult(launchByPackageIntent, 0)
    } else {
        // Prompt the user to install the third party app
        MaterialAlertDialogBuilder(activity)
                .apply {
                    setTitle(thirdPartyAuthentication.downloadTitle)
                    setMessage(thirdPartyAuthentication.downloadMessage)
                    setPositiveButton("Install") { _, _ ->
                        val intent = Intent(Intent.ACTION_VIEW).apply {
                            data = Uri.parse("https://play.google.com/store/apps/details?id=${thirdPartyAuthenticationAndroid.packageName}")
                            setPackage("com.android.vending")
                        }
                        activity.startActivity(intent)
                    }
                    setNegativeButton("Cancel") { _, _ -> // Cancel action  }
                }
                .show()
        }
    }
}
```

# Handling third party application callbacks

## Prerequisites
Register the Redirect URI for your app (e.g. `myapp://callback` or `https://myapp.com/callback`) in the list of allowed redirect URIs in console.tink.com.

## Preparing your manifest for third party callbacks
```xml
<!-- app/src/main/AndroidManifest.xml -->

<!-- 
  Launch mode for activity:
  Setting android:launchMode="singleTask" will enable the app to bring its current task, if running,
  to the front when the intent containing the redirect uri is invoked.
  Otherwise, it will just create another new stack with a new activity instance.
-->
<activity
  android:name=".MainActivity"
  android:launchMode="singleTask">
  <intent-filter>
    <action android:name="android.intent.action.MAIN" />

    <category android:name="android.intent.category.LAUNCHER" />
  </intent-filter>
  <intent-filter>
    <action android:name="android.intent.action.VIEW" />
    <category android:name="android.intent.category.DEFAULT" />
    <category android:name="android.intent.category.BROWSABLE" />
    <!--
      Attributes settings for <data> tag:
      android:scheme="https" - If you are a custom app scheme such as "myapp://callback", this should be set to "myapp"
      android:host="myapp.com" - This is not set if you are using a custom app scheme
      android:pathPrefix="/callback" - A path that is unique for the purpose of handling third party authentication callbacks
    -->
    <data
      android:scheme="https"
      android:host="myapp.com"
      android:pathPrefix="/callback" />
      <!-- or -->
    <data
      android:scheme="myapp"
      android:host="callback" />
  </intent-filter>
</activity>
```
For more information regarding setting up of deep links, please look at the official android guide [to create deep links](https://developer.android.com/training/app-links/deep-linking.html).

If you are using a special type of deep link such as your company website URLs (e.g. `https://mycompany.com/callback`), please look at the official android guide [to verify android app links](https://developer.android.com/training/app-links/verify-site-associations.html).

## Handling thirds party callbacks in the app with TinkLink

After the redirect to the third party app, some providers requires additional information to be sent to Tink after the user authenticates with the third party app for the credential to be added successfully. This information is passed to your app via the redirect URI.
```kotlin
// MainActivity.kt
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    // This will ensure that we handle this even if this application was closed when the user is doing the authentication in the third party app.
    redirectIfAppropriate(intent)
}

override fun onNewIntent(intent: Intent?) {
    super.onNewIntent(intent)
    redirectIfAppropriate(intent)
}

private fun redirectIfAppropriate(intent: Intent?) {
    intent?.data?.let { uri ->
        val hasBeenHandled = tinkLink.getUserContext()?.handleUri(uri) // This function returns `true` if the uri has been handled successfully, `false` otherwise
    }
}
```


