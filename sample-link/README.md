![Platform](https://img.shields.io/badge/platform-Android-orange.svg)
![Languages](https://img.shields.io/badge/languages-kotlin-orange.svg)

# TinkLink Headless Sample

This directory contains sample code that demonstrates the usage of `TinkLink` Android SDK.

## Prerequisites

1. Follow the [getting started guide](https://docs.tink.com/resources/getting-started/set-up-your-account) to retrieve your `client_id`.
2. Make sure you are an Enterprise customer with permanent users enabled.
3. Add a `link-demo://tink`) to the [list of redirect URIs under your app's settings](https://console.tink.com/overview).

## Configuration

Before running the example project, you need to configure the following:

1. Create a `src/main/java/com/tink/link/sample/configuration/Configuration.kt` with the following:

   ```kotlin
   package com.tink.link.sample.configuration

   import com.tink.service.network.Environment

   object Configuration {
       val sampleEnvironment = Environment.Production
       val sampleOAuthClientId: String = "{CLIENT_ID}"
   }
   ```

2. Set a valid user access token. If you don't have one already, please follow our [guide](https://docs.tink.com/resources/getting-started/get-access-token) on how to generate a new API token. Note that these can expire, so make sure that you're using one that's currently active.
   Open [`src/main/java/com/tink/link/sample/MainFragment.kt`](src/main/java/com/tink/link/sample/MainFragment.kt) and adapt getUser:
   ```kotlin
   private fun getUser(): User {
       return getUserByAccessToken("{ACCESS_TOKEN}")
   }
   ```

## Running the example app

1. Open the project in Android Studio.
2. Press the run button. If all went well, this should launch a simulator with the sample app running.

Read more about TinkLink Android in [here](https://docs.tink.com/resources/tink-link-android).
