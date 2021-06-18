//[link](../../../index.md)/[com.tink.link.ui](../../index.md)/[[androidJvm]TinkLinkUiActivity](../index.md)/[Companion](index.md)/[createIntent](create-intent.md)



# createIntent  
[androidJvm]  
Content  
@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  
  
fun [createIntent](create-intent.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), linkUser: [LinkUser](../../[android-jvm]-link-user/index.md), scopes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Scope](../../../com.tink.model.user/[android-jvm]-scope/index.md)>, styleResId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = R.style.TinkLinkUiStyle, credentialsOperation: [CredentialsOperation](../../[android-jvm]-credentials-operation/index.md) = CredentialsOperation.Create()): [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)  
More info  


Creates an intent for use when starting this activity.



This helper method makes sure that all required values are set.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/#android.content.Context#com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a>linkUser| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/#android.content.Context#com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a><br><br>Information about the user to be used in the flow.<br><br>
| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/#android.content.Context#com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a>scopes| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/#android.content.Context#com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a><br><br>Needs to be a subset of the scopes enabled for the client id set in the [TinkConfiguration](../../../com.tink.service.network/[android-jvm]-tink-configuration/index.md) that was used in [Tink.init](../../../com.tink.core/[android-jvm]-tink/init.md).<br><br>
| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/#android.content.Context#com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a>styleResId| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/#android.content.Context#com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a><br><br>Optional style for changing the appearance of the flow. See our [configuration guide](https://docs.tink.com/resources/tutorials/tink-link-ui-sdk-android-tutorial#customizing-the-appearance). The default value is R.style.TinkLinkUiStyle.<br><br>
| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/#android.content.Context#com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a>credentialsOperation| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion/createIntent/#android.content.Context#com.tink.link.ui.LinkUser#kotlin.collections.List[com.tink.model.user.Scope]#kotlin.Int?#com.tink.link.ui.CredentialsOperation/PointingToDeclaration/"></a><br><br>The type of credentials operation to be performed. The default value is [CredentialsOperation.Create](../../[android-jvm]-credentials-operation/-create/index.md)<br><br>
  
  



