[link](../../../../../../index.md) / [com.tink.link.authentication](../../../../../index.md) / [AuthenticationTask](../../../../index.md) / [ThirdPartyAuthentication](../../../index.md) / [LaunchResult](../../index.md) / [Error](../index.md) / [AppNotInstalled](./index.md)

# AppNotInstalled

`data class AppNotInstalled : Error`

The app necessary for authentication is not installed on the user's device.

Properties [packageName](package-name.md), [title](title.md), and [message](message.md) can be used for example to show
a dialog to the user prompting to install the app.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The app necessary for authentication is not installed on the user's device.`AppNotInstalled(packageName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [message](message.md) | `val message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [packageName](package-name.md) | `val packageName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [title](title.md) | `val title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
