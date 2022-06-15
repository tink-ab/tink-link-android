---
title: [androidJvm]PerformedInsightAction
---
//[link](../../../index.html)/[com.tink.model.insights](../index.html)/[[androidJvm]PerformedInsightAction](index.html)



# PerformedInsightAction



[androidJvm]\
data class [PerformedInsightAction](index.html)(val insightId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val actionType: [InsightAction.Type](../[android-jvm]-insight-action/-type/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [PerformedInsightAction](-performed-insight-action.html) | [androidJvm]<br>fun [PerformedInsightAction](-performed-insight-action.html)(insightId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), actionType: [InsightAction.Type](../[android-jvm]-insight-action/-type/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [actionType](action-type.html) | [androidJvm]<br>val [actionType](action-type.html): [InsightAction.Type](../[android-jvm]-insight-action/-type/index.html) |
| [insightId](insight-id.html) | [androidJvm]<br>val [insightId](insight-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [userId](user-id.html) | [androidJvm]<br>val [userId](user-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

