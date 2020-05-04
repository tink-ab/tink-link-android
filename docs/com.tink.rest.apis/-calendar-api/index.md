[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CalendarApi](./index.md)

# CalendarApi

`@JvmSuppressWildcards interface CalendarApi`

### Functions

| Name | Summary |
|---|---|
| [businessDays](business-days.md) | Get business days Get the business days available for this user.`abstract suspend fun businessDays(startYear: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, startMonth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, months: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?): `[`BusinessDaysResponse`](../../com.tink.rest.models/-business-days-response/index.md) |
| [listPeriods](list-periods.md) | Get period details Get details for the supplied period. Will always return one of the monthly resolutions.`abstract suspend fun listPeriods(period: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Period`](../../com.tink.rest.models/-period/index.md)`>` |
