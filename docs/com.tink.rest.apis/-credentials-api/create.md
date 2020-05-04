[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CredentialsApi](index.md) / [create](./create.md)

# create

`@POST("/api/v1/credentials") abstract suspend fun create(@Body body: `[`CreateCredentialsRequest`](../../com.tink.rest.models/-create-credentials-request/index.md)`, @Query("items") items: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?): `[`Credentials`](../../com.tink.rest.models/-credentials/index.md)

Create credentials
Creates the Credentials for the user. The create request will trigger a refresh towards the provider.

### Parameters

`body` - The credentials to create. Only providerName and fields are required. (optional)

`items` - The data types to aggregate from the provider. Multiple items are allowed and are passed as: items&#x3D;item1&amp;items&#x3D;item2. If omitted, all data types are aggregated. (optional)