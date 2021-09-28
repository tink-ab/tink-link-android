---
title: create -
---
//[link](../../index.md)/[com.tink.link.core.credentials](../index.md)/[[common]CredentialsRepository](index.md)/[create](create.md)



# create  
[common]  
Content  
fun [create](create.md)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsType: [Credentials.Type](../../com.tink.model.credentials/[common]-credentials/-type/index.md), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.md)<[CredentialsStatus](../[common]-credentials-status/index.md)>, items: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[RefreshableItem](../../com.tink.model.credentials/[common]-refreshable-item/index.md)>? = null): [StreamSubscription](../../com.tink.service.streaming.publisher/[common]-stream-subscription/index.md)  
More info  


Creates a new [Credentials](../../com.tink.model.credentials/[common]-credentials/index.md) object.



## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.core.credentials/CredentialsRepository/create/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]#kotlin.collections.Set[com.tink.model.credentials.RefreshableItem]?/PointingToDeclaration/"></a>providerName| <a name="com.tink.link.core.credentials/CredentialsRepository/create/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]#kotlin.collections.Set[com.tink.model.credentials.RefreshableItem]?/PointingToDeclaration/"></a><br><br>Identifier for the [Provider](../../com.tink.model.provider/[common]-provider/index.md). See [Provider.name](../../com.tink.model.provider/[common]-provider/name.md)<br><br>
| <a name="com.tink.link.core.credentials/CredentialsRepository/create/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]#kotlin.collections.Set[com.tink.model.credentials.RefreshableItem]?/PointingToDeclaration/"></a>credentialsType| <a name="com.tink.link.core.credentials/CredentialsRepository/create/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]#kotlin.collections.Set[com.tink.model.credentials.RefreshableItem]?/PointingToDeclaration/"></a><br><br>The [Credentials.Type](../../com.tink.model.credentials/[common]-credentials/-type/index.md) used to authenticate the user to the financial institution<br><br>
| <a name="com.tink.link.core.credentials/CredentialsRepository/create/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]#kotlin.collections.Set[com.tink.model.credentials.RefreshableItem]?/PointingToDeclaration/"></a>fields| <a name="com.tink.link.core.credentials/CredentialsRepository/create/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]#kotlin.collections.Set[com.tink.model.credentials.RefreshableItem]?/PointingToDeclaration/"></a><br><br>The map of [Field](../../com.tink.model.misc/[common]-field/index.md) name and value pairs for the [Provider](../../com.tink.model.provider/[common]-provider/index.md)<br><br>
| <a name="com.tink.link.core.credentials/CredentialsRepository/create/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]#kotlin.collections.Set[com.tink.model.credentials.RefreshableItem]?/PointingToDeclaration/"></a>statusChangeObserver| <a name="com.tink.link.core.credentials/CredentialsRepository/create/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]#kotlin.collections.Set[com.tink.model.credentials.RefreshableItem]?/PointingToDeclaration/"></a><br><br>An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in [onNext](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-next.md), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via [onError](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-error.md). If the creation finished successfully, you will also receive a call to [onCompleted](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-completed.md), after which there will be no other calls to this stream observer.<br><br>
| <a name="com.tink.link.core.credentials/CredentialsRepository/create/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]#kotlin.collections.Set[com.tink.model.credentials.RefreshableItem]?/PointingToDeclaration/"></a>items| <a name="com.tink.link.core.credentials/CredentialsRepository/create/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.streaming.publisher.StreamObserver[com.tink.link.core.credentials.CredentialsStatus]#kotlin.collections.Set[com.tink.model.credentials.RefreshableItem]?/PointingToDeclaration/"></a><br><br>A list of [RefreshableItem](../../com.tink.model.credentials/[common]-refreshable-item/index.md) representing the data types to aggregate from the provider. If omitted, all data types are aggregated.<br><br>
  
  



