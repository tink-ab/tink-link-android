[link](../../index.md) / [com.tink.rest.apis](../index.md) / [OAuthApi](index.md) / [token](./token.md)

# token

`@FormUrlEncoded @POST("/api/v1/oauth/token") abstract suspend fun token(@Field("client_id") clientId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Field("client_secret") clientSecret: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Field("grant_type") grantType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Field("code") code: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, @Field("refresh_token") refreshToken: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, @Field("scope") scope: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`OAuth2AuthenticationTokenResponse`](../../com.tink.rest.models/-o-auth2-authentication-token-response/index.md)

Get an authorization token
Exchange an authorization code or a refresh token for authorization tokens. The authorization tokens are used to access API resources on the end-user's behalf.

### Parameters

`clientId` - The OAuth client ID. (required)

`clientSecret` - The client secret of your third-party application. (required)

`grantType` - The grant type. (required)

`code` - The one-time code that was returned from the authorization flow. Can be omitted if grant types refresh_token or client_credentials are used. (optional)

`refreshToken` - The refresh token to be used to get a new access token. Can be omitted if grant types authorization_code or client_credentials are used. (optional)

`scope` - The requested scope when using client credentials. Can be omitted if grant types authorization_code or refresh_token are used. (optional)