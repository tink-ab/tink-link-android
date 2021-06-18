//[link](../../index.md)/[com.tink.model.provider](../index.md)/[[common]ProviderTreeNode](index.md)



# ProviderTreeNode  
 [common] sealed class [ProviderTreeNode](index.md)

This class represents a tree structure of [FinancialInstitutionGroupNode](-financial-institution-group-node/index.md) objects with children. This eventually leads to a leaf object of type [ProviderNode](-provider-node/index.md), that contains more detailed [Provider](../[common]-provider/index.md) data.



The tree will always follow the structure:



[FinancialInstitutionGroupNode](-financial-institution-group-node/index.md) -> [FinancialInstitutionNode](-financial-institution-node/index.md) -> [AccessTypeNode](-access-type-node/index.md) -> [CredentialsTypeNode](-credentials-type-node/index.md) -> [ProviderNode](-provider-node/index.md)

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.provider/ProviderTreeNode.AccessTypeNode///PointingToDeclaration/"></a>[AccessTypeNode](-access-type-node/index.md)| <a name="com.tink.model.provider/ProviderTreeNode.AccessTypeNode///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [AccessTypeNode](-access-type-node/index.md)(**type**: [Provider.AccessType](../[common]-provider/-access-type/index.md), **credentialsTypes**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ProviderTreeNode.CredentialsTypeNode](-credentials-type-node/index.md)>) : [ProviderTreeNode](index.md)  <br>More info  <br>A parent node of the tree structure, with a list of [CredentialsTypeNode](-credentials-type-node/index.md) children.  <br><br><br>
| <a name="com.tink.model.provider/ProviderTreeNode.AuthenticationUserTypeNode///PointingToDeclaration/"></a>[AuthenticationUserTypeNode](-authentication-user-type-node/index.md)| <a name="com.tink.model.provider/ProviderTreeNode.AuthenticationUserTypeNode///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [AuthenticationUserTypeNode](-authentication-user-type-node/index.md)(**authenticationUserType**: [Provider.AuthenticationUserType](../[common]-provider/-authentication-user-type/index.md), **accessTypes**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ProviderTreeNode.AccessTypeNode](-access-type-node/index.md)>) : [ProviderTreeNode](index.md)  <br>More info  <br>A parent node of the tree structure, with a list of [AccessTypeNode](-access-type-node/index.md) children.  <br><br><br>
| <a name="com.tink.model.provider/ProviderTreeNode.CredentialsTypeNode///PointingToDeclaration/"></a>[CredentialsTypeNode](-credentials-type-node/index.md)| <a name="com.tink.model.provider/ProviderTreeNode.CredentialsTypeNode///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [CredentialsTypeNode](-credentials-type-node/index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **type**: [Credentials.Type](../../com.tink.model.credentials/[common]-credentials/-type/index.md), **providers**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ProviderTreeNode.ProviderNode](-provider-node/index.md)>) : [ProviderTreeNode](index.md)  <br>More info  <br>A parent node of the tree structure, with a list of [ProviderNode](-provider-node/index.md) children.  <br><br><br>
| <a name="com.tink.model.provider/ProviderTreeNode.FinancialInstitutionGroupNode///PointingToDeclaration/"></a>[FinancialInstitutionGroupNode](-financial-institution-group-node/index.md)| <a name="com.tink.model.provider/ProviderTreeNode.FinancialInstitutionGroupNode///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [FinancialInstitutionGroupNode](-financial-institution-group-node/index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **financialInstitutions**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ProviderTreeNode.FinancialInstitutionNode](-financial-institution-node/index.md)>) : [ProviderTreeNode](index.md)  <br>More info  <br>The top level node of the tree structure, with a list of [FinancialInstitutionNode](-financial-institution-node/index.md) children.  <br><br><br>
| <a name="com.tink.model.provider/ProviderTreeNode.FinancialInstitutionNode///PointingToDeclaration/"></a>[FinancialInstitutionNode](-financial-institution-node/index.md)| <a name="com.tink.model.provider/ProviderTreeNode.FinancialInstitutionNode///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [FinancialInstitutionNode](-financial-institution-node/index.md)(**financialInstitution**: [Provider.FinancialInstitution](../[common]-provider/-financial-institution/index.md), **authenticationUserTypes**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ProviderTreeNode.AuthenticationUserTypeNode](-authentication-user-type-node/index.md)>) : [ProviderTreeNode](index.md)  <br>More info  <br>A parent node of the tree structure, with a list of [AuthenticationUserTypeNode](-authentication-user-type-node/index.md) children.  <br><br><br>
| <a name="com.tink.model.provider/ProviderTreeNode.ProviderNode///PointingToDeclaration/"></a>[ProviderNode](-provider-node/index.md)| <a name="com.tink.model.provider/ProviderTreeNode.ProviderNode///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [ProviderNode](-provider-node/index.md)(**provider**: [Provider](../[common]-provider/index.md)) : [ProviderTreeNode](index.md)  <br>More info  <br>The leaf node of the tree structure, containing the more detailed [Provider](../[common]-provider/index.md) object.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.provider/ProviderTreeNode/icon/#/PointingToDeclaration/"></a>[icon](icon.md)| <a name="com.tink.model.provider/ProviderTreeNode/icon/#/PointingToDeclaration/"></a> [common] abstract val [icon](icon.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?An optional url linking to a visual description of the node.   <br>
| <a name="com.tink.model.provider/ProviderTreeNode/isBeta/#/PointingToDeclaration/"></a>[isBeta](is-beta.md)| <a name="com.tink.model.provider/ProviderTreeNode/isBeta/#/PointingToDeclaration/"></a> [common] abstract val [isBeta](is-beta.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)Denotes that there is at least one underlying Provider in beta.   <br>
| <a name="com.tink.model.provider/ProviderTreeNode/name/#/PointingToDeclaration/"></a>[name](name.md)| <a name="com.tink.model.provider/ProviderTreeNode/name/#/PointingToDeclaration/"></a> [common] abstract val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?A textual description of the node.   <br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.model.provider/ProviderTreeNode.FinancialInstitutionGroupNode///PointingToDeclaration/"></a>ProviderTreeNode
| <a name="com.tink.model.provider/ProviderTreeNode.FinancialInstitutionNode///PointingToDeclaration/"></a>ProviderTreeNode
| <a name="com.tink.model.provider/ProviderTreeNode.AuthenticationUserTypeNode///PointingToDeclaration/"></a>ProviderTreeNode
| <a name="com.tink.model.provider/ProviderTreeNode.AccessTypeNode///PointingToDeclaration/"></a>ProviderTreeNode
| <a name="com.tink.model.provider/ProviderTreeNode.CredentialsTypeNode///PointingToDeclaration/"></a>ProviderTreeNode
| <a name="com.tink.model.provider/ProviderTreeNode.ProviderNode///PointingToDeclaration/"></a>ProviderTreeNode

