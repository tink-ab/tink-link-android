[link](../index.md) / [com.tink.link](index.md) / [requireUserContext](./require-user-context.md)

# requireUserContext

`fun `[`Tink`](../com.tink.core/-tink/index.md)`.requireUserContext(): `[`UserContext`](../com.tink.link.core.user/-user-context/index.md)

Fetches the [UserContext](../com.tink.link.core.user/-user-context/index.md) from Tink if a user is set.

If no user is set, this will throw an [IllegalStateException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-state-exception/index.html)

