[link](../../index.md) / [com.tink.rest.apis](../index.md) / [BudgetApi](index.md) / [getDetails](./get-details.md)

# getDetails

`@GET("/api/v1/budgets/{id}/details") abstract suspend fun getDetails(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Query("start") start: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?, @Query("end") end: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?): `[`BudgetDetailsResponse`](../../com.tink.rest.models/-budget-details-response/index.md)

Get budget details
Get the specified budget and its periods within the start and end dates. The date parameters are inclusive, thus specifying a date in the middle of a period will include the complete period amounts. Returns `404 Not Found` if the budget does not exist. Returns `400 Bad Request` if any of the request parameters is incorrect or missing. Returns `500 Internal Server Error` for any unspecified error.

### Parameters

`id` - The ID of the budget. (required)

`start` - Date within the first period expressed as UTC epoch timestamp in milliseconds. (optional)

`end` - Date within the last period expressed as UTC epoch timestamp in milliseconds. (optional)