[link](../../../../../index.md) / [com.tink.link.authentication](../../../../index.md) / [AuthenticationTask](../../../index.md) / [ThirdPartyAuthentication](../../index.md) / [LaunchResult](../index.md) / [Error](./index.md)

# Error

`sealed class Error : LaunchResult`

There was an error when launching the third party app.

Properties [packageName](package-name.md), [title](title.md), and [message](message.md) can be used for example to show
a dialog to the user prompting to install or upgrading the app.

**See Also**

[AppNotInstalled](-app-not-installed/index.md)

[AppNeedsUpgrade](-app-needs-upgrade/index.md)

### Types

| Name | Summary |
|---|---|
| [AppNeedsUpgrade](-app-needs-upgrade/index.md) | The app necessary for authentication is installed on the users device but needs to be updated.`data class AppNeedsUpgrade : Error` |
| [AppNotInstalled](-app-not-installed/index.md) | The app necessary for authentication is not installed on the user's device.`data class AppNotInstalled : Error` |

### Properties

| Name | Summary |
|---|---|
| [message](message.md) | `abstract val message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [packageName](package-name.md) | `abstract val packageName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [title](title.md) | `abstract val title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
