//[link](../../index.md)/[com.tink.link.consent](../index.md)/[[common]ConsentContext](index.md)/[describeClient](describe-client.md)



# describeClient  
[common]  
Content  
fun [describeClient](describe-client.md)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[Scope](../../com.tink.model.user/[common]-scope/index.md)>, resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[OAuthClientDescription](../../com.tink.model.consent/[common]-o-auth-client-description/index.md)>)  
More info  


Get the [client description](../../com.tink.model.consent/[common]-o-auth-client-description/index.md) for a client with the provided scopes.



## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.consent/ConsentContext/describeClient/#kotlin.collections.Set[com.tink.model.user.Scope]#com.tink.service.handler.ResultHandler[com.tink.model.consent.OAuthClientDescription]/PointingToDeclaration/"></a>scopes| <a name="com.tink.link.consent/ConsentContext/describeClient/#kotlin.collections.Set[com.tink.model.user.Scope]#com.tink.service.handler.ResultHandler[com.tink.model.consent.OAuthClientDescription]/PointingToDeclaration/"></a><br><br>A [Scope](../../com.tink.model.user/[common]-scope/index.md) set of OAuth scopes authorized for this client<br><br>
| <a name="com.tink.link.consent/ConsentContext/describeClient/#kotlin.collections.Set[com.tink.model.user.Scope]#com.tink.service.handler.ResultHandler[com.tink.model.consent.OAuthClientDescription]/PointingToDeclaration/"></a>resultHandler| <a name="com.tink.link.consent/ConsentContext/describeClient/#kotlin.collections.Set[com.tink.model.user.Scope]#com.tink.service.handler.ResultHandler[com.tink.model.consent.OAuthClientDescription]/PointingToDeclaration/"></a><br><br>Handler for successful (providing the [client description](../../com.tink.model.consent/[common]-o-auth-client-description/index.md)) or error events.<br><br>
  
  



