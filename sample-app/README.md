![Min Android API level](https://img.shields.io/badge/api-23%2B-0E9EC2)
![Platform](https://img.shields.io/badge/platform-Android-blue.svg)
![Languages](https://img.shields.io/badge/languages-Kotlin-blue.svg)

# Sample UI App

An Android app designed to demonstrate a simple use case of Tink Link for Android.

## Prerequisites

1. Follow the [getting started guide](https://docs.tink.com/resources/getting-started/set-up-your-account) to set up your Tink account and to retrieve your `clientID`.

2. In Tink Console, go to [**App settings** > API client](https://console.tink.com/app-settings/client). In the Redirect URIs section, select **Add new redirect URI**. Add a redirect URI to your app. Your redirect URI needs a scheme and host, for example: `awesomeApp://callback`.

## How to run the sample app

1. Open repository root in Android Studio.

2. Open [SampleActivity](src/main/java/com/tink/link/app/SampleActivity.kt)

3. Add your `clientId` and `redirectUri` that you retrieved in the [Prerequisites](#Prerequisites) section, inside `val configuration = Configuration(clientId = "", redirectUri = "")`.

4. Open [AndroidManifest](src/main/AndroidManifest.xml)

5. Replace `android:host` and `android:scheme` placeholder in the source code with the `host` and `scheme` of the `redirectURI` you specified in the [Prerequisites](#Prerequisites) section.

6. Make sure `sample-ui` is selected as run target.

7. Select any `Android phone emulator` or `physical device` as deployment target device.

8. Run the sample app by hitting `Control+R` or by pressing the triangle (`Run`) button in the top-side of Android Studio.

9. Inside the app select any launch mode with the "Launch Mode" dropdown menu.

10. Inside the app expand the intended flow dropdown menu and press desired button to start a flow.