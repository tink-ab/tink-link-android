---
title: Specification
---
//[link](../../../../index.html)/[com.tink.model.budget](../../index.html)/[[common]Budget](../index.html)/[Specification](index.html)



# Specification



[common]\
data class [Specification](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val created: &lt;ERROR CLASS&gt;, val amount: [Amount](../../../com.tink.model.misc/[common]-amount/index.html), val periodicity: [Budget.Periodicity](../-periodicity/index.html), val archived: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val filter: [Budget.Specification.Filter](-filter/index.html))



## Constructors


| | |
|---|---|
| [Specification](-specification.html) | [common]<br>fun [Specification](-specification.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), created: &lt;ERROR CLASS&gt;, amount: [Amount](../../../com.tink.model.misc/[common]-amount/index.html), periodicity: [Budget.Periodicity](../-periodicity/index.html), archived: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), filter: [Budget.Specification.Filter](-filter/index.html)) |


## Types


| Name | Summary |
|---|---|
| [Filter](-filter/index.html) | [common]<br>data class [Filter](-filter/index.html)(val accounts: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Account](-filter/-account/index.html)&gt;, val categories: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Category](-filter/-category/index.html)&gt;, val tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Tag](-filter/-tag/index.html)&gt;, val freeTextQuery: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [amount](amount.html) | [common]<br>val [amount](amount.html): [Amount](../../../com.tink.model.misc/[common]-amount/index.html) |
| [archived](archived.html) | [common]<br>val [archived](archived.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [created](created.html) | [common]<br>val [created](created.html): &lt;ERROR CLASS&gt; |
| [filter](filter.html) | [common]<br>val [filter](filter.html): [Budget.Specification.Filter](-filter/index.html) |
| [id](id.html) | [common]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.html) | [common]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [periodicity](periodicity.html) | [common]<br>val [periodicity](periodicity.html): [Budget.Periodicity](../-periodicity/index.html) |

