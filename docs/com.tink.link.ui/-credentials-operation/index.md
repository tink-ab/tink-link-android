[link](../../index.md) / [com.tink.link.ui](../index.md) / [CredentialsOperation](./index.md)

# CredentialsOperation

`sealed class CredentialsOperation : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

Used as an argument for the [TinkLinkUiActivity](../-tink-link-ui-activity/index.md) to specify the type of credentials operation
to be performed using Tink Link UI.
Possible values are [Create](-create/index.md), [Update](-update/index.md), [Refresh](-refresh/index.md) and [Authenticate](-authenticate/index.md).
Please note that you need to have permanent users enabled for [Update](-update/index.md), [Refresh](-refresh/index.md)
and [Authenticate](-authenticate/index.md) operations.

### Types

| Name | Summary |
|---|---|
| [Authenticate](-authenticate/index.md) | Pass this to [TinkLinkUiActivity.createIntent](../-tink-link-ui-activity/create-intent.md) function to authenticate credentials. This operation is limited to open banking credentials.`data class Authenticate : `[`CredentialsOperation`](./index.md) |
| [Create](-create/index.md) | Pass this to the [TinkLinkUiActivity.createIntent](../-tink-link-ui-activity/create-intent.md) function to create credentials.`data class Create : `[`CredentialsOperation`](./index.md) |
| [Refresh](-refresh/index.md) | Pass this to [TinkLinkUiActivity.createIntent](../-tink-link-ui-activity/create-intent.md) function to refresh credentials.`data class Refresh : `[`CredentialsOperation`](./index.md) |
| [Update](-update/index.md) | Pass this to [TinkLinkUiActivity.createIntent](../-tink-link-ui-activity/create-intent.md) function to update credentials.`data class Update : `[`CredentialsOperation`](./index.md) |

### Properties

| Name | Summary |
|---|---|
| [credentialsId](credentials-id.md) | `open val credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
