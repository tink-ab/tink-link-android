---
title: [common]BudgetCreateOrUpdateDescriptor
---
//[link](../../../index.html)/[com.tink.model.budget](../index.html)/[[common]BudgetCreateOrUpdateDescriptor](index.html)



# BudgetCreateOrUpdateDescriptor



[common]\
data class [BudgetCreateOrUpdateDescriptor](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val targetAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val filter: [Budget.Specification.Filter](../[common]-budget/-specification/-filter/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val periodicity: [Budget.Periodicity](../[common]-budget/-periodicity/index.html))

Descriptor for creating or updating a budget. If we have an id, it means we're updating an already existing budget.



## Constructors


| | |
|---|---|
| [BudgetCreateOrUpdateDescriptor](-budget-create-or-update-descriptor.html) | [common]<br>fun [BudgetCreateOrUpdateDescriptor](-budget-create-or-update-descriptor.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), targetAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html), filter: [Budget.Specification.Filter](../[common]-budget/-specification/-filter/index.html), description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, periodicity: [Budget.Periodicity](../[common]-budget/-periodicity/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [description](description.html) | [common]<br>val [description](description.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [filter](filter.html) | [common]<br>val [filter](filter.html): [Budget.Specification.Filter](../[common]-budget/-specification/-filter/index.html) |
| [id](id.html) | [common]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [name](name.html) | [common]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [periodicity](periodicity.html) | [common]<br>val [periodicity](periodicity.html): [Budget.Periodicity](../[common]-budget/-periodicity/index.html) |
| [targetAmount](target-amount.html) | [common]<br>val [targetAmount](target-amount.html): [Amount](../../com.tink.model.misc/[common]-amount/index.html) |

