# Tink Link Android SDK

## Prerequisites
1. Follow the [getting started guide](https://docs.tink.com/resources/getting-started/set-up-your-account) to create your developer account and retrieve your Client ID.
2. Register the Redirect URI for your app (e.g. `myapp://callback` or `https://myapp.com/callback`) in the list of allowed redirect URIs in console.tink.com.

## Installation

1. Make sure `mavenCentral()` is added to your repositories (it should be by default).

```groovy
allprojects {
    repositories {
       mavenCentral()
       ...
    }
}
```

2. Add dependency on the latest version: 

[![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/tink-ab/tink-link-android?color=%230E9EC2)](https://github.com/tink-ab/tink-link-android/releases/latest)

```groovy
dependencies {
    implementation "com.tink:link:<version>"
}
```

3. Optional: Verify artifact checksums

The *SHA-256* checksums can be found in the corresponding [release](https://github.com/tink-ab/tink-link-android/releases).

## Initialization

1. Set up a configuration object with your specifics:

```kotlin
val config = 
    TinkConfiguration(
        environment = Environment.Production, // Or define your own environment
        oAuthClientId = "yourKey", // Your clientId. Retrieve it from console.tink.com,
        redirectUri = "https://localhost:3000/callback" // [1]
    )
```

`[1]` _Note: You need to add a custom URL scheme or supported web URLS to handle redirects from a third party authentication flow back into your app.
This should be the same redirect URI that is registered in the list of allowed redirect URIs. Follow the [third party authentication guide](https://docs.tink.com/resources/tutorials/tink-link-sdk-android-tutorial#third-party-authentication) to set this up._

2. Initialize Tink in your Application

```kotlin
Tink.init(config, applicationContext)
```

## Update proguard rules to prevent issues due to code obfuscation
Since we currently use reflection for the serialization of rest modules in our `core` module, this may cause issues due to code obfuscation.
To prevent this, please add the following proguard keep rules to your `proguard-rules.pro` file.
```java
-keep class com.tink.rest.models.** { *; }
-keepclassmembers class com.tink.rest.models.** { *; }
```

## Integrating Tink Link UI into your application
Tink Link UI contains a predefined flow, a single entrypoint and configurable UI style, which can be used to bootstrap your application fast, suitable for customer aggregating with temporary users.

1. As a prerequisite, Tink Link UI requires Tink Link to be installed and initialized in your application. To do this, please follow the previous steps mentioned above to configure and set up Tink Link.

2. Add dependency on the latest version: 

[![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/tink-ab/tink-link-android?color=%230E9EC2)](https://github.com/tink-ab/tink-link-android/releases/latest)

```groovy
dependencies {
     implementation "com.tink:link:<version>"
     implementation "com.tink:link-ui:<version>"
 }
```

### Initializing the `AndroidThreeTen` library
Currently, Tink Link UI uses the [`AndroidThreeTen`](https://github.com/JakeWharton/ThreeTenABP) library and this needs the timezone information to be initialized in your `Application.onCreate()` method as mentioned [here](https://github.com/JakeWharton/ThreeTenABP#usage).
```kotlin
class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }
}
```

## Tutorials
- [Tink Link Tutorial](https://docs.tink.com/resources/tink-link-android/tink-link-android-headless-tutorial) This section outlines how to use the different classes and types provided with Tink Link.
- [Tink Link UI Tutorial](https://docs.tink.com/resources/tink-link-android/tink-link-android-tutorial) This tutorial outlines how to configure and use Tink Link UI in your application.

## Samples
|Sample|Description|Temporary User|Existing User|
|---|---|---|---|
|**[Tink Link Sample](/sample-link-headless)**|Demonstrates the usage of `TinkLink` Android SDK.|<p align="center"><img align="center" width="20" alt="icon-check-green" src="https://user-images.githubusercontent.com/14132621/116664333-9a132080-a998-11eb-92da-0de3116551be.png"></p>|<p align="center"><img align="center" width="20" alt="icon-check-green" src="https://user-images.githubusercontent.com/14132621/116664333-9a132080-a998-11eb-92da-0de3116551be.png"></p>|
|**[Tink Link UI Sample](/sample-link)**|Demonstrates the usage of `TinkLinkUI` Android SDK.||<p align="center"><img align="center" width="20" alt="icon-check-green" src="https://user-images.githubusercontent.com/14132621/116664333-9a132080-a998-11eb-92da-0de3116551be.png"></p>|

## Developer documentation
- [Tink Link Android Reference](https://tink-ab.github.io/tink-link-android/)

## [Tink](https://tink.com)
Tink was founded in 2012 with the aim of changing the banking industry for the better. We have built Europe’s most robust open banking platform – with the broadest, deepest connectivity and powerful services that create value out of the financial data.

## Support
👋 We are continuously working on improving the developer experience of our API offering. [Contact us](https://tinkab.atlassian.net/servicedesk/customer/portal/5) for support, questions or suggestions.
