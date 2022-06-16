[link](../../../index.md) / [com.tink.link.core.credentials](../../index.md) / [CredentialsStatus](../index.md) / [AwaitingAuthentication](./index.md)

# AwaitingAuthentication

`class AwaitingAuthentication : `[`CredentialsStatus`](../index.md)

There is an outstanding authentication waiting that needs to be completed by the user to
proceed.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | There is an outstanding authentication waiting that needs to be completed by the user to proceed.`AwaitingAuthentication(authenticationTask: `[`AuthenticationTask`](../../../com.tink.link.authentication/-authentication-task/index.md)`, credentials: `[`Credentials`](../../../com.tink.model.credentials/-credentials/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [authenticationTask](authentication-task.md) | the authentication that needs to be completed by the user.`val authenticationTask: `[`AuthenticationTask`](../../../com.tink.link.authentication/-authentication-task/index.md) |
| [credentials](credentials.md) | the credentials for which authentication is needed`val credentials: `[`Credentials`](../../../com.tink.model.credentials/-credentials/index.md) |
