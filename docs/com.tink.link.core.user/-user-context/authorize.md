[link](../../index.md) / [com.tink.link.core.user](../index.md) / [UserContext](index.md) / [authorize](./authorize.md)

# authorize

`abstract fun authorize(scopes: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Scope`](../../com.tink.service.authorization/-scope/index.md)`>, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Authorize your user towards a new set of scopes.
These scopes needs to be enabled for your [clientId](../../com.tink.service.network/-tink-configuration/o-auth-client-id.md).

