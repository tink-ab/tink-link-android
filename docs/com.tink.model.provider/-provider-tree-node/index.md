[link](../../index.md) / [com.tink.model.provider](../index.md) / [ProviderTreeNode](./index.md)

# ProviderTreeNode

`sealed class ProviderTreeNode : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

This class represents a tree structure of [FinancialInstitutionGroupNode](-financial-institution-group-node/index.md) objects with children.
This eventually leads to a leaf object of type [CredentialsTypeNode](-credentials-type-node/index.md),
that contains more detailed [Provider](../-provider/index.md) data.

The tree will always follow the structure:

[FinancialInstitutionGroupNode](-financial-institution-group-node/index.md) -&gt; [FinancialInstitutionNode](-financial-institution-node/index.md) -&gt; [AccessTypeNode](-access-type-node/index.md) -&gt; [CredentialsTypeNode](-credentials-type-node/index.md)

### Types

| Name | Summary |
|---|---|
| [AccessTypeNode](-access-type-node/index.md) | A parent node of the tree structure, with a list of [CredentialsTypeNode](-credentials-type-node/index.md) children.`data class AccessTypeNode : `[`ProviderTreeNode`](./index.md) |
| [CredentialsTypeNode](-credentials-type-node/index.md) | A parent node of the tree structure, with a list of [ProviderNode](-provider-node/index.md) children.`data class CredentialsTypeNode : `[`ProviderTreeNode`](./index.md) |
| [FinancialInstitutionGroupNode](-financial-institution-group-node/index.md) | The top level node of the tree structure, with a list of [FinancialInstitutionNode](-financial-institution-node/index.md) children.`data class FinancialInstitutionGroupNode : `[`ProviderTreeNode`](./index.md) |
| [FinancialInstitutionNode](-financial-institution-node/index.md) | A parent node of the tree structure, with a list of [AccessTypeNode](-access-type-node/index.md) children.`data class FinancialInstitutionNode : `[`ProviderTreeNode`](./index.md) |
| [ProviderNode](-provider-node/index.md) | The leaf node of the tree structure, containing the more detailed [Provider](../-provider/index.md) object.`data class ProviderNode : `[`ProviderTreeNode`](./index.md) |

### Properties

| Name | Summary |
|---|---|
| [icon](icon.md) | An optional url linking to a visual description of the node.`abstract val icon: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | A textual description of the node.`abstract val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
