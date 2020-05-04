[link](../../index.md) / [com.tink.rest.apis](../index.md) / [ProviderApi](./index.md)

# ProviderApi

`@JvmSuppressWildcards interface ProviderApi`

### Functions

| Name | Summary |
|---|---|
| [list](list.md) | List providers Lists all providers available for a authenticated user.`abstract suspend fun list(capability: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, includeTestProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?, excludeNonTestProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`ProviderListResponse`](../../com.tink.rest.models/-provider-list-response/index.md) |
| [listByMarket](list-by-market.md) | List providers for a market Lists all providers on a specified market. Your authentication affects the list of providers you get: When authenticated, the result will only contain providers available for that user. When unauthenticated and without passing The OAuth2 Client ID header, you get all providers made available for the entire environment. If you are unauthenticated but you include The OAuth2 Client ID header, you will get providers available for the app with the given client id.`abstract suspend fun listByMarket(market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, xTinkOAuthClientID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, acceptLanguage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, includeTestProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?, excludeNonTestProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?, capability: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`ProviderListResponse`](../../com.tink.rest.models/-provider-list-response/index.md) |
| [listMarkets](list-markets.md) | List markets Lists all markets where there are providers available.`abstract suspend fun listMarkets(xTinkOAuthClientID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`ProviderMarketListResponse`](../../com.tink.rest.models/-provider-market-list-response/index.md) |
| [suggest](suggest.md) | Suggest providers for user.`abstract suspend fun suggest(): `[`ProviderListResponse`](../../com.tink.rest.models/-provider-list-response/index.md) |
