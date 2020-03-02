[link](../../../index.md) / [com.tink.model.authentication](../../index.md) / [ThirdPartyAppAuthentication](../index.md) / [Android](./index.md)

# Android

`data class Android : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

This model contains Android specific information required to launch the third party application.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | This model contains Android specific information required to launch the third party application.`Android(intent: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, packageName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, requiredMinimumVersion: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [intent](intent.md) | A uri string that can be parsed into [Uri](https://developer.android.com/reference/android/net/Uri.html) and set as `data` for the [Intent](https://developer.android.com/reference/android/content/Intent.html) to launch the third party application. See [Intent.setData](https://developer.android.com/reference/android/content/Intent.html#setData(android.net.Uri))`val intent: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [packageName](package-name.md) | The package name of the third party application`val packageName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [requiredMinimumVersion](required-minimum-version.md) | The minimum version of the third party application that needs to be installed on the device for the authentication flow`val requiredMinimumVersion: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
