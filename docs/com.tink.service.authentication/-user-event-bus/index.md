[link](../../index.md) / [com.tink.service.authentication](../index.md) / [UserEventBus](./index.md)

# UserEventBus

`@Singleton class UserEventBus`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UserEventBus()` |

### Functions

| Name | Summary |
|---|---|
| [postUser](post-user.md) | `fun postUser(user: `[`User`](../../com.tink.service.authentication.user/-user/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [subscribe](subscribe.md) | `fun subscribe(onUserReceived: (`[`User`](../../com.tink.service.authentication.user/-user/index.md)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Disposable` |
