---
title: cancel -
---
//[link](../../../index.md)/[com.tink.link.authentication](../../index.md)/[[common]AuthenticationTask](../index.md)/[SupplementalInformation](index.md)/[cancel](cancel.md)



# cancel  
[common]  
Content  
fun [cancel](cancel.md)(resultHandler: [ResultHandler](../../../com.tink.service.handler/[common]-result-handler/index.md)<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>)  
More info  


Cancel the ongoing supplemental information task. This can be used to fail the authentication should the user back out of the authentication. If not called, the authentication will time out on its own. This is a shortcut to be able to get into a failed state faster and thus be able to retry more quickly.

  



