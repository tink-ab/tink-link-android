[link](../../index.md) / [com.tink.rest.apis](../index.md) / [BudgetApi](index.md) / [createRecurring](./create-recurring.md)

# createRecurring

`@POST("/api/v1/budgets/recurring") abstract suspend fun createRecurring(@Body body: `[`CreateRecurringBudgetRequest`](../../com.tink.rest.models/-create-recurring-budget-request/index.md)`): `[`CreateBudgetResponse`](../../com.tink.rest.models/-create-budget-response/index.md)

Create recurring budget
Creates a recurring budget with a set periodicity.Returns `400 Bad Request` if any of the request parameters is incorrect or missing. Returns `500 Internal Server Error` for any unspecified error.

### Parameters

`body` - The recurring budget to be created. (required)