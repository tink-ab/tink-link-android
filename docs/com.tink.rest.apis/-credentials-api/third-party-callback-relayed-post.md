[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CredentialsApi](index.md) / [thirdPartyCallbackRelayedPost](./third-party-callback-relayed-post.md)

# thirdPartyCallbackRelayedPost

`@POST("/api/v1/credentials/third-party/callback/relayed") abstract suspend fun thirdPartyCallbackRelayedPost(@Body body: `[`CallbackRelayedRequest`](../../com.tink.rest.models/-callback-relayed-request/index.md)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Third-party callback with redirect
Send callback information from an ASPSP. This endpoint will return the registered redirect uri as response.

### Parameters

`body` - The callback response from the ASPSP with JSON format. (required)