[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialRepository](index.md) / [supplementInformation](./supplement-information.md)

# supplementInformation

`fun supplementInformation(credentialId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, information: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Submits the supplemental information required to authenticate the [Credential](../../com.tink.model.credential/-credential/index.md) matching the id.

### Parameters

`credentialId` - Identifier for the [Credential](../../com.tink.model.credential/-credential/index.md) that is being authenticated

`information` - The map of [Field](../../com.tink.model.misc/-field/index.md) name and value pairs representing the supplemental information to be sent

`handler` - The [ResultHandler](../../com.tink.service.handler/-result-handler/index.md) for processing error and success callbacks