[link](../../../index.md) / [com.tink.model.provider](../../index.md) / [ProviderTreeNode](../index.md) / [AuthenticationUserTypeNode](./index.md)

# AuthenticationUserTypeNode

`data class AuthenticationUserTypeNode : `[`ProviderTreeNode`](../index.md)

A parent node of the tree structure, with a list of [AccessTypeNode](../-access-type-node/index.md) children.

### Parameters

`authenticationUserType` - The `authenticationUserType` that this node represents.

`accessTypes` - The list of child nodes.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A parent node of the tree structure, with a list of [AccessTypeNode](../-access-type-node/index.md) children.`AuthenticationUserTypeNode(authenticationUserType: AuthenticationUserType, accessTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<AccessTypeNode>)` |

### Properties

| Name | Summary |
|---|---|
| [accessTypes](access-types.md) | The list of child nodes.`val accessTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<AccessTypeNode>` |
| [authenticationUserType](authentication-user-type.md) | The `authenticationUserType` that this node represents.`val authenticationUserType: AuthenticationUserType` |
| [icon](icon.md) | An optional url linking to a visual description of the node.`val icon: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | A textual description of the node.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
