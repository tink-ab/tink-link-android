[link](../../index.md) / [com.tink.rest.apis](../index.md) / [UserApi](index.md) / [updateProfile](./update-profile.md)

# updateProfile

`@PUT("/api/v1/user/profile") abstract suspend fun updateProfile(@Body body: `[`UserProfile`](../../com.tink.rest.models/-user-profile/index.md)`): `[`UserProfile`](../../com.tink.rest.models/-user-profile/index.md)

Update the user profile
Updates certain user modifiable properties of a user's profile. Please refer to the body schema to see which properties are modifiable by the user.

### Parameters

`body` - The updated user profile object (required)