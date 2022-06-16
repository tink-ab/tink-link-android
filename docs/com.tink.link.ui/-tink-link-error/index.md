[link](../../index.md) / [com.tink.link.ui](../index.md) / [TinkLinkError](./index.md)

# TinkLinkError

`sealed class TinkLinkError : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

Represents errors that happen during the Tink Link UI flow.

### Types

| Name | Summary |
|---|---|
| [CredentialsNotFound](-credentials-not-found/index.md) | Tink Link UI is unable to fetch the credentials with the specified [credentialsId](-credentials-not-found/credentials-id.md).`data class CredentialsNotFound : `[`TinkLinkError`](./index.md) |
| [FailedToAddCredentials](-failed-to-add-credentials/index.md) | Tink Link UI failed to add one or more credentials.`data class FailedToAddCredentials : `[`TinkLinkError`](./index.md) |
| [InternalError](-internal-error.md) | An internal error occurred in the Tink Link UI flow.`object InternalError : `[`TinkLinkError`](./index.md) |
| [ProviderListEmpty](-provider-list-empty.md) | Tink Link UI fetched an empty list of providers`object ProviderListEmpty : `[`TinkLinkError`](./index.md) |
| [ProviderNotFound](-provider-not-found/index.md) | Tink Link UI is unable to fetch the provider with the specified [providerName](-provider-not-found/provider-name.md).`data class ProviderNotFound : `[`TinkLinkError`](./index.md) |
| [UnableToFetchProviders](-unable-to-fetch-providers.md) | Tink Link UI is unable to fetch providers.`object UnableToFetchProviders : `[`TinkLinkError`](./index.md) |
