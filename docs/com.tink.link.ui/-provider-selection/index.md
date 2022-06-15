[link](../../index.md) / [com.tink.link.ui](../index.md) / [ProviderSelection](./index.md)

# ProviderSelection

`sealed class ProviderSelection : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

Used as an argument for the [TinkLinkUiActivity](../-tink-link-ui-activity/index.md) to specify if you want to select a
[single provider](-single-provider/index.md) or a [list of providers](-provider-list/index.md).

### Types

| Name | Summary |
|---|---|
| [ProviderList](-provider-list/index.md) | Show a provider list selection in the UI. This allows you to also specify an optional [filter](-provider-list/filter.md).`data class ProviderList : `[`ProviderSelection`](./index.md) |
| [SingleProvider](-single-provider/index.md) | Adapt the UI to launch directly into a single provider with a unique [name](-single-provider/name.md) identifier. This will launch the create credentials view directly and skip the provider list selection.`data class SingleProvider : `[`ProviderSelection`](./index.md) |
