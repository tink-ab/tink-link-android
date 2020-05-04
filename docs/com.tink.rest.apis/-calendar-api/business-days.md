[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CalendarApi](index.md) / [businessDays](./business-days.md)

# businessDays

`@GET("/api/v1/calendar/businessdays/{startYear}-{startMonth}") abstract suspend fun businessDays(@Path("startYear") startYear: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Path("startMonth") startMonth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Query("months") months: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?): `[`BusinessDaysResponse`](../../com.tink.rest.models/-business-days-response/index.md)

Get business days
Get the business days available for this user.

### Parameters

`startYear` - Start year for queried business days (required)

`startMonth` - Start month for queried business days (required)

`months` - Number of months queried for. Defaults to 1. (optional)