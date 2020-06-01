[link](../../index.md) / [com.tink.model.transfer](../index.md) / [SignableOperation](./index.md)

# SignableOperation

`data class SignableOperation : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Types

| Name | Summary |
|---|---|
| [Status](-status/index.md) | The status of the operation. [CANCELLED](-status/-c-a-n-c-e-l-l-e-d.md), [FAILED](-status/-f-a-i-l-e-d.md) and [EXECUTED](-status/-e-x-e-c-u-t-e-d.md) are all endstates.`enum class Status` |
| [Type](-type/index.md) | `enum class Type` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SignableOperation(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, created: Instant, status: Status, statusMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, type: Type, underlyingId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, updated: Instant, userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [created](created.md) | `val created: Instant` |
| [credentialsId](credentials-id.md) | `val credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [id](id.md) | `val id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [status](status.md) | `val status: Status` |
| [statusMessage](status-message.md) | `val statusMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [type](type.md) | `val type: Type` |
| [underlyingId](underlying-id.md) | `val underlyingId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [updated](updated.md) | `val updated: Instant` |
| [userId](user-id.md) | `val userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
