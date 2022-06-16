---
title: [androidJvm]toProviderTree
---
//[link](../../index.html)/[com.tink.model.provider](index.html)/[[androidJvm]toProviderTree]([android-jvm]to-provider-tree.html)



# toProviderTree



[androidJvm]\
fun [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Provider]([android-jvm]-provider/index.html)&gt;.[toProviderTree]([android-jvm]to-provider-tree.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProviderTreeNode]([android-jvm]-provider-tree-node/index.html)&gt;



Groups the providers by a few defining elements, creating a tree structure. Each level in the tree structure may have 1 to n children.



#### Return



A tree of [ProviderTreeNode]([android-jvm]-provider-tree-node/index.html) objects that will always follow the structure:



[FinancialInstitutionGroupNode]([android-jvm]-provider-tree-node/-financial-institution-group-node/index.html) ->[FinancialInstitutionNode]([android-jvm]-provider-tree-node/-financial-institution-node/index.html) ->[AccessTypeNode]([android-jvm]-provider-tree-node/-access-type-node/index.html) ->[CredentialsTypeNode]([android-jvm]-provider-tree-node/-credentials-type-node/index.html)




