---
title: [common]ErrorState
---
//[link](../../../index.html)/[com.tink.service.network](../index.html)/[[common]ErrorState](index.html)



# ErrorState



[common]\
data class [ErrorState](index.html)&lt;[T](index.html)&gt;(val errorMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [ResponseState](../[common]-response-state/index.html)&lt;[T](index.html)&gt;



## Constructors


| | |
|---|---|
| [ErrorState](-error-state.html) | [common]<br>fun [ErrorState](-error-state.html)(throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [ErrorState](-error-state.html) | [common]<br>fun [ErrorState](-error-state.html)(errorMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [errorMessage](error-message.html) | [common]<br>val [errorMessage](error-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |

