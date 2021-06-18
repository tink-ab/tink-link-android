//[link](../../index.md)/[com.tink.link.core.user](../index.md)/[[common]UserContext](index.md)/[authorize](authorize.md)



# authorize  
[common]  
Content  
abstract fun [authorize](authorize.md)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[Scope](../../com.tink.model.user/[common]-scope/index.md)>, resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  
More info  


Authorize your user towards a new set of scopes. These scopes needs to be enabled for your [clientId](../../com.tink.service.network/[common]-tink-configuration/o-auth-client-id.md).

  



