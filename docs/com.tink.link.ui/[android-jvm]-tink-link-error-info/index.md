---
title: [androidJvm]TinkLinkErrorInfo
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[androidJvm]TinkLinkErrorInfo](index.html)



# TinkLinkErrorInfo



[androidJvm]\
sealed class [TinkLinkErrorInfo](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

A wrapper class that provides information about the underlying error causing the [TinkLinkError](../[android-jvm]-tink-link-error/index.html)



## Types


| Name | Summary |
|---|---|
| [HttpError](-http-error/index.html) | [androidJvm]<br>data class [HttpError](-http-error/index.html)(val code: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TinkLinkErrorInfo](index.html)<br>This represents an HTTP exception that may have occurred. |
| [InternalError](-internal-error/index.html) | [androidJvm]<br>data class [InternalError](-internal-error/index.html)(val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TinkLinkErrorInfo](index.html)<br>This represents a generic error that may have occurred. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [message](message.html) | [androidJvm]<br>abstract val [message](message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The error message |


## Inheritors


| Name |
|---|
| HttpError |
| InternalError |

