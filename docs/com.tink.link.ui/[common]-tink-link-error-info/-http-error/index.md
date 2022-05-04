---
title: HttpError
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[common]TinkLinkErrorInfo](../index.html)/[HttpError](index.html)



# HttpError



[common]\
data class [HttpError](index.html)(val code: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TinkLinkErrorInfo](../index.html)

This represents an HTTP exception that may have occurred.



## Constructors


| | |
|---|---|
| [HttpError](-http-error.html) | [common]<br>fun [HttpError](-http-error.html)(code: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [code](code.html) | [common]<br>val [code](code.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The HTTP error code |
| [message](message.html) | [common]<br>open override val [message](message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The error message |

