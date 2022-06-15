[link](../../index.md) / [com.tink.link.authentication](../index.md) / [AuthenticationTask](./index.md)

# AuthenticationTask

`sealed class AuthenticationTask : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

Represents an authentication that needs to be completed by the user.

The possible values are [SupplementalInformation](-supplemental-information/index.md) and [ThirdPartyAppAuthentication](../../com.tink.model.authentication/-third-party-app-authentication/index.md)

### Types

| Name | Summary |
|---|---|
| [SupplementalInformation](-supplemental-information/index.md) | Indicates that there is additional information required from the user to proceed. This can for example be an OTP sent via SMS or authentication app. First the [fields](-supplemental-information/fields.md) should be made accessible to the user for example as text input fields. Then [submit](-supplemental-information/submit.md) should be called as soon as the fields have been validated and the user is ready to send the information.`data class SupplementalInformation : `[`AuthenticationTask`](./index.md) |
| [ThirdPartyAuthentication](-third-party-authentication/index.md) | Indicates that there is an authentication in a third party app or in the browser necessary to proceed with the authentication. The user can be sent to redirected by calling [launch](-third-party-authentication/launch.md), or you can provide a custom redirection logic with the use of the data in [thirdPartyAppAuthentication](-third-party-authentication/third-party-app-authentication.md)`data class ThirdPartyAuthentication : `[`AuthenticationTask`](./index.md) |

### Functions

| Name | Summary |
|---|---|
| [isNewerThan](is-newer-than.md) | Helper function comparing two [AuthenticationTask](./index.md)s to see if one is newer than that the other. This can be used to determine if a new update should be sent. This is for internal use in the Tink Sdk and it should not be necessary to use it otherwise.`fun isNewerThan(other: `[`AuthenticationTask`](./index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
