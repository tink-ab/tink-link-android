---
title: AwaitingAuthentication
---
//[link](../../../../index.html)/[com.tink.link.core.credentials](../../index.html)/[[common]CredentialsStatus](../index.html)/[AwaitingAuthentication](index.html)



# AwaitingAuthentication



[common]\
class [AwaitingAuthentication](index.html)(val authenticationTask: [AuthenticationTask](../../../com.tink.link.authentication/[common]-authentication-task/index.html), val credentials: &lt;ERROR CLASS&gt;) : [CredentialsStatus](../index.html)

There is an outstanding authentication waiting that needs to be completed by the user to proceed.



## Parameters


common

| | |
|---|---|
| credentials | the credentials for which authentication is needed |



## Constructors


| | |
|---|---|
| [AwaitingAuthentication](-awaiting-authentication.html) | [common]<br>fun [AwaitingAuthentication](-awaiting-authentication.html)(authenticationTask: [AuthenticationTask](../../../com.tink.link.authentication/[common]-authentication-task/index.html), credentials: &lt;ERROR CLASS&gt;) |


## Properties


| Name | Summary |
|---|---|
| [authenticationTask](authentication-task.html) | [common]<br>val [authenticationTask](authentication-task.html): [AuthenticationTask](../../../com.tink.link.authentication/[common]-authentication-task/index.html)<br>the authentication that needs to be completed by the user. |
| [credentials](credentials.html) | [common]<br>open override val [credentials](credentials.html): &lt;ERROR CLASS&gt; |

