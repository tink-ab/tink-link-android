[link](../../index.md) / [com.tink.rest.apis](../index.md) / [UserApi](index.md) / [getUser](./get-user.md)

# getUser

`@GET("/api/v1/user") abstract suspend fun getUser(): `[`User`](../../com.tink.rest.models/-user/index.md)

Get the user
Returns the user object. Note that the password field is not stored in clear text nor populated when getting the user. It's only used for setting the password when registering a new user.

