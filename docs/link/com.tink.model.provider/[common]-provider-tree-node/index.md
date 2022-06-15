---
title: [common]ProviderTreeNode
---
//[link](../../../index.html)/[com.tink.model.provider](../index.html)/[[common]ProviderTreeNode](index.html)



# ProviderTreeNode



[common]\
sealed class [ProviderTreeNode](index.html)

This class represents a tree structure of [FinancialInstitutionGroupNode](-financial-institution-group-node/index.html) objects with children. This eventually leads to a leaf object of type [ProviderNode](-provider-node/index.html), that contains more detailed [Provider](../[common]-provider/index.html) data.



The tree will always follow the structure:



[FinancialInstitutionGroupNode](-financial-institution-group-node/index.html) ->[FinancialInstitutionNode](-financial-institution-node/index.html) ->[AccessTypeNode](-access-type-node/index.html) ->[CredentialsTypeNode](-credentials-type-node/index.html) ->[ProviderNode](-provider-node/index.html)



## Types


| Name | Summary |
|---|---|
| [AccessTypeNode](-access-type-node/index.html) | [common]<br>data class [AccessTypeNode](-access-type-node/index.html)(val type: [Provider.AccessType](../[common]-provider/-access-type/index.html), val credentialsTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.CredentialsTypeNode](-credentials-type-node/index.html)&gt;) : [ProviderTreeNode](index.html)<br>A parent node of the tree structure, with a list of [CredentialsTypeNode](-credentials-type-node/index.html) children. |
| [AuthenticationUserTypeNode](-authentication-user-type-node/index.html) | [common]<br>data class [AuthenticationUserTypeNode](-authentication-user-type-node/index.html)(val authenticationUserType: [Provider.AuthenticationUserType](../[common]-provider/-authentication-user-type/index.html), val accessTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AccessTypeNode](-access-type-node/index.html)&gt;) : [ProviderTreeNode](index.html)<br>A parent node of the tree structure, with a list of [AccessTypeNode](-access-type-node/index.html) children. |
| [CredentialsTypeNode](-credentials-type-node/index.html) | [common]<br>data class [CredentialsTypeNode](-credentials-type-node/index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val type: [Credentials.Type](../../com.tink.model.credentials/[common]-credentials/-type/index.html), val providers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.ProviderNode](-provider-node/index.html)&gt;) : [ProviderTreeNode](index.html)<br>A parent node of the tree structure, with a list of [ProviderNode](-provider-node/index.html) children. |
| [FinancialInstitutionGroupNode](-financial-institution-group-node/index.html) | [common]<br>data class [FinancialInstitutionGroupNode](-financial-institution-group-node/index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val financialInstitutions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.FinancialInstitutionNode](-financial-institution-node/index.html)&gt;) : [ProviderTreeNode](index.html)<br>The top level node of the tree structure, with a list of [FinancialInstitutionNode](-financial-institution-node/index.html) children. |
| [FinancialInstitutionNode](-financial-institution-node/index.html) | [common]<br>data class [FinancialInstitutionNode](-financial-institution-node/index.html)(val financialInstitution: [Provider.FinancialInstitution](../[common]-provider/-financial-institution/index.html), val authenticationUserTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode.AuthenticationUserTypeNode](-authentication-user-type-node/index.html)&gt;) : [ProviderTreeNode](index.html)<br>A parent node of the tree structure, with a list of [AuthenticationUserTypeNode](-authentication-user-type-node/index.html) children. |
| [ProviderNode](-provider-node/index.html) | [common]<br>data class [ProviderNode](-provider-node/index.html)(val provider: [Provider](../[common]-provider/index.html)) : [ProviderTreeNode](index.html)<br>The leaf node of the tree structure, containing the more detailed [Provider](../[common]-provider/index.html) object. |


## Properties


| Name | Summary |
|---|---|
| [icon](icon.html) | [common]<br>abstract val [icon](icon.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>An optional url linking to a visual description of the node. |
| [isBeta](is-beta.html) | [common]<br>abstract val [isBeta](is-beta.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Denotes that there is at least one underlying Provider in beta. |
| [name](name.html) | [common]<br>abstract val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A textual description of the node. |


## Inheritors


| Name |
|---|
| FinancialInstitutionGroupNode |
| FinancialInstitutionNode |
| AuthenticationUserTypeNode |
| AccessTypeNode |
| CredentialsTypeNode |
| ProviderNode |

