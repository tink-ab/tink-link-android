[link](../../index.md) / [com.tink.link.core.user](../index.md) / [UserContext](index.md) / [authorize](./authorize.md)

# authorize

`abstract fun authorize(scopes: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<Scope>, resultHandler: ResultHandler<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Authorize your user towards a new set of scopes.
These scopes needs to be enabled for your [clientId](#).

