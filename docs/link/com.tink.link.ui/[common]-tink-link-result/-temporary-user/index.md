---
title: TemporaryUser
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[common]TinkLinkResult](../index.html)/[TemporaryUser](index.html)



# TemporaryUser



[common]\
data class [TemporaryUser](index.html)(val authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentials: [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html)) : [TinkLinkResult](../index.html)

The data returned when a [LinkUser.TemporaryUser](../../[common]-link-user/-temporary-user/index.html) is used in the Tink Link UI flow.



## Parameters


common

| | |
|---|---|
| authorizationCode | Authorization code from authorizing the user towards a new set of scopes |
| credentials | [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html) connected to the user |



## Constructors


| | |
|---|---|
| [TemporaryUser](-temporary-user.html) | [common]<br>fun [TemporaryUser](-temporary-user.html)(authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentials: [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [authorizationCode](authorization-code.html) | [common]<br>val [authorizationCode](authorization-code.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [credentials](credentials.html) | [common]<br>val [credentials](credentials.html): [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html) |

