---
title: [common]toProviderTree
---
//[link](../../index.html)/[com.tink.model.provider](index.html)/[[common]toProviderTree]([common]to-provider-tree.html)



# toProviderTree



[common]\
fun [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Provider]([common]-provider/index.html)&gt;.[toProviderTree]([common]to-provider-tree.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode]([common]-provider-tree-node/index.html)&gt;



Groups the providers by a few defining elements, creating a tree structure. Each level in the tree structure may have 1 to n children.



#### Return



A tree of [ProviderTreeNode]([common]-provider-tree-node/index.html) objects that will always follow the structure:



[FinancialInstitutionGroupNode]([common]-provider-tree-node/-financial-institution-group-node/index.html) ->[FinancialInstitutionNode]([common]-provider-tree-node/-financial-institution-node/index.html) ->[AccessTypeNode]([common]-provider-tree-node/-access-type-node/index.html) ->[CredentialsTypeNode]([common]-provider-tree-node/-credentials-type-node/index.html)




