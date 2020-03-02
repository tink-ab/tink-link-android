[link](../../index.md) / [com.tink.link.core.user](../index.md) / [UserContext](index.md) / [handleUri](./handle-uri.md)

# handleUri

`abstract fun handleUri(uri: `[`Uri`](https://developer.android.com/reference/android/net/Uri.html)`, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>? = null): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Handle a third-party callback.

Call this method when identifying a third-party callback from the registered
[redirectUri](../../com.tink.service.network/-tink-configuration/redirect-uri.md)

Example:

```
private fun redirectIfAppropriate(intent: Intent?) {
     intent?.data?.let { uri ->
         Tink.getUserContext()?.handleUri(uri)
     }
}
```

