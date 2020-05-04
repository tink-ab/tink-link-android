[link](../../index.md) / [com.tink.rest.apis](../index.md) / [UserApi](index.md) / [createUser](./create-user.md)

# createUser

`@POST("/api/v1/user/create") abstract suspend fun createUser(@Body body: `[`CreateUserRequest`](../../com.tink.rest.models/-create-user-request/index.md)`): `[`CreateUserResponse`](../../com.tink.rest.models/-create-user-response/index.md)

Create a new user
Returns the ID of the created user.

### Parameters

`body` - Configuration for new user. (optional)