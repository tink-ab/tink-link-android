![Platform](https://img.shields.io/badge/platform-Android-orange.svg)
![Languages](https://img.shields.io/badge/languages-kotlin-orange.svg)

# TinkLink Sample

This directory contains sample code that demonstrates the usage of `TinkLinkUI` Android SDK.

## Prerequisites

1. Follow the [getting started guide](https://docs.tink.com/resources/getting-started/set-up-your-account) to retrieve your `client_id`.
2. Add `link-demo://tink` to the [list of redirect URIs under your app's settings](https://console.tink.com/overview).

## Configuration

Before running Tink Link UI Sample, you need to configure the following:

1. Create a `src/main/java/com/tink/sample/configuration/Configuration.kt` with the following:

   ```kotlin
   package com.tink.sample.configuration

   import com.tink.service.network.Environment

   object Configuration {
       val sampleEnvironment = Environment.Production
       val sampleOAuthClientId: String = "{CLIENT_ID}"
   }
   ```

2. For temporary users, Tink Link UI handles the creation of user access token internally. If you already have a valid user access token that you want to use,
   open [`src/main/java/com/tink/sample/MainLinkUiActivity.kt`](src/main/java/com/tink/sample/MainLinkUiActivity.kt) and adapt `getUser`:

   ```kotlin
   private fun getUser(): User {
       return getUserByAccessToken("{ACCESS_TOKEN}")
   }
   ```

## Running Tink Link UI Sample

1. Open the project in Android Studio.
2. Press the Run button. If all went well, this should launch an emulator with the sample app running.
3. Click the `Launch Tink Link UI` button to launch the Link UI flow.

## User authorization
For temporary users, Tink Link UI will handle the creation of the user access token and user authorization. Upon successful completion
of the aggregation flow, a Toast message is shown which contains the authorization code.

## Redirect URI Handling

Redirect URI deep-linking for the sample application is done by setting the intent filter in the [`src/main/AndroidManifest.xml`](src/main/AndroidManifest.xml).
You can change the redirect URI by doing the following:

1. Add your redirect URI to the [list of redirect URIs under your app's settings](https://console.tink.com/overview).

2. Update intent filter for `TinkLinkUiActivity` in [`src/main/AndroidManifest.xml`](src/main/AndroidManifest.xml)

   ```xml
   <activity
     android:name="com.tink.link.ui.TinkLinkUiActivity"
     android:launchMode="singleTask">
     <intent-filter>
       <action android:name="android.intent.action.VIEW" />
       <category android:name="android.intent.category.DEFAULT" />
       <category android:name="android.intent.category.BROWSABLE" />
       <data
         android:scheme="{REDIRECT_URI_SCHEME}"
         android:host="{REDIRECT_URI_HOST}" />
     </intent-filter>
   </activity>
   ```
   For more information, please see the official Android guide [on deep linking](https://developer.android.com/training/app-links/deep-linking.html).

3. Update the `TinkConfiguration` object in [`src/main/java/com/tink/sample/MainLinkUiActivity.kt`](src/main/java/com/tink/sample/MainLinkUiActivity.kt) with the new redirect URI.

   ```kotlin
   private val MainLinkUiActivity.testTinkLinkConfig
       get() = TinkConfiguration(
           environment = Configuration.sampleEnvironment,
           oAuthClientId = Configuration.sampleOAuthClientId,
           redirectUri =
               Uri.Builder()
                   .scheme("{REDIRECT_URI_SCHEME}")
                   .encodedAuthority("{REDIRECT_URI_HOST}")
                   .build()
       )
   ```
