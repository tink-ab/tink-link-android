[link](../../index.md) / [com.tink.link.core.credentials](../index.md) / [CredentialsStatus](./index.md)

# CredentialsStatus

`sealed class CredentialsStatus`

The status of a Credentials.
Possible values are [Success](-success/index.md), [Loading](-loading/index.md), and [AwaitingAuthentication](-awaiting-authentication/index.md)

### Types

| Name | Summary |
|---|---|
| [AwaitingAuthentication](-awaiting-authentication/index.md) | There is an outstanding authentication waiting that needs to be completed by the user to proceed.`class AwaitingAuthentication : `[`CredentialsStatus`](./index.md) |
| [Loading](-loading/index.md) | The creation is being processed by Tink. There is currently no user action required.`data class Loading : `[`CredentialsStatus`](./index.md) |
| [Success](-success/index.md) | The credentials were successfully created.`data class Success : `[`CredentialsStatus`](./index.md) |
