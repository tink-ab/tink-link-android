//[link](../../index.md)/[com.tink.link.ui](../index.md)/[[common]TinkLinkUiActivity](index.md)



# TinkLinkUiActivity  
 [common] class [TinkLinkUiActivity](index.md)

Activity used for displaying the full Tink Link UI flow.



Results will be passed with setResult and can be observed with the usual methods, such as onActivityResult. Possible results are [RESULT_SUCCESS](-companion/-r-e-s-u-l-t_-s-u-c-c-e-s-s.md), [RESULT_CANCELLED](-companion/-r-e-s-u-l-t_-c-a-n-c-e-l-l-e-d.md), and [RESULT_FAILURE](-companion/-r-e-s-u-l-t_-f-a-i-l-u-r-e.md).



For a [successful result](-companion/-r-e-s-u-l-t_-s-u-c-c-e-s-s.md), a [TinkLinkResult](../[common]-tink-link-result/index.md) is returned as data bundled with the key [RESULT_DATA](-companion/-r-e-s-u-l-t_-d-a-t-a.md). For a [failure result](-companion/-r-e-s-u-l-t_-f-a-i-l-u-r-e.md), a [TinkLinkError](../[common]-tink-link-error/index.md) is returned as data bundled with the key [ERROR_DATA](-companion/-e-r-r-o-r_-d-a-t-a.md). If there are credentials that could not be added as part of the Tink Link UI flow, a map of those failed credentials ids to errors will be returned as data bundled with the key [FAILED_CREDENTIALS_DATA](-companion/-f-a-i-l-e-d_-c-r-e-d-e-n-t-i-a-l-s_-d-a-t-a.md) If a [temporary user](../[common]-link-user/-temporary-user/index.md) is used for the flow, the result data is of type [TinkLinkResult.TemporaryUser](../[common]-tink-link-result/-temporary-user/index.md) which includes the authorization code (String) and the [Credentials](../../com.tink.model.credentials/[common]-credentials/index.md) connected to the user. If a permanent user is used for the flow (either [LinkUser.ExistingUser](../[common]-link-user/-existing-user/index.md) or [LinkUser.UnauthenticatedUser](../[common]-link-user/-unauthenticated-user/index.md)), the result data is of type [TinkLinkResult.PermanentUser](../[common]-tink-link-result/-permanent-user/index.md) which includes the [Credentials](../../com.tink.model.credentials/[common]-credentials/index.md) connected to the user.

   


## Samples  
 [common] tinkLinkUIExample   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/TinkLinkUiActivity/TinkLinkUiActivity/#/PointingToDeclaration/"></a>[TinkLinkUiActivity](-tink-link-ui-activity.md)| <a name="com.tink.link.ui/TinkLinkUiActivity/TinkLinkUiActivity/#/PointingToDeclaration/"></a> [common] fun [TinkLinkUiActivity](-tink-link-ui-activity.md)()   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.tink.link.ui/TinkLinkUiActivity.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.tink.link.ui/TinkLinkUiActivity/onBackPressed/#/PointingToDeclaration/"></a>[onBackPressed](on-back-pressed.md)| <a name="com.tink.link.ui/TinkLinkUiActivity/onBackPressed/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [onBackPressed](on-back-pressed.md)()  <br><br><br>
| <a name="com.tink.link.ui/TinkLinkUiActivity/onCreate/#?/PointingToDeclaration/"></a>[onCreate](on-create.md)| <a name="com.tink.link.ui/TinkLinkUiActivity/onCreate/#?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [onCreate](on-create.md)(savedInstanceState: <ERROR CLASS>?)  <br><br><br>
| <a name="com.tink.link.ui/TinkLinkUiActivity/onNewIntent/#?/PointingToDeclaration/"></a>[onNewIntent](on-new-intent.md)| <a name="com.tink.link.ui/TinkLinkUiActivity/onNewIntent/#?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [onNewIntent](on-new-intent.md)(intent: <ERROR CLASS>?)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

