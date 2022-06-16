---
title: [common]TransferService
---
//[link](../../../index.html)/[com.tink.service.transfer](../index.html)/[[common]TransferService](index.html)



# TransferService



[common]\
interface [TransferService](index.html)



## Functions


| Name | Summary |
|---|---|
| [addBeneficiary](add-beneficiary.html) | [common]<br>abstract suspend fun [addBeneficiary](add-beneficiary.html)(descriptor: [CreateBeneficiaryDescriptor](../[common]-create-beneficiary-descriptor/index.html))<br>Add a new beneficiary |
| [getBeneficiaries](get-beneficiaries.html) | [common]<br>abstract suspend fun [getBeneficiaries](get-beneficiaries.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Beneficiary](../../com.tink.model.transfer/[common]-beneficiary/index.html)&gt;<br>Lists all beneficiaries of the current user |
| [getSourceAccounts](get-source-accounts.html) | [common]<br>abstract suspend fun [getSourceAccounts](get-source-accounts.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Account](../../com.tink.model.account/[common]-account/index.html)&gt;<br>Fetch a list of available source accounts. |
| [getTransferStatus](get-transfer-status.html) | [common]<br>abstract suspend fun [getTransferStatus](get-transfer-status.html)(transferId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.html)<br>Retrieves information about the current status of a transfer. |
| [initiateTransfer](initiate-transfer.html) | [common]<br>abstract suspend fun [initiateTransfer](initiate-transfer.html)(descriptor: [CreateTransferDescriptor](../[common]-create-transfer-descriptor/index.html)): [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.html)<br>Initiates a new transfer |

