---
title: [androidJvm]CredentialsService
---
//[link](../../../index.html)/[com.tink.service.credentials](../index.html)/[[androidJvm]CredentialsService](index.html)



# CredentialsService



[androidJvm]\
interface [CredentialsService](index.html)



## Functions


| Name | Summary |
|---|---|
| [authenticate](authenticate.html) | [androidJvm]<br>abstract suspend fun [authenticate](authenticate.html)(descriptor: [CredentialsAuthenticateDescriptor](../[android-jvm]-credentials-authenticate-descriptor/index.html)) |
| [cancelSupplementalInformation](cancel-supplemental-information.html) | [androidJvm]<br>abstract suspend fun [cancelSupplementalInformation](cancel-supplemental-information.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [create](create.html) | [androidJvm]<br>abstract suspend fun [create](create.html)(descriptor: [CredentialsCreationDescriptor](../[android-jvm]-credentials-creation-descriptor/index.html)): [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html) |
| [delete](delete.html) | [androidJvm]<br>abstract suspend fun [delete](delete.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [disable](disable.html) | [androidJvm]<br>abstract suspend fun [disable](disable.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [enable](enable.html) | [androidJvm]<br>abstract suspend fun [enable](enable.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [getCredentials](get-credentials.html) | [androidJvm]<br>abstract suspend fun [getCredentials](get-credentials.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html) |
| [list](list.html) | [androidJvm]<br>abstract fun [list](list.html)(): [Stream](../../com.tink.service.streaming.publisher/[android-jvm]-stream/index.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html)&gt;&gt; |
| [refresh](refresh.html) | [androidJvm]<br>abstract suspend fun [refresh](refresh.html)(descriptor: [CredentialsRefreshDescriptor](../[android-jvm]-credentials-refresh-descriptor/index.html)) |
| [supplementInformation](supplement-information.html) | [androidJvm]<br>abstract suspend fun [supplementInformation](supplement-information.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), information: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [thirdPartyCallback](third-party-callback.html) | [androidJvm]<br>abstract suspend fun [thirdPartyCallback](third-party-callback.html)(state: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), parameters: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [update](update.html) | [androidJvm]<br>abstract suspend fun [update](update.html)(descriptor: [CredentialsUpdateDescriptor](../[android-jvm]-credentials-update-descriptor/index.html)): [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html) |

