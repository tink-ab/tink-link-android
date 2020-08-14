[link](../../../index.md) / [com.tink.link.ui](../../index.md) / [LinkUser](../index.md) / [UnauthenticatedUser](./index.md)

# UnauthenticatedUser

`data class UnauthenticatedUser : `[`LinkUser`](../index.md)

Pass this to the [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to authenticate the permanent user
to be used in the flow.

### Parameters

`authorizationCode` - The authorization code from delegation to use for authentication

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Pass this to the [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to authenticate the permanent user to be used in the flow.`UnauthenticatedUser(authorizationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [authorizationCode](authorization-code.md) | The authorization code from delegation to use for authentication`val authorizationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
