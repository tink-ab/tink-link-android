[link](../../index.md) / [com.tink.rest.apis](../index.md) / [TransactionApi](index.md) / [updateLink](./update-link.md)

# updateLink

`@PUT("/api/v1/transactions/{id}/part/{partId}") abstract suspend fun updateLink(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("partId") partId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Body body: `[`UpdateTransactionLinkRequest`](../../com.tink.rest.models/-update-transaction-link-request/index.md)`): `[`LinkTransactionsResponse`](../../com.tink.rest.models/-link-transactions-response/index.md)

Update transaction Link
Updates an transaction part amount and it's counterpart amount.

### Parameters

`id` - The ID of the transaction to which the part belongs to. (required)

`partId` - The part ID to update. (required)

`body` - Object holding the required amount for transaction linking (required)