[link](../../index.md) / [com.tink.rest.apis](../index.md) / [AccountApi](index.md) / [update](./update.md)

# update

`@PUT("/api/v1/accounts/{id}") abstract suspend fun update(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Body body: `[`Account`](../../com.tink.rest.models/-account/index.md)`): `[`Account`](../../com.tink.rest.models/-account/index.md)

Update an Account
Updates mutable properties of an account. The following properties are possible to update: accountExclusion, accountNumber, excluded, favored, name, type

### Parameters

`id` - The ID of the account (required)

`body` - The updated account object (required)