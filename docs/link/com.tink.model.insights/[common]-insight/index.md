---
title: [common]Insight
---
//[link](../../../index.html)/[com.tink.model.insights](../index.html)/[[common]Insight](index.html)



# Insight



[common]\
data class [Insight](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [InsightType](../[common]-insight-type/index.html), val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val created: &lt;ERROR CLASS&gt;, val actions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightAction](../[common]-insight-action/index.html)&gt;, val state: [InsightState](../[common]-insight-state/index.html), val data: [InsightData](../[common]-insight-data/index.html), var viewDetails: [Insight.ViewDetails](-view-details/index.html)? = null)



## Constructors


| | |
|---|---|
| [Insight](-insight.html) | [common]<br>fun [Insight](-insight.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [InsightType](../[common]-insight-type/index.html), title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), created: &lt;ERROR CLASS&gt;, actions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightAction](../[common]-insight-action/index.html)&gt;, state: [InsightState](../[common]-insight-state/index.html), data: [InsightData](../[common]-insight-data/index.html), viewDetails: [Insight.ViewDetails](-view-details/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [ViewDetails](-view-details/index.html) | [common]<br>interface [ViewDetails](-view-details/index.html)<br>All subclasses should be data classes or provide a meaningful equals() function |


## Properties


| Name | Summary |
|---|---|
| [actions](actions.html) | [common]<br>val [actions](actions.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightAction](../[common]-insight-action/index.html)&gt; |
| [created](created.html) | [common]<br>val [created](created.html): &lt;ERROR CLASS&gt; |
| [data](data.html) | [common]<br>val [data](data.html): [InsightData](../[common]-insight-data/index.html) |
| [description](description.html) | [common]<br>val [description](description.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [id](id.html) | [common]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [state](state.html) | [common]<br>val [state](state.html): [InsightState](../[common]-insight-state/index.html) |
| [title](title.html) | [common]<br>val [title](title.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [type](type.html) | [common]<br>val [type](type.html): [InsightType](../[common]-insight-type/index.html) |
| [viewDetails](view-details.html) | [common]<br>var [viewDetails](view-details.html): [Insight.ViewDetails](-view-details/index.html)? = null |

