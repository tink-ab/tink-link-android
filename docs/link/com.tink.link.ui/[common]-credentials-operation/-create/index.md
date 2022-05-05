---
title: Create
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[common]CredentialsOperation](../index.html)/[Create](index.html)



# Create



[common]\
data class [Create](index.html)(val providerSelection: [ProviderSelection](../../[common]-provider-selection/index.html) = ProviderSelection.ProviderList()) : [CredentialsOperation](../index.html)

Pass this to the [TinkLinkUiActivity.createIntent](../../[common]-tink-link-ui-activity/-companion/create-intent.html) function to create credentials.



## Parameters


common

| | |
|---|---|
| providerSelection | Optional selection used to specify if you want to show a [single provider](../../[common]-provider-selection/-single-provider/index.html) or a [list of providers](../../[common]-provider-selection/-provider-list/index.html). |



## Constructors


| | |
|---|---|
| [Create](-create.html) | [common]<br>fun [Create](-create.html)(providerSelection: [ProviderSelection](../../[common]-provider-selection/index.html) = ProviderSelection.ProviderList()) |


## Properties


| Name | Summary |
|---|---|
| [credentialsId](../credentials-id.html) | [common]<br>open val [credentialsId](../credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [providerSelection](provider-selection.html) | [common]<br>val [providerSelection](provider-selection.html): [ProviderSelection](../../[common]-provider-selection/index.html) |

