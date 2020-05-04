[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CredentialsApi](index.md) / [delete](./delete.md)

# delete

`@DELETE("/api/v1/credentials/{id}") abstract suspend fun delete(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Delete credentials
Deletes the given credentials. The deletion is partly done asynchronously.

### Parameters

`id` - The internal identifier of the credentials to delete (required)