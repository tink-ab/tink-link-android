[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CalendarApi](index.md) / [listPeriods](./list-periods.md)

# listPeriods

`@GET("/api/v1/calendar/periods/{period}") abstract suspend fun listPeriods(@Path("period") period: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Period`](../../com.tink.rest.models/-period/index.md)`>`

Get period details
Get details for the supplied period. Will always return one of the monthly resolutions.

### Parameters

`period` - Period to get details for (required)