[link](../../index.md) / [com.tink.core.provider](../index.md) / [ProviderRepository](index.md) / [getProvider](./get-provider.md)

# getProvider

`fun getProvider(providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`?>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Get the provider with the specified [name](../../com.tink.model.provider/-provider/name.md). `null` will be passed to the
[resultHandler](get-provider.md#com.tink.core.provider.ProviderRepository$getProvider(kotlin.String, com.tink.service.handler.ResultHandler((com.tink.model.provider.Provider)))/resultHandler) in case no provider with this name could be found.

