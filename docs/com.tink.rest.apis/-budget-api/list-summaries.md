[link](../../index.md) / [com.tink.rest.apis](../index.md) / [BudgetApi](index.md) / [listSummaries](./list-summaries.md)

# listSummaries

`@GET("/api/v1/budgets/summaries") abstract suspend fun listSummaries(@Query("includeArchived") includeArchived: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?): `[`ListBudgetSummariesResponse`](../../com.tink.rest.models/-list-budget-summaries-response/index.md)

List budgets with summaries
List all budgets for the user including current period for each budget. Returns `500 Internal Server Error` for any unspecified error.

### Parameters

`includeArchived` - Whether to include archived budgets or not in the response. (optional, default to false)