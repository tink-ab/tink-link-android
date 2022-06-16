---
title: [common]Budget
---
//[link](../../../index.html)/[com.tink.model.budget](../index.html)/[[common]Budget](index.html)



# Budget



[common]\
class [Budget](index.html)



## Constructors


| | |
|---|---|
| [Budget](-budget.html) | [common]<br>fun [Budget](-budget.html)() |


## Types


| Name | Summary |
|---|---|
| [Period](-period/index.html) | [common]<br>data class [Period](-period/index.html)(val start: &lt;ERROR CLASS&gt;, val end: &lt;ERROR CLASS&gt;, val spentAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val budgetAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html)) |
| [Periodicity](-periodicity/index.html) | [common]<br>sealed class [Periodicity](-periodicity/index.html) |
| [Specification](-specification/index.html) | [common]<br>data class [Specification](-specification/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val created: &lt;ERROR CLASS&gt;, val amount: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val periodicity: [Budget.Periodicity](-periodicity/index.html), val archived: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val filter: [Budget.Specification.Filter](-specification/-filter/index.html)) |
| [Summary](-summary/index.html) | [common]<br>data class [Summary](-summary/index.html)(val budgetSpecification: [Budget.Specification](-specification/index.html), val budgetPeriod: [Budget.Period](-period/index.html)) |
| [Transaction](-transaction/index.html) | [common]<br>data class [Transaction](-transaction/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val amount: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val dispensableAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val categoryCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val date: &lt;ERROR CLASS&gt;) |

