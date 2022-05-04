---
title: SupplementalInformation
---
//[link](../../../../index.html)/[com.tink.link.authentication](../../index.html)/[[common]AuthenticationTask](../index.html)/[SupplementalInformation](index.html)



# SupplementalInformation



[common]\
data class [SupplementalInformation](index.html)(credentials: &lt;ERROR CLASS&gt;) : [AuthenticationTask](../index.html)

Indicates that there is additional information required from the user to proceed. This can for example be an OTP sent via SMS or authentication app. First the [fields](fields.html) should be made accessible to the user for example as text input fields. Then [submit](submit.html) should be called as soon as the fields have been validated and the user is ready to send the information.



## Constructors


| | |
|---|---|
| [SupplementalInformation](-supplemental-information.html) | [common]<br>fun [SupplementalInformation](-supplemental-information.html)(credentials: &lt;ERROR CLASS&gt;) |


## Functions


| Name | Summary |
|---|---|
| [cancel](cancel.html) | [common]<br>fun [cancel](cancel.html)(resultHandler: &lt;ERROR CLASS&gt;&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Cancel the ongoing supplemental information task. This can be used to fail the authentication should the user back out of the authentication. If not called, the authentication will time out on its own. This is a shortcut to be able to get into a failed state faster and thus be able to retry more quickly. |
| [isNewerThan](../is-newer-than.html) | [common]<br>fun [isNewerThan](../is-newer-than.html)(other: [AuthenticationTask](../index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Helper function comparing two [AuthenticationTask](../index.html)s to see if one is newer than that the other. This can be used to determine if a new update should be sent. This is for internal use in the Tink Sdk and it should not be necessary to use it otherwise. |
| [submit](submit.html) | [common]<br>fun [submit](submit.html)(filledFields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, resultHandler: &lt;ERROR CLASS&gt;&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Submit supplemental information for the authentication to Tink. Should be called as soon as the fields have been validated and the user is ready to send the information. |


## Properties


| Name | Summary |
|---|---|
| [fields](fields.html) | [common]<br>val [fields](fields.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;&lt;ERROR CLASS&gt;&gt;<br>The fields that need to be displayed to the user for input |

