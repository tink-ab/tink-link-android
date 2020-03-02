[link](../../index.md) / [com.tink.link.consent](../index.md) / [ConsentContext](index.md) / [scopeDescriptions](./scope-descriptions.md)

# scopeDescriptions

`fun scopeDescriptions(scopes: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Scope`](../../com.tink.service.authorization/-scope/index.md)`>, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ScopeDescription`](../../com.tink.service.consent/-scope-description/index.md)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Lists [scope descriptions](../../com.tink.service.consent/-scope-description/index.md) for the provided scopes.

### Parameters

`scopes` - A [Scope](../../com.tink.service.authorization/-scope/index.md) set of OAuth scopes to be requested.

`resultHandler` - Handler for successful (providing a list of [ScopeDescription](../../com.tink.service.consent/-scope-description/index.md)) or error events.