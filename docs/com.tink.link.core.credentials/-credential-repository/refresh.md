[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialRepository](index.md) / [refresh](./refresh.md)

# refresh

`fun refresh(credentialIds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, resultHandler: ResultHandler<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Refreshes all [Credential](#) objects matching the list of ids.

### Parameters

`credentialIds` - List of identifiers for all the [Credential](#) objects that is being refreshed

`resultHandler` - The [ResultHandler](#) for processing error and success callbacks