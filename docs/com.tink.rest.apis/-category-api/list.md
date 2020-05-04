[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CategoryApi](index.md) / [list](./list.md)

# list

`@GET("/api/v1/categories") abstract suspend fun list(@Query("locale") locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Category`](../../com.tink.rest.models/-category/index.md)`>`

List categories
Returns all categories for the given locale. The locale is either taken from the authenticated user or from a query parameter, if no user is authenticated. If no user and no query parameter is given, a default locale is used.

### Parameters

`locale` - The locale for which to fetch categories. (optional)