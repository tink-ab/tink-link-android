---
title: [common]CredentialsStatus
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[common]CredentialsStatus](index.html)



# CredentialsStatus



[common]\
sealed class [CredentialsStatus](index.html)

The status of a Credentials. Possible values are [Success](-success/index.html), [Loading](-loading/index.html), and [AwaitingAuthentication](-awaiting-authentication/index.html)



## Types


| Name | Summary |
|---|---|
| [AwaitingAuthentication](-awaiting-authentication/index.html) | [common]<br>class [AwaitingAuthentication](-awaiting-authentication/index.html)(val authenticationTask: [AuthenticationTask](../../com.tink.link.authentication/[common]-authentication-task/index.html), val credentials: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html)) : [CredentialsStatus](index.html)<br>There is an outstanding authentication waiting that needs to be completed by the user to proceed. |
| [Loading](-loading/index.html) | [common]<br>data class [Loading](-loading/index.html)(val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val credentials: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html)? = null) : [CredentialsStatus](index.html)<br>The creation is being processed by Tink. There is currently no user action required. |
| [Success](-success/index.html) | [common]<br>data class [Success](-success/index.html)(val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val credentials: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html)) : [CredentialsStatus](index.html)<br>The credentials were successfully created. |


## Properties


| Name | Summary |
|---|---|
| [credentials](credentials.html) | [common]<br>abstract val [credentials](credentials.html): [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html)? |


## Inheritors


| Name |
|---|
| Success |
| Loading |
| AwaitingAuthentication |

