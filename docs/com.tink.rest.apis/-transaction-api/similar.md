[link](../../index.md) / [com.tink.rest.apis](../index.md) / [TransactionApi](index.md) / [similar](./similar.md)

# similar

`@GET("/api/v1/transactions/{id}/similar") abstract suspend fun similar(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Query("categoryId") categoryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, @Query("includeSelf") includeSelf: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?): `[`SimilarTransactionsResponse`](../../com.tink.rest.models/-similar-transactions-response/index.md)

Get similar transactions
Returns an object holding a list of transactions similar to the supplied transaction based on description and a list of statistics summarizing these transactions

### Parameters

`id` - The ID of the transaction (required)

`categoryId` - Return similar of this category (optional)

`includeSelf` - Include the supplied transaction in response (optional)