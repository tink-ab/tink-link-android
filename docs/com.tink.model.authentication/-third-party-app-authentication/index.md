[link](../../index.md) / [com.tink.model.authentication](../index.md) / [ThirdPartyAppAuthentication](./index.md)

# ThirdPartyAppAuthentication

`data class ThirdPartyAppAuthentication : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

This model contains information required for third party authentication flow.

### Types

| Name | Summary |
|---|---|
| [Android](-android/index.md) | This model contains Android specific information required to launch the third party application.`data class Android : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | This model contains information required for third party authentication flow.`ThirdPartyAppAuthentication(downloadMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, downloadTitle: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, upgradeMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, upgradeTitle: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, android: Android? = null)` |

### Properties

| Name | Summary |
|---|---|
| [android](android.md) | The object containing Android specific information required to launch the third party application.`val android: Android?` |
| [downloadMessage](download-message.md) | A user-friendly text requesting the user to download the application for third party app authentication`val downloadMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [downloadTitle](download-title.md) | The title of the download application prompt shown to the users`val downloadTitle: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [upgradeMessage](upgrade-message.md) | A user-friendly text requesting the user to upgrade the application for third party app authentication`val upgradeMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [upgradeTitle](upgrade-title.md) | The title of the upgrade application prompt shown to the users`val upgradeTitle: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
