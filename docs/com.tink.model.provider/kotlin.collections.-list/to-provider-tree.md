[link](../../index.md) / [com.tink.model.provider](../index.md) / [kotlin.collections.List](index.md) / [toProviderTree](./to-provider-tree.md)

# toProviderTree

`fun `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../-provider/index.md)`>.toProviderTree(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ProviderTreeNode`](../-provider-tree-node/index.md)`>`

Groups the providers by a few defining elements, creating a tree structure.
Each level in the tree structure may have 1 to `n` children.

**Return**

A tree of [ProviderTreeNode](../-provider-tree-node/index.md) objects that will always follow the structure:



[FinancialInstitutionGroupNode](../-provider-tree-node/-financial-institution-group-node/index.md) -&gt; [FinancialInstitutionNode](../-provider-tree-node/-financial-institution-node/index.md) -&gt; [AccessTypeNode](../-provider-tree-node/-access-type-node/index.md) -&gt; [CredentialTypeNode](../-provider-tree-node/-credential-type-node/index.md)

