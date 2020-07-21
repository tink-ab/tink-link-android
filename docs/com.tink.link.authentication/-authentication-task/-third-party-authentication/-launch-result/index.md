[link](../../../../index.md) / [com.tink.link.authentication](../../../index.md) / [AuthenticationTask](../../index.md) / [ThirdPartyAuthentication](../index.md) / [LaunchResult](./index.md)

# LaunchResult

`sealed class LaunchResult : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

Indicates if the user was successfully redirected when [launch](../launch.md) was called.

Possible values are [Success](-success.md) and [Error](-error/index.md)

### Types

| Name | Summary |
|---|---|
| [Error](-error/index.md) | There was an error when launching the third party app.`sealed class Error : LaunchResult` |
| [Success](-success.md) | The user has successfully been redirected to the third party app.`object Success : LaunchResult` |
