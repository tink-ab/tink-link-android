# Tink Link Android SDK

## Prerequisites
1. Follow the [getting started guide](https://docs.tink.com/resources/getting-started/set-up-your-account) to create your developer account and retrieve your Client ID.
2. Register the Redirect URI for your app (e.g. `myapp://callback` or `https://myapp.com/callback`) in the list of allowed redirect URIs in console.tink.com.

## Installation (ALPHA)

// TODO: Adjust to bintray

1. Take the `com` folder (containing the Tink Link local Maven dependencies) and put it in `~/.m2/repository/`.
2. Add `mavenLocal()` as repository in your root level build.gradle file.

```groovy
allprojects {
    repositories {
        mavenLocal()
        // Rest of the repositories
    }
}
```

_Note: The `mavenLocal()` repository needs to be on top of the other repositories, as shown above._

// TODO: Section about checksum verification

3. Add dependency on `com.tink:tink-link-android-core:0.2.0-alpha`:

// TODO: Fix version

```groovy
dependencies {
    implementation("com.tink:tink-link-android-core:0.2.0-alpha")
}
```

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
