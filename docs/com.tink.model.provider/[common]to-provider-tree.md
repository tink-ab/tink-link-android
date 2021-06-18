---
title: [common]toProviderTree -
---
//[link](../index.md)/[com.tink.model.provider](index.md)/[[common]toProviderTree]([common]to-provider-tree.md)



# toProviderTree  
[common]  
Content  
fun [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Provider]([common]-provider/index.md)>.[toProviderTree]([common]to-provider-tree.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ProviderTreeNode]([common]-provider-tree-node/index.md)>  
More info  


Groups the providers by a few defining elements, creating a tree structure. Each level in the tree structure may have 1 to n children.



#### Return  


A tree of [ProviderTreeNode]([common]-provider-tree-node/index.md) objects that will always follow the structure:



[FinancialInstitutionGroupNode]([common]-provider-tree-node/-financial-institution-group-node/index.md) -> [FinancialInstitutionNode]([common]-provider-tree-node/-financial-institution-node/index.md) -> [AccessTypeNode]([common]-provider-tree-node/-access-type-node/index.md) -> [CredentialsTypeNode]([common]-provider-tree-node/-credentials-type-node/index.md)

  



