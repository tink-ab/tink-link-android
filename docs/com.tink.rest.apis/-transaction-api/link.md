[link](../../index.md) / [com.tink.rest.apis](../index.md) / [TransactionApi](index.md) / [link](./link.md)

# link

`@POST("/api/v1/transactions/{id}/link/{counterpartTransactionId}") abstract suspend fun link(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("counterpartTransactionId") counterpartTransactionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Body body: `[`LinkTransactionsRequest`](../../com.tink.rest.models/-link-transactions-request/index.md)`): `[`LinkTransactionsResponse`](../../com.tink.rest.models/-link-transactions-response/index.md)

Link transactions
Link two transactions, creating a transaction part for each transaction and netting out the amounts. The transactions are required to have different signs (i.e. one income and one expense). If one transaction is -300 and the other is +100, the common disposable amount is 100.

### Parameters

`id` - The ID of the first transaction to link. (required)

`counterpartTransactionId` - The ID of the other transaction (the counterpart) to link. (required)

`body` - Object holding the required amount for transaction linking (required)