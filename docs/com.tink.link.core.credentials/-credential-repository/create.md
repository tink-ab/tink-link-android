[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialRepository](index.md) / [create](./create.md)

# create

`fun create(providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, credentialType: Type, fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, resultHandler: ResultHandler<Credential>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Creates a new [Credential](#) object.

### Parameters

`providerName` - Identifier for the [Provider](#). See [Provider.name](#)

`credentialType` - The [Credential.Type](#) used to authenticate the user to the financial institution

`fields` - The map of [Field](#) name and value pairs for the [Provider](#)

`resultHandler` - The [ResultHandler](#) for processing error and success callbacks