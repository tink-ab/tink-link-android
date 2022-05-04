---
title: [common]LinkUser
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[common]LinkUser](index.html)



# LinkUser



[common]\
sealed class [LinkUser](index.html)

Use this to let Tink Link UI know if it should use an [existing user](-existing-user/index.html) or create a [temporary user](-temporary-user/index.html).



## Types


| Name | Summary |
|---|---|
| [ExistingUser](-existing-user/index.html) | [common]<br>data class [ExistingUser](-existing-user/index.html)(val user: &lt;ERROR CLASS&gt;) : [LinkUser](index.html)<br>Pass this to the [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.html) function to use an existing user for the flow. |
| [TemporaryUser](-temporary-user/index.html) | [common]<br>data class [TemporaryUser](-temporary-user/index.html)(val market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](index.html)<br>Pass this to the [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.html) function to create a temporary user to be used in the flow. The [market](-temporary-user/market.html) determines what providers will be available to the user, and the [locale](-temporary-user/locale.html) determines which language is used on a backend level. |
| [UnauthenticatedUser](-unauthenticated-user/index.html) | [common]<br>data class [UnauthenticatedUser](-unauthenticated-user/index.html)(val authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](index.html)<br>Pass this to the [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.html) function to authenticate the permanent user to be used in the flow. |


## Inheritors


| Name |
|---|
| ExistingUser |
| UnauthenticatedUser |
| TemporaryUser |

