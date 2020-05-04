[link](../../index.md) / [com.tink.rest.models](../index.md) / [OAuth2AuthenticationTokenResponse](./index.md)

# OAuth2AuthenticationTokenResponse

`@JsonClass(true) data class OAuth2AuthenticationTokenResponse`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `OAuth2AuthenticationTokenResponse(tokenType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, expiresIn: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, accessToken: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, refreshToken: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, scope: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, idHint: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [accessToken](access-token.md) | The access token that can be used to access an API resource. It should be treated as opaque (no defined format).`var accessToken: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [expiresIn](expires-in.md) | The amount of time in seconds for the expiration of the token.`var expiresIn: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [idHint](id-hint.md) | Human readable information about the identity of user`var idHint: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [refreshToken](refresh-token.md) | The refresh token that can be used to get a new access token. It should be treated as opaque (no defined format).`var refreshToken: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [scope](scope.md) | The scope valid for the returned token.`var scope: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [tokenType](token-type.md) | The type of authorization token returned.`var tokenType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
