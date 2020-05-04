[link](../../index.md) / [com.tink.rest.apis](../index.md) / [TransactionApi](index.md) / [getTransaction](./get-transaction.md)

# getTransaction

`@GET("/api/v1/transactions/{id}") abstract suspend fun getTransaction(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Transaction`](../../com.tink.rest.models/-transaction/index.md)

Get one transaction
Returns a transaction matching the requested id

### Parameters

`id` - The ID of the transaction (required)