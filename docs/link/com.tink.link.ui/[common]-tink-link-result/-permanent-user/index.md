---
title: PermanentUser
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[common]TinkLinkResult](../index.html)/[PermanentUser](index.html)



# PermanentUser



[common]\
data class [PermanentUser](index.html)(val credentials: [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html)) : [TinkLinkResult](../index.html)

The data returned when a [LinkUser.ExistingUser](../../[common]-link-user/-existing-user/index.html) or [LinkUser.UnauthenticatedUser](../../[common]-link-user/-unauthenticated-user/index.html) is used in the Tink Link UI flow.



## Parameters


common

| | |
|---|---|
| credentials | [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html) connected to the user |



## Constructors


| | |
|---|---|
| [PermanentUser](-permanent-user.html) | [common]<br>fun [PermanentUser](-permanent-user.html)(credentials: [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [credentials](credentials.html) | [common]<br>val [credentials](credentials.html): [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html) |
