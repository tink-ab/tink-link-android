---
title: createIntent -
---
//[link](../../../index.md)/[com.tink.link.ui](../../index.md)/[[common]TinkLinkUiActivity](../index.md)/[Companion](index.md)/[createIntent](create-intent.md)



# createIntent  
[common]  
Content  
fun [createIntent](create-intent.md)(context: <ERROR CLASS>, linkUser: [LinkUser](../../[common]-link-user/index.md), scopes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Scope](../../../com.tink.model.user/[common]-scope/index.md)>, styleResId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = R.style.TinkLinkUiStyle, credentialsOperation: [CredentialsOperation](../../[common]-credentials-operation/index.md) = CredentialsOperation.Create()): <ERROR CLASS>  
More info  


Creates an intent for use when starting this activity.



This helper method makes sure that all required values are set.



## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/##com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a>linkUser| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/##com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a><br><br>Information about the user to be used in the flow.<br><br>
| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/##com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a>scopes| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/##com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a><br><br>Needs to be a subset of the scopes enabled for the client id set in the [TinkConfiguration](../../../com.tink.service.network/[common]-tink-configuration/index.md) that was used in [Tink.init](../../../com.tink.core/[common]-tink/init.md).<br><br>
| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/##com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a>styleResId| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/##com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a><br><br>Optional style for changing the appearance of the flow. See our [configuration guide](https://docs.tink.com/resources/tutorials/tink-link-ui-sdk-android-tutorial#customizing-the-appearance). The default value is R.style.TinkLinkUiStyle.<br><br>
| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/##com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a>credentialsOperation| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/##com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a><br><br>The type of credentials operation to be performed. The default value is [CredentialsOperation.Create](../../[common]-credentials-operation/-create/index.md)<br><br>
  
  



