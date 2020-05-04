[link](../../index.md) / [com.tink.rest.models](../index.md) / [AuthenticatedUser](./index.md)

# AuthenticatedUser

`@JsonClass(true) data class AuthenticatedUser`

### Types

| Name | Summary |
|---|---|
| [MethodEnum](-method-enum/index.md) | Values: SESSION, BASIC, BEARER, NON_VALID, TOKEN`enum class MethodEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AuthenticatedUser(method: MethodEnum? = null, appId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, user: `[`User`](../-user/index.md)`? = null, administrativeMode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, scopes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, oauthClientId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [administrativeMode](administrative-mode.md) | `var administrativeMode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [appId](app-id.md) | `var appId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [locale](locale.md) | `var locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [method](method.md) | `var method: MethodEnum?` |
| [oauthClientId](oauth-client-id.md) | `var oauthClientId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [scopes](scopes.md) | `var scopes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [user](user.md) | `var user: `[`User`](../-user/index.md)`?` |
