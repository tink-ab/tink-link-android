[link](../../index.md) / [com.tink.rest.models](../index.md) / [User](./index.md)

# User

`@JsonClass(true) data class User`

The user model represents a unique Tink end-user and includes properties that defines the user, user profile information and user-modifiable settings. The user information can primarily be used whenever a Tink user signs up for a 3rd party service using her Tink account, or when user-modifiable settings, such as locale or currency, are needed in order to display or calculate the correct data in the 3rd party service.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The user model represents a unique Tink end-user and includes properties that defines the user, user profile information and user-modifiable settings. The user information can primarily be used whenever a Tink user signs up for a 3rd party service using her Tink account, or when user-modifiable settings, such as locale or currency, are needed in order to display or calculate the correct data in the 3rd party service.`User(created: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, profile: `[`UserProfile`](../-user-profile/index.md)`, flags: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, username: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, nationalId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [created](created.md) | The date when the user was created.`var created: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [flags](flags.md) | The user-specific feature flags assigned to the user.`var flags: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [id](id.md) | The internal identifier of the user.`var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [nationalId](national-id.md) | Detected national identification number of the end-user.`var nationalId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [profile](profile.md) | The configurable profile of the user.`var profile: `[`UserProfile`](../-user-profile/index.md) |
| [username](username.md) | The username (usually email) of the user.`var username: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
