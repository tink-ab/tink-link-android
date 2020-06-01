[link](../../index.md) / [com.tink.link.payments](../index.md) / [TransferMessage](./index.md)

# TransferMessage

`data class TransferMessage`

The message for a transfer.

### Parameters

`destinationMessage` - This is the message that will be displayed to the
recipient of the transfer.

`sourceMessage` - This is the message that will be displayed on the source
source account. If not provided it will be the same as [destinationMessage](destination-message.md).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The message for a transfer.`TransferMessage(destinationMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, sourceMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [destinationMessage](destination-message.md) | This is the message that will be displayed to the recipient of the transfer.`val destinationMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [sourceMessage](source-message.md) | This is the message that will be displayed on the source source account. If not provided it will be the same as [destinationMessage](destination-message.md).`val sourceMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
