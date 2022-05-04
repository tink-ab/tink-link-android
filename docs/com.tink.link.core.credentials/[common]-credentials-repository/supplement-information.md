---
title: supplementInformation
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[common]CredentialsRepository](index.html)/[supplementInformation](supplement-information.html)



# supplementInformation



[common]\
fun [supplementInformation](supplement-information.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), information: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, handler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)



Submits the supplemental information required to authenticate the [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html) matching the [credentialsId](supplement-information.html).



## Parameters


common

| | |
|---|---|
| information | The map of [Field](../../com.tink.model.misc/[common]-field/index.html) name and value pairs representing the supplemental information to be sent |
| handler | The [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html) for processing error and success callbacks |




