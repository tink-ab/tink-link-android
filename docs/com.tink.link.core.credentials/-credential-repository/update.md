[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialRepository](index.md) / [update](./update.md)

# update

`fun update(credentialId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, resultHandler: ResultHandler<Credential>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Updates the [Credential](#) matching the id.

You can only update the value of a [Field](#) that is mutable.

### Parameters

`credentialId` - Identifier for the [Credential](#) that is being updated

`fields` - The map of [Field](#) name and value pairs for the [Credential](#)

`resultHandler` - The [ResultHandler](#) for processing error and success callbacks