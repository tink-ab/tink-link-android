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
1. Add the Tink Link .aar file named "sdk-release.aar" to the `libs` folder of your app module. The .aar file can be found on the Github release page for this project under the "Tink Link iOS 2.0.0 Release Candidate 1"
2. In your app module build.gradle file add the following line in the "dependencies" section:

```groovy
dependencies {
   implementation fileTree(dir: "libs", include: ["*.aar"])
}
```

## Initialization
1. Initialize Tink Link in your Application class:

```kotlin
Tink.initSdk(
   clientId = "YOUR_CLIENT_ID", // Your clientId. Retrieve it from console.tink.com.
   redirectUri = "{REDIRECT_URI_SCHEME}://{REDIRECT_URI_HOST}" //[^1]
)
```
^1: You must add a custom URL scheme or supported web URLs to handle redirects from a third-party authentication flow back to your app.
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
^2: Use the same redirect URI as noted in step 1[^1].

## Display Tink Link into your application
Tink Link can be displayed in two different ways inside your application: Fullscreen and Modal mode.

### FullScreen

Fullscreen launchmode will show Tink SDK in fullscreen mode inside your app, leaving only the status bar visible.
<img src="https://user-images.githubusercontent.com/102951880/208935693-15f6aa04-80d2-4d47-bf9c-824068088ed3.png" alt="fullscreen" width="200"/>

### Modal

Modal launch mode shows Tink SDK inside a modal bottom sheet, which leaves the top part of your app still visible but not selectable.
<img src="https://user-images.githubusercontent.com/102951880/208936710-d48fab76-c479-485d-947b-5a1b457662ad.png" alt="modal" width="200"/>

## FullScreen and Modal integration guide

For any Tink Link flow regardless of the UI architecture that you've chosen for your app (XML layouts or Jetpack Compose), the steps required are the following:

1. [Create the request object](#create-the-request-object)
2. [Customize Tink Link UI](#customize-the-look-of-tink-link)
3. [Start the flow](#launch-tink-link-flow)
4. [Collect the outcome of the flow](#collect-tink-link-flow-outcome) 

In the sections below we will show you how to start the flow for connecting accounts to a permanent user (also called "continuous access").

### Create the request object

Create the correct request object for the desired flow (in the example, this is `Tink.Transactions.connectAccountsForContinuousAccess`)
and enter values for the mandatory and eventually optional parameters:
   
```kotlin
val dataRequest = ConnectAccountsForContinuousAccess(
   authorizationCode = "{YOUR_AUTH_CODE_HERE}", // [^3]
   market = Market.SE
)
```

^3: To learn how to retrieve an authorization code, please visit our [Tink documentation guide](https://docs.tink.com/api#general/oauth/create-authorization).

### Customize the look of Tink Link
Customize the look of Tink Link by creating a theme for both light and dark modes. This is mandatory and it's needed for matching Tink Link with the UI style of your app.

If your UI architecture is based on XML layout, create a `TinkAppearanceXml`object similar to the following:

```kotlin
TinkAppearanceXml(
   light = TinkAppearanceXml.ThemeAttributes(
      toolbarColorId = R.color.white,
      windowBackgroundColorId = R.color.white,
      iconBackId = R.drawable.ic_back,
      iconBackTint = R.color.black,
      iconBackDescriptionId = R.string.app_name,
      iconCloseId = R.drawable.ic_cross,
      iconCloseTint = R.color.black,
      iconCloseDescriptionId = R.string.app_name,
      toolbarTitleObj = TinkAppearanceXml.ToolbarTitle()
   ),
   dark = TinkAppearanceXml.ThemeAttributes(
      toolbarColorId = R.color.black,
      windowBackgroundColorId = R.color.white,
      iconBackId = R.drawable.ic_back,
      iconBackTint = R.color.white,
      iconBackDescriptionId = R.string.app_name,
      iconCloseId = R.drawable.ic_cross,
      iconCloseTint = R.color.white,
      iconCloseDescriptionId = R.string.app_name,
      toolbarTitleObj = TinkAppearanceXml.ToolbarTitle()
   )
)
```

If your UI architecture is based on Jetpack Compose layout, create a `TinkAppearanceCompose`object similar to the following:

```kotlin
TinkAppearanceCompose(
   light = TinkAppearanceCompose.ThemeAttributes(
      toolbarColor = Color.White,
      windowBackgroundColor = Color.White,
      iconBack = {
         Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = "Back",
            tint = Color.Black
         )
      },
      iconClose = {
         Icon(
            imageVector = Icons.Filled.Close,
            contentDescription = "Close",
            tint = Color.Black
         )
      },
      toolbarTitle = { Text(text = "Tink", color = Color.Black) }
   ),
   dark = TinkAppearanceCompose.ThemeAttributes(
      toolbarColor = Color.Black,
      windowBackgroundColor = Color.Black,
      iconBack = {
         Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = "Back",
            tint = Color.White
         )
      },
      iconClose = {
         Icon(
            imageVector = Icons.Filled.Close,
            contentDescription = "Close",
            tint = Color.White
         )
      },
      toolbarTitle = { Text(text = "Tink", color = Color.White, fontSize = 20.sp) }
   )
)
```

Please replace the values in the above examples with something suitable for your app.

### Launch Tink Link flow
Launch the selected flow from within your Activity, Fragment or Composable by passing the request object (that you created in the previous step), and setting the `launchMode` parameter to FullScreen or Modal adding the theme (that you created in the previous step):

```kotlin
Tink.Transactions.connectAccountsForContinuousAccess(
   this, //Activity context
   dataRequest,
   fullscreen,
   { success: TinkTransactionSuccess ->
      // callback for handling successful outcome.
   },
   { error: TinkError ->
      // callback for handling erroneous or user cancellation outcome.
   }
)
```
### Collect Tink Link flow outcome
After the flow has completed, Tink Link will asynchronously return the successful or erroneous outcome in one of the callbacks previously specified.

## Permanent users and preselecting a provider

### Permanent users: connect accounts, extend and update consent
Tink Link offers different flows for different use cases. For connecting accounts for permanent users and for updating and extending the consent, please refer to the sample [code](sample-app/src/main/java/com/tink/link/app/navToFlows/FlowCases.kt)  

### Preselecting a provider
You can also optimize your integration in different ways, such as [preselecting a provider](https://docs.tink.com/resources/account-check/optimize-your-account-check-integration#preselecting-a-bank).
To preselect a provider, simply add your provider name in the request object, like in this example:
```kotlin
val dataRequest = ConnectAccountsForOneTimeAccess(
   market = Market.SE,
   input_provider = "sbab-bankid",
)
```
Parameter input_provider gives the option to use the data to skip the provider-selection screen and preselect the user's provider (in this example, SBAB is preselected.)

To get the list of all providers available for an authenticated user, please refer to [list-providers](https://docs.tink.com/api#connectivity/provider/list-providers)
To get the list of all providers on a specified market, please refer to [list-providers-for-a-market](https://docs.tink.com/api#connectivity/provider/list-providers-for-a-market)

## Additional resources

### Samples
For code samples on how to integrate Tink Link in your app, please refer to the:
- [Sample dev](sample-dev)

For testing all the different Tink products, please refer to the: 
- [Sample App](sample-app)

### Developer documentation
- [Tink Link Android Reference](https://github.com/tink-ab/tink-sdk-android-private)

### Support
👋 We are always working on improving our API developer experience. Don't hesitate to [contact us](https://support.tink.com) for support or if you have questions or suggestions.
