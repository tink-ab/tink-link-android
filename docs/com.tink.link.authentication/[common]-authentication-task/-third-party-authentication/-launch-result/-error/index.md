---
title: Error
---
//[link](../../../../../../index.html)/[com.tink.link.authentication](../../../../index.html)/[[common]AuthenticationTask](../../../index.html)/[ThirdPartyAuthentication](../../index.html)/[LaunchResult](../index.html)/[Error](index.html)



# Error



[common]\
sealed class [Error](index.html) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](../index.html)

There was an error when launching the third party app.



Properties [packageName](package-name.html), [title](title.html), and [message](message.html) can be used for example to show a dialog to the user prompting to install or upgrading the app.



## See also


common

| | |
|---|---|
| [com.tink.link.authentication.AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNotInstalled](-app-not-installed/index.html) |  |
| [com.tink.link.authentication.AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNeedsUpgrade](-app-needs-upgrade/index.html) |  |



## Types


| Name | Summary |
|---|---|
| [AppNeedsUpgrade](-app-needs-upgrade/index.html) | [common]<br>data class [AppNeedsUpgrade](-app-needs-upgrade/index.html)(val packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error](index.html)<br>The app necessary for authentication is installed on the users device but needs to be updated. |
| [AppNotInstalled](-app-not-installed/index.html) | [common]<br>data class [AppNotInstalled](-app-not-installed/index.html)(val packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error](index.html)<br>The app necessary for authentication is not installed on the user's device. |


## Properties


| Name | Summary |
|---|---|
| [message](message.html) | [common]<br>abstract val [message](message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [packageName](package-name.html) | [common]<br>abstract val [packageName](package-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [title](title.html) | [common]<br>abstract val [title](title.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |


## Inheritors


| Name |
|---|
| AppNotInstalled |
| AppNeedsUpgrade |

