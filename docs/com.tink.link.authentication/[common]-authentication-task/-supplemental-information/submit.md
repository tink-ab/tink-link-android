---
title: submit
---
//[link](../../../../index.html)/[com.tink.link.authentication](../../index.html)/[[common]AuthenticationTask](../index.html)/[SupplementalInformation](index.html)/[submit](submit.html)



# submit



[common]\
fun [submit](submit.html)(filledFields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, resultHandler: [ResultHandler](../../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)



Submit supplemental information for the authentication to Tink. Should be called as soon as the fields have been validated and the user is ready to send the information.



## Parameters


common

| | |
|---|---|
| filledFields | A key-value map of the supplemental information. The key should always be [Field.name](../../../com.tink.model.misc/[common]-field/name.html) from [fields](fields.html) and the value should be the user input of that field. |




