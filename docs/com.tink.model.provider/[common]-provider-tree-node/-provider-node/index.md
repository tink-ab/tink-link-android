---
title: ProviderNode
---
//[link](../../../../index.html)/[com.tink.model.provider](../../index.html)/[[common]ProviderTreeNode](../index.html)/[ProviderNode](index.html)



# ProviderNode



[common]\
data class [ProviderNode](index.html)(val provider: [Provider](../../[common]-provider/index.html)) : [ProviderTreeNode](../index.html)

The leaf node of the tree structure, containing the more detailed [Provider](../../[common]-provider/index.html) object.



## Constructors


| | |
|---|---|
| [ProviderNode](-provider-node.html) | [common]<br>fun [ProviderNode](-provider-node.html)(provider: [Provider](../../[common]-provider/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [icon](icon.html) | [common]<br>open override val [icon](icon.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [common]<br>open override val [isBeta](is-beta.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [common]<br>open override val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A textual description of the node. |
| [provider](provider.html) | [common]<br>val [provider](provider.html): [Provider](../../[common]-provider/index.html) |

