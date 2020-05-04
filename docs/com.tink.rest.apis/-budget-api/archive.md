[link](../../index.md) / [com.tink.rest.apis](../index.md) / [BudgetApi](index.md) / [archive](./archive.md)

# archive

`@PUT("/api/v1/budgets/{id}/archive") abstract suspend fun archive(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`ArchiveBudgetResponse`](../../com.tink.rest.models/-archive-budget-response/index.md)

Archive budget
Archives the specified budget.Returns `404 Not Found` if the budget does not exist. Returns `400 Bad Request` if any of the request parameters is incorrect or missing. Returns `500 Internal Server Error` for any unspecified error.

### Parameters

`id` - The ID of the budget. (required)