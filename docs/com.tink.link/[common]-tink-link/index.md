//[link](../../index.md)/[com.tink.link](../index.md)/[[common]TinkLink](index.md)



# TinkLink  
 [common] object [TinkLink](index.md)

This is for Java compatibility only. Use extensions on [Tink](../../com.tink.core/[common]-tink/index.md) when using Kotlin



#### Since Kotlin  
999999999.0.0  
  
   


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link/TinkLink/authenticateUser/#kotlin.String#com.tink.service.handler.ResultHandler[com.tink.model.user.User]/PointingToDeclaration/"></a>[authenticateUser](authenticate-user.md)| <a name="com.tink.link/TinkLink/authenticateUser/#kotlin.String#com.tink.service.handler.ResultHandler[com.tink.model.user.User]/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [authenticateUser](authenticate-user.md)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[User](../../com.tink.model.user/[common]-user/index.md)>): <ERROR CLASS>  <br>More info  <br>Authenticate an existing user with an authentication code.  <br><br><br>
| <a name="com.tink.link/TinkLink/createTemporaryUser/#kotlin.String#kotlin.String#com.tink.service.handler.ResultHandler[com.tink.model.user.User]/PointingToDeclaration/"></a>[createTemporaryUser](create-temporary-user.md)| <a name="com.tink.link/TinkLink/createTemporaryUser/#kotlin.String#kotlin.String#com.tink.service.handler.ResultHandler[com.tink.model.user.User]/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [createTemporaryUser](create-temporary-user.md)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[User](../../com.tink.model.user/[common]-user/index.md)>): <ERROR CLASS>  <br>More info  <br>Create a temporary user.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.tink.link/TinkLink/getConsentContext/#/PointingToDeclaration/"></a>[getConsentContext](get-consent-context.md)| <a name="com.tink.link/TinkLink/getConsentContext/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [getConsentContext](get-consent-context.md)(): <ERROR CLASS>  <br><br><br>
| <a name="com.tink.link/TinkLink/getUserContext/#/PointingToDeclaration/"></a>[getUserContext](get-user-context.md)| <a name="com.tink.link/TinkLink/getUserContext/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [getUserContext](get-user-context.md)(): [UserContext](../../com.tink.link.core.user/[common]-user-context/index.md)?  <br>More info  <br>Fetches the [UserContext](../../com.tink.link.core.user/[common]-user-context/index.md) from Tink if a user is set.  <br><br><br>
| <a name="com.tink.link/TinkLink/getUserInfo/#com.tink.service.handler.ResultHandler[com.tink.model.user.UserInfo]/PointingToDeclaration/"></a>[getUserInfo](get-user-info.md)| <a name="com.tink.link/TinkLink/getUserInfo/#com.tink.service.handler.ResultHandler[com.tink.model.user.UserInfo]/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [getUserInfo](get-user-info.md)(resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[UserInfo](../../com.tink.model.user/[common]-user-info/index.md)>): <ERROR CLASS>  <br>More info  <br>Fetches the [UserInfo](../../com.tink.model.user/[common]-user-info/index.md) for an authenticated user.  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.tink.link/TinkLink/requireUserContext/#/PointingToDeclaration/"></a>[requireUserContext](require-user-context.md)| <a name="com.tink.link/TinkLink/requireUserContext/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [requireUserContext](require-user-context.md)(): [UserContext](../../com.tink.link.core.user/[common]-user-context/index.md)  <br>More info  <br>Fetches the [UserContext](../../com.tink.link.core.user/[common]-user-context/index.md) from Tink if a user is set.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

