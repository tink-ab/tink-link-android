---
title: [common]InsightAction
---
//[link](../../../index.html)/[com.tink.model.insights](../index.html)/[[common]InsightAction](index.html)



# InsightAction



[common]\
data class [InsightAction](index.html)(val label: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val actionType: [InsightAction.Type](-type/index.html), val data: [InsightAction.Data](-data/index.html))



## Constructors


| | |
|---|---|
| [InsightAction](-insight-action.html) | [common]<br>fun [InsightAction](-insight-action.html)(label: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), actionType: [InsightAction.Type](-type/index.html), data: [InsightAction.Data](-data/index.html)) |


## Types


| Name | Summary |
|---|---|
| [Data](-data/index.html) | [common]<br>sealed class [Data](-data/index.html)<br>All subclasses should be data classes or provide a meaningful equals() function |
| [Type](-type/index.html) | [common]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[InsightAction.Type](-type/index.html)&gt; |


## Properties


| Name | Summary |
|---|---|
| [actionType](action-type.html) | [common]<br>val [actionType](action-type.html): [InsightAction.Type](-type/index.html) |
| [data](data.html) | [common]<br>val [data](data.html): [InsightAction.Data](-data/index.html) |
| [label](label.html) | [common]<br>val [label](label.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

