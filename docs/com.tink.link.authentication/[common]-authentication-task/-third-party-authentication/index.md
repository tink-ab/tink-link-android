---
title: ThirdPartyAuthentication
---
//[link](../../../../index.html)/[com.tink.link.authentication](../../index.html)/[[common]AuthenticationTask](../index.html)/[ThirdPartyAuthentication](index.html)



# ThirdPartyAuthentication



[common]\
data class [ThirdPartyAuthentication](index.html)(credentials: [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html)) : [AuthenticationTask](../index.html)

Indicates that there is an authentication in a third party app or in the browser necessary to proceed with the authentication. The user can be sent to redirected by calling [launch](launch.html), or you can provide a custom redirection logic with the use of the data in [thirdPartyAppAuthentication](third-party-app-authentication.html)



## Constructors


| | |
|---|---|
| [ThirdPartyAuthentication](-third-party-authentication.html) | [common]<br>fun [ThirdPartyAuthentication](-third-party-authentication.html)(credentials: [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html)) |


## Types


| Name | Summary |
|---|---|
| [LaunchResult](-launch-result/index.html) | [common]<br>sealed class [LaunchResult](-launch-result/index.html)<br>Indicates if the user was successfully redirected when [launch](launch.html) was called. |


## Functions


| Name | Summary |
|---|---|
| [isNewerThan](../is-newer-than.html) | [common]<br>fun [isNewerThan](../is-newer-than.html)(other: [AuthenticationTask](../index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Helper function comparing two [AuthenticationTask](../index.html)s to see if one is newer than that the other. This can be used to determine if a new update should be sent. This is for internal use in the Tink Sdk and it should not be necessary to use it otherwise. |
| [launch](launch.html) | [common]<br>fun [launch](launch.html)(activity: &lt;ERROR CLASS&gt;): [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](-launch-result/index.html)<br>Try to redirect the user to the third party app for authentication. |


## Properties


| Name | Summary |
|---|---|
| [thirdPartyAppAuthentication](third-party-app-authentication.html) | [common]<br>val [thirdPartyAppAuthentication](third-party-app-authentication.html): &lt;ERROR CLASS&gt; |

