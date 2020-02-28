[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialRepository](index.md) / [cancelSupplementalInformation](./cancel-supplemental-information.md)

# cancelSupplementalInformation

`fun cancelSupplementalInformation(credentialId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, handler: ResultHandler<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Cancels the supplemental information submission flow.
The backend service is informed to stop waiting for the supplemental information.
This method should be called if you want to dismiss the supplemental information flow.

### Parameters

`credentialId` - Identifier for the [Credential](#) that is being authenticated

`handler` - The [ResultHandler](#) for processing error and success callbacks