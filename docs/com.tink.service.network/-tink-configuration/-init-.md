[link](../../index.md) / [com.tink.service.network](../index.md) / [TinkConfiguration](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TinkConfiguration(environment: `[`Environment`](../-environment/index.md)`, oAuthClientId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, redirectUri: `[`Uri`](https://developer.android.com/reference/android/net/Uri.html)`)`

Configuration for Tink Link

### Parameters

`environment` - The environment you want to connect to. Use [Environment.Production](../-environment/-production.md) if you
are using the Tink environment or add your own with [Environment.Custom](../-environment/-custom/index.md)

`oAuthClientId` - Your client id. You can retrieve it from [the Tink console](https://console.tink.com).

`redirectUri` - The URI to redirect back to your app from a browser or third party app.
Refer to the [third party authorization guide](https://github.com/tink-ab/tink-link-sdk-android/blob/master/third-party-authentication.md) for details.