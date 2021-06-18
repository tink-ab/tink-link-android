//[link](../../index.md)/[com.tink.link.ui](../index.md)/[[common]TinkLinkResult](index.md)



# TinkLinkResult  
 [common] sealed class [TinkLinkResult](index.md)

The result data that is returned from the Tink Link UI flow. Possible values are [TemporaryUser](-temporary-user/index.md) and [PermanentUser](-permanent-user/index.md)

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/TinkLinkResult.PermanentUser///PointingToDeclaration/"></a>[PermanentUser](-permanent-user/index.md)| <a name="com.tink.link.ui/TinkLinkResult.PermanentUser///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [PermanentUser](-permanent-user/index.md)(**credentials**: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.md)) : [TinkLinkResult](index.md)  <br>More info  <br>The data returned when a [LinkUser.ExistingUser](../[common]-link-user/-existing-user/index.md) or [LinkUser.UnauthenticatedUser](../[common]-link-user/-unauthenticated-user/index.md) is used in the Tink Link UI flow.  <br><br><br>
| <a name="com.tink.link.ui/TinkLinkResult.TemporaryUser///PointingToDeclaration/"></a>[TemporaryUser](-temporary-user/index.md)| <a name="com.tink.link.ui/TinkLinkResult.TemporaryUser///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [TemporaryUser](-temporary-user/index.md)(**authorizationCode**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **credentials**: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.md)) : [TinkLinkResult](index.md)  <br>More info  <br>The data returned when a [LinkUser.TemporaryUser](../[common]-link-user/-temporary-user/index.md) is used in the Tink Link UI flow.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.ui/TinkLinkResult.TemporaryUser///PointingToDeclaration/"></a>TinkLinkResult
| <a name="com.tink.link.ui/TinkLinkResult.PermanentUser///PointingToDeclaration/"></a>TinkLinkResult

