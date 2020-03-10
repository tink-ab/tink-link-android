[link](../../../index.md) / [com.tink.model.provider](../../index.md) / [ProviderTreeNode](../index.md) / [FinancialInstitutionGroupNode](./index.md)

# FinancialInstitutionGroupNode

`data class FinancialInstitutionGroupNode : `[`ProviderTreeNode`](../index.md)

The top level node of the tree structure, with a list of [FinancialInstitutionNode](../-financial-institution-node/index.md) children.

### Parameters

`name` - The grouping identifier related to the [Provider](../../-provider/index.md)'s `groupDisplayName` or
    `financialInstitution.name` property

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The top level node of the tree structure, with a list of [FinancialInstitutionNode](../-financial-institution-node/index.md) children.`FinancialInstitutionGroupNode(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, financialInstitutions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<FinancialInstitutionNode>)` |

### Properties

| Name | Summary |
|---|---|
| [financialInstitutions](financial-institutions.md) | `val financialInstitutions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<FinancialInstitutionNode>` |
| [icon](icon.md) | An optional url linking to a visual description of the node.`val icon: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | The grouping identifier related to the [Provider](../../-provider/index.md)'s `groupDisplayName` or     `financialInstitution.name` property`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
