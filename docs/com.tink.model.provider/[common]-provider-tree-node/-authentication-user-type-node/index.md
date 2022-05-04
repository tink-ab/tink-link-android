---
title: AuthenticationUserTypeNode
---
//[link](../../../../index.html)/[com.tink.model.provider](../../index.html)/[[common]ProviderTreeNode](../index.html)/[AuthenticationUserTypeNode](index.html)



# AuthenticationUserTypeNode



[common]\
data class [AuthenticationUserTypeNode](index.html)(val authenticationUserType: [Provider.AuthenticationUserType](../../[common]-provider/-authentication-user-type/index.html), val accessTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AccessTypeNode](../-access-type-node/index.html)&gt;) : [ProviderTreeNode](../index.html)

A parent node of the tree structure, with a list of [AccessTypeNode](../-access-type-node/index.html) children.



## Parameters


common

| | |
|---|---|
| authenticationUserType | The authenticationUserType that this node represents. |
| accessTypes | The list of child nodes. |



## Constructors


| | |
|---|---|
| [AuthenticationUserTypeNode](-authentication-user-type-node.html) | [common]<br>fun [AuthenticationUserTypeNode](-authentication-user-type-node.html)(authenticationUserType: [Provider.AuthenticationUserType](../../[common]-provider/-authentication-user-type/index.html), accessTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AccessTypeNode](../-access-type-node/index.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [accessTypes](access-types.html) | [common]<br>val [accessTypes](access-types.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AccessTypeNode](../-access-type-node/index.html)&gt; |
| [authenticationUserType](authentication-user-type.html) | [common]<br>val [authenticationUserType](authentication-user-type.html): [Provider.AuthenticationUserType](../../[common]-provider/-authentication-user-type/index.html) |
| [icon](icon.html) | [common]<br>open override val [icon](icon.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [common]<br>open override val [isBeta](is-beta.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [common]<br>open override val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A textual description of the node. |

