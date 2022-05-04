---
title: [common]AuthenticationTask
---
//[link](../../../index.html)/[com.tink.link.authentication](../index.html)/[[common]AuthenticationTask](index.html)



# AuthenticationTask



[common]\
sealed class [AuthenticationTask](index.html)

Represents an authentication that needs to be completed by the user.



The possible values are [SupplementalInformation](-supplemental-information/index.html) and [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[common]-third-party-app-authentication/index.html)



## Types


| Name | Summary |
|---|---|
| [SupplementalInformation](-supplemental-information/index.html) | [common]<br>data class [SupplementalInformation](-supplemental-information/index.html)(credentials: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html)) : [AuthenticationTask](index.html)<br>Indicates that there is additional information required from the user to proceed. This can for example be an OTP sent via SMS or authentication app. First the [fields](-supplemental-information/fields.html) should be made accessible to the user for example as text input fields. Then [submit](-supplemental-information/submit.html) should be called as soon as the fields have been validated and the user is ready to send the information. |
| [ThirdPartyAuthentication](-third-party-authentication/index.html) | [common]<br>data class [ThirdPartyAuthentication](-third-party-authentication/index.html)(credentials: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html)) : [AuthenticationTask](index.html)<br>Indicates that there is an authentication in a third party app or in the browser necessary to proceed with the authentication. The user can be sent to redirected by calling [launch](-third-party-authentication/launch.html), or you can provide a custom redirection logic with the use of the data in [thirdPartyAppAuthentication](-third-party-authentication/third-party-app-authentication.html) |


## Functions


| Name | Summary |
|---|---|
| [isNewerThan](is-newer-than.html) | [common]<br>fun [isNewerThan](is-newer-than.html)(other: [AuthenticationTask](index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Helper function comparing two [AuthenticationTask](index.html)s to see if one is newer than that the other. This can be used to determine if a new update should be sent. This is for internal use in the Tink Sdk and it should not be necessary to use it otherwise. |


## Inheritors


| Name |
|---|
| SupplementalInformation |
| ThirdPartyAuthentication |

