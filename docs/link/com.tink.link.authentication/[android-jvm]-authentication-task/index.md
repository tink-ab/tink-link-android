---
title: [androidJvm]AuthenticationTask
---
//[link](../../../index.html)/[com.tink.link.authentication](../index.html)/[[androidJvm]AuthenticationTask](index.html)



# AuthenticationTask



[androidJvm]\
sealed class [AuthenticationTask](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Represents an authentication that needs to be completed by the user.



The possible values are [SupplementalInformation](-supplemental-information/index.html) and [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[android-jvm]-third-party-app-authentication/index.html)



## Types


| Name | Summary |
|---|---|
| [SupplementalInformation](-supplemental-information/index.html) | [androidJvm]<br>data class [SupplementalInformation](-supplemental-information/index.html)(credentials: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) : [AuthenticationTask](index.html)<br>Indicates that there is additional information required from the user to proceed. This can for example be an OTP sent via SMS or authentication app. First the [fields](-supplemental-information/fields.html) should be made accessible to the user for example as text input fields. Then [submit](-supplemental-information/submit.html) should be called as soon as the fields have been validated and the user is ready to send the information. |
| [ThirdPartyAuthentication](-third-party-authentication/index.html) | [androidJvm]<br>data class [ThirdPartyAuthentication](-third-party-authentication/index.html)(credentials: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) : [AuthenticationTask](index.html)<br>Indicates that there is an authentication in a third party app or in the browser necessary to proceed with the authentication. The user can be sent to redirected by calling [launch](-third-party-authentication/launch.html), or you can provide a custom redirection logic with the use of the data in [thirdPartyAppAuthentication](-third-party-authentication/third-party-app-authentication.html) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [isNewerThan](is-newer-than.html) | [androidJvm]<br>fun [isNewerThan](is-newer-than.html)(other: [AuthenticationTask](index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Helper function comparing two [AuthenticationTask](index.html)s to see if one is newer than that the other. This can be used to determine if a new update should be sent. This is for internal use in the Tink Sdk and it should not be necessary to use it otherwise. |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Inheritors


| Name |
|---|
| SupplementalInformation |
| ThirdPartyAuthentication |

