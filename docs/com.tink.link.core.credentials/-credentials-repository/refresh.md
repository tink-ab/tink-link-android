[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialsRepository](index.md) / [refresh](./refresh.md)

# refresh

`fun refresh(credentialsIds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, items: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`RefreshableItem`](../../com.tink.model.credentials/-refreshable-item/index.md)`>? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Refreshes all [Credentials](../../com.tink.model.credentials/-credentials/index.md) objects matching the list of ids.

### Parameters

`credentialsIds` - List of identifiers for all the [Credentials](../../com.tink.model.credentials/-credentials/index.md) objects that is being refreshed

`resultHandler` - The [ResultHandler](../../com.tink.service.handler/-result-handler/index.md) for processing error and success callbacks

`items` - A list of [RefreshableItem](../../com.tink.model.credentials/-refreshable-item/index.md) representing the data types to aggregate from the Provider. If omitted, all data types are aggregated.