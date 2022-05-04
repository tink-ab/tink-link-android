---
title: FinancialInstitutionNode
---
//[link](../../../../index.html)/[com.tink.model.provider](../../index.html)/[[common]ProviderTreeNode](../index.html)/[FinancialInstitutionNode](index.html)



# FinancialInstitutionNode



[common]\
data class [FinancialInstitutionNode](index.html)(val financialInstitution: [Provider.FinancialInstitution](../../[common]-provider/-financial-institution/index.html), val authenticationUserTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AuthenticationUserTypeNode](../-authentication-user-type-node/index.html)&gt;) : [ProviderTreeNode](../index.html)

A parent node of the tree structure, with a list of [AuthenticationUserTypeNode](../-authentication-user-type-node/index.html) children.



## Parameters


common

| | |
|---|---|
| financialInstitution | The financialInstitution that this node represents. |
| authenticationUserTypes | The list of child nodes. |



## Constructors


| | |
|---|---|
| [FinancialInstitutionNode](-financial-institution-node.html) | [common]<br>fun [FinancialInstitutionNode](-financial-institution-node.html)(financialInstitution: [Provider.FinancialInstitution](../../[common]-provider/-financial-institution/index.html), authenticationUserTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AuthenticationUserTypeNode](../-authentication-user-type-node/index.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [authenticationUserTypes](authentication-user-types.html) | [common]<br>val [authenticationUserTypes](authentication-user-types.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AuthenticationUserTypeNode](../-authentication-user-type-node/index.html)&gt; |
| [financialInstitution](financial-institution.html) | [common]<br>val [financialInstitution](financial-institution.html): [Provider.FinancialInstitution](../../[common]-provider/-financial-institution/index.html) |
| [icon](icon.html) | [common]<br>open override val [icon](icon.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [common]<br>open override val [isBeta](is-beta.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [common]<br>open override val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A textual description of the node. |

