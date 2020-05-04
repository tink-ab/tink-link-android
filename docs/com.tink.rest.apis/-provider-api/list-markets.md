[link](../../index.md) / [com.tink.rest.apis](../index.md) / [ProviderApi](index.md) / [listMarkets](./list-markets.md)

# listMarkets

`@GET("/api/v1/providers/markets") abstract suspend fun listMarkets(@Header("X-Tink-OAuth-Client-ID") xTinkOAuthClientID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`ProviderMarketListResponse`](../../com.tink.rest.models/-provider-market-list-response/index.md)

List markets
Lists all markets where there are providers available.

### Parameters

`xTinkOAuthClientID` - The OAuth2 Client ID (optional)