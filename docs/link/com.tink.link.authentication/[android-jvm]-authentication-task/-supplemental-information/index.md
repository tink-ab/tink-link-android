---
title: SupplementalInformation
---
//[link](../../../../index.html)/[com.tink.link.authentication](../../index.html)/[[androidJvm]AuthenticationTask](../index.html)/[SupplementalInformation](index.html)



# SupplementalInformation



[androidJvm]\
data class [SupplementalInformation](index.html)(credentials: Credentials) : [AuthenticationTask](../index.html)

Indicates that there is additional information required from the user to proceed. This can for example be an OTP sent via SMS or authentication app. First the [fields](fields.html) should be made accessible to the user for example as text input fields. Then [submit](submit.html) should be called as soon as the fields have been validated and the user is ready to send the information.



## Constructors


| | |
|---|---|
| [SupplementalInformation](-supplemental-information.html) | [androidJvm]<br>fun [SupplementalInformation](-supplemental-information.html)(credentials: Credentials) |


## Functions


| Name | Summary |
|---|---|
| [cancel](cancel.html) | [androidJvm]<br>fun [cancel](cancel.html)(resultHandler: ResultHandler&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Cancel the ongoing supplemental information task. This can be used to fail the authentication should the user back out of the authentication. If not called, the authentication will time out on its own. This is a shortcut to be able to get into a failed state faster and thus be able to retry more quickly. |
| [describeContents](../-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [isNewerThan](../is-newer-than.html) | [androidJvm]<br>fun [isNewerThan](../is-newer-than.html)(other: [AuthenticationTask](../index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Helper function comparing two [AuthenticationTask](../index.html)s to see if one is newer than that the other. This can be used to determine if a new update should be sent. This is for internal use in the Tink Sdk and it should not be necessary to use it otherwise. |
| [submit](submit.html) | [androidJvm]<br>fun [submit](submit.html)(filledFields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, resultHandler: ResultHandler&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Submit supplemental information for the authentication to Tink. Should be called as soon as the fields have been validated and the user is ready to send the information. |
| [writeToParcel](../-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [fields](fields.html) | [androidJvm]<br>val [fields](fields.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;Field&gt;<br>The fields that need to be displayed to the user for input |

