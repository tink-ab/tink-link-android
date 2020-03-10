[link](../../index.md) / [com.tink.service.provider](../index.md) / [ProviderService](./index.md)

# ProviderService

`interface ProviderService`

### Functions

| Name | Summary |
|---|---|
| [listProviders](list-providers.md) | `abstract fun listProviders(handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`>>, includeDemoProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [listSuggestions](list-suggestions.md) | `abstract fun listSuggestions(handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [ProviderServiceImpl](../-provider-service-impl/index.md) | `class ProviderServiceImpl : `[`ProviderService`](./index.md) |
