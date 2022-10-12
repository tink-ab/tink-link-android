---
title: handleUri
---
//[link](../../../index.html)/[com.tink.link.core.user](../index.html)/[[common]UserContext](index.html)/[handleUri](handle-uri.html)



# handleUri



[common]\
abstract fun [handleUri](handle-uri.html)(uri: &lt;ERROR CLASS&gt;, resultHandler: &lt;ERROR CLASS&gt;&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Handle a third-party callback.



Call this method when identifying a third-party callback from the registered TinkConfiguration.redirectUri



Example:

private fun redirectIfAppropriate(intent: Intent?) {\
     intent?.data?.let { uri -&gt;\
         Tink.getUserContext()?.handleUri(uri)\
     }\
}


