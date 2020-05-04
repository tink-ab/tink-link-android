[link](../../index.md) / [com.tink.rest.apis](../index.md) / [ProviderApi](index.md) / [list](./list.md)

# list

`@GET("/api/v1/providers") abstract suspend fun list(@Query("capability") capability: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, @Query("includeTestProviders") includeTestProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?, @Query("excludeNonTestProviders") excludeNonTestProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?, @Query("name") name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`ProviderListResponse`](../../com.tink.rest.models/-provider-list-response/index.md)

List providers
Lists all providers available for a authenticated user.

### Parameters

`capability` - Use the capability to only list providers with a specific capability. If no capability the provider response will not be filtered on capability. (optional)

`includeTestProviders` - Defaults to false. If set to &#x60;true&#x60;, Providers of &#x60;TEST&#x60; type will be added in the response list. (optional)

`excludeNonTestProviders` - Defaults to false. If set to &#x60;true&#x60;, Providers of type different than &#x60;TEST&#x60; will be removed from the response list. (optional)

`name` - Gets a specific provider from the name. If this query parameter is used, only one or no providers will be returned. (optional)