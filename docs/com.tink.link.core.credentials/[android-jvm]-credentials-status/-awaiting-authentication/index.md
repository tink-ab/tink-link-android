---
title: AwaitingAuthentication
---
//[link](../../../../index.html)/[com.tink.link.core.credentials](../../index.html)/[[androidJvm]CredentialsStatus](../index.html)/[AwaitingAuthentication](index.html)



# AwaitingAuthentication



[androidJvm]\
class [AwaitingAuthentication](index.html)(val authenticationTask: [AuthenticationTask](../../../com.tink.link.authentication/[android-jvm]-authentication-task/index.html), val credentials: [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) : [CredentialsStatus](../index.html)

There is an outstanding authentication waiting that needs to be completed by the user to proceed.



## Parameters


androidJvm

| | |
|---|---|
| credentials | the credentials for which authentication is needed |



## Constructors


| | |
|---|---|
| [AwaitingAuthentication](-awaiting-authentication.html) | [androidJvm]<br>fun [AwaitingAuthentication](-awaiting-authentication.html)(authenticationTask: [AuthenticationTask](../../../com.tink.link.authentication/[android-jvm]-authentication-task/index.html), credentials: [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [authenticationTask](authentication-task.html) | [androidJvm]<br>val [authenticationTask](authentication-task.html): [AuthenticationTask](../../../com.tink.link.authentication/[android-jvm]-authentication-task/index.html)<br>the authentication that needs to be completed by the user. |
| [credentials](credentials.html) | [androidJvm]<br>open override val [credentials](credentials.html): [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.html) |

