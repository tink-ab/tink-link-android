---
title: [androidJvm]UserProfile
---
//[link](../../../index.html)/[com.tink.model.user](../index.html)/[[androidJvm]UserProfile](index.html)



# UserProfile



[androidJvm]\
data class [UserProfile](index.html)(val locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val timeZone: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val currency: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val periodMode: [UserProfile.PeriodMode](-period-mode/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [UserProfile](-user-profile.html) | [androidJvm]<br>fun [UserProfile](-user-profile.html)(locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), timeZone: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), currency: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), periodMode: [UserProfile.PeriodMode](-period-mode/index.html)) |


## Types


| Name | Summary |
|---|---|
| [PeriodMode](-period-mode/index.html) | [androidJvm]<br>sealed class [PeriodMode](-period-mode/index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [currency](currency.html) | [androidJvm]<br>val [currency](currency.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [locale](locale.html) | [androidJvm]<br>val [locale](locale.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [market](market.html) | [androidJvm]<br>val [market](market.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [periodMode](period-mode.html) | [androidJvm]<br>val [periodMode](period-mode.html): [UserProfile.PeriodMode](-period-mode/index.html) |
| [timeZone](time-zone.html) | [androidJvm]<br>val [timeZone](time-zone.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

