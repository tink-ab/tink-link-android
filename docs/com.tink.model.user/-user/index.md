[link](../../index.md) / [com.tink.model.user](../index.md) / [User](./index.md)

# User

`data class User : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `User(authorization: `[`Authorization`](../-authorization/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [authorization](authorization.md) | `val authorization: `[`Authorization`](../-authorization/index.md) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [fromAccessToken](from-access-token.md) | `fun fromAccessToken(accessToken: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`User`](./index.md) |
| [fromSessionId](from-session-id.md) | `fun fromSessionId(sessionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`User`](./index.md) |
