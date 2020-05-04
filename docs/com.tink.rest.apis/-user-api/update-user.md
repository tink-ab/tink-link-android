[link](../../index.md) / [com.tink.rest.apis](../index.md) / [UserApi](index.md) / [updateUser](./update-user.md)

# updateUser

`@PUT("/api/v1/user") abstract suspend fun updateUser(@Body body: `[`User`](../../com.tink.rest.models/-user/index.md)`): `[`User`](../../com.tink.rest.models/-user/index.md)

Update the user
Updates certain user modifiable properties of a user. Please refer to the body schema to see which properties are modifiable by the user.

### Parameters

`body` - The updated user object (required)