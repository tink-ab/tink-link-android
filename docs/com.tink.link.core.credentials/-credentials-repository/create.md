[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialsRepository](index.md) / [create](./create.md)

# create

`fun create(providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, credentialsType: Type, fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, statusChangeObserver: `[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<`[`CredentialsStatus`](../-credentials-status/index.md)`>, items: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`RefreshableItem`](../../com.tink.model.credentials/-refreshable-item/index.md)`>? = null): `[`StreamSubscription`](../../com.tink.service.streaming.publisher/-stream-subscription/index.md)

Creates a new [Credentials](../../com.tink.model.credentials/-credentials/index.md) object.

### Parameters

`providerName` - Identifier for the [Provider](../../com.tink.model.provider/-provider/index.md). See [Provider.name](../../com.tink.model.provider/-provider/name.md)

`credentialsType` - The [Credentials.Type](../../com.tink.model.credentials/-credentials/-type/index.md) used to authenticate the user to the financial institution

`fields` - The map of [Field](../../com.tink.model.misc/-field/index.md) name and value pairs for the [Provider](../../com.tink.model.provider/-provider/index.md)

`statusChangeObserver` - An observer which will receive callbacks when there are
updates to the status of the credentials. Successful and intermediate status will be posted in
[onNext](../../com.tink.service.streaming.publisher/-stream-observer/on-next.md), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)
via [onError](../../com.tink.service.streaming.publisher/-stream-observer/on-error.md). If the creation finished successfully, you will also
receive a call to [onCompleted](../../com.tink.service.streaming.publisher/-stream-observer/on-completed.md), after which there will be no other
calls to this stream observer.

`items` - A list of [RefreshableItem](../../com.tink.model.credentials/-refreshable-item/index.md) representing the data types to aggregate from the provider. If omitted, all data types are aggregated.