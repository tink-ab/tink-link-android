[link](../../index.md) / [com.tink.rest.apis](../index.md) / [TransactionApi](index.md) / [updateTransactions](./update-transactions.md)

# updateTransactions

`@PUT("/api/v1/transactions") abstract suspend fun updateTransactions(@Body body: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Transaction`](../../com.tink.rest.models/-transaction/index.md)`>): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Update a list of transactions
Updates mutable properties of a list of transactions. The following properties are possible to update:amount, categoryId, date, description.

### Parameters

`body` - The transactions to be updated (required)