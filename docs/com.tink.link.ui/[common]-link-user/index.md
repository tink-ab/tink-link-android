//[link](../../index.md)/[com.tink.link.ui](../index.md)/[[common]LinkUser](index.md)



# LinkUser  
 [common] sealed class [LinkUser](index.md)

Use this to let Tink Link UI know if it should use an [existing user](-existing-user/index.md) or create a [temporary user](-temporary-user/index.md).

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/LinkUser.ExistingUser///PointingToDeclaration/"></a>[ExistingUser](-existing-user/index.md)| <a name="com.tink.link.ui/LinkUser.ExistingUser///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [ExistingUser](-existing-user/index.md)(**user**: [User](../../com.tink.model.user/[common]-user/index.md)) : [LinkUser](index.md)  <br>More info  <br>Pass this to the [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.md) function to use an existing user for the flow.  <br><br><br>
| <a name="com.tink.link.ui/LinkUser.TemporaryUser///PointingToDeclaration/"></a>[TemporaryUser](-temporary-user/index.md)| <a name="com.tink.link.ui/LinkUser.TemporaryUser///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [TemporaryUser](-temporary-user/index.md)(**market**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **locale**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](index.md)  <br>More info  <br>Pass this to the [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.md) function to create a temporary user to be used in the flow.  <br><br><br>
| <a name="com.tink.link.ui/LinkUser.UnauthenticatedUser///PointingToDeclaration/"></a>[UnauthenticatedUser](-unauthenticated-user/index.md)| <a name="com.tink.link.ui/LinkUser.UnauthenticatedUser///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [UnauthenticatedUser](-unauthenticated-user/index.md)(**authorizationCode**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](index.md)  <br>More info  <br>Pass this to the [TinkLinkUiActivity.createIntent](../[common]-tink-link-ui-activity/-companion/create-intent.md) function to authenticate the permanent user to be used in the flow.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.ui/LinkUser.ExistingUser///PointingToDeclaration/"></a>LinkUser
| <a name="com.tink.link.ui/LinkUser.UnauthenticatedUser///PointingToDeclaration/"></a>LinkUser
| <a name="com.tink.link.ui/LinkUser.TemporaryUser///PointingToDeclaration/"></a>LinkUser

