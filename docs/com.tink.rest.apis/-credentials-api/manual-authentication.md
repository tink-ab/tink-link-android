[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CredentialsApi](index.md) / [manualAuthentication](./manual-authentication.md)

# manualAuthentication

`@POST("/api/v1/credentials/{id}/authenticate") abstract suspend fun manualAuthentication(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Body body: `[`ManualAuthenticationRequest`](../../com.tink.rest.models/-manual-authentication-request/index.md)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Manual authenticate of credentials
Triggers a full authentication flow to renew refresh tokens with ASPSPs. This endpoint is limited to credentials connected to providers of access type `OPEN_BANKING`. This endpoint only triggers authentication, thus a full credentials refresh will not be executed.

### Parameters

`id` - The internal identifier of the &#x60;Credentials&#x60; object to authenticate. (required)

`body` - (optional)