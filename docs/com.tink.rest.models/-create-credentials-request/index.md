[link](../../index.md) / [com.tink.rest.models](../index.md) / [CreateCredentialsRequest](./index.md)

# CreateCredentialsRequest

`@JsonClass(true) data class CreateCredentialsRequest`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CreateCredentialsRequest(providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, callbackUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, appUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, triggerRefresh: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [appUri](app-uri.md) | The end user will be redirected to this URI after the authorization code has been delivered.`var appUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [callbackUri](callback-uri.md) | This URI will be used by the ASPSP to pass the authorization code. It corresponds to the redirect/callback URI in OAuth2/OpenId. This parameter is only applicable if you are a TPP.`var callbackUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [fields](fields.md) | This is a key-value map of &#x60;Field&#x60; name and value found on the &#x60;Provider&#x60; to which the credentials belongs to. This parameter is required when creating credentials.`var fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [providerName](provider-name.md) | The provider (financial institution) that the credentials is connected to.`var providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [triggerRefresh](trigger-refresh.md) | Defines if the Credentials creation should cause a refresh on aggregated data. Defaults to &#x60;true&#x60;`var triggerRefresh: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
