[link](../../../index.md) / [com.tink.model.provider](../../index.md) / [ProviderTreeNode](../index.md) / [FinancialInstitutionNode](./index.md)

# FinancialInstitutionNode

`data class FinancialInstitutionNode : `[`ProviderTreeNode`](../index.md)

A parent node of the tree structure, with a list of [AuthenticationUserTypeNode](../-authentication-user-type-node/index.md) children.

### Parameters

`financialInstitution` - The `financialInstitution` that this node represents.

`authenticationUserTypes` - The list of child nodes.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A parent node of the tree structure, with a list of [AuthenticationUserTypeNode](../-authentication-user-type-node/index.md) children.`FinancialInstitutionNode(financialInstitution: FinancialInstitution, authenticationUserTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<AuthenticationUserTypeNode>)` |

### Properties

| Name | Summary |
|---|---|
| [authenticationUserTypes](authentication-user-types.md) | The list of child nodes.`val authenticationUserTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<AuthenticationUserTypeNode>` |
| [financialInstitution](financial-institution.md) | The `financialInstitution` that this node represents.`val financialInstitution: FinancialInstitution` |
| [icon](icon.md) | An optional url linking to a visual description of the node.`val icon: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | A textual description of the node.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
