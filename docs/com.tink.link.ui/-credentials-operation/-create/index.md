[link](../../../index.md) / [com.tink.link.ui](../../index.md) / [CredentialsOperation](../index.md) / [Create](./index.md)

# Create

`data class Create : `[`CredentialsOperation`](../index.md)

Pass this to the [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to create credentials.

### Parameters

`providerSelection` - Optional selection used to specify if you want to show a
[single provider](../../-provider-selection/-single-provider/index.md) or a [list of providers](../../-provider-selection/-provider-list/index.md).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Pass this to the [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to create credentials.`Create(providerSelection: `[`ProviderSelection`](../../-provider-selection/index.md)` = ProviderSelection.ProviderList())` |

### Properties

| Name | Summary |
|---|---|
| [providerSelection](provider-selection.md) | Optional selection used to specify if you want to show a [single provider](../../-provider-selection/-single-provider/index.md) or a [list of providers](../../-provider-selection/-provider-list/index.md).`val providerSelection: `[`ProviderSelection`](../../-provider-selection/index.md) |
