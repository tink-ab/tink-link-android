---
title: Loading
---
//[link](../../../../index.html)/[com.tink.link.core.credentials](../../index.html)/[[common]CredentialsStatus](../index.html)/[Loading](index.html)



# Loading



[common]\
data class [Loading](index.html)(val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val credentials: [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html)? = null) : [CredentialsStatus](../index.html)

The creation is being processed by Tink. There is currently no user action required.



## Parameters


common

| | |
|---|---|
| message | a message containing details about the status. |
| credentials | the credentials being processed, if available |



## Constructors


| | |
|---|---|
| [Loading](-loading.html) | [common]<br>fun [Loading](-loading.html)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, credentials: [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [credentials](credentials.html) | [common]<br>open override val [credentials](credentials.html): [Credentials](../../../com.tink.model.credentials/[common]-credentials/index.html)? = null |
| [message](message.html) | [common]<br>val [message](message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |

