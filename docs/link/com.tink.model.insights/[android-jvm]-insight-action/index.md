---
title: [androidJvm]InsightAction
---
//[link](../../../index.html)/[com.tink.model.insights](../index.html)/[[androidJvm]InsightAction](index.html)



# InsightAction



[androidJvm]\
data class [InsightAction](index.html)(val label: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val actionType: [InsightAction.Type](-type/index.html), val data: [InsightAction.Data](-data/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [InsightAction](-insight-action.html) | [androidJvm]<br>fun [InsightAction](-insight-action.html)(label: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), actionType: [InsightAction.Type](-type/index.html), data: [InsightAction.Data](-data/index.html)) |


## Types


| Name | Summary |
|---|---|
| [Data](-data/index.html) | [androidJvm]<br>sealed class [Data](-data/index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>All subclasses should be data classes or provide a meaningful equals() function |
| [Type](-type/index.html) | [androidJvm]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[InsightAction.Type](-type/index.html)&gt; |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [actionType](action-type.html) | [androidJvm]<br>val [actionType](action-type.html): [InsightAction.Type](-type/index.html) |
| [data](data.html) | [androidJvm]<br>val [data](data.html): [InsightAction.Data](-data/index.html) |
| [label](label.html) | [androidJvm]<br>val [label](label.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

