[link](../../index.md) / [com.tink.rest.apis](../index.md) / [BudgetApi](index.md) / [update](./update.md)

# update

`@PUT("/api/v1/budgets/{id}") abstract suspend fun update(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Body body: `[`UpdateBudgetRequest`](../../com.tink.rest.models/-update-budget-request/index.md)`): `[`UpdateBudgetResponse`](../../com.tink.rest.models/-update-budget-response/index.md)

Update budget
Updates the specified budget. Returns `404 Not Found` if the budget does not exist. Returns `400 Bad Request` if any of the request parameters is incorrect or missing. Returns `500 Internal Server Error` for any unspecified error.

### Parameters

`id` - The ID of the budget. (required)

`body` - The modified budget to be applied. (required)