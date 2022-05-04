---
title: [androidJvm]InsightServiceImpl
---
//[link](../../../index.html)/[com.tink.service.insight](../index.html)/[[androidJvm]InsightServiceImpl](index.html)



# InsightServiceImpl



[androidJvm]\
class [InsightServiceImpl](index.html)@Injectconstructor(val api: ActionableInsightApi) : [InsightService](../[android-jvm]-insight-service/index.html)



## Constructors


| | |
|---|---|
| [InsightServiceImpl](-insight-service-impl.html) | [androidJvm]<br>@Inject<br>fun [InsightServiceImpl](-insight-service-impl.html)(api: ActionableInsightApi) |


## Functions


| Name | Summary |
|---|---|
| [listArchived](list-archived.html) | [androidJvm]<br>open suspend override fun [listArchived](list-archived.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Insight](../../com.tink.model.insights/[android-jvm]-insight/index.html)&gt; |
| [listInsights](list-insights.html) | [androidJvm]<br>open suspend override fun [listInsights](list-insights.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Insight](../../com.tink.model.insights/[android-jvm]-insight/index.html)&gt; |
| [selectAction](select-action.html) | [androidJvm]<br>open suspend override fun [selectAction](select-action.html)(performedAction: [PerformedInsightAction](../../com.tink.model.insights/[android-jvm]-performed-insight-action/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [api](api.html) | [androidJvm]<br>val [api](api.html): ActionableInsightApi |

