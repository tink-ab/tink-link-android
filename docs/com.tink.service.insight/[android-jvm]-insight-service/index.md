---
title: [androidJvm]InsightService
---
//[link](../../../index.html)/[com.tink.service.insight](../index.html)/[[androidJvm]InsightService](index.html)



# InsightService



[androidJvm]\
interface [InsightService](index.html)



## Functions


| Name | Summary |
|---|---|
| [listArchived](list-archived.html) | [androidJvm]<br>abstract suspend fun [listArchived](list-archived.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Insight](../../com.tink.model.insights/[android-jvm]-insight/index.html)&gt; |
| [listInsights](list-insights.html) | [androidJvm]<br>abstract suspend fun [listInsights](list-insights.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Insight](../../com.tink.model.insights/[android-jvm]-insight/index.html)&gt; |
| [selectAction](select-action.html) | [androidJvm]<br>abstract suspend fun [selectAction](select-action.html)(performedAction: [PerformedInsightAction](../../com.tink.model.insights/[android-jvm]-performed-insight-action/index.html)) |


## Inheritors


| Name |
|---|
| InsightServiceImpl |

