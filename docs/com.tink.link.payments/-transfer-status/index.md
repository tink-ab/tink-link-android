[link](../../index.md) / [com.tink.link.payments](../index.md) / [TransferStatus](./index.md)

# TransferStatus

`sealed class TransferStatus`

The status of a transfer.
Possible values are [Success](-success/index.md), [Loading](-loading/index.md), and [AwaitingAuthentication](-awaiting-authentication/index.md)

### Types

| Name | Summary |
|---|---|
| [AwaitingAuthentication](-awaiting-authentication/index.md) | There is an outstanding authentication waiting that needs to be completed by the user to proceed with the transfer.`class AwaitingAuthentication : `[`TransferStatus`](./index.md) |
| [Loading](-loading/index.md) | The transfer is being processed by Tink. There is currently no user action required.`data class Loading : `[`TransferStatus`](./index.md) |
| [Success](-success/index.md) | The status was successfully sent to the user's bank for processing.`data class Success : `[`TransferStatus`](./index.md) |
