[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialsRepository](index.md) / [update](./update.md)

# update

`fun update(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Credentials`](../../com.tink.model.credentials/-credentials/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Updates the [Credentials](../../com.tink.model.credentials/-credentials/index.md) matching the id.

You can only update the value of a [Field](../../com.tink.model.misc/-field/index.md) that is mutable.

### Parameters

`credentialsId` - Identifier for the [Credentials](../../com.tink.model.credentials/-credentials/index.md) that is being updated

`fields` - The map of [Field](../../com.tink.model.misc/-field/index.md) name and value pairs for the [Credentials](../../com.tink.model.credentials/-credentials/index.md)

`resultHandler` - The [ResultHandler](../../com.tink.service.handler/-result-handler/index.md) for processing error and success callbacks