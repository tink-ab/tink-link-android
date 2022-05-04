---
title: FinancialInstitutionGroupNode
---
//[link](../../../../index.html)/[com.tink.model.provider](../../index.html)/[[androidJvm]ProviderTreeNode](../index.html)/[FinancialInstitutionGroupNode](index.html)



# FinancialInstitutionGroupNode



[androidJvm]\
data class [FinancialInstitutionGroupNode](index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val financialInstitutions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.FinancialInstitutionNode](../-financial-institution-node/index.html)&gt;) : [ProviderTreeNode](../index.html)

The top level node of the tree structure, with a list of [FinancialInstitutionNode](../-financial-institution-node/index.html) children.



## Parameters


androidJvm

| | |
|---|---|
| name | The grouping identifier related to the [Provider](../../[android-jvm]-provider/index.html)'s groupDisplayName or     financialInstitution.name property. |
| financialInstitutions | The list of child nodes. |



## Constructors


| | |
|---|---|
| [FinancialInstitutionGroupNode](-financial-institution-group-node.html) | [androidJvm]<br>fun [FinancialInstitutionGroupNode](-financial-institution-group-node.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), financialInstitutions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.FinancialInstitutionNode](../-financial-institution-node/index.html)&gt;) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [financialInstitutions](financial-institutions.html) | [androidJvm]<br>val [financialInstitutions](financial-institutions.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.FinancialInstitutionNode](../-financial-institution-node/index.html)&gt; |
| [icon](icon.html) | [androidJvm]<br>open override val [icon](icon.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [androidJvm]<br>open override val [isBeta](is-beta.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [androidJvm]<br>open override val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

