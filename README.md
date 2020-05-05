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

2. Add dependency on the [latest release](https://github.com/tink-ab/tink-link-android/releases/latest):

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
This should be the same redirect URI that is registered in the list of allowed redirect URIs. Follow the [third party authentication guide](/third-party-authentication.md) to set this up._

2. Initialize Tink in your Application

```kotlin
Tink.init(config, applicationContext)
```

## Examples
- [Usage Examples](/USAGE.md) This document outlines how to use the different classes and types provided with TinkLink

## Developer documentation
- [Tink Link Android Reference](https://tink-ab.github.io/tink-link-android/)
