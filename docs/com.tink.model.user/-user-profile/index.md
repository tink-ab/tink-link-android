[link](../../index.md) / [com.tink.model.user](../index.md) / [UserProfile](./index.md)

# UserProfile

`data class UserProfile : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UserProfile(username: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, timeZone: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, currency: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, authorizedLoginMethods: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`AuthenticationMethod`](../../com.tink.model.authentication/-authentication-method/index.md)`>, availableAuthenticationMethods: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`AuthenticationMethod`](../../com.tink.model.authentication/-authentication-method/index.md)`>)` |

### Properties

| Name | Summary |
|---|---|
| [authorizedLoginMethods](authorized-login-methods.md) | `val authorizedLoginMethods: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`AuthenticationMethod`](../../com.tink.model.authentication/-authentication-method/index.md)`>` |
| [availableAuthenticationMethods](available-authentication-methods.md) | `val availableAuthenticationMethods: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`AuthenticationMethod`](../../com.tink.model.authentication/-authentication-method/index.md)`>` |
| [currency](currency.md) | `val currency: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [locale](locale.md) | `val locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [market](market.md) | `val market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [timeZone](time-zone.md) | `val timeZone: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [username](username.md) | `val username: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| Name | Summary |
|---|---|
| [hasPassword](has-password.md) | `fun hasPassword(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
