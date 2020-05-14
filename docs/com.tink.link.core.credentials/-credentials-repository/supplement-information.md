[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialsRepository](index.md) / [supplementInformation](./supplement-information.md)

# supplementInformation

`fun supplementInformation(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, information: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Submits the supplemental information required to authenticate the [Credentials](../../com.tink.model.credentials/-credentials/index.md) matching the id.

### Parameters

`credentialsId` - Identifier for the [Credentials](../../com.tink.model.credentials/-credentials/index.md) that is being authenticated

`information` - The map of [Field](../../com.tink.model.misc/-field/index.md) name and value pairs representing the supplemental information to be sent

`handler` - The [ResultHandler](../../com.tink.service.handler/-result-handler/index.md) for processing error and success callbacks