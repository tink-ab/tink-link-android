---
title: com.tink.service.budget
---
//[link](../../index.html)/[com.tink.service.budget](index.html)



# Package com.tink.service.budget



## Types


| Name | Summary |
|---|---|
| BudgetService | [common, androidJvm]<br>[common]<br>interface [BudgetService]([common]-budget-service/index.html)<br>[androidJvm]<br>interface [BudgetService]([android-jvm]-budget-service/index.html) |
| BudgetServiceImpl | [common, androidJvm]<br>[common]<br>class [BudgetServiceImpl]([common]-budget-service-impl/index.html)constructor(val api: &lt;ERROR CLASS&gt;) : [BudgetService]([common]-budget-service/index.html)<br>[androidJvm]<br>class [BudgetServiceImpl]([android-jvm]-budget-service-impl/index.html)@Injectconstructor(val api: BudgetApi) : [BudgetService]([android-jvm]-budget-service/index.html) |


## Functions


| Name | Summary |
|---|---|
| toCoreModel | [common, androidJvm]<br>[common]<br>fun &lt;ERROR CLASS&gt;.[toCoreModel]([common]to-core-model.html)(): [BudgetSpecification](../com.tink.model.budget/index.html#1357535401%2FClasslikes%2F-1713223439)<br>[common]<br>fun &lt;ERROR CLASS&gt;.[toCoreModel]([common]to-core-model.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun Budget.[toCoreModel]([android-jvm]to-core-model.html)(): [BudgetSpecification](../com.tink.model.budget/index.html#1357535401%2FClasslikes%2F-812656150)<br>[androidJvm]<br>fun BudgetSummary.[toCoreModel]([android-jvm]to-core-model.html)(): [Budget.Summary](../com.tink.model.budget/[android-jvm]-budget/-summary/index.html)<br>[androidJvm]<br>fun BudgetTransaction.[toCoreModel]([android-jvm]to-core-model.html)(): [Budget.Transaction](../com.tink.model.budget/[android-jvm]-budget/-transaction/index.html)<br>[androidJvm]<br>fun Filter.[toCoreModel]([android-jvm]to-core-model.html)(): [Budget.Specification.Filter](../com.tink.model.budget/[android-jvm]-budget/-specification/-filter/index.html)<br>[common]<br>fun &lt;ERROR CLASS&gt;.[toCoreModel]([common]to-core-model.html)(budgetAmount: [Amount](../com.tink.model.misc/[common]-amount/index.html)): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun BudgetPeriod.[toCoreModel]([android-jvm]to-core-model.html)(budgetAmount: [Amount](../com.tink.model.misc/[android-jvm]-amount/index.html)): [Budget.Period](../com.tink.model.budget/[android-jvm]-budget/-period/index.html) |
| toDto | [common, androidJvm]<br>[common]<br>fun [OneOffPeriodicity](../com.tink.model.budget/index.html#668268061%2FClasslikes%2F-1713223439).[toDto]([common]to-dto.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [OneOffPeriodicity](../com.tink.model.budget/index.html#668268061%2FClasslikes%2F-812656150).[toDto]([android-jvm]to-dto.html)(): OneOffPeriodicity<br>[common]<br>fun [RecurringPeriodicity](../com.tink.model.budget/index.html#-420361691%2FClasslikes%2F-1713223439).[toDto]([common]to-dto.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [RecurringPeriodicity](../com.tink.model.budget/index.html#-420361691%2FClasslikes%2F-812656150).[toDto]([android-jvm]to-dto.html)(): RecurringPeriodicity<br>[common]<br>fun [Budget.Specification.Filter](../com.tink.model.budget/[common]-budget/-specification/-filter/index.html).[toDto]([common]to-dto.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [Budget.Specification.Filter](../com.tink.model.budget/[android-jvm]-budget/-specification/-filter/index.html).[toDto]([android-jvm]to-dto.html)(): Filter |

