[link](../../index.md) / [com.tink.core.provider](../index.md) / [ProviderRepository](./index.md)

# ProviderRepository

`class ProviderRepository`

Repository for retrieving [Provider](../../com.tink.model.provider/-provider/index.md)s

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Create a new repository instance from a [ProviderService](../../com.tink.service.provider/-provider-service/index.md). This is usually done inside the TinkLink framework and it should normally not be necessary to create your own instance.`ProviderRepository(service: `[`ProviderService`](../../com.tink.service.provider/-provider-service/index.md)`)` |

### Functions

| Name | Summary |
|---|---|
| [listProviders](list-providers.md) | List all providers on the current market. The result will already be filtered to only contain providers that are [enabled](../../com.tink.model.provider/-provider/-status/-e-n-a-b-l-e-d.md)`fun listProviders(handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`>>, includeDemoProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
