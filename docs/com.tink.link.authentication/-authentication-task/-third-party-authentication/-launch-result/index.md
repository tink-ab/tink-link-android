[link](../../../../index.md) / [com.tink.link.authentication](../../../index.md) / [AuthenticationTask](../../index.md) / [ThirdPartyAuthentication](../index.md) / [LaunchResult](./index.md)

# LaunchResult

`sealed class LaunchResult : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

Indicates if the user was successfully redirected when [launch](../launch.md) was called.

Possible values are [Success](-success.md), [AppNotInstalled](-app-not-installed/index.md), and [AppNeedsUpgrade](-app-needs-upgrade/index.md)

### Types

| Name | Summary |
|---|---|
| [AppNeedsUpgrade](-app-needs-upgrade/index.md) | The app necessary for authentication is installed on the users device but needs to be updated.`data class AppNeedsUpgrade : LaunchResult` |
| [AppNotInstalled](-app-not-installed/index.md) | The app necessary for authentication is not installed on the user's device.`data class AppNotInstalled : LaunchResult` |
| [Success](-success.md) | The user has successfully been redirected to the third party app.`object Success : LaunchResult` |
