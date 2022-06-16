[link](../../../index.md) / [com.tink.link.core.credentials](../../index.md) / [CredentialsStatus](../index.md) / [Loading](./index.md)

# Loading

`data class Loading : `[`CredentialsStatus`](../index.md)

The creation is being processed by Tink. There is currently no user action
required.

### Parameters

`message` - a message containing details about the status.

`credentials` - the credentials being processed, if available

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The creation is being processed by Tink. There is currently no user action required.`Loading(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, credentials: `[`Credentials`](../../../com.tink.model.credentials/-credentials/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [credentials](credentials.md) | the credentials being processed, if available`val credentials: `[`Credentials`](../../../com.tink.model.credentials/-credentials/index.md)`?` |
| [message](message.md) | a message containing details about the status.`val message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
