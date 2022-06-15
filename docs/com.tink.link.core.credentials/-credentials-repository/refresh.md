[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialsRepository](index.md) / [refresh](./refresh.md)

# refresh

`fun refresh(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, authenticate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, statusChangeObserver: `[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<`[`CredentialsStatus`](../-credentials-status/index.md)`>, items: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`RefreshableItem`](../../com.tink.model.credentials/-refreshable-item/index.md)`>? = null): `[`StreamSubscription`](../../com.tink.service.streaming.publisher/-stream-subscription/index.md)

Refreshes the [Credentials](../../com.tink.model.credentials/-credentials/index.md) matching the [credentialsId](refresh.md#com.tink.link.core.credentials.CredentialsRepository$refresh(kotlin.String, kotlin.Boolean, com.tink.service.streaming.publisher.StreamObserver((com.tink.link.core.credentials.CredentialsStatus)), kotlin.collections.Set((com.tink.model.credentials.RefreshableItem)))/credentialsId).

### Parameters

`authenticate` - Force an authentication before the refresh, designed for open banking credentials. Defaults to false. (optional)

`statusChangeObserver` - An observer which will receive callbacks when there are
updates to the status of the credentials. Successful and intermediate status will be posted in
[onNext](../../com.tink.service.streaming.publisher/-stream-observer/on-next.md), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)
via [onError](../../com.tink.service.streaming.publisher/-stream-observer/on-error.md). If the creation finished successfully, you will also
receive a call to [onCompleted](../../com.tink.service.streaming.publisher/-stream-observer/on-completed.md), after which there will be no other
calls to this stream observer.

`items` - A list of [RefreshableItem](../../com.tink.model.credentials/-refreshable-item/index.md) representing the data types to aggregate from the Provider. If omitted, all data types are aggregated.