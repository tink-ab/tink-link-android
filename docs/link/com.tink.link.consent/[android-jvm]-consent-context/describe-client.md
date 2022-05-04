---
title: describeClient
---
//[link](../../../index.html)/[com.tink.link.consent](../index.html)/[[androidJvm]ConsentContext](index.html)/[describeClient](describe-client.html)



# describeClient



[androidJvm]\
fun [describeClient](describe-client.html)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Scope](../../com.tink.model.user/[android-jvm]-scope/index.html)&gt;, resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[OAuthClientDescription](../../com.tink.model.consent/[android-jvm]-o-auth-client-description/index.html)&gt;)



Get the [client description](../../com.tink.model.consent/[android-jvm]-o-auth-client-description/index.html) for a client with the provided scopes.



## Parameters


androidJvm

| | |
|---|---|
| scopes | A [Scope](../../com.tink.model.user/[android-jvm]-scope/index.html) set of OAuth scopes authorized for this client |
| resultHandler | Handler for successful (providing the [client description](../../com.tink.model.consent/[android-jvm]-o-auth-client-description/index.html)) or error events. |




