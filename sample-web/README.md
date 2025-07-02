![Minimum Android API level](https://img.shields.io/badge/api-29%2B-0E9EC2)
![Platform](https://img.shields.io/badge/platform-Android-blue.svg)
![Languages](https://img.shields.io/badge/languages-Kotlin-blue.svg)

# Tink Link + WebView integration example

This example app demonstrates how to integrate Tink Link using a WebView component on Android. It follows the steps described in
[Integrate One-Time Payments in Android apps](https://docs.tink.com/resources/payments/one-time-payments/integrate-one-time-payments-in-android-apps) guide.

## Steps

### 1. Add dependencies
* Update your `build.gradle.kts` file to include the `androidx.webkit` library, which provides access to the `WebView` component.
* Update your `build.gradle.kts` file to include the `androidx.browser` library, which provides access to the `CustomTabsIntent` component.

[View code ↗](./app/build.gradle.kts#L55-L56)

### 2. Create a `CustomTabsHelper`
Add a `CustomTabsHelper` type providing an interface to handle [Android's Custom Tabs](https://developer.android.com/develop/ui/views/layout/webapps/overview-of-android-custom-tabs).
* Interface to warmup private `CustomTabsClient` with URLs that user is likely to reach. (optional)
* Interface to open a web-based authentication URL in Custom Tabs.

[View code ↗](./app/src/main/java/com/tink/tinklinkweb/CustomTabsHelper.kt#L23)

### 3. Create a `TinkLinkActivity` wrapping `WebView`
Implement a `TinkLinkActivity` that wraps the `WebView`. This activity handles:
* Displaying the Tink Link interface.
* Managing redirects.
* Processing the final response.

[View code ↗](./app/src/main/java/com/tink/tinklinkweb/TinkLinkActivity.kt#L18)

### 3. Update `AndroidManifest.xml`
* Extend the manifest and add the necessary intent filters to support app redirection back to the `TinkLinkActivity`.

[View code ↗](./app/src/main/AndroidManifest.xml#L31-L50)

* Add a query that allows the app to find and use a web browser that supports the Custom Tabs feature on Android 11 (API 30) and higher.

[View code ↗](./app/src/main/AndroidManifest.xml#L7-L12)

### 4. Configure Tink Link URL parameters
Set up the Tink Link URL with your credentials and required parameters.

[View code ↗](./app/src/main/java/com/tink/tinklinkweb/MainActivity.kt#L27-L43)

### 5. Launch `TinkLinkActivity`
Start the `TinkLinkActivity`, passing the configured URL as an intent extra.

[View code ↗](./app/src/main/java/com/tink/tinklinkweb/MainActivity.kt#L67-L69)

### 6. Handle the callback response
Parse the `callback` query response parameters to handle the response.

[View code ↗](./app/src/main/java/com/tink/tinklinkweb/TinkLinkActivity.kt#L73-L83)

## Support
If you have any questions or need assistance, please contact [Tink Support](https://docs.tink.com/resources/support).
