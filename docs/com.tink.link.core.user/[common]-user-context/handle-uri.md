---
title: handleUri -
---
//[link](../../index.md)/[com.tink.link.core.user](../index.md)/[[common]UserContext](index.md)/[handleUri](handle-uri.md)



# handleUri  
[common]  
Content  
abstract fun [handleUri](handle-uri.md)(uri: <ERROR CLASS>, resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  
More info  


Handle a third-party callback.



Call this method when identifying a third-party callback from the registered [redirectUri](../../com.tink.service.network/[common]-tink-configuration/redirect-uri.md)



Example:

private fun redirectIfAppropriate(intent: Intent?) {  
     intent?.data?.let { uri ->  
         Tink.getUserContext()?.handleUri(uri)  
     }  
}  



