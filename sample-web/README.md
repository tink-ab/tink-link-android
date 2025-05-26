![Minimum Android API level](https://img.shields.io/badge/api-29%2B-0E9EC2)
![Platform](https://img.shields.io/badge/platform-Android-blue.svg)
![Languages](https://img.shields.io/badge/languages-Kotlin-blue.svg)

# Tink Link + WebView integration example

This example app demonstrates how to integrate Tink Link using a WebView component on Android. It follows the steps described in
[Integrate One-Time Payments in Android apps](https://docs.tink.com/resources/payments/one-time-payments/integrate-one-time-payments-in-android-apps) guide.

## Steps

### 1. Add WebView dependency
Update your `build.gradle.kts` file to include the `androidx.webkit` library, which provides access to the `WebView` component.

[View code ↗](https://github.com/tink-ab/tink-link-android/blob/8d4375ce5f3a2e591439dd89f472bfa2a55b8e32/sample-web/app/build.gradle.kts#L55)

### 2. Create a `TinkLinkActivity` wrapping `WebView`
Implement a `TinkLinkActivity` that wraps the `WebView`. This activity handles:
* Displaying the Tink Link interface
* Managing redirects
* Processing the final response

[View code ↗](https://github.com/tink-ab/tink-link-android/blob/8d4375ce5f3a2e591439dd89f472bfa2a55b8e32/sample-web/app/src/main/java/com/tink/tinklinkweb/TinkLinkActivity.kt#L18)

### 3. Update `AndroidManifest.xml`
Extend the manifest and add the necessary intent filters to support app redirection back to the `TinkLinkActivity`.

[View code ↗](https://github.com/tink-ab/tink-link-android/blob/8d4375ce5f3a2e591439dd89f472bfa2a55b8e32/sample-web/app/src/main/AndroidManifest.xml#L31-L50)

### 4. Configure Tink Link URL parameters
Set up the Tink Link URL with your credentials and required parameters.

[View code ↗](https://github.com/tink-ab/tink-link-android/blob/8d4375ce5f3a2e591439dd89f472bfa2a55b8e32/sample-web/app/src/main/java/com/tink/tinklinkweb/MainActivity.kt#L31-L40)

### 5. Launch `TinkLinkActivity`
Start the `TinkLinkActivity`, passing the configured URL as an intent extra.

[View code ↗](https://github.com/tink-ab/tink-link-android/blob/8d4375ce5f3a2e591439dd89f472bfa2a55b8e32/sample-web/app/src/main/java/com/tink/tinklinkweb/MainActivity.kt#L79-L81)

### 6. Handle the callback response
Parse the `callback` query response parameters to handle the response.

[View code ↗](https://github.com/tink-ab/tink-link-android/blob/8d4375ce5f3a2e591439dd89f472bfa2a55b8e32/sample-web/app/src/main/java/com/tink/tinklinkweb/TinkLinkActivity.kt#L74-L82)

## Support
If you have any questions or need assistance, please contact [Tink Support](https://docs.tink.com/resources/support).
