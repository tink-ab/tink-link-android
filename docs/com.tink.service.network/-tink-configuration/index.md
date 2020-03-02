[link](../../index.md) / [com.tink.service.network](../index.md) / [TinkConfiguration](./index.md)

# TinkConfiguration

`data class TinkConfiguration`

Configuration for Tink Link

### Parameters

`environment` - The environment you want to connect to. Use [Environment.Production](../-environment/-production.md) if you
are using the Tink environment or add your own with [Environment.Custom](../-environment/-custom/index.md)

`oAuthClientId` - Your client id. You can retrieve it from [the Tink console](https://console.tink.com).

`redirectUri` - The URI to redirect back to your app from a browser or third party app.
Refer to the [third party authorization guide](https://github.com/tink-ab/tink-link-sdk-android/blob/master/third-party-authentication.md) for details.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Configuration for Tink Link`TinkConfiguration(environment: `[`Environment`](../-environment/index.md)`, oAuthClientId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, redirectUri: `[`Uri`](https://developer.android.com/reference/android/net/Uri.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [environment](environment.md) | The environment you want to connect to. Use [Environment.Production](../-environment/-production.md) if you are using the Tink environment or add your own with [Environment.Custom](../-environment/-custom/index.md)`val environment: `[`Environment`](../-environment/index.md) |
| [oAuthClientId](o-auth-client-id.md) | Your client id. You can retrieve it from [the Tink console](https://console.tink.com).`val oAuthClientId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [redirectUri](redirect-uri.md) | The URI to redirect back to your app from a browser or third party app. Refer to the [third party authorization guide](https://github.com/tink-ab/tink-link-sdk-android/blob/master/third-party-authentication.md) for details.`val redirectUri: `[`Uri`](https://developer.android.com/reference/android/net/Uri.html) |
