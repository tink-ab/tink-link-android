---
title: Loading
---
//[link](../../../../index.html)/[com.tink.link.core.credentials](../../index.html)/[[androidJvm]CredentialsStatus](../index.html)/[Loading](index.html)



# Loading



[androidJvm]\
data class [Loading](index.html)(val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;&quot;, val credentials: Credentials? = null) : [CredentialsStatus](../index.html)

The creation is being processed by Tink. There is currently no user action required.



## Parameters


androidJvm

| | |
|---|---|
| message | a message containing details about the status. |
| credentials | the credentials being processed, if available |



## Constructors


| | |
|---|---|
| [Loading](-loading.html) | [androidJvm]<br>fun [Loading](-loading.html)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;&quot;, credentials: Credentials? = null) |


## Properties


| Name | Summary |
|---|---|
| [credentials](credentials.html) | [androidJvm]<br>open override val [credentials](credentials.html): Credentials? = null |
| [message](message.html) | [androidJvm]<br>val [message](message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

