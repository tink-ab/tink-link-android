[link](../../../index.md) / [com.tink.model.provider](../../index.md) / [ProviderTreeNode](../index.md) / [FinancialInstitutionGroupNode](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`FinancialInstitutionGroupNode(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, financialInstitutions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<FinancialInstitutionNode>)`

The top level node of the tree structure, with a list of [FinancialInstitutionNode](../-financial-institution-node/index.md) children.

### Parameters

`name` - The grouping identifier related to the [Provider](../../-provider/index.md)'s `groupDisplayName` or
    `financialInstitution.name` property.

`financialInstitutions` - The list of child nodes.