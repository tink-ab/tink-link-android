---
title: authorize
---
//[link](../../../index.html)/[com.tink.link.core.user](../index.html)/[[common]UserContext](index.html)/[authorize](authorize.html)



# authorize



[common]\
abstract fun [authorize](authorize.html)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Scope](../../com.tink.model.user/[common]-scope/index.html)&gt;, resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)



Authorize your user towards a new set of scopes. These scopes needs to be enabled for your [clientId](../../com.tink.service.network/[common]-tink-configuration/o-auth-client-id.html).




