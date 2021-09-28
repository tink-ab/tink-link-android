---
title: Error -
---
//[link](../../../../../index.md)/[com.tink.link.authentication](../../../../index.md)/[[common]AuthenticationTask](../../../index.md)/[ThirdPartyAuthentication](../../index.md)/[LaunchResult](../index.md)/[Error](index.md)



# Error  
 [common] sealed class [Error](index.md) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](../index.md)

There was an error when launching the third party app.



Properties [packageName](package-name.md), [title](title.md), and [message](message.md) can be used for example to show a dialog to the user prompting to install or upgrading the app.

   


## See also  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error///PointingToDeclaration/"></a>[com.tink.link.authentication.AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNotInstalled](-app-not-installed/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error///PointingToDeclaration/"></a>
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error///PointingToDeclaration/"></a>[com.tink.link.authentication.AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNeedsUpgrade](-app-needs-upgrade/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error///PointingToDeclaration/"></a>
  


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNeedsUpgrade///PointingToDeclaration/"></a>[AppNeedsUpgrade](-app-needs-upgrade/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNeedsUpgrade///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [AppNeedsUpgrade](-app-needs-upgrade/index.md)(**packageName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error](index.md)  <br>More info  <br>The app necessary for authentication is installed on the users device but needs to be updated.  <br><br><br>
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNotInstalled///PointingToDeclaration/"></a>[AppNotInstalled](-app-not-installed/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNotInstalled///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [AppNotInstalled](-app-not-installed/index.md)(**packageName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error](index.md)  <br>More info  <br>The app necessary for authentication is not installed on the user's device.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/message/#/PointingToDeclaration/"></a>[message](message.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/message/#/PointingToDeclaration/"></a> [common] abstract val [message](message.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/packageName/#/PointingToDeclaration/"></a>[packageName](package-name.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/packageName/#/PointingToDeclaration/"></a> [common] abstract val [packageName](package-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/title/#/PointingToDeclaration/"></a>[title](title.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/title/#/PointingToDeclaration/"></a> [common] abstract val [title](title.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNotInstalled///PointingToDeclaration/"></a>AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNeedsUpgrade///PointingToDeclaration/"></a>AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error

