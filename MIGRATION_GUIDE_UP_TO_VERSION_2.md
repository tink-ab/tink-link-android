# New requirements
* Minimum Android 6.0 (API level 23) is now required (previously Android 5.0, API level 21).
* Minimum Android Studio version is Flamingo 2022.2.1 (previously Android Studio Dolphin 2021.3.1).

# Dependencies update
* ## Maven Central
Tink dependency definition in Maven Central has changed.
1. In your `build.gradle` product module file replace:
```
dependencies {
    implementation 'com.tink:link-ui:0.16.0'
}
```
With:
```
dependencies {
    implementation 'com.tink:link:2+'
}
```

2. Sync the changes.

# Styling
There's no need to define a style resource file (e.g., [sample version prior 2.0](https://github.com/tink-ab/tink-link-android/blob/0.16.0/sample-link-ui/src/main/res/values/styles.xml)). 
Styling is now defined via the type-conforming [TinkAppearance](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.themes/-tink-appearance/index.html) protocol.

# Android Manifest
* Previous activity definition with Tink Link Android version prior 2.0:
```
<activity
      android:name="com.tink.link.ui.TinkLinkUiActivity"
      android:exported="false"
      android:launchMode="singleTask">
</activity>
```

* New activity definition with Tink Link 2.0:
```
<activity
    ...
    android:exported="true"
    android:launchMode="singleInstance">
    <intent-filter>
        <action android:name="android.intent.action.VIEW" />
        <category android:name="android.intent.category.DEFAULT" />
        <category android:name="android.intent.category.BROWSABLE" />
        <data
                android:host="YOUR_REDIRECT_URL_HOST"
                android:scheme="YOUR_REDIRECT_URL_SCHEME" />
    </intent-filter>
</activity>
```

# Configuration
* Previous implementation with Tink Link Android version prior 2.0:
```
val configuration = TinkConfiguration(
                    environment = Environment.Production,
                    oAuthClientId = "YOUR_CLIENT_ID",
                    redirectUri = Uri.parse("YOUR_REDIRECT_URI")
)
Tink.init(configuration, applicationContext)
```

* New implementation with Tink Link 2.0:
```
val configuration = Configuration(
                    clientId = "YOUR_CLIENT_ID",
                    redirectUri = "YOUR_REDIRECT_URI"
)
```

