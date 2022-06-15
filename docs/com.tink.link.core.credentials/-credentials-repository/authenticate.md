[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialsRepository](index.md) / [authenticate](./authenticate.md)

# authenticate

`fun authenticate(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, statusChangeObserver: `[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<`[`CredentialsStatus`](../-credentials-status/index.md)`>): `[`StreamSubscription`](../../com.tink.service.streaming.publisher/-stream-subscription/index.md)

Manually authenticates the [Credentials](../../com.tink.model.credentials/-credentials/index.md) matching the [credentialsId](authenticate.md#com.tink.link.core.credentials.CredentialsRepository$authenticate(kotlin.String, com.tink.service.streaming.publisher.StreamObserver((com.tink.link.core.credentials.CredentialsStatus)))/credentialsId). This is only applicable for PSD2 credentials.

### Parameters

`statusChangeObserver` - An observer which will receive callbacks when there are
updates to the status of the credentials. Successful and intermediate status will be posted in
[onNext](../../com.tink.service.streaming.publisher/-stream-observer/on-next.md), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)
via [onError](../../com.tink.service.streaming.publisher/-stream-observer/on-error.md). If the creation finished successfully, you will also
receive a call to [onCompleted](../../com.tink.service.streaming.publisher/-stream-observer/on-completed.md), after which there will be no other
calls to this stream observer.