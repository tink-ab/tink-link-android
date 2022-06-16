[link](../../../index.md) / [com.tink.link.ui](../../index.md) / [CredentialsOperation](../index.md) / [Refresh](./index.md)

# Refresh

`data class Refresh : `[`CredentialsOperation`](../index.md)

Pass this to [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to refresh credentials.

### Parameters

`credentialsId` - Id of the [Credentials](../../../com.tink.model.credentials/-credentials/index.md) to be refreshed

`authenticate` - Force an authentication before the refresh, designed for open banking credentials. Defaults to false. (optional)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Pass this to [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to refresh credentials.`Refresh(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, authenticate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false)` |

### Properties

| Name | Summary |
|---|---|
| [authenticate](authenticate.md) | Force an authentication before the refresh, designed for open banking credentials. Defaults to false. (optional)`val authenticate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [credentialsId](credentials-id.md) | Id of the [Credentials](../../../com.tink.model.credentials/-credentials/index.md) to be refreshed`val credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
