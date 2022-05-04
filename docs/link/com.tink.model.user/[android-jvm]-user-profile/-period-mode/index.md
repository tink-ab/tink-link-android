---
title: PeriodMode
---
//[link](../../../../index.html)/[com.tink.model.user](../../index.html)/[[androidJvm]UserProfile](../index.html)/[PeriodMode](index.html)



# PeriodMode



[androidJvm]\
sealed class [PeriodMode](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Types


| Name | Summary |
|---|---|
| [Monthly](-monthly/index.html) | [androidJvm]<br>object [Monthly](-monthly/index.html) : [UserProfile.PeriodMode](index.html) |
| [MonthlyAdjusted](-monthly-adjusted/index.html) | [androidJvm]<br>data class [MonthlyAdjusted](-monthly-adjusted/index.html)(val periodAdjustedDayOfMonth: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [UserProfile.PeriodMode](index.html) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Inheritors


| Name |
|---|
| Monthly |
| MonthlyAdjusted |

