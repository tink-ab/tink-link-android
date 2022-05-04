---
title: [androidJvm]AccountDetails
---
//[link](../../../index.html)/[com.tink.model.account](../index.html)/[[androidJvm]AccountDetails](index.html)



# AccountDetails



[androidJvm]\
data class [AccountDetails](index.html)(val interest: [ExactNumber](../../com.tink.model.misc/[android-jvm]-exact-number/index.html)? = null, val numberOfMonthsBound: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, val type: [AccountDetails.Type](-type/index.html)?, val nextDayOfTermsChange: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)? = null) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [AccountDetails](-account-details.html) | [androidJvm]<br>fun [AccountDetails](-account-details.html)(interest: [ExactNumber](../../com.tink.model.misc/[android-jvm]-exact-number/index.html)? = null, numberOfMonthsBound: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, type: [AccountDetails.Type](-type/index.html)?, nextDayOfTermsChange: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [Type](-type/index.html) | [androidJvm]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[AccountDetails.Type](-type/index.html)&gt; |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [interest](interest.html) | [androidJvm]<br>val [interest](interest.html): [ExactNumber](../../com.tink.model.misc/[android-jvm]-exact-number/index.html)? = null |
| [nextDayOfTermsChange](next-day-of-terms-change.html) | [androidJvm]<br>val [nextDayOfTermsChange](next-day-of-terms-change.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)? = null |
| [numberOfMonthsBound](number-of-months-bound.html) | [androidJvm]<br>val [numberOfMonthsBound](number-of-months-bound.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null |
| [type](type.html) | [androidJvm]<br>val [type](type.html): [AccountDetails.Type](-type/index.html)? |

