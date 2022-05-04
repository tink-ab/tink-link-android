---
title: [androidJvm]WeekPeriod
---
//[link](../../../index.html)/[com.tink.model.time](../index.html)/[[androidJvm]WeekPeriod](index.html)



# WeekPeriod



[androidJvm]\
data class [WeekPeriod](index.html)(val weekOfYear: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val year: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val identifier: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val start: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val end: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)) : [Period](../[android-jvm]-period/index.html)



## Constructors


| | |
|---|---|
| [WeekPeriod](-week-period.html) | [androidJvm]<br>fun [WeekPeriod](-week-period.html)(weekOfYear: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), year: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), identifier: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), start: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), end: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [end](end.html) | [androidJvm]<br>open override val [end](end.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [identifier](identifier.html) | [androidJvm]<br>open override val [identifier](identifier.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [start](start.html) | [androidJvm]<br>open override val [start](start.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [weekOfYear](week-of-year.html) | [androidJvm]<br>val [weekOfYear](week-of-year.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [year](year.html) | [androidJvm]<br>val [year](year.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

