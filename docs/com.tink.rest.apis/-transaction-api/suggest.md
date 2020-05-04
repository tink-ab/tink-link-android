[link](../../index.md) / [com.tink.rest.apis](../index.md) / [TransactionApi](index.md) / [suggest](./suggest.md)

# suggest

`@GET("/api/v1/transactions/suggest") abstract suspend fun suggest(@Query("numberOfClusters") numberOfClusters: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?, @Query("evaluateEverything") evaluateEverything: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?): `[`SuggestTransactionsResponse`](../../com.tink.rest.models/-suggest-transactions-response/index.md)

Get categorization clusters
Returns an object holding clusters of transactions to be categorized and possible categorization level improvement

### Parameters

`numberOfClusters` - Max number of clusters returned (optional)

`evaluateEverything` - (optional)