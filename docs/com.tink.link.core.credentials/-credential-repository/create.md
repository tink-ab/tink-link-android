[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialRepository](index.md) / [create](./create.md)

# create

`fun create(providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, credentialType: Type, fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Credential`](../../com.tink.model.credential/-credential/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Creates a new [Credential](../../com.tink.model.credential/-credential/index.md) object.

### Parameters

`providerName` - Identifier for the [Provider](../../com.tink.model.provider/-provider/index.md). See [Provider.name](../../com.tink.model.provider/-provider/name.md)

`credentialType` - The [Credential.Type](../../com.tink.model.credential/-credential/-type/index.md) used to authenticate the user to the financial institution

`fields` - The map of [Field](../../com.tink.model.misc/-field/index.md) name and value pairs for the [Provider](../../com.tink.model.provider/-provider/index.md)

`resultHandler` - The [ResultHandler](../../com.tink.service.handler/-result-handler/index.md) for processing error and success callbacks