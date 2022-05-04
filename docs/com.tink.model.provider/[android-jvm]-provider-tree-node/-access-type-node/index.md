---
title: AccessTypeNode
---
//[link](../../../../index.html)/[com.tink.model.provider](../../index.html)/[[androidJvm]ProviderTreeNode](../index.html)/[AccessTypeNode](index.html)



# AccessTypeNode



[androidJvm]\
data class [AccessTypeNode](index.html)(val type: [Provider.AccessType](../../[android-jvm]-provider/-access-type/index.html), val credentialsTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.CredentialsTypeNode](../-credentials-type-node/index.html)&gt;) : [ProviderTreeNode](../index.html)

A parent node of the tree structure, with a list of [CredentialsTypeNode](../-credentials-type-node/index.html) children.



## Parameters


androidJvm

| | |
|---|---|
| type | Grouping identifier. See [Provider.AccessType](../../[android-jvm]-provider/-access-type/index.html) |
| credentialsTypes | The list of child nodes. |



## Constructors


| | |
|---|---|
| [AccessTypeNode](-access-type-node.html) | [androidJvm]<br>fun [AccessTypeNode](-access-type-node.html)(type: [Provider.AccessType](../../[android-jvm]-provider/-access-type/index.html), credentialsTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.CredentialsTypeNode](../-credentials-type-node/index.html)&gt;) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [credentialsTypes](credentials-types.html) | [androidJvm]<br>val [credentialsTypes](credentials-types.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.CredentialsTypeNode](../-credentials-type-node/index.html)&gt; |
| [icon](icon.html) | [androidJvm]<br>open override val [icon](icon.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [androidJvm]<br>open override val [isBeta](is-beta.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [androidJvm]<br>open override val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A textual description of the node. |
| [type](type.html) | [androidJvm]<br>val [type](type.html): [Provider.AccessType](../../[android-jvm]-provider/-access-type/index.html) |

