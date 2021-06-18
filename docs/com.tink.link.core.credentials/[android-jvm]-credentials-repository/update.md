//[link](../../index.md)/[com.tink.link.core.credentials](../index.md)/[[androidJvm]CredentialsRepository](index.md)/[update](update.md)



# update  
[androidJvm]  
Content  
fun [update](update.md)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/index.md)<[CredentialsStatus](../[android-jvm]-credentials-status/index.md)>): [StreamSubscription](../../com.tink.service.streaming.publisher/[android-jvm]-stream-subscription/index.md)  
More info  


Updates the [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.md) matching the credentialsId.



You can only update the value of a [Field](../../com.tink.model.misc/[android-jvm]-field/index.md) that is mutable.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.core.credentials/CredentialsRepository/update/#kotlin.String#kotlin.String#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]/PointingToDeclaration/"></a>fields| <a name="com.tink.link.core.credentials/CredentialsRepository/update/#kotlin.String#kotlin.String#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]/PointingToDeclaration/"></a><br><br>The map of [Field](../../com.tink.model.misc/[android-jvm]-field/index.md) name and value pairs for the [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.md)<br><br>
| <a name="com.tink.link.core.credentials/CredentialsRepository/update/#kotlin.String#kotlin.String#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]/PointingToDeclaration/"></a>statusChangeObserver| <a name="com.tink.link.core.credentials/CredentialsRepository/update/#kotlin.String#kotlin.String#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]/PointingToDeclaration/"></a><br><br>An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in [onNext](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-next.md), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via [onError](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-error.md). If the creation finished successfully, you will also receive a call to [onCompleted](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-completed.md), after which there will be no other calls to this stream observer.<br><br>
  
  



