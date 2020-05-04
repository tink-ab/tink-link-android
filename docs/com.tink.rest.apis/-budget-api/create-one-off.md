[link](../../index.md) / [com.tink.rest.apis](../index.md) / [BudgetApi](index.md) / [createOneOff](./create-one-off.md)

# createOneOff

`@POST("/api/v1/budgets/one-off") abstract suspend fun createOneOff(@Body body: `[`CreateOneOffBudgetRequest`](../../com.tink.rest.models/-create-one-off-budget-request/index.md)`): `[`CreateBudgetResponse`](../../com.tink.rest.models/-create-budget-response/index.md)

Create one-off budget
Creates a budget for a specific date interval. Returns `400 Bad Request` if any of the request parameters is incorrect or missing. Returns `500 Internal Server Error` for any unspecified error.

### Parameters

`body` - The one off budget to be created. (required)