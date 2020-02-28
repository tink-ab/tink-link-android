[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialRepository](index.md) / [thirdPartyCallback](./third-party-callback.md)

# thirdPartyCallback

`fun thirdPartyCallback(state: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parameters: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, handler: ResultHandler<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Sends the third party callback information from an Account Servicing Payment Service Provider (ASPSP).

This is usually done inside the TinkLink framework and it should normally not be necessary to do this on your own.

### Parameters

`state` - The value corresponding to the `state` key from the received callback parameters.

`parameters` - The map of key and value pairs, other than `state` from the received callback parameters.

`handler` - The [ResultHandler](#) for processing error and success callbacks