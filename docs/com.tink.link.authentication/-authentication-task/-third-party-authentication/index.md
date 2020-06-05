[link](../../../index.md) / [com.tink.link.authentication](../../index.md) / [AuthenticationTask](../index.md) / [ThirdPartyAuthentication](./index.md)

# ThirdPartyAuthentication

`data class ThirdPartyAuthentication : `[`AuthenticationTask`](../index.md)

Indicates that there is an authentication in a third party app or in the browser necessary
to proceed with the authentication.
The user can be sent to redirected by calling [launch](launch.md), or you can provide a custom redirection
logic with the use of the data in [thirdPartyAppAuthentication](third-party-app-authentication.md)

### Types

| Name | Summary |
|---|---|
| [LaunchResult](-launch-result/index.md) | Indicates if the user was successfully redirected when [launch](launch.md) was called.`sealed class LaunchResult : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Indicates that there is an authentication in a third party app or in the browser necessary to proceed with the authentication. The user can be sent to redirected by calling [launch](launch.md), or you can provide a custom redirection logic with the use of the data in [thirdPartyAppAuthentication](third-party-app-authentication.md)`ThirdPartyAuthentication(credentials: `[`Credentials`](../../../com.tink.model.credentials/-credentials/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [thirdPartyAppAuthentication](third-party-app-authentication.md) | `val thirdPartyAppAuthentication: `[`ThirdPartyAppAuthentication`](../../../com.tink.model.authentication/-third-party-app-authentication/index.md) |

### Functions

| Name | Summary |
|---|---|
| [launch](launch.md) | Try to redirect the user to the third party app for authentication.`fun launch(activity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`): LaunchResult` |
