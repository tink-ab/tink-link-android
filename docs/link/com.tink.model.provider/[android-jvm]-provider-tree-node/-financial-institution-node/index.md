---
title: FinancialInstitutionNode
---
//[link](../../../../index.html)/[com.tink.model.provider](../../index.html)/[[androidJvm]ProviderTreeNode](../index.html)/[FinancialInstitutionNode](index.html)



# FinancialInstitutionNode



[androidJvm]\
data class [FinancialInstitutionNode](index.html)(val financialInstitution: [Provider.FinancialInstitution](../../[android-jvm]-provider/-financial-institution/index.html), val authenticationUserTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AuthenticationUserTypeNode](../-authentication-user-type-node/index.html)&gt;) : [ProviderTreeNode](../index.html)

A parent node of the tree structure, with a list of [AuthenticationUserTypeNode](../-authentication-user-type-node/index.html) children.



## Parameters


androidJvm

| | |
|---|---|
| financialInstitution | The financialInstitution that this node represents. |
| authenticationUserTypes | The list of child nodes. |



## Constructors


| | |
|---|---|
| [FinancialInstitutionNode](-financial-institution-node.html) | [androidJvm]<br>fun [FinancialInstitutionNode](-financial-institution-node.html)(financialInstitution: [Provider.FinancialInstitution](../../[android-jvm]-provider/-financial-institution/index.html), authenticationUserTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AuthenticationUserTypeNode](../-authentication-user-type-node/index.html)&gt;) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [authenticationUserTypes](authentication-user-types.html) | [androidJvm]<br>val [authenticationUserTypes](authentication-user-types.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AuthenticationUserTypeNode](../-authentication-user-type-node/index.html)&gt; |
| [financialInstitution](financial-institution.html) | [androidJvm]<br>val [financialInstitution](financial-institution.html): [Provider.FinancialInstitution](../../[android-jvm]-provider/-financial-institution/index.html) |
| [icon](icon.html) | [androidJvm]<br>open override val [icon](icon.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [androidJvm]<br>open override val [isBeta](is-beta.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [androidJvm]<br>open override val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A textual description of the node. |

