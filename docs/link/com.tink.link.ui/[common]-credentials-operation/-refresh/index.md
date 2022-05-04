---
title: Refresh
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[common]CredentialsOperation](../index.html)/[Refresh](index.html)



# Refresh



[common]\
data class [Refresh](index.html)(val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false) : [CredentialsOperation](../index.html)

Pass this to [TinkLinkUiActivity.createIntent](../../[common]-tink-link-ui-activity/-companion/create-intent.html) function to refresh credentials.



## Parameters


common

| | |
|---|---|
| credentialsId | Id of the [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html) to be refreshed |
| authenticate | Force an authentication before the refresh, designed for open banking credentials. Defaults to false. (optional) |



## Constructors


| | |
|---|---|
| [Refresh](-refresh.html) | [common]<br>fun [Refresh](-refresh.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false) |


## Properties


| Name | Summary |
|---|---|
| [authenticate](authenticate.html) | [common]<br>val [authenticate](authenticate.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [credentialsId](credentials-id.html) | [common]<br>open override val [credentialsId](credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

