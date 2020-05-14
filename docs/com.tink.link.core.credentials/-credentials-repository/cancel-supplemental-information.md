[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialsRepository](index.md) / [cancelSupplementalInformation](./cancel-supplemental-information.md)

# cancelSupplementalInformation

`fun cancelSupplementalInformation(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Cancels the supplemental information submission flow.
The backend service is informed to stop waiting for the supplemental information.
This method should be called if you want to dismiss the supplemental information flow.

### Parameters

`credentialsId` - Identifier for the [Credentials](../../com.tink.model.credentials/-credentials/index.md) that is being authenticated

`handler` - The [ResultHandler](../../com.tink.service.handler/-result-handler/index.md) for processing error and success callbacks