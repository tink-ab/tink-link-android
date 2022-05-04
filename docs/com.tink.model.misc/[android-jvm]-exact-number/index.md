---
title: [androidJvm]ExactNumber
---
//[link](../../../index.html)/[com.tink.model.misc](../index.html)/[[androidJvm]ExactNumber](index.html)



# ExactNumber



[androidJvm]\
data class [ExactNumber](index.html)(val unscaledValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val scale: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)&lt;[ExactNumber](index.html)&gt; , [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [ExactNumber](-exact-number.html) | [androidJvm]<br>fun [ExactNumber](-exact-number.html)(double: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) |
| [ExactNumber](-exact-number.html) | [androidJvm]<br>fun [ExactNumber](-exact-number.html)(long: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |
| [ExactNumber](-exact-number.html) | [androidJvm]<br>fun [ExactNumber](-exact-number.html)(bigDecimal: [BigDecimal](https://developer.android.com/reference/kotlin/java/math/BigDecimal.html)) |
| [ExactNumber](-exact-number.html) | [androidJvm]<br>fun [ExactNumber](-exact-number.html)(unscaledValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), scale: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [compareTo](compare-to.html) | [androidJvm]<br>open operator override fun [compareTo](compare-to.html)(other: [ExactNumber](index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toBigDecimal](to-big-decimal.html) | [androidJvm]<br>fun [toBigDecimal](to-big-decimal.html)(): [BigDecimal](https://developer.android.com/reference/kotlin/java/math/BigDecimal.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [scale](scale.html) | [androidJvm]<br>val [scale](scale.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [unscaledValue](unscaled-value.html) | [androidJvm]<br>val [unscaledValue](unscaled-value.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

