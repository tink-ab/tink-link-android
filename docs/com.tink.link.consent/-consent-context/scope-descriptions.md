[link](../../index.md) / [com.tink.link.consent](../index.md) / [ConsentContext](index.md) / [scopeDescriptions](./scope-descriptions.md)

# scopeDescriptions

`fun scopeDescriptions(scopes: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<Scope>, resultHandler: ResultHandler<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<ScopeDescription>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Lists [scope descriptions](#) for the provided scopes.

### Parameters

`scopes` - A [Scope](#) set of OAuth scopes to be requested.

`resultHandler` - Handler for successful (providing a list of [ScopeDescription](#)) or error events.