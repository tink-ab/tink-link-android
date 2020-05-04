[link](../../index.md) / [com.tink.rest.apis](../index.md) / [TransactionApi](index.md) / [updateTransaction](./update-transaction.md)

# updateTransaction

`@PUT("/api/v1/transactions/{id}") abstract suspend fun updateTransaction(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Body body: `[`Transaction`](../../com.tink.rest.models/-transaction/index.md)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Update a transaction
Updates mutable properties of a list of transactions. The following properties are possible to update:amount, categoryId, date, description.

### Parameters

`id` - The ID of the transaction (required)

`body` - The transaction to be updated (required)