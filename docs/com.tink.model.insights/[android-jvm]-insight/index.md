---
title: [androidJvm]Insight
---
//[link](../../../index.html)/[com.tink.model.insights](../index.html)/[[androidJvm]Insight](index.html)



# Insight



[androidJvm]\
data class [Insight](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [InsightType](../[android-jvm]-insight-type/index.html), val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val created: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val actions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightAction](../[android-jvm]-insight-action/index.html)&gt;, val state: [InsightState](../[android-jvm]-insight-state/index.html), val data: [InsightData](../[android-jvm]-insight-data/index.html), var viewDetails: [Insight.ViewDetails](-view-details/index.html)? = null) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [Insight](-insight.html) | [androidJvm]<br>fun [Insight](-insight.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [InsightType](../[android-jvm]-insight-type/index.html), title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), created: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), actions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightAction](../[android-jvm]-insight-action/index.html)&gt;, state: [InsightState](../[android-jvm]-insight-state/index.html), data: [InsightData](../[android-jvm]-insight-data/index.html), viewDetails: [Insight.ViewDetails](-view-details/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [ViewDetails](-view-details/index.html) | [androidJvm]<br>interface [ViewDetails](-view-details/index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>All subclasses should be data classes or provide a meaningful equals() function |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [actions](actions.html) | [androidJvm]<br>val [actions](actions.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightAction](../[android-jvm]-insight-action/index.html)&gt; |
| [created](created.html) | [androidJvm]<br>val [created](created.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [data](data.html) | [androidJvm]<br>val [data](data.html): [InsightData](../[android-jvm]-insight-data/index.html) |
| [description](description.html) | [androidJvm]<br>val [description](description.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [state](state.html) | [androidJvm]<br>val [state](state.html): [InsightState](../[android-jvm]-insight-state/index.html) |
| [title](title.html) | [androidJvm]<br>val [title](title.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [type](type.html) | [androidJvm]<br>val [type](type.html): [InsightType](../[android-jvm]-insight-type/index.html) |
| [viewDetails](view-details.html) | [androidJvm]<br>var [viewDetails](view-details.html): [Insight.ViewDetails](-view-details/index.html)? = null |

