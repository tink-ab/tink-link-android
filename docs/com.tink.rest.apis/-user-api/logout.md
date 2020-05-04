[link](../../index.md) / [com.tink.rest.apis](../index.md) / [UserApi](index.md) / [logout](./logout.md)

# logout

`@POST("/api/v1/user/logout") abstract suspend fun logout(@Query("autologout") autologout: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Logout a user

### Parameters

`autologout` - boolean (optional)