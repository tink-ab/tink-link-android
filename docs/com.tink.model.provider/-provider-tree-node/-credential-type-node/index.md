[link](../../../index.md) / [com.tink.model.provider](../../index.md) / [ProviderTreeNode](../index.md) / [CredentialTypeNode](./index.md)

# CredentialTypeNode

`data class CredentialTypeNode : `[`ProviderTreeNode`](../index.md)

A parent node of the tree structure, with a list of [ProviderNode](../-provider-node/index.md) children.

### Parameters

`type` - Grouping identifier. See [Credential.Type](../../../com.tink.model.credential/-credential/-type/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A parent node of the tree structure, with a list of [ProviderNode](../-provider-node/index.md) children.`CredentialTypeNode(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, type: Type, providers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<ProviderNode>)` |

### Properties

| Name | Summary |
|---|---|
| [icon](icon.md) | An optional url linking to a visual description of the node.`val icon: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | A textual description of the node.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [providers](providers.md) | `val providers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<ProviderNode>` |
| [type](type.md) | Grouping identifier. See [Credential.Type](../../../com.tink.model.credential/-credential/-type/index.md)`val type: Type` |
