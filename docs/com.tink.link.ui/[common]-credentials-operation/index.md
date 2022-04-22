---
title: [common]CredentialsOperation -
---
//[link](../../index.md)/[com.tink.link.ui](../index.md)/[[common]CredentialsOperation](index.md)



# CredentialsOperation  
 [common] sealed class [CredentialsOperation](index.md)

Used as an argument for the [TinkLinkUiActivity](../[common]-tink-link-ui-activity/index.md) to specify the type of credentials operation to be performed using Tink Link UI. Possible values are [Create](-create/index.md), [Update](-update/index.md), [Refresh](-refresh/index.md) and [Authenticate](-authenticate/index.md). Please note that you need to have permanent users enabled for [Update](-update/index.md), [Refresh](-refresh/index.md) and [Authenticate](-authenticate/index.md) operations.

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/CredentialsOperation.Authenticate///PointingToDeclaration/"></a>[Authenticate](-authenticate/index.md)| <a name="com.tink.link.ui/CredentialsOperation.Authenticate///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Authenticate](-authenticate/index.md)(**credentialsId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [CredentialsOperation](index.md)  <br>More info  <br>Pass this to [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.md) function to authenticate credentials.  <br><br><br>
| <a name="com.tink.link.ui/CredentialsOperation.Create///PointingToDeclaration/"></a>[Create](-create/index.md)| <a name="com.tink.link.ui/CredentialsOperation.Create///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Create](-create/index.md)(**providerSelection**: [ProviderSelection](../[common]-provider-selection/index.md)) : [CredentialsOperation](index.md)  <br>More info  <br>Pass this to the [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.md) function to create credentials.  <br><br><br>
| <a name="com.tink.link.ui/CredentialsOperation.Refresh///PointingToDeclaration/"></a>[Refresh](-refresh/index.md)| <a name="com.tink.link.ui/CredentialsOperation.Refresh///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Refresh](-refresh/index.md)(**credentialsId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **authenticate**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [CredentialsOperation](index.md)  <br>More info  <br>Pass this to [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.md) function to refresh credentials.  <br><br><br>
| <a name="com.tink.link.ui/CredentialsOperation.Update///PointingToDeclaration/"></a>[Update](-update/index.md)| <a name="com.tink.link.ui/CredentialsOperation.Update///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Update](-update/index.md)(**credentialsId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [CredentialsOperation](index.md)  <br>More info  <br>Pass this to [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.md) function to update credentials.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/CredentialsOperation/credentialsId/#/PointingToDeclaration/"></a>[credentialsId](credentials-id.md)| <a name="com.tink.link.ui/CredentialsOperation/credentialsId/#/PointingToDeclaration/"></a> [common] open val [credentialsId](credentials-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null   <br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.ui/CredentialsOperation.Create///PointingToDeclaration/"></a>CredentialsOperation
| <a name="com.tink.link.ui/CredentialsOperation.Authenticate///PointingToDeclaration/"></a>CredentialsOperation
| <a name="com.tink.link.ui/CredentialsOperation.Refresh///PointingToDeclaration/"></a>CredentialsOperation
| <a name="com.tink.link.ui/CredentialsOperation.Update///PointingToDeclaration/"></a>CredentialsOperation

