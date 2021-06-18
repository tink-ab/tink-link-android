---
title: authenticate -
---
//[link](../../index.md)/[com.tink.link.core.credentials](../index.md)/[[androidJvm]CredentialsRepository](index.md)/[authenticate](authenticate.md)



# authenticate  
[androidJvm]  
Content  
fun [authenticate](authenticate.md)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/index.md)<[CredentialsStatus](../[android-jvm]-credentials-status/index.md)>): [StreamSubscription](../../com.tink.service.streaming.publisher/[android-jvm]-stream-subscription/index.md)  
More info  


Manually authenticates the [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.md) matching the credentialsId. This is only applicable for PSD2 credentials.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.core.credentials/CredentialsRepository/authenticate/#kotlin.String#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]/PointingToDeclaration/"></a>statusChangeObserver| <a name="com.tink.link.core.credentials/CredentialsRepository/authenticate/#kotlin.String#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]/PointingToDeclaration/"></a><br><br>An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in [onNext](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-next.md), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via [onError](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-error.md). If the creation finished successfully, you will also receive a call to [onCompleted](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-completed.md), after which there will be no other calls to this stream observer.<br><br>
  
  



