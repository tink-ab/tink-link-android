[link](../../index.md) / [com.tink.rest.apis](../index.md) / [UserApi](index.md) / [delete](./delete.md)

# delete

`@POST("/api/v1/user/delete") abstract suspend fun delete(@Body body: `[`DeleteUserRequest`](../../com.tink.rest.models/-delete-user-request/index.md)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Delete user
Completely deletes the currently authenticated user and its data.

### Parameters

`body` - (optional)