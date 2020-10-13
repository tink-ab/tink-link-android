[link](../../../index.md) / [com.tink.link.ui](../../index.md) / [CredentialsOperation](../index.md) / [Authenticate](./index.md)

# Authenticate

`data class Authenticate : `[`CredentialsOperation`](../index.md)

Pass this to [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to authenticate credentials.
This operation is limited to open banking credentials.

### Parameters

`credentialsId` - Id of the [Credentials](../../../com.tink.model.credentials/-credentials/index.md) to be authenticated

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Pass this to [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to authenticate credentials. This operation is limited to open banking credentials.`Authenticate(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [credentialsId](credentials-id.md) | Id of the [Credentials](../../../com.tink.model.credentials/-credentials/index.md) to be authenticated`val credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
