[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialRepository](index.md) / [supplementInformation](./supplement-information.md)

# supplementInformation

`fun supplementInformation(credentialId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, information: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, handler: ResultHandler<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Submits the supplemental information required to authenticate the [Credential](#) matching the id.

### Parameters

`credentialId` - Identifier for the [Credential](#) that is being authenticated

`information` - The map of [Field](#) name and value pairs representing the supplemental information to be sent

`handler` - The [ResultHandler](#) for processing error and success callbacks