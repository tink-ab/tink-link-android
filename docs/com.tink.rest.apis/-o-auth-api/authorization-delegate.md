[link](../../index.md) / [com.tink.rest.apis](../index.md) / [OAuthApi](index.md) / [authorizationDelegate](./authorization-delegate.md)

# authorizationDelegate

`@FormUrlEncoded @POST("/api/v1/oauth/authorization-grant/delegate") abstract suspend fun authorizationDelegate(@Field("id_hint") idHint: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Field("actor_client_id") actorClientId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Body body: `[`OAuth2Client`](../../com.tink.rest.models/-o-auth2-client/index.md)`, @Field("user_id") userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, @Field("external_user_id") externalUserId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, @Field("scope") scope: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Create a delegated authorization code
Creates a delegated authorization code for a user with requested scopes.

### Parameters

`idHint` - Human readable identifier to prevent user from authorizing access for another user (required)

`actorClientId` - The unique identifier of the client which is allowed to use the authorization request. Actor client existence is not validated (required)

`body` - (optional)

`userId` - User ID. Cannot be specified at the same time as &#x60;external_user_id&#x60;. (optional)

`externalUserId` - External user ID set by the client on user creation. Cannot be specified at the same time as &#x60;user_id&#x60;. (optional)

`scope` - Scopes to delegate access for (optional)