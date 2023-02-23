![Min Android API level](https://img.shields.io/badge/api-23%2B-0E9EC2)
![Platform](https://img.shields.io/badge/platform-Android-blue.svg)
![Languages](https://img.shields.io/badge/languages-Kotlin-blue.svg)

# Tink Link Android
![thumbnail](https://user-images.githubusercontent.com/102951880/211527808-dc74007b-aa9b-4fc5-97f9-9cc94f26fce2.png)


## Prerequisites
1. Go to [Set up your Tink Console account](https://docs.tink.com/resources/getting-started/set-up-your-account) and follow the steps to create a Console account and an app. Make a note of your `client_id`.
2. In Console, go to **App settings** > API client. In the Redirect URIs section, select **Add new redirect URI**. Add a redirect URI to your app. Your redirect URI needs a scheme and host, for example: `awesomeApp://callback`.

## Requirements
The minimum API level that's required to use this library is 23 (Android 6.0).

## Installation
1. Make sure that `mavenCentral()` is added to your repositories (it should be, by default).

```groovy
allprojects {
   repositories {
      mavenCentral()
   }
}
```

2. Add dependency on the latest version:

[![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/tink-ab/tink-sdk-android-private?color=%230E9EC2)](https://github.com/tink-ab/tink-sdk-android-private/releases/latest)

```groovy
dependencies {
   implementation "com.tink:link:<version>"
}
```

3. Optional: Verify artifact checksums

A SHA-256 checksum is documented per [release](https://github.com/tink-ab/tink-sdk-android-private/releases).•

## Initialization
1. Initialize Tink Link in your Application class:

```kotlin
Tink.initSdk(
   clientId = "YOUR_CLIENT_ID", // Your clientId. Retrieve it from console.tink.com.
   redirectUri = "{REDIRECT_URI_SCHEME}://{REDIRECT_URI_HOST}" // [^1]
)
```

[^1]: You must add a custom URL scheme or supported web URLs to handle redirects from a third-party authentication flow back to your app.
The redirect URI should be the same as the one you've entered in Console > **App settings**(https://console.tink.com/account-verification/tink-link).

2. Configure activity and an intent filter in your Manifest file

```xml
<activity
android:exported="true"
android:launchMode="singleInstance">
</activity>
```

```xml
<intent-filter>
   <action android:name="android.intent.action.VIEW" />
   <category android:name="android.intent.category.DEFAULT" />
   <category android:name="android.intent.category.BROWSABLE" />
   <data
           android:host="{REDIRECT_URI_HOST}"
           android:scheme="{REDIRECT_URI_SCHEME}" /> // [^2]
</intent-filter>
```

[^2]: Use the same redirect URI as noted in step 1[^1].


## Integrate Tink SDK into your application
Tink SDK can be displayed in two different ways inside your application: Fullscreen and Modal mode.

![flow_comparison](https://user-images.githubusercontent.com/102951880/211849562-9bc886e4-084f-4592-83db-40438872fe45.png)

The following sections describe the three integration modes and the code that's needed in your app to launch Tink SDK.

Tink SDK can be integrated in all apps regardless of UI architecture. In other words, use either XML layout or Jetpack Compose.

- [Fullscreen](#fullscreen)[^3]
- [Modal](#modal)[^3]

[^3]: The implementation is the same for both an XML layout-based app and Jetpack Compose.

### FullScreen

<img src="https://user-images.githubusercontent.com/102951880/208935693-15f6aa04-80d2-4d47-bf9c-824068088ed3.png" alt="fullscreen" width="200"/>

Fullscreen launchmode will show Tink SDK in fullscreen mode inside your app, leaving only the status bar visible while hiding the actionbar.

Regardless of the UI architecture that you've chosen for your app (XML layouts or Jetpack Compose), to launch a Tink SDK flow in fullscreen mode requires you to do the following:

1. Create the correct request object for the selected flow (in the example, this is `Tink.Transactions.connectOneTimeAccessTransaction`)
   and enter values for the mandatory and eventually optional parameters:
```kotlin
val dataRequest = ConnectAccountsForOneTimeAccess(
   market = Market.SE
)
```

2. Launch the selected flow by passing the request object (that you created in the previous step) and setting the `launchMode` parameter to FullScreen:
```kotlin
Tink.Transactions.connectAccountsForOneTimeAccess(
   this,
   dataRequest,
   FullScreen,
   { success: TinkTransactionSuccess ->
      // callback for handling successful outcome.
   },
   { error: TinkError ->
      // callback for handling erroneous or user cancellation outcome.
   }
)
```

1. After the flow has completed, Tink SDK will asynchronously return the successful or erroneous outcome in one of the callbacks previously specified.

### Modal
<img src="https://user-images.githubusercontent.com/102951880/208936710-d48fab76-c479-485d-947b-5a1b457662ad.png" alt="modal" width="200"/>

Modal launch mode shows Tink SDK inside a modal bottom sheet, which leaves the top part of your app still visible but not selectable.

Regardless of the UI architecture that you've chosen for your app (XML layouts or Jetpack Compose), to launch a Tink SDK flow in modal mode requires you to do the following:

1. Create the correct request object for the selected flow (in the example, this is `Tink.Transactions.connectOneTimeAccessTransaction`)
   and enter values for the mandatory and eventually optional parameters:
```kotlin
val dataRequest = ConnectAccountsForOneTimeAccess(
   market = Market.SE
)
```
2. Launch the selected flow by passing the request object (that you created in the previous step) and setting the `launchMode` parameter to Modal:
```kotlin
Tink.Transactions.connectAccountsForOneTimeAccess(
   this,
   dataRequest,
   Modal,
   { success: TinkTransactionSuccess ->
      // handle successful completion here.
   },
   { error: TinkError ->
      // handle error completion or user cancellation here.
   }
)
```

3. After the flow has completed, Tink SDK will asynchronously return the successful or error outcome in one of the callbacks previously specified.

## Samples
For code samples on how to integrate Tink Link in your app, please refer to the:
- [Sample dev](sample-dev)

For testing all the different Tink products, please refer to the: 
- [Sample App](sample-app)

## Developer documentation (add correct link to Tink Docs)
- [Tink Link Android Reference](https://github.com/tink-ab/tink-sdk-android-private)

## Support
👋 We are always working on improving our API developer experience. Don't hesitate to [contact us](https://support.tink.com) for support or if you have questions or suggestions.
