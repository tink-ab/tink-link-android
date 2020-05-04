[link](../../index.md) / [com.tink.rest.apis](../index.md) / [OAuthApi](index.md) / [revokeAll](./revoke-all.md)

# revokeAll

`@FormUrlEncoded @POST("/api/v1/oauth/revoke-all") abstract suspend fun revokeAll(@Body body: `[`OAuth2Client`](../../com.tink.rest.models/-o-auth2-client/index.md)`, @Field("user_id") userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, @Field("external_user_id") externalUserId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Revoke all tokens
Revokes all access and refresh tokens for a given user ID or external user ID.

### Parameters

`body` - (optional)

`userId` - The user ID (optional)

`externalUserId` - The external user ID (optional)