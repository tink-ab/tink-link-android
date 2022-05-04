---
title: [common]InsightService
---
//[link](../../../index.html)/[com.tink.service.insight](../index.html)/[[common]InsightService](index.html)



# InsightService



[common]\
interface [InsightService](index.html)



## Functions


| Name | Summary |
|---|---|
| [listArchived](list-archived.html) | [common]<br>abstract suspend fun [listArchived](list-archived.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Insight](../../com.tink.model.insights/[common]-insight/index.html)&gt; |
| [listInsights](list-insights.html) | [common]<br>abstract suspend fun [listInsights](list-insights.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Insight](../../com.tink.model.insights/[common]-insight/index.html)&gt; |
| [selectAction](select-action.html) | [common]<br>abstract suspend fun [selectAction](select-action.html)(performedAction: [PerformedInsightAction](../../com.tink.model.insights/[common]-performed-insight-action/index.html)) |


## Inheritors


| Name |
|---|
| InsightServiceImpl |

