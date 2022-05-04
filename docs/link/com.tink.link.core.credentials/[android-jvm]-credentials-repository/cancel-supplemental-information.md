---
title: cancelSupplementalInformation
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[androidJvm]CredentialsRepository](index.html)/[cancelSupplementalInformation](cancel-supplemental-information.html)



# cancelSupplementalInformation



[androidJvm]\
fun [cancelSupplementalInformation](cancel-supplemental-information.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), handler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)



Cancels the supplemental information submission flow. The backend service is informed to stop waiting for the supplemental information. This method should be called if you want to dismiss the supplemental information flow.



## Parameters


androidJvm

| | |
|---|---|
| credentialsId | Identifier for the [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html) that is being authenticated |
| handler | The [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html) for processing error and success callbacks |




