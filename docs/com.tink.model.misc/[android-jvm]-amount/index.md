---
title: [androidJvm]Amount
---
//[link](../../../index.html)/[com.tink.model.misc](../index.html)/[[androidJvm]Amount](index.html)



# Amount



[androidJvm]\
data class [Amount](index.html)(val value: [ExactNumber](../[android-jvm]-exact-number/index.html), val currencyCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [Amount](-amount.html) | [androidJvm]<br>fun [Amount](-amount.html)(value: [ExactNumber](../[android-jvm]-exact-number/index.html), currencyCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [currencyCode](currency-code.html) | [androidJvm]<br>val [currencyCode](currency-code.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [value](value.html) | [androidJvm]<br>val [value](value.html): [ExactNumber](../[android-jvm]-exact-number/index.html) |


## Extensions


| Name | Summary |
|---|---|
| toDto | [common, androidJvm]<br>[common]<br>fun [Amount](../[common]-amount/index.html).[toDto](../../com.tink.service.misc/[common]to-dto.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [Amount](index.html).[toDto](../../com.tink.service.misc/[android-jvm]to-dto.html)(): CurrencyDenominatedAmount |

