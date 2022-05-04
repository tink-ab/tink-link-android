---
title: handleUri
---
//[link](../../../index.html)/[com.tink.link.core.user](../index.html)/[[common]UserContext](index.html)/[handleUri](handle-uri.html)



# handleUri



[common]\
abstract fun [handleUri](handle-uri.html)(uri: &lt;ERROR CLASS&gt;, resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Handle a third-party callback.



Call this method when identifying a third-party callback from the registered [redirectUri](../../com.tink.service.network/[common]-tink-configuration/redirect-uri.html)



Example:

private fun redirectIfAppropriate(intent: Intent?) {\
     intent?.data?.let { uri -&gt;\
         Tink.getUserContext()?.handleUri(uri)\
     }\
}


