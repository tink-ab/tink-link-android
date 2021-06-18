//[link](../../index.md)/[com.tink.link.payments](../index.md)/[[androidJvm]TransferRepository](index.md)/[initiateTransfer](initiate-transfer.md)



# initiateTransfer  
[androidJvm]  
Content  
abstract fun [initiateTransfer](initiate-transfer.md)(amount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.md), sourceAccountUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), beneficiaryUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [TransferMessage](../[android-jvm]-transfer-message/index.md), statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/index.md)<[TransferStatus](../[android-jvm]-transfer-status/index.md)>): [StreamSubscription](../../com.tink.service.streaming.publisher/[android-jvm]-stream-subscription/index.md)  
More info  


Initiate a new transfer



#### Return  


a [StreamSubscription](../../com.tink.service.streaming.publisher/[android-jvm]-stream-subscription/index.md). Calling [unsubscribe](../../com.tink.service.streaming.publisher/[android-jvm]-stream-subscription/unsubscribe.md) on it will cancel polling of the transfer status. No more updates will be passed to the statusChangeObserver.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#kotlin.String#kotlin.String#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>amount| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#kotlin.String#kotlin.String#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a><br><br>The amount that should be transferred. Its [currencyCode](../../com.tink.model.misc/[android-jvm]-amount/currency-code.md) should be the same as the source account's currency.<br><br>
| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#kotlin.String#kotlin.String#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>sourceAccountUri| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#kotlin.String#kotlin.String#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a><br><br>The uri for the source account of the transfer. It can be retrieved for example from [Account.identifiers](../../com.tink.model.account/[android-jvm]-account/identifiers.md)<br><br>
| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#kotlin.String#kotlin.String#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>beneficiaryUri| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#kotlin.String#kotlin.String#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a><br><br>The uri of the beneficiary the transfer is sent to. See [Beneficiary.uri](../../com.tink.model.transfer/[android-jvm]-beneficiary/uri.md)<br><br>
| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#kotlin.String#kotlin.String#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>message| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#kotlin.String#kotlin.String#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a><br><br>The message used for the transfer.<br><br>
| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#kotlin.String#kotlin.String#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>statusChangeObserver| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#kotlin.String#kotlin.String#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a><br><br>An observer which will receive callbacks when there are updates to the status of the transfer. Successful and intermediate status will be posted in [onNext](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-next.md), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via [onError](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-error.md). If the transfer finished successfully, you will also receive a call to [onCompleted](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-completed.md), after which there will be no other calls to this stream observer.<br><br>
  
  


[androidJvm]  
Content  
abstract fun [initiateTransfer](initiate-transfer.md)(amount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.md), sourceAccount: [Account](../../com.tink.model.account/[android-jvm]-account/index.md), beneficiary: [Beneficiary](../../com.tink.model.transfer/[android-jvm]-beneficiary/index.md), message: [TransferMessage](../[android-jvm]-transfer-message/index.md), statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/index.md)<[TransferStatus](../[android-jvm]-transfer-status/index.md)>): [StreamSubscription](../../com.tink.service.streaming.publisher/[android-jvm]-stream-subscription/index.md)  
More info  


Initiate a new transfer



#### Return  


a [StreamSubscription](../../com.tink.service.streaming.publisher/[android-jvm]-stream-subscription/index.md). Calling [unsubscribe](../../com.tink.service.streaming.publisher/[android-jvm]-stream-subscription/unsubscribe.md) on it will cancel polling of the transfer status. No more updates will be passed to the statusChangeObserver



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>amount| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a><br><br>The amount that should be transferred. Its [currencyCode](../../com.tink.model.misc/[android-jvm]-amount/currency-code.md) should be the same as the source account's currency.<br><br>
| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>sourceAccount| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a><br><br>The source account of this transfer. See [fetchAccounts](fetch-accounts.md).<br><br>
| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>beneficiary| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a><br><br>The beneficiary of this transfer. See [fetchBeneficiaries](fetch-beneficiaries.md).<br><br>
| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>message| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a><br><br>The message used for the transfer.<br><br>
| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a>statusChangeObserver| <a name="com.tink.link.payments/TransferRepository/initiateTransfer/#com.tink.model.misc.Amount#com.tink.model.account.Account#com.tink.model.transfer.Beneficiary#com.tink.link.payments.TransferMessage#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.payments.TransferStatus]/PointingToDeclaration/"></a><br><br>An observer which will receive callbacks when there are updates to the status of the transfer. Successful and intermediate status will be posted in [onNext](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-next.md), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via [onError](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-error.md). If the transfer finished successfully, you will also receive a call to [onCompleted](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-completed.md), after which there will be no other calls to this stream observer.<br><br>
  
  



