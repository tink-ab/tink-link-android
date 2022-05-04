---
title: [common]CredentialsOperation
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[common]CredentialsOperation](index.html)



# CredentialsOperation



[common]\
sealed class [CredentialsOperation](index.html)

Used as an argument for the [TinkLinkUiActivity](../[common]-tink-link-ui-activity/index.html) to specify the type of credentials operation to be performed using Tink Link UI. Possible values are [Create](-create/index.html), [Update](-update/index.html), [Refresh](-refresh/index.html) and [Authenticate](-authenticate/index.html). Please note that you need to have permanent users enabled for [Update](-update/index.html), [Refresh](-refresh/index.html) and [Authenticate](-authenticate/index.html) operations.



## Types


| Name | Summary |
|---|---|
| [Authenticate](-authenticate/index.html) | [common]<br>data class [Authenticate](-authenticate/index.html)(val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [CredentialsOperation](index.html)<br>Pass this to [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.html) function to authenticate credentials. This operation is limited to open banking credentials. |
| [Create](-create/index.html) | [common]<br>data class [Create](-create/index.html)(val providerSelection: [ProviderSelection](../[common]-provider-selection/index.html) = ProviderSelection.ProviderList()) : [CredentialsOperation](index.html)<br>Pass this to the [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.html) function to create credentials. |
| [Refresh](-refresh/index.html) | [common]<br>data class [Refresh](-refresh/index.html)(val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false) : [CredentialsOperation](index.html)<br>Pass this to [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.html) function to refresh credentials. |
| [Update](-update/index.html) | [common]<br>data class [Update](-update/index.html)(val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [CredentialsOperation](index.html)<br>Pass this to [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.html) function to update credentials. |


## Properties


| Name | Summary |
|---|---|
| [credentialsId](credentials-id.html) | [common]<br>open val [credentialsId](credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |


## Inheritors


| Name |
|---|
| Create |
| Authenticate |
| Refresh |
| Update |

