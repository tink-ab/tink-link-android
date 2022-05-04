---
title: AccessTypeNode
---
//[link](../../../../index.html)/[com.tink.model.provider](../../index.html)/[[common]ProviderTreeNode](../index.html)/[AccessTypeNode](index.html)



# AccessTypeNode



[common]\
data class [AccessTypeNode](index.html)(val type: [Provider.AccessType](../../[common]-provider/-access-type/index.html), val credentialsTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.CredentialsTypeNode](../-credentials-type-node/index.html)&gt;) : [ProviderTreeNode](../index.html)

A parent node of the tree structure, with a list of [CredentialsTypeNode](../-credentials-type-node/index.html) children.



## Parameters


common

| | |
|---|---|
| type | Grouping identifier. See [Provider.AccessType](../../[common]-provider/-access-type/index.html) |
| credentialsTypes | The list of child nodes. |



## Constructors


| | |
|---|---|
| [AccessTypeNode](-access-type-node.html) | [common]<br>fun [AccessTypeNode](-access-type-node.html)(type: [Provider.AccessType](../../[common]-provider/-access-type/index.html), credentialsTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.CredentialsTypeNode](../-credentials-type-node/index.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [credentialsTypes](credentials-types.html) | [common]<br>val [credentialsTypes](credentials-types.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.CredentialsTypeNode](../-credentials-type-node/index.html)&gt; |
| [icon](icon.html) | [common]<br>open override val [icon](icon.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [common]<br>open override val [isBeta](is-beta.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [common]<br>open override val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A textual description of the node. |
| [type](type.html) | [common]<br>val [type](type.html): [Provider.AccessType](../../[common]-provider/-access-type/index.html) |

