---
title: handleUri
---
//[link](../../../index.html)/[com.tink.link.core.user](../index.html)/[[androidJvm]UserContext](index.html)/[handleUri](handle-uri.html)



# handleUri



[androidJvm]\
abstract fun [handleUri](handle-uri.html)(uri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Handle a third-party callback.



Call this method when identifying a third-party callback from the registered [redirectUri](../../com.tink.service.network/[android-jvm]-tink-configuration/redirect-uri.html)



Example:

private fun redirectIfAppropriate(intent: Intent?) {\
     intent?.data?.let { uri -&gt;\
         Tink.getUserContext()?.handleUri(uri)\
     }\
}


