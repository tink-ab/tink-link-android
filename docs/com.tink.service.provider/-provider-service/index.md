[link](../../index.md) / [com.tink.service.provider](../index.md) / [ProviderService](./index.md)

# ProviderService

`interface ProviderService`

### Functions

| Name | Summary |
|---|---|
| [getProvider](get-provider.md) | `abstract suspend fun getProvider(providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Provider`](../../com.tink.model.provider/-provider/index.md)`?` |
| [listProviders](list-providers.md) | `abstract suspend fun listProviders(filter: `[`ProviderFilter`](../-provider-filter/index.md)`?): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`>` |
| [listSuggestions](list-suggestions.md) | `abstract suspend fun listSuggestions(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`>` |
