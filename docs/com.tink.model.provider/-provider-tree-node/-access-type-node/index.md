[link](../../../index.md) / [com.tink.model.provider](../../index.md) / [ProviderTreeNode](../index.md) / [AccessTypeNode](./index.md)

# AccessTypeNode

`data class AccessTypeNode : `[`ProviderTreeNode`](../index.md)

A parent node of the tree structure, with a list of [CredentialTypeNode](../-credential-type-node/index.md) children.

### Parameters

`type` - Grouping identifier. See [Provider.AccessType](../../-provider/-access-type/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A parent node of the tree structure, with a list of [CredentialTypeNode](../-credential-type-node/index.md) children.`AccessTypeNode(type: AccessType, credentialTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<CredentialTypeNode>)` |

### Properties

| Name | Summary |
|---|---|
| [credentialTypes](credential-types.md) | `val credentialTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<CredentialTypeNode>` |
| [icon](icon.md) | An optional url linking to a visual description of the node.`val icon: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | A textual description of the node.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [type](type.md) | Grouping identifier. See [Provider.AccessType](../../-provider/-access-type/index.md)`val type: AccessType` |
