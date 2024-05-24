![Minimum Android API level](https://img.shields.io/badge/api-23%2B-0E9EC2)
![Platform](https://img.shields.io/badge/platform-Android-blue.svg)
![Languages](https://img.shields.io/badge/languages-Kotlin-blue.svg)

# Tink Link Android

![Tink Link Android](https://github.com/tink-ab/tink-link-android-private/assets/102951880/40b9dab6-b823-4b1e-9d1b-abb4f9958f11)

## Prerequisites

1. [Set up your Tink Console account](https://docs.tink.com/resources/console/set-up-your-tink-account) and retrieve the `client ID` for your app.
2. Add an App Link (or deep link) to your app in the list of redirect URIs under _App settings > API client_ (eg. `myapp://callback`).

## Requirements

The minimum API level that's required to use this library is 23 (Android 6.0).

## Installation

To install the SDK, add `link` to your `app/build.gradle` dependencies.

[![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/tink-ab/tink-link-android?color=%230E9EC2)](https://github.com/tink-ab/tink-link-android/releases/latest)

```groovy
dependencies {
   implementation "com.tink:link:2.7.0"
}
```

## Initialization

1. In you `AndroidManifest.xml` file configure the Activity that will launch Tink Link:

```xml
<activity
    ...
    android:exported="true"
    android:launchMode="singleInstance">
    <intent-filter>
        <action android:name="android.intent.action.VIEW" />
        <category android:name="android.intent.category.DEFAULT" />
        <category android:name="android.intent.category.BROWSABLE" />
        <data
                android:host="callback"
                android:scheme="myapp" />
    </intent-filter>
</activity>
```

You must configure an [App Link](https://developer.android.com/training/app-links) or a [deep link](https://developer.android.com/training/app-links/deep-linking) to handle redirects, as the end user may be taken out of your app to complete the authentication (for example, into their banking app or system browser). This link needs to match the redirect URI registered in [Tink Console](https://console.tink.com/).

## Launching the SDK

To launch the SDK in your Android app, please see the product specific documentation.

|                       |                                                                                                                    |                                                                                                                                               |                                                               |
| --------------------- | ------------------------------------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------- |
| **Account Check**     | [Getting started](https://docs.tink.com/resources/account-check/verify-your-first-account)                         | [Setup and integrate](https://docs.tink.com/resources/account-check/setup-and-integrate-account-check#tink-link-for-android)                  | [SDK reference](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.features.accountCheck/-tink-account-check/index.html) |
| **Expense Check**     | [Getting started](https://docs.tink.com/resources/expense-check/fetch-your-first-expense-check-report)             | [Setup and integrate](https://docs.tink.com/resources/expense-check/setup-and-integrate-expense-check#tink-link-for-android)                  | [SDK reference](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.features.expensecheck/-tink-expense-check/index.html) |
| **Income Check**      | [Getting started](https://docs.tink.com/resources/income-check/fetch-your-first-income-check-report)               | [Setup and integrate](https://docs.tink.com/resources/income-check/setup-and-integrate-income-check#tink-link-for-android)                    | [SDK reference](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.features.incomecheck/-tink-income-check/index.html) |
| **One-time payments** | [Getting started](https://docs.tink.com/resources/payments/one-time-payments/initiate-your-first-one-time-payment) | [Setup and integrate](https://docs.tink.com/resources/payments/one-time-payments/setup-and-integrate-one-time-payments#tink-link-for-android) | [SDK reference](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.features.payments/-tink-payments/index.html) |
| **Risk Insights**     | [Getting started](https://docs.tink.com/resources/risk-insights/fetch-your-first-risk-insights-report)             | [Setup and integrate](https://docs.tink.com/resources/risk-insights/setup-and-integrate-risk-insights#tink-link-for-android)                  | [SDK reference](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.features.riskInsights/-tink-risk-insights/index.html) |
| **Transactions**      | [Getting started](https://docs.tink.com/resources/transactions/connect-to-a-bank-account)                          | [Setup and integrate](https://docs.tink.com/resources/transactions/setup-and-integrate-transactions#tink-link-for-android)                    | [SDK reference](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.features.transactions/-tink-transactions/index.html) |
| **Report bundling**   | -                                                                                                                  | -                                                                                                                                             | [SDK reference](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.features.reports/-tink-reports/index.html) |

## Preselecting a provider

You can also optimize your integration in different ways, such as [preselecting a provider](https://docs.tink.com/resources/account-check/optimize-your-account-check-integration#preselecting-a-bank).
To preselect a provider, simply add your provider name in the request object, like in this example:

```kotlin
val dataRequest = ConnectAccountsForOneTimeAccess(
   market = "SE",
   inputProvider = "sbab-bankid",
)
```
Parameter `inputProvider` gives the option to use the data to skip the provider-selection screen and preselect the user's provider (in this example, SBAB is preselected.)

To get the list of all providers available for an authenticated user, please refer to [list-providers](https://docs.tink.com/api#connectivity/provider/list-providers)

### Example apps

- [Simple example app](https://github.com/tink-ab/tink-link-android/tree/master/sample-dev) shows code samples how to integrate the Tink Link SDK in the easiest and fastest manner
- [Products example app](https://github.com/tink-ab/tink-link-android/tree/master/sample-app) showcases and allows you to try different Tink products

## SDK reference

For the full API reference, please see the [Tink Link Android SDK Reference](https://tink-ab.github.io/tink-link-android/).
