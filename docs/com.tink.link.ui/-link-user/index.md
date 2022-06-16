[link](../../index.md) / [com.tink.link.ui](../index.md) / [LinkUser](./index.md)

# LinkUser

`sealed class LinkUser : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

Use this to let Tink Link UI know if it should use an [existing user](-existing-user/index.md) or
create a [temporary user](-temporary-user/index.md).

### Types

| Name | Summary |
|---|---|
| [ExistingUser](-existing-user/index.md) | Pass this to the [TinkLinkUiActivity.createIntent](../-tink-link-ui-activity/create-intent.md) function to use an existing user for the flow.`data class ExistingUser : `[`LinkUser`](./index.md) |
| [TemporaryUser](-temporary-user/index.md) | Pass this to the [TinkLinkUiActivity.createIntent](../-tink-link-ui-activity/create-intent.md) function to create a temporary user to be used in the flow. The [market](-temporary-user/market.md) determines what providers will be available to the user, and the [locale](-temporary-user/locale.md) determines which language is used on a backend level.`data class TemporaryUser : `[`LinkUser`](./index.md) |
| [UnauthenticatedUser](-unauthenticated-user/index.md) | Pass this to the [TinkLinkUiActivity.createIntent](../-tink-link-ui-activity/create-intent.md) function to authenticate the permanent user to be used in the flow.`data class UnauthenticatedUser : `[`LinkUser`](./index.md) |
