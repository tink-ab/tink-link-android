[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialsRepository](index.md) / [create](./create.md)

# create

`fun create(providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, credentialsType: Type, fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Credentials`](../../com.tink.model.credentials/-credentials/index.md)`>, items: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`RefreshableItem`](../../com.tink.model.credentials/-refreshable-item/index.md)`>? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Creates a new [Credentials](../../com.tink.model.credentials/-credentials/index.md) object.

### Parameters

`providerName` - Identifier for the [Provider](../../com.tink.model.provider/-provider/index.md). See [Provider.name](../../com.tink.model.provider/-provider/name.md)

`credentialsType` - The [Credentials.Type](../../com.tink.model.credentials/-credentials/-type/index.md) used to authenticate the user to the financial institution

`fields` - The map of [Field](../../com.tink.model.misc/-field/index.md) name and value pairs for the [Provider](../../com.tink.model.provider/-provider/index.md)

`resultHandler` - The [ResultHandler](../../com.tink.service.handler/-result-handler/index.md) for processing error and success callbacks

`items` - A list of [RefreshableItem](../../com.tink.model.credentials/-refreshable-item/index.md) representing the data types to aggregate from the provider. If omitted, all data types are aggregated.