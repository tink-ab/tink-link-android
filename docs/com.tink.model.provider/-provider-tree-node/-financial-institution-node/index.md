[link](../../../index.md) / [com.tink.model.provider](../../index.md) / [ProviderTreeNode](../index.md) / [FinancialInstitutionNode](./index.md)

# FinancialInstitutionNode

`data class FinancialInstitutionNode : `[`ProviderTreeNode`](../index.md)

A parent node of the tree structure, with a list of [AccessTypeNode](../-access-type-node/index.md) children.

### Parameters

`financialInstitution` - The `financialInstitution` that this node represents.

`accessTypes` - The list of child nodes.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A parent node of the tree structure, with a list of [AccessTypeNode](../-access-type-node/index.md) children.`FinancialInstitutionNode(financialInstitution: FinancialInstitution, accessTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<AccessTypeNode>)` |

### Properties

| Name | Summary |
|---|---|
| [accessTypes](access-types.md) | The list of child nodes.`val accessTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<AccessTypeNode>` |
| [financialInstitution](financial-institution.md) | The `financialInstitution` that this node represents.`val financialInstitution: FinancialInstitution` |
| [icon](icon.md) | An optional url linking to a visual description of the node.`val icon: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | A textual description of the node.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
