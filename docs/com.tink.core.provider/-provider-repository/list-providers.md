[link](../../index.md) / [com.tink.core.provider](../index.md) / [ProviderRepository](index.md) / [listProviders](./list-providers.md)

# listProviders

`@JvmOverloads fun listProviders(handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`>>, filter: `[`ProviderFilter`](../../com.tink.service.provider/-provider-filter/index.md)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

List all providers on the current market. The result will already be filtered to only contain
providers that are [enabled](../../com.tink.model.provider/-provider/-status/-e-n-a-b-l-e-d.md)

### Parameters

`handler` - the [ResultHandler](../../com.tink.service.handler/-result-handler/index.md) for processing error and success callbacks

`filter` - An optional filter that can be passed to modify the resulting list of providers