[link](../../index.md) / [com.tink.link.payments](../index.md) / [TransferRepository](index.md) / [initiateTransfer](./initiate-transfer.md)

# initiateTransfer

`abstract fun initiateTransfer(amount: `[`Amount`](../../com.tink.model.misc/-amount/index.md)`, sourceAccountUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, beneficiaryUri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, message: `[`TransferMessage`](../-transfer-message/index.md)`, statusChangeObserver: `[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<`[`TransferStatus`](../-transfer-status/index.md)`>): `[`StreamSubscription`](../../com.tink.service.streaming.publisher/-stream-subscription/index.md)

Initiate a new transfer

### Parameters

`amount` - The amount that should be transferred. Its [currencyCode](../../com.tink.model.misc/-amount/currency-code.md)
should be the same as the source account's currency.

`sourceAccountUri` - The uri for the source account of the transfer. It can be retrieved
for example from [Account.identifiers](../../com.tink.model.account/-account/identifiers.md)

`beneficiaryUri` - The uri of the beneficiary the transfer is sent to.
See [Beneficiary.uri](../../com.tink.model.transfer/-beneficiary/uri.md)

`message` - The message used for the transfer.

`statusChangeObserver` - An observer which will receive callbacks when there are
updates to the status of the transfer. Successful and intermediate status will be posted in
[onNext](../../com.tink.service.streaming.publisher/-stream-observer/on-next.md), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)
via [onError](../../com.tink.service.streaming.publisher/-stream-observer/on-error.md). If the transfer finished successfully, you will also
receive a call to [onCompleted](../../com.tink.service.streaming.publisher/-stream-observer/on-completed.md), after which there will be no other
calls to this stream observer.

**Return**
a [StreamSubscription](../../com.tink.service.streaming.publisher/-stream-subscription/index.md). Calling [unsubscribe](../../com.tink.service.streaming.publisher/-stream-subscription/unsubscribe.md) on it
will cancel polling of the transfer status. No more updates will be passed to the
[statusChangeObserver](initiate-transfer.md#com.tink.link.payments.TransferRepository$initiateTransfer(com.tink.model.misc.Amount, kotlin.String, kotlin.String, com.tink.link.payments.TransferMessage, com.tink.service.streaming.publisher.StreamObserver((com.tink.link.payments.TransferStatus)))/statusChangeObserver).

`abstract fun initiateTransfer(amount: `[`Amount`](../../com.tink.model.misc/-amount/index.md)`, sourceAccount: `[`Account`](../../com.tink.model.account/-account/index.md)`, beneficiary: `[`Beneficiary`](../../com.tink.model.transfer/-beneficiary/index.md)`, message: `[`TransferMessage`](../-transfer-message/index.md)`, statusChangeObserver: `[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<`[`TransferStatus`](../-transfer-status/index.md)`>): `[`StreamSubscription`](../../com.tink.service.streaming.publisher/-stream-subscription/index.md)

Initiate a new transfer

### Parameters

`amount` - The amount that should be transferred. Its [currencyCode](../../com.tink.model.misc/-amount/currency-code.md)
should be the same as the source account's currency.

`sourceAccount` - The source account of this transfer. See [fetchAccounts](fetch-accounts.md).

`beneficiary` - The beneficiary of this transfer. See [fetchBeneficiaries](fetch-beneficiaries.md).

`message` - The message used for the transfer.

`statusChangeObserver` - An observer which will receive callbacks when there are
updates to the status of the transfer. Successful and intermediate status will be posted in
[onNext](../../com.tink.service.streaming.publisher/-stream-observer/on-next.md), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)
via [onError](../../com.tink.service.streaming.publisher/-stream-observer/on-error.md). If the transfer finished successfully, you will also
receive a call to [onCompleted](../../com.tink.service.streaming.publisher/-stream-observer/on-completed.md), after which there will be no other
calls to this stream observer.

**Return**
a [StreamSubscription](../../com.tink.service.streaming.publisher/-stream-subscription/index.md). Calling [unsubscribe](../../com.tink.service.streaming.publisher/-stream-subscription/unsubscribe.md) on it
will cancel polling of the transfer status. No more updates will be passed to the
[statusChangeObserver](initiate-transfer.md#com.tink.link.payments.TransferRepository$initiateTransfer(com.tink.model.misc.Amount, com.tink.model.account.Account, com.tink.model.transfer.Beneficiary, com.tink.link.payments.TransferMessage, com.tink.service.streaming.publisher.StreamObserver((com.tink.link.payments.TransferStatus)))/statusChangeObserver)

