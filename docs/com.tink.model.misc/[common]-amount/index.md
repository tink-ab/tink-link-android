---
title: [common]Amount
---
//[link](../../../index.html)/[com.tink.model.misc](../index.html)/[[common]Amount](index.html)



# Amount



[common]\
data class [Amount](index.html)(val value: [ExactNumber](../[common]-exact-number/index.html), val currencyCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



## Constructors


| | |
|---|---|
| [Amount](-amount.html) | [common]<br>fun [Amount](-amount.html)(value: [ExactNumber](../[common]-exact-number/index.html), currencyCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [currencyCode](currency-code.html) | [common]<br>val [currencyCode](currency-code.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [value](value.html) | [common]<br>val [value](value.html): [ExactNumber](../[common]-exact-number/index.html) |


## Extensions


| Name | Summary |
|---|---|
| toDto | [common, androidJvm]<br>[common]<br>fun [Amount](index.html).[toDto](../../com.tink.service.misc/[common]to-dto.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [Amount](../[android-jvm]-amount/index.html).[toDto](../../com.tink.service.misc/[android-jvm]to-dto.html)(): CurrencyDenominatedAmount |

