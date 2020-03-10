[link](../../index.md) / [com.tink.core.provider](../index.md) / [ProviderRepository](index.md) / [listProviders](./list-providers.md)

# listProviders

`@JvmOverloads fun listProviders(handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`>>, includeDemoProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

List all providers on the current market. The result will already be filtered to only contain
providers that are [enabled](../../com.tink.model.provider/-provider/-status/-e-n-a-b-l-e-d.md)

### Parameters

`handler` - the [ResultHandler](../../com.tink.service.handler/-result-handler/index.md) for processing error and success callbacks

`includeDemoProviders` - Set this to true if the response should contain demo providers.
This is very useful for test and demonstration purposes, but should be set to `false`
in the release version of the application.