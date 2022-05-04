---
title: [androidJvm]Period
---
//[link](../../../index.html)/[com.tink.model.time](../index.html)/[[androidJvm]Period](index.html)



# Period



[androidJvm]\
sealed class [Period](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [end](end.html) | [androidJvm]<br>abstract val [end](end.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [identifier](identifier.html) | [androidJvm]<br>abstract val [identifier](identifier.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [start](start.html) | [androidJvm]<br>abstract val [start](start.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |


## Inheritors


| Name |
|---|
| YearPeriod |
| MonthPeriod |
| DayPeriod |
| WeekPeriod |

