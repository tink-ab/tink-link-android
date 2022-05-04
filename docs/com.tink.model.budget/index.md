---
title: com.tink.model.budget
---
//[link](../../index.html)/[com.tink.model.budget](index.html)



# Package com.tink.model.budget



## Types


| Name | Summary |
|---|---|
| Budget | [common, androidJvm]<br>[common]<br>class [Budget]([common]-budget/index.html)<br>[androidJvm]<br>class [Budget]([android-jvm]-budget/index.html) |
| BudgetCreateOrUpdateDescriptor | [common, androidJvm]<br>[common]<br>data class [BudgetCreateOrUpdateDescriptor]([common]-budget-create-or-update-descriptor/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val targetAmount: [Amount](../com.tink.model.misc/[common]-amount/index.html), val filter: [Budget.Specification.Filter]([common]-budget/-specification/-filter/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val periodicity: [Budget.Periodicity]([common]-budget/-periodicity/index.html))<br>[androidJvm]<br>data class [BudgetCreateOrUpdateDescriptor]([android-jvm]-budget-create-or-update-descriptor/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val targetAmount: [Amount](../com.tink.model.misc/[android-jvm]-amount/index.html), val filter: [Budget.Specification.Filter]([android-jvm]-budget/-specification/-filter/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val periodicity: [Budget.Periodicity]([android-jvm]-budget/-periodicity/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>Descriptor for creating or updating a budget. If we have an id, it means we're updating an already existing budget. |
| BudgetFilter | [common, androidJvm]<br>[common]<br>typealias BudgetFilter = Budget.Specification.Filtertypealias BudgetFilter = Budget.Specification.Filtertypealias BudgetFilter = Budget.Specification.Filtertypealias BudgetFilter = Budget.Specification.Filter<br>[androidJvm]<br>typealias BudgetFilter = Budget.Specification.Filtertypealias BudgetFilter = Budget.Specification.Filtertypealias BudgetFilter = Budget.Specification.Filter |
| BudgetPeriod | [common, androidJvm]<br>[common]<br>typealias BudgetPeriod = Budget.Periodtypealias BudgetPeriod = Budget.Periodtypealias BudgetPeriod = Budget.Periodtypealias BudgetPeriod = Budget.Period<br>[androidJvm]<br>typealias BudgetPeriod = Budget.Periodtypealias BudgetPeriod = Budget.Periodtypealias BudgetPeriod = Budget.Period |
| BudgetPeriodicity | [common, androidJvm]<br>[common]<br>typealias BudgetPeriodicity = Budget.Periodicitytypealias BudgetPeriodicity = Budget.Periodicitytypealias BudgetPeriodicity = Budget.Periodicitytypealias BudgetPeriodicity = Budget.Periodicity<br>[androidJvm]<br>typealias BudgetPeriodicity = Budget.Periodicitytypealias BudgetPeriodicity = Budget.Periodicitytypealias BudgetPeriodicity = Budget.Periodicity |
| BudgetSpecification | [common, androidJvm]<br>[common]<br>typealias BudgetSpecification = Budget.Specificationtypealias BudgetSpecification = Budget.Specificationtypealias BudgetSpecification = Budget.Specificationtypealias BudgetSpecification = Budget.Specification<br>[androidJvm]<br>typealias BudgetSpecification = Budget.Specificationtypealias BudgetSpecification = Budget.Specificationtypealias BudgetSpecification = Budget.Specification |
| BudgetSummary | [common, androidJvm]<br>[common]<br>typealias BudgetSummary = Budget.Summarytypealias BudgetSummary = Budget.Summarytypealias BudgetSummary = Budget.Summarytypealias BudgetSummary = Budget.Summary<br>[androidJvm]<br>typealias BudgetSummary = Budget.Summarytypealias BudgetSummary = Budget.Summarytypealias BudgetSummary = Budget.Summary |
| BudgetTransaction | [common, androidJvm]<br>[common]<br>typealias BudgetTransaction = Budget.Transactiontypealias BudgetTransaction = Budget.Transactiontypealias BudgetTransaction = Budget.Transactiontypealias BudgetTransaction = Budget.Transaction<br>[androidJvm]<br>typealias BudgetTransaction = Budget.Transactiontypealias BudgetTransaction = Budget.Transactiontypealias BudgetTransaction = Budget.Transaction |
| OneOffPeriodicity | [common, androidJvm]<br>[common]<br>typealias OneOffPeriodicity = Budget.Periodicity.OneOfftypealias OneOffPeriodicity = Budget.Periodicity.OneOfftypealias OneOffPeriodicity = Budget.Periodicity.OneOfftypealias OneOffPeriodicity = Budget.Periodicity.OneOff<br>[androidJvm]<br>typealias OneOffPeriodicity = Budget.Periodicity.OneOfftypealias OneOffPeriodicity = Budget.Periodicity.OneOfftypealias OneOffPeriodicity = Budget.Periodicity.OneOff |
| RecurringPeriodicity | [common, androidJvm]<br>[common]<br>typealias RecurringPeriodicity = Budget.Periodicity.Recurringtypealias RecurringPeriodicity = Budget.Periodicity.Recurringtypealias RecurringPeriodicity = Budget.Periodicity.Recurringtypealias RecurringPeriodicity = Budget.Periodicity.Recurring<br>[androidJvm]<br>typealias RecurringPeriodicity = Budget.Periodicity.Recurringtypealias RecurringPeriodicity = Budget.Periodicity.Recurringtypealias RecurringPeriodicity = Budget.Periodicity.Recurring |

