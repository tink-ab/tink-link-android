---
title: cancelSupplementalInformation -
---
//[link](../../index.md)/[com.tink.link.core.credentials](../index.md)/[[common]CredentialsRepository](index.md)/[cancelSupplementalInformation](cancel-supplemental-information.md)



# cancelSupplementalInformation  
[common]  
Content  
fun [cancelSupplementalInformation](cancel-supplemental-information.md)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), handler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>)  
More info  


Cancels the supplemental information submission flow. The backend service is informed to stop waiting for the supplemental information. This method should be called if you want to dismiss the supplemental information flow.



## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.core.credentials/CredentialsRepository/cancelSupplementalInformation/#kotlin.String#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a>credentialsId| <a name="com.tink.link.core.credentials/CredentialsRepository/cancelSupplementalInformation/#kotlin.String#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a><br><br>Identifier for the [Credentials](../../com.tink.model.credentials/[common]-credentials/index.md) that is being authenticated<br><br>
| <a name="com.tink.link.core.credentials/CredentialsRepository/cancelSupplementalInformation/#kotlin.String#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a>handler| <a name="com.tink.link.core.credentials/CredentialsRepository/cancelSupplementalInformation/#kotlin.String#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a><br><br>The [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md) for processing error and success callbacks<br><br>
  
  



