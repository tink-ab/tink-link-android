---
title: [androidJvm]SignableOperation
---
//[link](../../../index.html)/[com.tink.model.transfer](../index.html)/[[androidJvm]SignableOperation](index.html)



# SignableOperation



[androidJvm]\
data class [SignableOperation](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val created: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val status: [SignableOperation.Status](-status/index.html), val statusMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [SignableOperation.Type](-type/index.html), val underlyingId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val updated: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [SignableOperation](-signable-operation.html) | [androidJvm]<br>fun [SignableOperation](-signable-operation.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, created: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), status: [SignableOperation.Status](-status/index.html), statusMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [SignableOperation.Type](-type/index.html), underlyingId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), updated: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Types


| Name | Summary |
|---|---|
| [Status](-status/index.html) | [androidJvm]<br>enum [Status](-status/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[SignableOperation.Status](-status/index.html)&gt; <br>The status of the operation. [CANCELLED](-status/-c-a-n-c-e-l-l-e-d/index.html), [FAILED](-status/-f-a-i-l-e-d/index.html) and [EXECUTED](-status/-e-x-e-c-u-t-e-d/index.html) are all endstates. |
| [Type](-type/index.html) | [androidJvm]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[SignableOperation.Type](-type/index.html)&gt; |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [created](created.html) | [androidJvm]<br>val [created](created.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [credentialsId](credentials-id.html) | [androidJvm]<br>val [credentialsId](credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [status](status.html) | [androidJvm]<br>val [status](status.html): [SignableOperation.Status](-status/index.html) |
| [statusMessage](status-message.html) | [androidJvm]<br>val [statusMessage](status-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [type](type.html) | [androidJvm]<br>val [type](type.html): [SignableOperation.Type](-type/index.html) |
| [underlyingId](underlying-id.html) | [androidJvm]<br>val [underlyingId](underlying-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [updated](updated.html) | [androidJvm]<br>val [updated](updated.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [userId](user-id.html) | [androidJvm]<br>val [userId](user-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

