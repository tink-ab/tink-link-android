//[link](../index.md)/[com.tink.model.provider](index.md)/[[androidJvm]toProviderTree]([android-jvm]to-provider-tree.md)



# toProviderTree  
[androidJvm]  
Content  
fun [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Provider]([android-jvm]-provider/index.md)>.[toProviderTree]([android-jvm]to-provider-tree.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ProviderTreeNode]([android-jvm]-provider-tree-node/index.md)>  
More info  


Groups the providers by a few defining elements, creating a tree structure. Each level in the tree structure may have 1 to n children.



#### Return  


A tree of [ProviderTreeNode]([android-jvm]-provider-tree-node/index.md) objects that will always follow the structure:



[FinancialInstitutionGroupNode]([android-jvm]-provider-tree-node/-financial-institution-group-node/index.md) -> [FinancialInstitutionNode]([android-jvm]-provider-tree-node/-financial-institution-node/index.md) -> [AccessTypeNode]([android-jvm]-provider-tree-node/-access-type-node/index.md) -> [CredentialsTypeNode]([android-jvm]-provider-tree-node/-credentials-type-node/index.md)

  



