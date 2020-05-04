[link](../../index.md) / [com.tink.rest.apis](../index.md) / [BudgetApi](index.md) / [getTransactions](./get-transactions.md)

# getTransactions

`@GET("/api/v1/budgets/{id}/transactions") abstract suspend fun getTransactions(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Query("start") start: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, @Query("end") end: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`BudgetTransactionsResponse`](../../com.tink.rest.models/-budget-transactions-response/index.md)

Get budget transactions
List all transactions for the specified budget within the start and end date. The date parameters are inclusive. Returns `404 Not Found` if the budget does not exist. Returns `400 Bad Request` if any of the request parameters is incorrect or missing. Returns `500 Internal Server Error` for any unspecified error.

### Parameters

`id` - The ID of the budget. (required)

`start` - Query start date expressed as UTC epoch timestamp in milliseconds. (required)

`end` - Query end date expressed as UTC epoch timestamp in milliseconds. (required)