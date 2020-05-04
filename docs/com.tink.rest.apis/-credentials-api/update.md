[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CredentialsApi](index.md) / [update](./update.md)

# update

`@PUT("/api/v1/credentials/{id}") abstract suspend fun update(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Body body: `[`UpdateCredentialsRequest`](../../com.tink.rest.models/-update-credentials-request/index.md)`): `[`Credentials`](../../com.tink.rest.models/-credentials/index.md)

Modify credentials
Modify the specified credentials.

### Parameters

`id` - The internal identifier of the credentials to change (required)

`body` - The new credentials object. (required)