[link](../../../index.md) / [com.tink.model.provider](../../index.md) / [ProviderTreeNode](../index.md) / [CredentialsTypeNode](./index.md)

# CredentialsTypeNode

`data class CredentialsTypeNode : `[`ProviderTreeNode`](../index.md)

A parent node of the tree structure, with a list of [ProviderNode](../-provider-node/index.md) children.

### Parameters

`type` - Grouping identifier. See [Credentials.Type](../../../com.tink.model.credentials/-credentials/-type/index.md)

`providers` - The list of child nodes.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A parent node of the tree structure, with a list of [ProviderNode](../-provider-node/index.md) children.`CredentialsTypeNode(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, type: Type, providers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<ProviderNode>)` |

### Properties

| Name | Summary |
|---|---|
| [icon](icon.md) | An optional url linking to a visual description of the node.`val icon: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | A textual description of the node.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [providers](providers.md) | The list of child nodes.`val providers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<ProviderNode>` |
| [type](type.md) | Grouping identifier. See [Credentials.Type](../../../com.tink.model.credentials/-credentials/-type/index.md)`val type: Type` |
