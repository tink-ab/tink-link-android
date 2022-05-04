---
title: [common]ExactNumber
---
//[link](../../../index.html)/[com.tink.model.misc](../index.html)/[[common]ExactNumber](index.html)



# ExactNumber



[common]\
data class [ExactNumber](index.html)(val unscaledValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val scale: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)&lt;[ExactNumber](index.html)&gt;



## Constructors


| | |
|---|---|
| [ExactNumber](-exact-number.html) | [common]<br>fun [ExactNumber](-exact-number.html)(double: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) |
| [ExactNumber](-exact-number.html) | [common]<br>fun [ExactNumber](-exact-number.html)(long: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |
| [ExactNumber](-exact-number.html) | [common]<br>fun [ExactNumber](-exact-number.html)(bigDecimal: &lt;ERROR CLASS&gt;) |
| [ExactNumber](-exact-number.html) | [common]<br>fun [ExactNumber](-exact-number.html)(unscaledValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), scale: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [compareTo](compare-to.html) | [common]<br>open operator override fun [compareTo](compare-to.html)(other: [ExactNumber](index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toBigDecimal](to-big-decimal.html) | [common]<br>fun [toBigDecimal](to-big-decimal.html)(): &lt;ERROR CLASS&gt; |


## Properties


| Name | Summary |
|---|---|
| [scale](scale.html) | [common]<br>val [scale](scale.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [unscaledValue](unscaled-value.html) | [common]<br>val [unscaledValue](unscaled-value.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

