[link](../index.md) / [com.tink.link.payments](./index.md)

## Package com.tink.link.payments

### Types

| Name | Summary |
|---|---|
| [AddBeneficiaryStatus](-add-beneficiary-status/index.md) | The status of a transfer. Possible values are [Success](-add-beneficiary-status/-success/index.md), [Loading](-add-beneficiary-status/-loading/index.md), and [AwaitingAuthentication](-add-beneficiary-status/-awaiting-authentication/index.md)`sealed class AddBeneficiaryStatus` |
| [TinkLinkPayments](-tink-link-payments/index.md) (Since: `999999999.0.0`) | This is for Java compatibility only. Use extensions on [Tink](../com.tink.core/-tink/index.md) when using Kotlin`object TinkLinkPayments` |
| [TransferMessage](-transfer-message/index.md) | The message for a transfer.`data class TransferMessage` |
| [TransferRepository](-transfer-repository/index.md) | Repository for initiating transfers and retrieving the necessary input for that action.`interface TransferRepository` |
| [TransferStatus](-transfer-status/index.md) | The status of a transfer. Possible values are [Success](-transfer-status/-success/index.md), [Loading](-transfer-status/-loading/index.md), and [AwaitingAuthentication](-transfer-status/-awaiting-authentication/index.md)`sealed class TransferStatus` |

### Exceptions

| Name | Summary |
|---|---|
| [AddBeneficiaryFailure](-add-beneficiary-failure/index.md) | `class AddBeneficiaryFailure : `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [TransferFailure](-transfer-failure/index.md) | `class TransferFailure : `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |

### Functions

| Name | Summary |
|---|---|
| [getTransferRepository](get-transfer-repository.md) | Fetches the [TransferRepository](-transfer-repository/index.md) from Tink.`fun `[`Tink`](../com.tink.core/-tink/index.md)`.getTransferRepository(): `[`TransferRepository`](-transfer-repository/index.md) |
