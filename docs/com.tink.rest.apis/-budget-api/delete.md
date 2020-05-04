[link](../../index.md) / [com.tink.rest.apis](../index.md) / [BudgetApi](index.md) / [delete](./delete.md)

# delete

`@DELETE("/api/v1/budgets/{id}") abstract suspend fun delete(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Delete budget
Deletes the specified budget. Returns `404 Not Found` if the budget does not exist. Returns `400 Bad Request` if any of the request parameters is incorrect or missing. Returns `500 Internal Server Error` for any unspecified error.

### Parameters

`id` - The ID of the budget. (required)