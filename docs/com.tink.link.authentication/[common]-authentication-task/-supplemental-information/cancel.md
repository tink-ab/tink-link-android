---
title: cancel
---
//[link](../../../../index.html)/[com.tink.link.authentication](../../index.html)/[[common]AuthenticationTask](../index.html)/[SupplementalInformation](index.html)/[cancel](cancel.html)



# cancel



[common]\
fun [cancel](cancel.html)(resultHandler: [ResultHandler](../../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)



Cancel the ongoing supplemental information task. This can be used to fail the authentication should the user back out of the authentication. If not called, the authentication will time out on its own. This is a shortcut to be able to get into a failed state faster and thus be able to retry more quickly.




