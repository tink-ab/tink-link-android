[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CredentialsApi](index.md) / [get](./get.md)

# get

`@GET("/api/v1/credentials/{id}") abstract suspend fun get(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Credentials`](../../com.tink.rest.models/-credentials/index.md)

Get credentials
Gets credentials by ID.

### Parameters

`id` - The internal identifier of the credentials to get (required)