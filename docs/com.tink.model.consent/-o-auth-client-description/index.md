[link](../../index.md) / [com.tink.model.consent](../index.md) / [OAuthClientDescription](./index.md)

# OAuthClientDescription

`data class OAuthClientDescription : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

A description of the OAuth client and the data it will collect from the user.

### Parameters

`clientName` - : The name of the application specified by the client when creating it in the console.

`clientUrl` - : A url specified by the client for additional information. Can be empty.

`clientIconUrl` - : A url for a client icon. Can be empty.

`scopeDescriptions` - : A list of [ScopeDescription](../-scope-description/index.md)s describing which financial info is going to be collected.

`verified` - : Indicates whether the app is verified or not. If it is unverified, the user should be cautious when sharing financial data.

`aggregator` - : Describes whether the client is aggregating data under their own or under Tink's license.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A description of the OAuth client and the data it will collect from the user.`OAuthClientDescription(clientName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, clientUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, clientIconUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, verified: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, aggregator: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, scopeDescriptions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ScopeDescription`](../-scope-description/index.md)`>)` |

### Properties

| Name | Summary |
|---|---|
| [aggregator](aggregator.md) | : Describes whether the client is aggregating data under their own or under Tink's license.`val aggregator: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [clientIconUrl](client-icon-url.md) | : A url for a client icon. Can be empty.`val clientIconUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [clientName](client-name.md) | : The name of the application specified by the client when creating it in the console.`val clientName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [clientUrl](client-url.md) | : A url specified by the client for additional information. Can be empty.`val clientUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [scopeDescriptions](scope-descriptions.md) | : A list of [ScopeDescription](../-scope-description/index.md)s describing which financial info is going to be collected.`val scopeDescriptions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ScopeDescription`](../-scope-description/index.md)`>` |
| [verified](verified.md) | : Indicates whether the app is verified or not. If it is unverified, the user should be cautious when sharing financial data.`val verified: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
