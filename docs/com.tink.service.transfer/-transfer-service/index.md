[link](../../index.md) / [com.tink.service.transfer](../index.md) / [TransferService](./index.md)

# TransferService

`interface TransferService`

### Functions

| Name | Summary |
|---|---|
| [addBeneficiary](add-beneficiary.md) | Add a new beneficiary`abstract suspend fun addBeneficiary(descriptor: `[`CreateBeneficiaryDescriptor`](../-create-beneficiary-descriptor/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getBeneficiaries](get-beneficiaries.md) | Lists all beneficiaries of the current user`abstract suspend fun getBeneficiaries(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Beneficiary`](../../com.tink.model.transfer/-beneficiary/index.md)`>` |
| [getSourceAccounts](get-source-accounts.md) | Fetch a list of available source accounts.`abstract suspend fun getSourceAccounts(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Account`](../../com.tink.model.account/-account/index.md)`>` |
| [getTransferStatus](get-transfer-status.md) | Retrieves information about the current status of a transfer.`abstract suspend fun getTransferStatus(transferId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SignableOperation`](../../com.tink.model.transfer/-signable-operation/index.md) |
| [initiateTransfer](initiate-transfer.md) | Initiates a new transfer`abstract suspend fun initiateTransfer(descriptor: `[`CreateTransferDescriptor`](../-create-transfer-descriptor/index.md)`): `[`SignableOperation`](../../com.tink.model.transfer/-signable-operation/index.md) |
