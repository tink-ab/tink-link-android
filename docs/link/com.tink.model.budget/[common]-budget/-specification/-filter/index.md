---
title: Filter
---
//[link](../../../../../index.html)/[com.tink.model.budget](../../../index.html)/[[common]Budget](../../index.html)/[Specification](../index.html)/[Filter](index.html)



# Filter



[common]\
data class [Filter](index.html)(val accounts: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Account](-account/index.html)&gt;, val categories: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Category](-category/index.html)&gt;, val tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Tag](-tag/index.html)&gt;, val freeTextQuery: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



## Constructors


| | |
|---|---|
| [Filter](-filter.html) | [common]<br>fun [Filter](-filter.html)(accounts: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Account](-account/index.html)&gt;, categories: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Category](-category/index.html)&gt;, tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Tag](-tag/index.html)&gt;, freeTextQuery: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Types


| Name | Summary |
|---|---|
| [Account](-account/index.html) | [common]<br>data class [Account](-account/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [Category](-category/index.html) | [common]<br>data class [Category](-category/index.html)(val code: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [Tag](-tag/index.html) | [common]<br>data class [Tag](-tag/index.html)(val key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [accounts](accounts.html) | [common]<br>val [accounts](accounts.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Account](-account/index.html)&gt; |
| [categories](categories.html) | [common]<br>val [categories](categories.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Category](-category/index.html)&gt; |
| [freeTextQuery](free-text-query.html) | [common]<br>val [freeTextQuery](free-text-query.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [tags](tags.html) | [common]<br>val [tags](tags.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Tag](-tag/index.html)&gt; |


## Extensions


| Name | Summary |
|---|---|
| toDto | [common, androidJvm]<br>[common]<br>fun [Budget.Specification.Filter](index.html).[toDto](../../../../com.tink.service.budget/[common]to-dto.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [Budget.Specification.Filter](../../../[android-jvm]-budget/-specification/-filter/index.html).[toDto](../../../../com.tink.service.budget/[android-jvm]to-dto.html)(): Filter |

