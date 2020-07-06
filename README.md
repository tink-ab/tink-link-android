# Tink Link Android SDK

## Prerequisites
1. Follow the [getting started guide](https://docs.tink.com/resources/getting-started/set-up-your-account) to create your developer account and retrieve your Client ID.
2. Register the Redirect URI for your app (e.g. `myapp://callback` or `https://myapp.com/callback`) in the list of allowed redirect URIs in console.tink.com.

## Installation

1. Make sure `jcenter()` is added to your repositories (it should be by default).

```groovy
allprojects {
    repositories {
       jcenter()
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

## Tutorials
- [Tink Link Tutorial](https://docs.tink.com/resources/tutorials/tink-link-sdk-android-tutorial) This section outlines how to use the different classes and types provided with Tink Link.
- [Tink Link UI Tutorial] This tutorial outlines how to configure and use Tink Link UI in your application. // TODO

## Examples
- [Tink Link Sample](/sample-link)
- [Tink Link UI Sample](/sample-link-ui)

## Developer documentation
- [Tink Link Android Reference](https://tink-ab.github.io/tink-link-android/)
