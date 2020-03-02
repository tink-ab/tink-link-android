[link](../../index.md) / [com.tink.link.consent](../index.md) / [ConsentContext](./index.md)

# ConsentContext

`class ConsentContext`

Context for handling things around user consent.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Context for handling things around user consent.`ConsentContext(consentService: `[`ConsentService`](../../com.tink.service.consent/-consent-service/index.md)`)` |

### Functions

| Name | Summary |
|---|---|
| [privacyPolicy](privacy-policy.md) | Get a link to the Privacy Policy for Tink Link.`fun privacyPolicy(locale: `[`Locale`](https://docs.oracle.com/javase/6/docs/api/java/util/Locale.html)` = Locale.getDefault()): `[`Uri`](https://developer.android.com/reference/android/net/Uri.html) |
| [scopeDescriptions](scope-descriptions.md) | Lists [scope descriptions](../../com.tink.service.consent/-scope-description/index.md) for the provided scopes.`fun scopeDescriptions(scopes: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Scope`](../../com.tink.service.authorization/-scope/index.md)`>, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ScopeDescription`](../../com.tink.service.consent/-scope-description/index.md)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [termsAndConditions](terms-and-conditions.md) | Get a link to the Terms &amp; Conditions for Tink Link.`fun termsAndConditions(locale: `[`Locale`](https://docs.oracle.com/javase/6/docs/api/java/util/Locale.html)` = Locale.getDefault()): `[`Uri`](https://developer.android.com/reference/android/net/Uri.html) |
