---
title: [common]TinkLinkErrorInfo
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[common]TinkLinkErrorInfo](index.html)



# TinkLinkErrorInfo



[common]\
sealed class [TinkLinkErrorInfo](index.html)

A wrapper class that provides information about the underlying error causing the [TinkLinkError](../[common]-tink-link-error/index.html)



## Types


| Name | Summary |
|---|---|
| [HttpError](-http-error/index.html) | [common]<br>data class [HttpError](-http-error/index.html)(val code: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TinkLinkErrorInfo](index.html)<br>This represents an HTTP exception that may have occurred. |
| [InternalError](-internal-error/index.html) | [common]<br>data class [InternalError](-internal-error/index.html)(val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TinkLinkErrorInfo](index.html)<br>This represents a generic error that may have occurred. |


## Properties


| Name | Summary |
|---|---|
| [message](message.html) | [common]<br>abstract val [message](message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The error message |


## Inheritors


| Name |
|---|
| HttpError |
| InternalError |

