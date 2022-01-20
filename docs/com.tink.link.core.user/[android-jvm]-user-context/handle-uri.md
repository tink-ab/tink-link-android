---
title: handleUri -
---
//[link](../../index.md)/[com.tink.link.core.user](../index.md)/[[androidJvm]UserContext](index.md)/[handleUri](handle-uri.md)



# handleUri  
[androidJvm]  
Content  
abstract fun [handleUri](handle-uri.md)(uri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.md)<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  
More info  


Handle a third-party callback.



Call this method when identifying a third-party callback from the registered [redirectUri](../../com.tink.service.network/[android-jvm]-tink-configuration/redirect-uri.md)



Example:

private fun redirectIfAppropriate(intent: Intent?) {  
     intent?.data?.let { uri ->  
         Tink.getUserContext()?.handleUri(uri)  
     }  
}  



