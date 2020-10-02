[link](../../index.md) / [com.tink.link.ui](../index.md) / [TinkLinkResult](./index.md)

# TinkLinkResult

`sealed class TinkLinkResult : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

The result data that is returned from the Tink Link UI flow.
Possible values are [TemporaryUser](-temporary-user/index.md) and [PermanentUser](-permanent-user/index.md)

### Types

| Name | Summary |
|---|---|
| [PermanentUser](-permanent-user/index.md) | The data returned when a [LinkUser.ExistingUser](../-link-user/-existing-user/index.md) or [LinkUser.UnauthenticatedUser](../-link-user/-unauthenticated-user/index.md) is used in the Tink Link UI flow.`data class PermanentUser : `[`TinkLinkResult`](./index.md) |
| [TemporaryUser](-temporary-user/index.md) | The data returned when a [LinkUser.TemporaryUser](../-link-user/-temporary-user/index.md) is used in the Tink Link UI flow.`data class TemporaryUser : `[`TinkLinkResult`](./index.md) |
