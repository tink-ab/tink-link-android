---
title: CreateTransfer
---
//[link](../../../../../index.html)/[com.tink.model.insights](../../../index.html)/[[androidJvm]InsightAction](../../index.html)/[Data](../index.html)/[CreateTransfer](index.html)



# CreateTransfer



[androidJvm]\
data class [CreateTransfer](index.html)(val sourceUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val destinationUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val amount: [Amount](../../../../com.tink.model.misc/[android-jvm]-amount/index.html)? = null, val sourceAccountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val destinationAccountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [InsightAction.Data](../index.html)



## Constructors


| | |
|---|---|
| [CreateTransfer](-create-transfer.html) | [androidJvm]<br>fun [CreateTransfer](-create-transfer.html)(sourceUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, destinationUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, amount: [Amount](../../../../com.tink.model.misc/[android-jvm]-amount/index.html)? = null, sourceAccountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, destinationAccountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [amount](amount.html) | [androidJvm]<br>val [amount](amount.html): [Amount](../../../../com.tink.model.misc/[android-jvm]-amount/index.html)? = null |
| [destinationAccountNumber](destination-account-number.html) | [androidJvm]<br>val [destinationAccountNumber](destination-account-number.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [destinationUri](destination-uri.html) | [androidJvm]<br>val [destinationUri](destination-uri.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [sourceAccountNumber](source-account-number.html) | [androidJvm]<br>val [sourceAccountNumber](source-account-number.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [sourceUri](source-uri.html) | [androidJvm]<br>val [sourceUri](source-uri.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |

