---
title: [common]TransferRepository -
---
//[link](../../index.md)/[com.tink.link.payments](../index.md)/[[common]TransferRepository](index.md)



# TransferRepository  
 [common] interface [TransferRepository](index.md)

Repository for initiating transfers and retrieving the necessary input for that action.

   


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.payments/TransferRepository/addBeneficiary/#com.tink.model.account.Account#kotlin.String#kotlin.String#kotlin.String#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.AddBeneficiaryStatus]/PointingToDeclaration/"></a>[addBeneficiary](add-beneficiary.md)| <a name="com.tink.link.payments/TransferRepository/addBeneficiary/#com.tink.model.account.Account#kotlin.String#kotlin.String#kotlin.String#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.AddBeneficiaryStatus]/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [addBeneficiary](add-beneficiary.md)(ownerAccount: [Account](../../com.tink.model.account/[common]-account/index.md), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), streamObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.md)<[AddBeneficiaryStatus](../[common]-add-beneficiary-status/index.md)>): [StreamSubscription](../../com.tink.service.streaming.publisher/[common]-stream-subscription/index.md)  <br>abstract fun [addBeneficiary](add-beneficiary.md)(ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), streamObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.md)<[AddBeneficiaryStatus](../[common]-add-beneficiary-status/index.md)>): [StreamSubscription](../../com.tink.service.streaming.publisher/[common]-stream-subscription/index.md)  <br>More info  <br>Add a new beneficiary  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.tink.link.payments/TransferRepository/fetchAccounts/#com.tink.service.handler.ResultHandler[kotlin.collections.List[com.tink.model.account.Account]]/PointingToDeclaration/"></a>[fetchAccounts](fetch-accounts.md)| <a name="com.tink.link.payments/TransferRepository/fetchAccounts/#com.tink.service.handler.ResultHandler[kotlin.collections.List[com.tink.model.account.Account]]/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [fetchAccounts](fetch-accounts.md)(resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Account](../../com.tink.model.account/[common]-account/index.md)>>)  <br>More info  <br>Fetch all accounts of the user that are suitable to pick as the source of a transfer.  <br><br><br>
| <a name="com.tink.link.payments/TransferRepository/fetchBeneficiaries/#com.tink.service.handler.ResultHandler[kotlin.collections.List[com.tink.model.transfer.Beneficiary]]/PointingToDeclaration/"></a>[fetchBeneficiaries](fetch-beneficiaries.md)| <a name="com.tink.link.payments/TransferRepository/fetchBeneficiaries/#com.tink.service.handler.ResultHandler[kotlin.collections.List[com.tink.model.transfer.Beneficiary]]/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [fetchBeneficiaries](fetch-beneficiaries.md)(resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Beneficiary](../../com.tink.model.transfer/[common]-beneficiary/index.md)>>)  <br>More info  <br>Fetch all beneficiaries of the user.  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>[initiateTransfer](initiate-transfer.md)| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [initiateTransfer](initiate-transfer.md)(amount: [Amount](../../com.tink.model.misc/[common]-amount/index.md), sourceAccount: [Account](../../com.tink.model.account/[common]-account/index.md), beneficiary: [Beneficiary](../../com.tink.model.transfer/[common]-beneficiary/index.md), message: [TransferMessage](../[common]-transfer-message/index.md), statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.md)<[TransferStatus](../[common]-transfer-status/index.md)>): [StreamSubscription](../../com.tink.service.streaming.publisher/[common]-stream-subscription/index.md)  <br>abstract fun [initiateTransfer](initiate-transfer.md)(amount: [Amount](../../com.tink.model.misc/[common]-amount/index.md), sourceAccountUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), beneficiaryUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [TransferMessage](../[common]-transfer-message/index.md), statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.md)<[TransferStatus](../[common]-transfer-status/index.md)>): [StreamSubscription](../../com.tink.service.streaming.publisher/[common]-stream-subscription/index.md)  <br>More info  <br>Initiate a new transfer  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
