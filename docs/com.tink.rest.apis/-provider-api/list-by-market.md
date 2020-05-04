[link](../../index.md) / [com.tink.rest.apis](../index.md) / [ProviderApi](index.md) / [listByMarket](./list-by-market.md)

# listByMarket

`@GET("/api/v1/providers/{market}") abstract suspend fun listByMarket(@Path("market") market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("X-Tink-OAuth-Client-ID") xTinkOAuthClientID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, @Header("Accept-Language") acceptLanguage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, @Query("includeTestProviders") includeTestProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?, @Query("excludeNonTestProviders") excludeNonTestProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?, @Query("capability") capability: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`ProviderListResponse`](../../com.tink.rest.models/-provider-list-response/index.md)

List providers for a market
Lists all providers on a specified market. Your authentication affects the list of providers you get: When authenticated, the result will only contain providers available for that user. When unauthenticated and without passing The OAuth2 Client ID header, you get all providers made available for the entire environment. If you are unauthenticated but you include The OAuth2 Client ID header, you will get providers available for the app with the given client id.

### Parameters

`market` - The ISO 3166-1 alpha-2 market code. (required)

`xTinkOAuthClientID` - The OAuth2 Client ID (optional)

`acceptLanguage` - Language to translate to. (optional)

`includeTestProviders` - Defaults to false. If set to &#x60;true&#x60;, Providers of &#x60;TEST&#x60; type will be added in the response list. (optional)

`excludeNonTestProviders` - Defaults to false. If set to &#x60;true&#x60;, Providers of type different than &#x60;TEST&#x60; will be removed from the response list. (optional)

`capability` - Use the capability to only list providers with a specific capability. If no capability the provider response will not be filtered on capability. (optional)