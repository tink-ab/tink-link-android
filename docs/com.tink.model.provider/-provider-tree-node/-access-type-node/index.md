[link](../../../index.md) / [com.tink.model.provider](../../index.md) / [ProviderTreeNode](../index.md) / [AccessTypeNode](./index.md)

# AccessTypeNode

`data class AccessTypeNode : `[`ProviderTreeNode`](../index.md)

A parent node of the tree structure, with a list of [CredentialsTypeNode](../-credentials-type-node/index.md) children.

### Parameters

`type` - Grouping identifier. See [Provider.AccessType](../../-provider/-access-type/index.md)

`credentialsTypes` - The list of child nodes.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A parent node of the tree structure, with a list of [CredentialsTypeNode](../-credentials-type-node/index.md) children.`AccessTypeNode(type: AccessType, credentialsTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<CredentialsTypeNode>)` |

### Properties

| Name | Summary |
|---|---|
| [credentialsTypes](credentials-types.md) | The list of child nodes.`val credentialsTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<CredentialsTypeNode>` |
| [icon](icon.md) | An optional url linking to a visual description of the node.`val icon: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [isBeta](is-beta.md) | Denotes that there is at least one underlying Provider in beta.`val isBeta: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [name](name.md) | A textual description of the node.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [type](type.md) | Grouping identifier. See [Provider.AccessType](../../-provider/-access-type/index.md)`val type: AccessType` |
