---
title: FinancialInstitutionGroupNode
---
//[link](../../../../index.html)/[com.tink.model.provider](../../index.html)/[[common]ProviderTreeNode](../index.html)/[FinancialInstitutionGroupNode](index.html)



# FinancialInstitutionGroupNode



[common]\
data class [FinancialInstitutionGroupNode](index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val financialInstitutions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.FinancialInstitutionNode](../-financial-institution-node/index.html)&gt;) : [ProviderTreeNode](../index.html)

The top level node of the tree structure, with a list of [FinancialInstitutionNode](../-financial-institution-node/index.html) children.



## Parameters


common

| | |
|---|---|
| name | The grouping identifier related to the [Provider](../../[common]-provider/index.html)'s groupDisplayName or     financialInstitution.name property. |
| financialInstitutions | The list of child nodes. |



## Constructors


| | |
|---|---|
| [FinancialInstitutionGroupNode](-financial-institution-group-node.html) | [common]<br>fun [FinancialInstitutionGroupNode](-financial-institution-group-node.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), financialInstitutions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.FinancialInstitutionNode](../-financial-institution-node/index.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [financialInstitutions](financial-institutions.html) | [common]<br>val [financialInstitutions](financial-institutions.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.FinancialInstitutionNode](../-financial-institution-node/index.html)&gt; |
| [icon](icon.html) | [common]<br>open override val [icon](icon.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [common]<br>open override val [isBeta](is-beta.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [common]<br>open override val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

