---
title: Authenticate
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[common]CredentialsOperation](../index.html)/[Authenticate](index.html)



# Authenticate



[common]\
data class [Authenticate](index.html)(val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [CredentialsOperation](../index.html)

Pass this to [TinkLinkUiActivity.createIntent](../../[common]-tink-link-ui-activity/-companion/create-intent.html) function to authenticate credentials. This operation is limited to open banking credentials.



## Parameters


common

| | |
|---|---|
| credentialsId | Id of the Credentials to be authenticated |



## Constructors


| | |
|---|---|
| [Authenticate](-authenticate.html) | [common]<br>fun [Authenticate](-authenticate.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [credentialsId](credentials-id.html) | [common]<br>open override val [credentialsId](credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

