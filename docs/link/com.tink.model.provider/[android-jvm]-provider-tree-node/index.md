---
title: [androidJvm]ProviderTreeNode
---
//[link](../../../index.html)/[com.tink.model.provider](../index.html)/[[androidJvm]ProviderTreeNode](index.html)



# ProviderTreeNode



[androidJvm]\
sealed class [ProviderTreeNode](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

This class represents a tree structure of [FinancialInstitutionGroupNode](-financial-institution-group-node/index.html) objects with children. This eventually leads to a leaf object of type [ProviderNode](-provider-node/index.html), that contains more detailed [Provider](../[android-jvm]-provider/index.html) data.



The tree will always follow the structure:



[FinancialInstitutionGroupNode](-financial-institution-group-node/index.html) ->[FinancialInstitutionNode](-financial-institution-node/index.html) ->[AccessTypeNode](-access-type-node/index.html) ->[CredentialsTypeNode](-credentials-type-node/index.html) ->[ProviderNode](-provider-node/index.html)



## Types


| Name | Summary |
|---|---|
| [AccessTypeNode](-access-type-node/index.html) | [androidJvm]<br>data class [AccessTypeNode](-access-type-node/index.html)(val type: [Provider.AccessType](../[android-jvm]-provider/-access-type/index.html), val credentialsTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.CredentialsTypeNode](-credentials-type-node/index.html)&gt;) : [ProviderTreeNode](index.html)<br>A parent node of the tree structure, with a list of [CredentialsTypeNode](-credentials-type-node/index.html) children. |
| [AuthenticationUserTypeNode](-authentication-user-type-node/index.html) | [androidJvm]<br>data class [AuthenticationUserTypeNode](-authentication-user-type-node/index.html)(val authenticationUserType: [Provider.AuthenticationUserType](../[android-jvm]-provider/-authentication-user-type/index.html), val accessTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AccessTypeNode](-access-type-node/index.html)&gt;) : [ProviderTreeNode](index.html)<br>A parent node of the tree structure, with a list of [AccessTypeNode](-access-type-node/index.html) children. |
| [CredentialsTypeNode](-credentials-type-node/index.html) | [androidJvm]<br>data class [CredentialsTypeNode](-credentials-type-node/index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val type: [Credentials.Type](../../com.tink.model.credentials/[android-jvm]-credentials/-type/index.html), val providers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.ProviderNode](-provider-node/index.html)&gt;) : [ProviderTreeNode](index.html)<br>A parent node of the tree structure, with a list of [ProviderNode](-provider-node/index.html) children. |
| [FinancialInstitutionGroupNode](-financial-institution-group-node/index.html) | [androidJvm]<br>data class [FinancialInstitutionGroupNode](-financial-institution-group-node/index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val financialInstitutions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.FinancialInstitutionNode](-financial-institution-node/index.html)&gt;) : [ProviderTreeNode](index.html)<br>The top level node of the tree structure, with a list of [FinancialInstitutionNode](-financial-institution-node/index.html) children. |
| [FinancialInstitutionNode](-financial-institution-node/index.html) | [androidJvm]<br>data class [FinancialInstitutionNode](-financial-institution-node/index.html)(val financialInstitution: [Provider.FinancialInstitution](../[android-jvm]-provider/-financial-institution/index.html), val authenticationUserTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AuthenticationUserTypeNode](-authentication-user-type-node/index.html)&gt;) : [ProviderTreeNode](index.html)<br>A parent node of the tree structure, with a list of [AuthenticationUserTypeNode](-authentication-user-type-node/index.html) children. |
| [ProviderNode](-provider-node/index.html) | [androidJvm]<br>data class [ProviderNode](-provider-node/index.html)(val provider: [Provider](../[android-jvm]-provider/index.html)) : [ProviderTreeNode](index.html)<br>The leaf node of the tree structure, containing the more detailed [Provider](../[android-jvm]-provider/index.html) object. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [icon](icon.html) | [androidJvm]<br>abstract val [icon](icon.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [androidJvm]<br>abstract val [isBeta](is-beta.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [androidJvm]<br>abstract val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A textual description of the node. |


## Inheritors


| Name |
|---|
| FinancialInstitutionGroupNode |
| FinancialInstitutionNode |
| AuthenticationUserTypeNode |
| AccessTypeNode |
| CredentialsTypeNode |
| ProviderNode |

