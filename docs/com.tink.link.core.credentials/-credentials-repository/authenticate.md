[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialsRepository](index.md) / [authenticate](./authenticate.md)

# authenticate

`fun authenticate(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Manually authenticates the [Credentials](../../com.tink.model.credentials/-credentials/index.md) matching the id. This is only applicable for PSD2 credentials.

### Parameters

`credentialsId` - Identifier for the [Credentials](../../com.tink.model.credentials/-credentials/index.md) that is being authenticated