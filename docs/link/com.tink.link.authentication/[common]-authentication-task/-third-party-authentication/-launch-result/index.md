---
title: LaunchResult
---
//[link](../../../../../index.html)/[com.tink.link.authentication](../../../index.html)/[[common]AuthenticationTask](../../index.html)/[ThirdPartyAuthentication](../index.html)/[LaunchResult](index.html)



# LaunchResult



[common]\
sealed class [LaunchResult](index.html)

Indicates if the user was successfully redirected when [launch](../launch.html) was called.



Possible values are [Success](-success/index.html) and [Error](-error/index.html)



## Types


| Name | Summary |
|---|---|
| [Error](-error/index.html) | [common]<br>sealed class [Error](-error/index.html) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](index.html)<br>There was an error when launching the third party app. |
| [Success](-success/index.html) | [common]<br>object [Success](-success/index.html) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](index.html)<br>The user has successfully been redirected to the third party app. |


## Inheritors


| Name |
|---|
| Success |
| Error |

