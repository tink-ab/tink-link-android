[link](../../index.md) / [com.tink.rest.apis](../index.md) / [TransactionApi](index.md) / [linkSuggest](./link-suggest.md)

# linkSuggest

`@GET("/api/v1/transactions/{id}/link/suggest") abstract suspend fun linkSuggest(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Query("limit") limit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?): `[`TransactionLinkSuggestionResponse`](../../com.tink.rest.models/-transaction-link-suggestion-response/index.md)

Get counterpart suggestions
Returns suggestions for potential counterpart expenses for a reimbursement.

### Parameters

`id` - The ID of the transaction to get suggestions for (required)

`limit` - Max number of suggestions returned. (optional, default to 5)