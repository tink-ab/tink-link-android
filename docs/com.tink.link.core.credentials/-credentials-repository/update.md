[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialsRepository](index.md) / [update](./update.md)

# update

`fun update(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, statusChangeObserver: `[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<`[`CredentialsStatus`](../-credentials-status/index.md)`>): `[`StreamSubscription`](../../com.tink.service.streaming.publisher/-stream-subscription/index.md)

Updates the [Credentials](../../com.tink.model.credentials/-credentials/index.md) matching the [credentialsId](update.md#com.tink.link.core.credentials.CredentialsRepository$update(kotlin.String, kotlin.String, kotlin.collections.Map((kotlin.String, )), com.tink.service.streaming.publisher.StreamObserver((com.tink.link.core.credentials.CredentialsStatus)))/credentialsId).

You can only update the value of a [Field](../../com.tink.model.misc/-field/index.md) that is mutable.

### Parameters

`fields` - The map of [Field](../../com.tink.model.misc/-field/index.md) name and value pairs for the [Credentials](../../com.tink.model.credentials/-credentials/index.md)

`statusChangeObserver` - An observer which will receive callbacks when there are
updates to the status of the credentials. Successful and intermediate status will be posted in
[onNext](../../com.tink.service.streaming.publisher/-stream-observer/on-next.md), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)
via [onError](../../com.tink.service.streaming.publisher/-stream-observer/on-error.md). If the creation finished successfully, you will also
receive a call to [onCompleted](../../com.tink.service.streaming.publisher/-stream-observer/on-completed.md), after which there will be no other
calls to this stream observer.