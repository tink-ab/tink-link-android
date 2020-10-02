[link](../../../index.md) / [com.tink.link.ui](../../index.md) / [TinkLinkResult](../index.md) / [TemporaryUser](./index.md)

# TemporaryUser

`data class TemporaryUser : `[`TinkLinkResult`](../index.md)

The data returned when a [LinkUser.TemporaryUser](../../-link-user/-temporary-user/index.md) is used in the Tink Link UI flow.

### Parameters

`authorizationCode` - Authorization code from authorizing the user towards a new set of scopes

`credentials` - [Credentials](../../../com.tink.model.credentials/-credentials/index.md) connected to the user

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The data returned when a [LinkUser.TemporaryUser](../../-link-user/-temporary-user/index.md) is used in the Tink Link UI flow.`TemporaryUser(authorizationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, credentials: `[`Credentials`](../../../com.tink.model.credentials/-credentials/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [authorizationCode](authorization-code.md) | Authorization code from authorizing the user towards a new set of scopes`val authorizationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [credentials](credentials.md) | [Credentials](../../../com.tink.model.credentials/-credentials/index.md) connected to the user`val credentials: `[`Credentials`](../../../com.tink.model.credentials/-credentials/index.md) |
