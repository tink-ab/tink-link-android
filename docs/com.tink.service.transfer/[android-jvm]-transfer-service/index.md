---
title: [androidJvm]TransferService
---
//[link](../../../index.html)/[com.tink.service.transfer](../index.html)/[[androidJvm]TransferService](index.html)



# TransferService



[androidJvm]\
interface [TransferService](index.html)



## Functions


| Name | Summary |
|---|---|
| [addBeneficiary](add-beneficiary.html) | [androidJvm]<br>abstract suspend fun [addBeneficiary](add-beneficiary.html)(descriptor: [CreateBeneficiaryDescriptor](../[android-jvm]-create-beneficiary-descriptor/index.html))<br>Add a new beneficiary |
| [getBeneficiaries](get-beneficiaries.html) | [androidJvm]<br>abstract suspend fun [getBeneficiaries](get-beneficiaries.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Beneficiary](../../com.tink.model.transfer/[android-jvm]-beneficiary/index.html)&gt;<br>Lists all beneficiaries of the current user |
| [getSourceAccounts](get-source-accounts.html) | [androidJvm]<br>abstract suspend fun [getSourceAccounts](get-source-accounts.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Account](../../com.tink.model.account/[android-jvm]-account/index.html)&gt;<br>Fetch a list of available source accounts. |
| [getTransferStatus](get-transfer-status.html) | [androidJvm]<br>abstract suspend fun [getTransferStatus](get-transfer-status.html)(transferId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [SignableOperation](../../com.tink.model.transfer/[android-jvm]-signable-operation/index.html)<br>Retrieves information about the current status of a transfer. |
| [initiateTransfer](initiate-transfer.html) | [androidJvm]<br>abstract suspend fun [initiateTransfer](initiate-transfer.html)(descriptor: [CreateTransferDescriptor](../[android-jvm]-create-transfer-descriptor/index.html)): [SignableOperation](../../com.tink.model.transfer/[android-jvm]-signable-operation/index.html)<br>Initiates a new transfer |

