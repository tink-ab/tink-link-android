---
title: FailedToAddCredentials
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[common]TinkLinkError](../index.html)/[FailedToAddCredentials](index.html)



# FailedToAddCredentials



[common]\
data class [FailedToAddCredentials](index.html)(val errorsByCredentialsId: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [TinkLinkErrorInfo](../../[common]-tink-link-error-info/index.html)&gt;) : [TinkLinkError](../index.html)

Tink Link UI failed to add one or more credentials.



## Constructors


| | |
|---|---|
| [FailedToAddCredentials](-failed-to-add-credentials.html) | [common]<br>fun [FailedToAddCredentials](-failed-to-add-credentials.html)(errorsByCredentialsId: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [TinkLinkErrorInfo](../../[common]-tink-link-error-info/index.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [errorsByCredentialsId](errors-by-credentials-id.html) | [common]<br>val [errorsByCredentialsId](errors-by-credentials-id.html): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [TinkLinkErrorInfo](../../[common]-tink-link-error-info/index.html)&gt;<br>A map of failed credentials ids to [errors](../../[common]-tink-link-error-info/index.html) |

