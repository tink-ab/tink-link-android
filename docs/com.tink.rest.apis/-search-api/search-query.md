[link](../../index.md) / [com.tink.rest.apis](../index.md) / [SearchApi](index.md) / [searchQuery](./search-query.md)

# searchQuery

`@POST("/api/v1/search") abstract suspend fun searchQuery(@Body body2: `[`SearchQuery`](../../com.tink.rest.models/-search-query/index.md)`, @Body body: `[`AuthenticationContext`](../../com.tink.rest.models/-authentication-context/index.md)`): `[`SearchResponse`](../../com.tink.rest.models/-search-response/index.md)

Query transactions
Queries transactions based on multiple parameters and returns a response containing transactions and their corresponding statistics matching the query. The query contains both fixed parameters and parameters parsed from the free text `queryString`. All the commands below are typically applied per word in the query and if multiple commands are found, they are concatenated with an `AND` operation (`OR` does not exist).  ### Query string commands  Type |  Description | Keywords ---- | ----------------- | ----------------- Tags | Searches specifically for transactions with tags.| Words starting with '#'. Amount Span | Searches for transactions within the given amount span. Keywords here depend on the locality of the user. | `over`, `under`, `more than`, `less than`, `around` Date/Time Span | Searches for transactions within the given date/time span. Keywords here depend on the locality of the user. | `weekdays`, `weekends`, `today`, `yesterday`, `this week/month/year`, `last week/month/year`, `week #`. Category | Searches specifically for transactions with the specified category. Keywords here depend on the locality of the user. | `Restaurant`, `Bar`

### Parameters

`body2` - The search query. (required)

`body` - (optional)