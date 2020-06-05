[link](../../../../../index.md) / [com.tink.link.authentication](../../../../index.md) / [AuthenticationTask](../../../index.md) / [ThirdPartyAuthentication](../../index.md) / [LaunchResult](../index.md) / [AppNeedsUpgrade](./index.md)

# AppNeedsUpgrade

`data class AppNeedsUpgrade : LaunchResult`

The app necessary for authentication is installed on the users device but needs to
be updated.

Properties [packageName](package-name.md), [title](title.md), and [message](message.md) can be used for example to show
a dialog to the user prompting to upgrade the app.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The app necessary for authentication is installed on the users device but needs to be updated.`AppNeedsUpgrade(packageName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [message](message.md) | `val message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [packageName](package-name.md) | `val packageName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [title](title.md) | `val title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