# Response handling
No more need to define `onActivityResult` handler (e.g., [sample version prior 2.0](https://github.com/tink-ab/tink-link-android/blob/19dcb635a9680bf31b35ad76d190f5767b6f2022/sample-link-ui/src/main/java/com/tink/sample/MainLinkUiActivity.kt#L69)).
A resulting callback handler is now required during the product initialization step. (e.g., [TinkAccountAggregation/authorizeForOneTimeAccess](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.features.accountAggregation/-tink-account-aggregation/authorize-for-one-time-access.html)).


# Declaration changes
1. [Tink.init](https://github.com/tink-ab/tink-link-android/blob/19dcb635a9680bf31b35ad76d190f5767b6f2022/sample-link-ui/src/main/java/com/tink/sample/MainLinkUiActivity.kt#L39) call is removed. [Tink](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.base/-tink/index.html?query=object%20Tink) class now used for access product flows only.

2. [TinkConfiguration](https://github.com/tink-ab/tink-link-android/blob/0.16.0/docs/com.tink.service.di/-service-component/-builder/tink-configuration.md) class is removed. Use [Configuration](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.data.request.configuration/-configuration/index.html?query=class%20Configuration(val%20clientId:%20String,%20val%20redirectUri:%20String)) class.

3. [Environment](https://github.com/tink-ab/tink-link-android/blob/0.16.0/docs/com.tink.service.network/-environment/index.md) is removed. 

4. [LinkUser](https://github.com/tink-ab/tink-link-android/blob/0.16.0/docs/com.tink.link.ui/-link-user/index.md) is removed. User [Market](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.data.request.common/-market/index.html?query=enum%20Market%20:%20Enum%3CMarket%3E) class to define market.

5. [ProviderSelection](https://github.com/tink-ab/tink-link-android/blob/0.16.0/docs/com.tink.link.ui/-provider-selection/index.md) class is removed. Use flow request class to define provider (e.g., [AuthorizeForOneTimeAccess](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.data.request.accountAggregation/-authorize-for-one-time-access/index.html?query=data%20class%20AuthorizeForOneTimeAccess%C2%A0constructor(val%20market:%20Market,%20val%20scope:%20List%3CScope%3E,%20val%20locale:%20Locale%20=%20Locale.getDefault(),%20val%20sessionId:%20String%20=%20%22%22,%20val%20inputProvider:%20String%20=%20%22%22,%20val%20inputUsername:%20String%20=%20%22%22)%20:%20RequestType))

6. [Scope](https://github.com/tink-ab/tink-link-android/blob/0.16.0/docs/com.tink.model.user/-scope/index.md) class is removed. Use flow dedicated request class (e.g., [AuthorizeForOneTimeAccess](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.data.request.accountAggregation/-authorize-for-one-time-access/index.html?query=data%20class%20AuthorizeForOneTimeAccess%C2%A0constructor(val%20market:%20Market,%20val%20scope:%20List%3CScope%3E,%20val%20locale:%20Locale%20=%20Locale.getDefault(),%20val%20sessionId:%20String%20=%20%22%22,%20val%20inputProvider:%20String%20=%20%22%22,%20val%20inputUsername:%20String%20=%20%22%22)%20:%20RequestType)) to provide list of [Scope](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.data.request.common/-scope/index.html?query=enum%20Scope%20:%20Enum%3CScope%3E) enums.

7. [CredentialsOperation](https://github.com/tink-ab/tink-link-android/blob/0.16.0/docs/com.tink.link.ui/-credentials-operation/index.md) class is removed. Use dedicated flow class (e.g., [TinkAccountAggregation](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.features.accountAggregation/-tink-account-aggregation/index.html)) to call operations. 

8. [TinkLinkUiActivity](https://github.com/tink-ab/tink-link-android/blob/0.16.0/docs/com.tink.link.ui/-tink-link-ui-activity/index.md) class is removed. It is no longer needed to start activity manually. To present product flow you need to call preferred one from product class (e.g., [TinkAccountAggregation.authorizeForOneTimeAccess](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.features.accountAggregation/-tink-account-aggregation/authorize-for-one-time-access.html)).

9. [TinkLinkError](https://github.com/tink-ab/tink-link-android/blob/0.16.0/docs/com.tink.link.ui/-tink-link-error/index.md) class is removed. Utilize [TinkError](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.data.response.error/-tink-error/index.html?query=data%20class%20TinkError(val%20code:%20ErrorStatus,%20val%20errorStatus:%20String?,%20val%20errorReason:%20String?,%20val%20trackingId:%20String?,%20val%20errorDescription:%20String?,%20val%20errorType:%20String?%20=%20null,%20val%20credentials:%20String?%20=%20null,%20val%20providerName:%20String?%20=%20null,%20val%20paymentRequestId:%20String?%20=%20null)) instead.

10. [TinkLinkResult](https://github.com/tink-ab/tink-link-android/blob/0.16.0/docs/com.tink.link.ui/-tink-link-result/index.md) class is removed. Utilize product dedicated success class instead (e.g., [TinkAccountAggregationSuccess](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.data.response.success.accountAggregation/-tink-account-aggregation-success/index.html?query=data%20class%20TinkAccountAggregationSuccess(val%20credentialsId:%20String,%20val%20code:%20String%20=%20%22%22)%20:%20SuccessResponse) in case of [TinkAccountAggregation](https://tink-ab.github.io/tink-link-android/-tink%20-link%20-android%20-s-d-k/com.tink.link.core.features.accountAggregation/-tink-account-aggregation/index.html) product).

# Account Aggregation product migration guide
## 1. [Permanent user aggregation: Add credentials](https://docs.tink.com/resources/tink-link-web/tink-link-web-api-reference-account-aggregation#add-credentials)

* Previous implementation with Tink Link Android version prior 2.0:
```
val linkUser = createdUser()?.let { LinkUser.ExistingUser(it) }
                ?: authorizationCode()?.let { LinkUser.UnauthenticatedUser(it) }
                ?: LinkUser.TemporaryUser(market = "SE", locale = "sv_SE")

startActivityForResult(
                TinkLinkUiActivity.createIntent(
                    context = this,
                    linkUser = linkUser,
                    scopes = listOf(Scope.AccountsRead),
                    styleResId = R.style.TinkLinkUiStyle,
                    credentialsOperation = CredentialsOperation.Create(ProviderSelection.ProviderList())
                ),
                REQUEST_CODE
            )
```

* New implementation with Tink Link 2.0:
```
val configuration = Configuration(
            clientId = "YOUR_CLIENT_ID",
            redirectUri = "YOUR_REDIRECT_URI"
)

val authorizationCode = "YOUR_AUTHORIZATION_CODE"
val request = AddCredentials(
    authorizationCode = authorizationCode,
    market = "SE",
    scope = listOf(
        Scope.USER_CREATE,
        Scope.AUTHORIZATION_GRANT)
)

val appearance = makeMyTinkAppearance()
val launchMode = Modal(appearance)

Tink.AccountAggregation.addCredentials(
    activity = this,
    configuration = configuration,
    request = request,
    launchMode = launchMode,
    onSuccess = { success: TinkAccountAggregationSuccess ->
        Log.d("permanentAddCredentials", "SUCCESS")
    },
    onError = { error: TinkError ->
        Log.d("permanentAddCredentials", "ERROR")
    }
)
```

## 2. [Permanent user aggregation: Authenticate credentials](https://docs.tink.com/resources/tink-link-web/tink-link-web-api-reference-account-aggregation#authenticate-credentials)

* Previous implementation with Tink Link Android version prior 2.0:
```
 val linkUser = createdUser()?.let { LinkUser.ExistingUser(it) }
                ?: authorizationCode()?.let { LinkUser.UnauthenticatedUser(it) }
                ?: LinkUser.TemporaryUser(market = "SE", locale = "sv_SE")

 startActivityForResult(
                TinkLinkUiActivity.createIntent(
                    context = this,
                    linkUser = linkUser,
                    scopes = listOf(Scope.AccountsRead),
                    styleResId = R.style.TinkLinkUiStyle,
                    credentialsOperation = CredentialsOperation.Authenticate(credentialsId = "YOUR_CREDENTIALS_ID")
                ),
                REQUEST_CODE
            )
```

* New implementation with Tink Link 2.0:
```
val configuration = Configuration(
            clientId = "YOUR_CLIENT_ID",
            redirectUri = "YOUR_REDIRECT_URI"
)

val authorizationCode = "YOUR_AUTHORIZATION_CODE"
val credentialsId = "YOUR_CREDENTIALS_ID"
val request = AuthenticateCredentials(
    authorizationCode = authorizationCode,
    credentialsId = credentialsId,
    market = "SE"
)

val appearance = makeMyTinkAppearance()
val launchMode = Modal(appearance)

Tink.AccountAggregation.authenticateCredentials(
    activity = this,
    configuration = configuration,
    request = request,
    launchMode = launchMode,
    onSuccess = { success: TinkAccountAggregationSuccess ->
        Log.d("permanentAuthenticateCredentials", "SUCCESS")
    },
    onError = { error: TinkError ->
        Log.d("permanentAuthenticateCredentials", "ERROR")
    }
)
```

## 3. [Permanent user aggregation: Refresh credentials](https://docs.tink.com/resources/tink-link-web/tink-link-web-api-reference-account-aggregation#refresh-credentials)

* Previous implementation with Tink Link Android version prior 2.0:
```
 val linkUser = createdUser()?.let { LinkUser.ExistingUser(it) }
                ?: authorizationCode()?.let { LinkUser.UnauthenticatedUser(it) }
                ?: LinkUser.TemporaryUser(market = "SE", locale = "sv_SE")

 startActivityForResult(
                TinkLinkUiActivity.createIntent(
                    context = this,
                    linkUser = linkUser,
                    scopes = listOf(Scope.AccountsRead),
                    styleResId = R.style.TinkLinkUiStyle,
                    credentialsOperation = CredentialsOperation.Refresh(credentialsId = "YOUR_CREDENTIALS_ID")
                ),
                REQUEST_CODE
            )
```

* New implementation with Tink Link 2.0:

```
val configuration = Configuration(
            clientId = "YOUR_CLIENT_ID",
            redirectUri = "YOUR_REDIRECT_URI"
)

val authorizationCode = "YOUR_AUTHORIZATION_CODE"
val credentialsId = "YOUR_CREDENTIALS_ID"
val request = RefreshCredentials(
    authorizationCode = authorizationCode,
    credentialsId = credentialsId,
    market = "SE",
    authenticate = true
)

val appearance = makeMyTinkAppearance()
val launchMode = Modal(appearance)

Tink.AccountAggregation.refreshCredentials(
    activity = this,
    configuration = configuration,
    request = request,
    launchMode = launchMode,
    onSuccess = { success: TinkAccountAggregationSuccess ->
        Log.d("permanentRefreshCredentials", "SUCCESS")
    },
    onError = { error: TinkError ->
        Log.d("permanentRefreshCredentials", "ERROR")
    }
)
```

## 4. Permanent user aggregation: Update 
Call is not available in Tink Link 2.0. Use [Extend consent](https://docs.tink.com/resources/tink-link-web/tink-link-web-api-reference-account-aggregation#extend-consent) instead.

* Previous implementation with Tink Link Android version prior 2.0:

```
val linkUser = createdUser()?.let { LinkUser.ExistingUser(it) }
                ?: authorizationCode()?.let { LinkUser.UnauthenticatedUser(it) }
                ?: LinkUser.TemporaryUser(market = "SE", locale = "sv_SE")

 startActivityForResult(
                TinkLinkUiActivity.createIntent(
                    context = this,
                    linkUser = linkUser,
                    scopes = listOf(Scope.AccountsRead),
                    styleResId = R.style.TinkLinkUiStyle,
                    credentialsOperation = CredentialsOperation.Update(credentialsId = "YOUR_CREDENTIALS_ID")
                ),
                REQUEST_CODE
            )

```

* New implementation with Tink Link 2.0:

```
val configuration = Configuration(
            clientId = "YOUR_CLIENT_ID",
            redirectUri = "YOUR_REDIRECT_URI"
)

val market = "SE"
val request = ExtendConsent(
    authorizationCode = "YOUR_AUTHORIZATION_CODE",
    credentialsId = "YOUR_CREDENTIALS_ID",
    market = market
)

val appearance = makeMyTinkAppearance()
val launchMode = Modal(appearance)

Tink.AccountAggregation.extendConsent(
    activity = this,
    configuration = configuration,
    request = request,
    launchMode = launchMode,
    onSuccess = { success: TinkAccountAggregationSuccess ->
        Log.d("permanentExtendConsent", "SUCCESS")
    },
    onError = { error: TinkError ->
        Log.d("permanentExtendConsent", "ERROR")
    }
)
```
