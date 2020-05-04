[link](../../index.md) / [com.tink.rest.apis](../index.md) / [OAuthApi](index.md) / [authorizationGrant](./authorization-grant.md)

# authorizationGrant

`@FormUrlEncoded @POST("/api/v1/oauth/authorization-grant") abstract suspend fun authorizationGrant(@Field("scope") scope: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Body body: `[`OAuth2Client`](../../com.tink.rest.models/-o-auth2-client/index.md)`, @Field("user_id") userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, @Field("external_user_id") externalUserId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`OAuth2AuthorizeResponse`](../../com.tink.rest.models/-o-auth2-authorize-response/index.md)

Create an authorization
Creates an authorization for the given user ID or external user ID with requested scopes and returns the authorization code.

### Parameters

`scope` - The requested OAuth scopes (required)

`body` - (optional)

`userId` - User ID. Cannot be specified at the same time as &#x60;external_user_id&#x60;. (optional)

`externalUserId` - External user ID set by the client on user creation. Cannot be specified at the same time as &#x60;user_id&#x60;. (optional)