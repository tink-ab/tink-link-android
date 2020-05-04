[link](../../index.md) / [com.tink.rest.models](../index.md) / [CreateUserRequest](./index.md)

# CreateUserRequest

`@JsonClass(true) data class CreateUserRequest`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CreateUserRequest(market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, externalUserId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [externalUserId](external-user-id.md) | Optional external user ID for the created user.`var externalUserId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [locale](locale.md) | Locale for the user. Defaults to default locale for the user&#39;s market.`var locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [market](market.md) | Market specific code for the user as a ISO 3166-1 country code.`var market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
