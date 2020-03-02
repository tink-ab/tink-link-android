[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialRepository](index.md) / [update](./update.md)

# update

`fun update(credentialId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Credential`](../../com.tink.model.credential/-credential/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Updates the [Credential](../../com.tink.model.credential/-credential/index.md) matching the id.

You can only update the value of a [Field](../../com.tink.model.misc/-field/index.md) that is mutable.

### Parameters

`credentialId` - Identifier for the [Credential](../../com.tink.model.credential/-credential/index.md) that is being updated

`fields` - The map of [Field](../../com.tink.model.misc/-field/index.md) name and value pairs for the [Credential](../../com.tink.model.credential/-credential/index.md)

`resultHandler` - The [ResultHandler](../../com.tink.service.handler/-result-handler/index.md) for processing error and success callbacks