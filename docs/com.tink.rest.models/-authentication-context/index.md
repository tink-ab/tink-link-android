[link](../../index.md) / [com.tink.rest.models](../index.md) / [AuthenticationContext](./index.md)

# AuthenticationContext

`@JsonClass(true) data class AuthenticationContext`

### Types

| Name | Summary |
|---|---|
| [ClientTypeEnum](-client-type-enum/index.md) | Values: IOS, ANDROID, OTHER`enum class ClientTypeEnum` |
| [HttpAuthenticationMethodEnum](-http-authentication-method-enum/index.md) | Values: SESSION, BASIC, BEARER, NON_VALID, TOKEN`enum class HttpAuthenticationMethodEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AuthenticationContext(metadata: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, user: `[`User`](../-user/index.md)`? = null, appId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, userAgent: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, remoteAddress: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, authenticated: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, userDeviceId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, httpAuthenticationMethod: HttpAuthenticationMethodEnum? = null, oauth2Client: `[`OAuth2Client`](../-o-auth2-client/index.md)`? = null, client: `[`Client`](../-client/index.md)`? = null, clientType: ClientTypeEnum? = null, administrativeMode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [administrativeMode](administrative-mode.md) | `var administrativeMode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [appId](app-id.md) | `var appId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [authenticated](authenticated.md) | `var authenticated: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [client](client.md) | `var client: `[`Client`](../-client/index.md)`?` |
| [clientType](client-type.md) | `var clientType: ClientTypeEnum?` |
| [httpAuthenticationMethod](http-authentication-method.md) | `var httpAuthenticationMethod: HttpAuthenticationMethodEnum?` |
| [metadata](metadata.md) | `var metadata: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [oauth2Client](oauth2-client.md) | `var oauth2Client: `[`OAuth2Client`](../-o-auth2-client/index.md)`?` |
| [remoteAddress](remote-address.md) | `var remoteAddress: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [user](user.md) | `var user: `[`User`](../-user/index.md)`?` |
| [userAgent](user-agent.md) | `var userAgent: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [userDeviceId](user-device-id.md) | `var userDeviceId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
