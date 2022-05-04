---
title: [androidJvm]Statistics
---
//[link](../../../index.html)/[com.tink.model.statistics](../index.html)/[[androidJvm]Statistics](index.html)



# Statistics



[androidJvm]\
data class [Statistics](index.html)(val identifier: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [Statistics.Type](-type/index.html), val period: [Period](../../com.tink.model.time/[android-jvm]-period/index.html), val value: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [Statistics](-statistics.html) | [androidJvm]<br>fun [Statistics](-statistics.html)(identifier: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [Statistics.Type](-type/index.html), period: [Period](../../com.tink.model.time/[android-jvm]-period/index.html), value: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html)) |


## Types


| Name | Summary |
|---|---|
| [Type](-type/index.html) | [androidJvm]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Statistics.Type](-type/index.html)&gt; |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [identifier](identifier.html) | [androidJvm]<br>val [identifier](identifier.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [period](period.html) | [androidJvm]<br>val [period](period.html): [Period](../../com.tink.model.time/[android-jvm]-period/index.html) |
| [type](type.html) | [androidJvm]<br>val [type](type.html): [Statistics.Type](-type/index.html) |
| [value](value.html) | [androidJvm]<br>val [value](value.html): [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html) |

