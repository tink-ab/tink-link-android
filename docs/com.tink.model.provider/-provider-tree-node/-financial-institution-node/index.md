[link](../../../index.md) / [com.tink.model.provider](../../index.md) / [ProviderTreeNode](../index.md) / [FinancialInstitutionNode](./index.md)

# FinancialInstitutionNode

`data class FinancialInstitutionNode : `[`ProviderTreeNode`](../index.md)

A parent node of the tree structure, with a list of [AccessTypeNode](../-access-type-node/index.md) children.

### Parameters

`id` - The unique identifier of the financial institution.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A parent node of the tree structure, with a list of [AccessTypeNode](../-access-type-node/index.md) children.`FinancialInstitutionNode(financialInstitution: FinancialInstitution, accessTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<AccessTypeNode>)` |

### Properties

| Name | Summary |
|---|---|
| [accessTypes](access-types.md) | `val accessTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<AccessTypeNode>` |
| [financialInstitution](financial-institution.md) | `val financialInstitution: FinancialInstitution` |
| [icon](icon.md) | An optional url linking to a visual description of the node.`val icon: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | A textual description of the node.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
