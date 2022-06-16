---
title: Success
---
//[link](../../../../index.html)/[com.tink.link.core.credentials](../../index.html)/[[common]CredentialsStatus](../index.html)/[Success](index.html)



# Success



[common]\
data class [Success](index.html)(val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;&quot;, val credentials: [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html)) : [CredentialsStatus](../index.html)

The credentials were successfully created.



## Parameters


common

| | |
|---|---|
| message | a message containing details about the status. |
| credentials | the successfully created credentials |



## Constructors


| | |
|---|---|
| [Success](-success.html) | [common]<br>fun [Success](-success.html)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;&quot;, credentials: [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [credentials](credentials.html) | [common]<br>open override val [credentials](credentials.html): [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html) |
| [message](message.html) | [common]<br>val [message](message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

