[link](../../../index.md) / [com.tink.model.provider](../../index.md) / [ProviderTreeNode](../index.md) / [ProviderNode](./index.md)

# ProviderNode

`data class ProviderNode : `[`ProviderTreeNode`](../index.md)

The leaf node of the tree structure, containing the more detailed [Provider](../../-provider/index.md) object.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The leaf node of the tree structure, containing the more detailed [Provider](../../-provider/index.md) object.`ProviderNode(provider: `[`Provider`](../../-provider/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [icon](icon.md) | An optional url linking to a visual description of the node.`val icon: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [isBeta](is-beta.md) | Denotes that there is at least one underlying Provider in beta.`val isBeta: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [name](name.md) | A textual description of the node.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [provider](provider.md) | `val provider: `[`Provider`](../../-provider/index.md) |
