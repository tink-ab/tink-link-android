[link](../../index.md) / [com.tink.link.consent](../index.md) / [ConsentContext](./index.md)

# ConsentContext

`class ConsentContext`

Context for handling things around user consent.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Context for handling things around user consent.`ConsentContext(consentService: `[`ConsentService`](../../com.tink.service.consent/-consent-service/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [scope](scope.md) | `val scope: CoroutineScope` |

### Functions

| Name | Summary |
|---|---|
| [describeClient](describe-client.md) | Get the [client description](../../com.tink.model.consent/-o-auth-client-description/index.md) for a client with the provided scopes.`fun describeClient(scopes: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Scope`](../../com.tink.model.user/-scope/index.md)`>, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`OAuthClientDescription`](../../com.tink.model.consent/-o-auth-client-description/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [privacyPolicy](privacy-policy.md) | Get a link to the Privacy Policy for Tink Link.`fun privacyPolicy(locale: `[`Locale`](https://docs.oracle.com/javase/6/docs/api/java/util/Locale.html)` = Locale.getDefault()): `[`Uri`](https://developer.android.com/reference/android/net/Uri.html) |
| [termsAndConditions](terms-and-conditions.md) | Get a link to the Terms &amp; Conditions for Tink Link.`fun termsAndConditions(locale: `[`Locale`](https://docs.oracle.com/javase/6/docs/api/java/util/Locale.html)` = Locale.getDefault()): `[`Uri`](https://developer.android.com/reference/android/net/Uri.html) |
