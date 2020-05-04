[link](../../index.md) / [com.tink.rest.apis](../index.md) / [TransactionApi](index.md) / [deletePart](./delete-part.md)

# deletePart

`@DELETE("/api/v1/transactions/{id}/part/{partId}") abstract suspend fun deletePart(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("partId") partId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`DeleteTransactionPartResponse`](../../com.tink.rest.models/-delete-transaction-part-response/index.md)

Delete transaction part
If the part is linked to another transaction, the bilateral link is removed as well (i.e. the counterpart will be removed too, if found).

### Parameters

`id` - The ID of the transaction to which the part belongs to. (required)

`partId` - The part ID to delete. (required)