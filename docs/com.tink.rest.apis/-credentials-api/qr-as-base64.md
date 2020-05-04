[link](../../index.md) / [com.tink.rest.apis](../index.md) / [CredentialsApi](index.md) / [qrAsBase64](./qr-as-base64.md)

# qrAsBase64

`@GET("/api/v1/credentials/{id}/qr") abstract suspend fun qrAsBase64(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Get QR code
QR code for authentication flows such as Mobile BankID as base64 encoded PNG. Includes `data:image/png;base64,`.

### Parameters

`id` - (required)