[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CredentialsApi](index.md) / [refresh](./refresh.md)

# refresh

`@POST("/api/v1/credentials/{id}/refresh") abstract suspend fun refresh(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Body body: `[`RefreshCredentialsRequest`](../../com.tink.rest.models/-refresh-credentials-request/index.md)`, @Query("items") items: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?, @Query("optIn") optIn: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Refresh credentials
Refreshes the specified credentials. It's only possible to refresh a credential every tenth minute, given that the latest refresh was successful.

### Parameters

`id` - The internal identifier of the &#x60;Credentials&#x60; object to refresh. (required)

`body` - (optional)

`items` - The data types to aggregate from the Provider. Multiple items are allowed. If omitted, all data types are aggregated. (optional)

`optIn` - Set to true to trigger an opt-in of accounts before doing the refresh. Today only available for enterprise customers. (optional)