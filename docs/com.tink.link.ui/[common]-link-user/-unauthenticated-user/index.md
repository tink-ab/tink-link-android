---
title: UnauthenticatedUser
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[common]LinkUser](../index.html)/[UnauthenticatedUser](index.html)



# UnauthenticatedUser



[common]\
data class [UnauthenticatedUser](index.html)(val authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](../index.html)

Pass this to the [TinkLinkUiActivity.createIntent](../../[common]-tink-link-ui-activity/-companion/create-intent.html) function to authenticate the permanent user to be used in the flow.



## Parameters


common

| | |
|---|---|
| authorizationCode | The authorization code from delegation to use for authentication |



## Constructors


| | |
|---|---|
| [UnauthenticatedUser](-unauthenticated-user.html) | [common]<br>fun [UnauthenticatedUser](-unauthenticated-user.html)(authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [authorizationCode](authorization-code.html) | [common]<br>val [authorizationCode](authorization-code.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

