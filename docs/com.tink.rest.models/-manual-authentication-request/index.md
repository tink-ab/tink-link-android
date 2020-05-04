[link](../../index.md) / [com.tink.rest.models](../index.md) / [ManualAuthenticationRequest](./index.md)

# ManualAuthenticationRequest

`@JsonClass(true) data class ManualAuthenticationRequest`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ManualAuthenticationRequest(callbackUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, appUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [appUri](app-uri.md) | The end user will be redirected to this URI after the authorization code has been delivered.`var appUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [callbackUri](callback-uri.md) | This URI will be used by the ASPSP to pass the authorization code. It corresponds to the redirect/callback URI in OAuth2/OpenId. This parameter is only applicable if you are a TPP.`var callbackUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
