[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialRepository](index.md) / [delete](./delete.md)

# delete

`fun delete(credentialId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Deletes the [Credential](../../com.tink.model.credential/-credential/index.md) matching the id.

### Parameters

`credentialId` - Identifier for the [Credential](../../com.tink.model.credential/-credential/index.md) that is being deleted

`resultHandler` - The [ResultHandler](../../com.tink.service.handler/-result-handler/index.md) for processing error and success callbacks