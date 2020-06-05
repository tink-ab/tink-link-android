[link](../../index.md) / [com.tink.link.payments](../index.md) / [TransferRepository](./index.md)

# TransferRepository

`interface TransferRepository`

Repository for initiating transfers and retrieving the necessary input for that action.

### Functions

| Name | Summary |
|---|---|
| [fetchAccounts](fetch-accounts.md) | Fetch all accounts of the user that are suitable to pick as the source of a transfer.`abstract fun fetchAccounts(resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Account`](../../com.tink.model.account/-account/index.md)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [fetchBeneficiaries](fetch-beneficiaries.md) | Fetch all beneficiaries of the user.`abstract fun fetchBeneficiaries(resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Beneficiary`](../../com.tink.model.transfer/-beneficiary/index.md)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [initiateTransfer](initiate-transfer.md) | Initiate a new transfer`abstract fun initiateTransfer(amount: `[`Amount`](../../com.tink.model.misc/-amount/index.md)`, sourceAccountUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, beneficiaryUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, message: `[`TransferMessage`](../-transfer-message/index.md)`, statusChangeObserver: `[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<`[`TransferStatus`](../-transfer-status/index.md)`>): `[`StreamSubscription`](../../com.tink.service.streaming.publisher/-stream-subscription/index.md)<br>`abstract fun initiateTransfer(amount: `[`Amount`](../../com.tink.model.misc/-amount/index.md)`, sourceAccount: `[`Account`](../../com.tink.model.account/-account/index.md)`, beneficiary: `[`Beneficiary`](../../com.tink.model.transfer/-beneficiary/index.md)`, message: `[`TransferMessage`](../-transfer-message/index.md)`, statusChangeObserver: `[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<`[`TransferStatus`](../-transfer-status/index.md)`>): `[`StreamSubscription`](../../com.tink.service.streaming.publisher/-stream-subscription/index.md) |
