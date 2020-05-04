[link](../../index.md) / [com.tink.rest.apis](../index.md) / [BudgetApi](index.md) / [listSpecifications](./list-specifications.md)

# listSpecifications

`@GET("/api/v1/budgets") abstract suspend fun listSpecifications(@Query("includeArchived") includeArchived: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?): `[`ListBudgetSpecificationsResponse`](../../com.tink.rest.models/-list-budget-specifications-response/index.md)

List budgets
List all budgets for the user. Returns `500 Internal Server Error` for any unspecified error.

### Parameters

`includeArchived` - Whether to include archived budgets or not in the response. (optional, default to false)