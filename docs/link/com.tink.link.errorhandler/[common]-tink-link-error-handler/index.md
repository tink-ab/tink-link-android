---
title: [common]TinkLinkErrorHandler
---
//[link](../../../index.html)/[com.tink.link.errorhandler](../index.html)/[[common]TinkLinkErrorHandler](index.html)



# TinkLinkErrorHandler



[common]\
interface [TinkLinkErrorHandler](index.html)



## Functions


| Name | Summary |
|---|---|
| [handleHttpError](handle-http-error.html) | [common]<br>abstract fun [handleHttpError](handle-http-error.html)(errorCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), fatalErrorCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), fatalErrorMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), nonFatalErrorMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), t: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [handleInternalError](handle-internal-error.html) | [common]<br>abstract fun [handleInternalError](handle-internal-error.html)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Inheritors


| Name |
|---|
| TinkLinkReleaseErrorHandler |
| TinkLinkDebugErrorHandler |

