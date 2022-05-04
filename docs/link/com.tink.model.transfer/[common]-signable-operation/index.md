---
title: [common]SignableOperation
---
//[link](../../../index.html)/[com.tink.model.transfer](../index.html)/[[common]SignableOperation](index.html)



# SignableOperation



[common]\
data class [SignableOperation](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val created: &lt;ERROR CLASS&gt;, val status: [SignableOperation.Status](-status/index.html), val statusMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [SignableOperation.Type](-type/index.html), val underlyingId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val updated: &lt;ERROR CLASS&gt;, val userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



## Constructors


| | |
|---|---|
| [SignableOperation](-signable-operation.html) | [common]<br>fun [SignableOperation](-signable-operation.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, created: &lt;ERROR CLASS&gt;, status: [SignableOperation.Status](-status/index.html), statusMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [SignableOperation.Type](-type/index.html), underlyingId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), updated: &lt;ERROR CLASS&gt;, userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Types


| Name | Summary |
|---|---|
| [Status](-status/index.html) | [common]<br>enum [Status](-status/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[SignableOperation.Status](-status/index.html)&gt; <br>The status of the operation. [CANCELLED](-status/-c-a-n-c-e-l-l-e-d/index.html), [FAILED](-status/-f-a-i-l-e-d/index.html) and [EXECUTED](-status/-e-x-e-c-u-t-e-d/index.html) are all endstates. |
| [Type](-type/index.html) | [common]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[SignableOperation.Type](-type/index.html)&gt; |


## Properties


| Name | Summary |
|---|---|
| [created](created.html) | [common]<br>val [created](created.html): &lt;ERROR CLASS&gt; |
| [credentialsId](credentials-id.html) | [common]<br>val [credentialsId](credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [id](id.html) | [common]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [status](status.html) | [common]<br>val [status](status.html): [SignableOperation.Status](-status/index.html) |
| [statusMessage](status-message.html) | [common]<br>val [statusMessage](status-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [type](type.html) | [common]<br>val [type](type.html): [SignableOperation.Type](-type/index.html) |
| [underlyingId](underlying-id.html) | [common]<br>val [underlyingId](underlying-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [updated](updated.html) | [common]<br>val [updated](updated.html): &lt;ERROR CLASS&gt; |
| [userId](user-id.html) | [common]<br>val [userId](user-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

