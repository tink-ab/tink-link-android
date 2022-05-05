---
title: CredentialsTypeNode
---
//[link](../../../../index.html)/[com.tink.model.provider](../../index.html)/[[androidJvm]ProviderTreeNode](../index.html)/[CredentialsTypeNode](index.html)



# CredentialsTypeNode



[androidJvm]\
data class [CredentialsTypeNode](index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val type: [Credentials.Type](../../../com.tink.model.credentials/[android-jvm]-credentials/-type/index.html), val providers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.ProviderNode](../-provider-node/index.html)&gt;) : [ProviderTreeNode](../index.html)

A parent node of the tree structure, with a list of [ProviderNode](../-provider-node/index.html) children.



## Parameters


androidJvm

| | |
|---|---|
| type | Grouping identifier. See [Credentials.Type](../../../com.tink.model.credentials/[android-jvm]-credentials/-type/index.html) |
| providers | The list of child nodes. |



## Constructors


| | |
|---|---|
| [CredentialsTypeNode](-credentials-type-node.html) | [androidJvm]<br>fun [CredentialsTypeNode](-credentials-type-node.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, type: [Credentials.Type](../../../com.tink.model.credentials/[android-jvm]-credentials/-type/index.html), providers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.ProviderNode](../-provider-node/index.html)&gt;) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [icon](icon.html) | [androidJvm]<br>open override val [icon](icon.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [androidJvm]<br>open override val [isBeta](is-beta.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [androidJvm]<br>open override val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A textual description of the node. |
| [providers](providers.html) | [androidJvm]<br>val [providers](providers.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.ProviderNode](../-provider-node/index.html)&gt; |
| [type](type.html) | [androidJvm]<br>val [type](type.html): [Credentials.Type](../../../com.tink.model.credentials/[android-jvm]-credentials/-type/index.html) |

