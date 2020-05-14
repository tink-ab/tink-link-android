[link](../../index.md) / [com.tink.link.consent](../index.md) / [ConsentContext](index.md) / [describeClient](./describe-client.md)

# describeClient

`fun describeClient(scopes: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Scope`](../../com.tink.model.user/-scope/index.md)`>, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`OAuthClientDescription`](../../com.tink.model.consent/-o-auth-client-description/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Get the [client description](../../com.tink.model.consent/-o-auth-client-description/index.md) for a client with the provided scopes.

### Parameters

`scopes` - A [Scope](../../com.tink.model.user/-scope/index.md) set of OAuth scopes authorized for this client

`resultHandler` - Handler for successful (providing the [client description](../../com.tink.model.consent/-o-auth-client-description/index.md)) or error events.