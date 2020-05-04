[link](../../index.md) / [com.tink.rest.apis](../index.md) / [TransactionApi](index.md) / [categorize](./categorize.md)

# categorize

`@PUT("/api/v1/transactions/categorize-multiple") abstract suspend fun categorize(@Body body: `[`CategorizeTransactionsListRequest`](../../com.tink.rest.models/-categorize-transactions-list-request/index.md)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Change category of transactions
Changes category of the supplied list of transactions to the supplied category

### Parameters

`body` - Object holding a list of new categories and the transactions to be categorized (required)