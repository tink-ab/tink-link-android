[link](../../../index.md) / [com.tink.link.ui](../../index.md) / [TinkLinkResult](../index.md) / [PermanentUser](./index.md)

# PermanentUser

`data class PermanentUser : `[`TinkLinkResult`](../index.md)

The data returned when a [LinkUser.ExistingUser](../../-link-user/-existing-user/index.md) or [LinkUser.UnauthenticatedUser](../../-link-user/-unauthenticated-user/index.md) is used
in the Tink Link UI flow.

### Parameters

`credentials` - [Credentials](../../../com.tink.model.credentials/-credentials/index.md) connected to the user

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The data returned when a [LinkUser.ExistingUser](../../-link-user/-existing-user/index.md) or [LinkUser.UnauthenticatedUser](../../-link-user/-unauthenticated-user/index.md) is used in the Tink Link UI flow.`PermanentUser(credentials: `[`Credentials`](../../../com.tink.model.credentials/-credentials/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [credentials](credentials.md) | [Credentials](../../../com.tink.model.credentials/-credentials/index.md) connected to the user`val credentials: `[`Credentials`](../../../com.tink.model.credentials/-credentials/index.md) |
