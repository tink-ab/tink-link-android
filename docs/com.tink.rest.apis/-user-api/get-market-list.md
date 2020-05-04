[link](../../index.md) / [com.tink.rest.apis](../index.md) / [UserApi](index.md) / [getMarketList](./get-market-list.md)

# getMarketList

`@GET("/api/v1/user/markets/list") abstract suspend fun getMarketList(@Query("desired") desired: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`MarketListResponse`](../../com.tink.rest.models/-market-list-response/index.md)

List markets
Returns an object with a list of all available markets in which a user could register with.

### Parameters

`desired` - The ISO 3166-1 alpha-2 country code of the desired market (optional)