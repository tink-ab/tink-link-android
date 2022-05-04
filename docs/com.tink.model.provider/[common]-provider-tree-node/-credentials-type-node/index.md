---
title: CredentialsTypeNode
---
//[link](../../../../index.html)/[com.tink.model.provider](../../index.html)/[[common]ProviderTreeNode](../index.html)/[CredentialsTypeNode](index.html)



# CredentialsTypeNode



[common]\
data class [CredentialsTypeNode](index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val type: [Credentials.Type](../../../com.tink.model.credentials/[common]-credentials/-type/index.html), val providers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.ProviderNode](../-provider-node/index.html)&gt;) : [ProviderTreeNode](../index.html)

A parent node of the tree structure, with a list of [ProviderNode](../-provider-node/index.html) children.



## Parameters


common

| | |
|---|---|
| type | Grouping identifier. See [Credentials.Type](../../../com.tink.model.credentials/[common]-credentials/-type/index.html) |
| providers | The list of child nodes. |



## Constructors


| | |
|---|---|
| [CredentialsTypeNode](-credentials-type-node.html) | [common]<br>fun [CredentialsTypeNode](-credentials-type-node.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, type: [Credentials.Type](../../../com.tink.model.credentials/[common]-credentials/-type/index.html), providers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.ProviderNode](../-provider-node/index.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [icon](icon.html) | [common]<br>open override val [icon](icon.html): &lt;ERROR CLASS&gt;<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [common]<br>open override val [isBeta](is-beta.html): &lt;ERROR CLASS&gt;<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [common]<br>open override val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A textual description of the node. |
| [providers](providers.html) | [common]<br>val [providers](providers.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.ProviderNode](../-provider-node/index.html)&gt; |
| [type](type.html) | [common]<br>val [type](type.html): [Credentials.Type](../../../com.tink.model.credentials/[common]-credentials/-type/index.html) |

