---
title: [common]TinkLinkResult
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[common]TinkLinkResult](index.html)



# TinkLinkResult



[common]\
sealed class [TinkLinkResult](index.html)

The result data that is returned from the Tink Link UI flow. Possible values are [TemporaryUser](-temporary-user/index.html) and [PermanentUser](-permanent-user/index.html)



## Types


| Name | Summary |
|---|---|
| [PermanentUser](-permanent-user/index.html) | [common]<br>data class [PermanentUser](-permanent-user/index.html)(val credentials: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html)) : [TinkLinkResult](index.html)<br>The data returned when a [LinkUser.ExistingUser](../[common]-link-user/-existing-user/index.html) or [LinkUser.UnauthenticatedUser](../[common]-link-user/-unauthenticated-user/index.html) is used in the Tink Link UI flow. |
| [TemporaryUser](-temporary-user/index.html) | [common]<br>data class [TemporaryUser](-temporary-user/index.html)(val authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentials: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html)) : [TinkLinkResult](index.html)<br>The data returned when a [LinkUser.TemporaryUser](../[common]-link-user/-temporary-user/index.html) is used in the Tink Link UI flow. |


## Inheritors


| Name |
|---|
| TemporaryUser |
| PermanentUser |

