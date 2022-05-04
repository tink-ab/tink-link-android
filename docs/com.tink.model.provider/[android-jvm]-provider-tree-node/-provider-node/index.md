---
title: ProviderNode
---
//[link](../../../../index.html)/[com.tink.model.provider](../../index.html)/[[androidJvm]ProviderTreeNode](../index.html)/[ProviderNode](index.html)



# ProviderNode



[androidJvm]\
data class [ProviderNode](index.html)(val provider: [Provider](../../[android-jvm]-provider/index.html)) : [ProviderTreeNode](../index.html)

The leaf node of the tree structure, containing the more detailed [Provider](../../[android-jvm]-provider/index.html) object.



## Constructors


| | |
|---|---|
| [ProviderNode](-provider-node.html) | [androidJvm]<br>fun [ProviderNode](-provider-node.html)(provider: [Provider](../../[android-jvm]-provider/index.html)) |


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
| [name](name.html) | [androidJvm]<br>open override val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A textual description of the node. |
| [provider](provider.html) | [androidJvm]<br>val [provider](provider.html): [Provider](../../[android-jvm]-provider/index.html) |

