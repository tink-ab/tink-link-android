[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CredentialsApi](index.md) / [supplemental](./supplemental.md)

# supplemental

`@POST("/api/v1/credentials/{id}/supplemental-information") abstract suspend fun supplemental(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Body body: `[`SupplementalInformation`](../../com.tink.rest.models/-supplemental-information/index.md)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Add Supplemental Information
Adds supplemental information to an authentication.

### Parameters

`id` - (required)

`body` - The supplemental information. (required)