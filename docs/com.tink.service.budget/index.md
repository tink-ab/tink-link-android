---
title: com.tink.service.budget -
---
//[link](../index.md)/[com.tink.service.budget](index.md)



# Package com.tink.service.budget  


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.budget/BudgetService///PointingToDeclaration/"></a>BudgetService| <a name="com.tink.service.budget/BudgetService///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>interface [BudgetService]([common]-budget-service/index.md)  <br>[androidJvm]  <br>interface [BudgetService]([android-jvm]-budget-service/index.md)  <br><br><br>
| <a name="com.tink.service.budget/BudgetServiceImpl///PointingToDeclaration/"></a>BudgetServiceImpl| <a name="com.tink.service.budget/BudgetServiceImpl///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>class [BudgetServiceImpl]([common]-budget-service-impl/index.md)constructor(**api**: <ERROR CLASS>) : [BudgetService]([common]-budget-service/index.md)  <br>[androidJvm]  <br>class [BudgetServiceImpl]([android-jvm]-budget-service-impl/index.md)@Inject()constructor(**api**: BudgetApi) : [BudgetService]([android-jvm]-budget-service/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.budget//toCoreModel/#/PointingToDeclaration/"></a>toCoreModel| <a name="com.tink.service.budget//toCoreModel/#/PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>fun <ERROR CLASS>.[toCoreModel]([common]to-core-model.md)(): <ERROR CLASS>  <br>[common]  <br>fun <ERROR CLASS>.[toCoreModel]([common]to-core-model.md)(): [BudgetSpecification](../com.tink.model.budget/index.md#%5Bcom.tink.model.budget%2FBudgetSpecification%2F%2F%2FPointingToDeclaration%2F%5D%2FClasslikes%2F1647702525)  <br>[androidJvm]  <br>fun Budget.[toCoreModel]([android-jvm]to-core-model.md)(): [BudgetSpecification](../com.tink.model.budget/index.md#%5Bcom.tink.model.budget%2FBudgetSpecification%2F%2F%2FPointingToDeclaration%2F%5D%2FClasslikes%2F-586840090)  <br>[androidJvm]  <br>fun BudgetSummary.[toCoreModel]([android-jvm]to-core-model.md)(): [Budget.Summary](../com.tink.model.budget/[android-jvm]-budget/-summary/index.md)  <br>[androidJvm]  <br>fun BudgetTransaction.[toCoreModel]([android-jvm]to-core-model.md)(): [Budget.Transaction](../com.tink.model.budget/[android-jvm]-budget/-transaction/index.md)  <br>[androidJvm]  <br>fun Filter.[toCoreModel]([android-jvm]to-core-model.md)(): [Budget.Specification.Filter](../com.tink.model.budget/[android-jvm]-budget/-specification/-filter/index.md)  <br>[common]  <br>fun <ERROR CLASS>.[toCoreModel](to-core-model.md)(budgetAmount: [Amount](../com.tink.model.misc/[common]-amount/index.md)): <ERROR CLASS>  <br>[androidJvm]  <br>fun BudgetPeriod.[toCoreModel]([android-jvm]to-core-model.md)(budgetAmount: [Amount](../com.tink.model.misc/[android-jvm]-amount/index.md)): [Budget.Period](../com.tink.model.budget/[android-jvm]-budget/-period/index.md)  <br><br><br>
| <a name="com.tink.service.budget//toDto/com.tink.model.budget.Budget.Periodicity.OneOff#/PointingToDeclaration/"></a>toDto| <a name="com.tink.service.budget//toDto/com.tink.model.budget.Budget.Periodicity.OneOff#/PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>fun [OneOffPeriodicity](../com.tink.model.budget/index.md#%5Bcom.tink.model.budget%2FOneOffPeriodicity%2F%2F%2FPointingToDeclaration%2F%5D%2FClasslikes%2F1647702525).[toDto]([common]to-dto.md)(): <ERROR CLASS>  <br>[androidJvm]  <br>fun [OneOffPeriodicity](../com.tink.model.budget/index.md#%5Bcom.tink.model.budget%2FOneOffPeriodicity%2F%2F%2FPointingToDeclaration%2F%5D%2FClasslikes%2F-586840090).[toDto]([android-jvm]to-dto.md)(): OneOffPeriodicity  <br>[common]  <br>fun [RecurringPeriodicity](../com.tink.model.budget/index.md#%5Bcom.tink.model.budget%2FRecurringPeriodicity%2F%2F%2FPointingToDeclaration%2F%5D%2FClasslikes%2F1647702525).[toDto]([common]to-dto.md)(): <ERROR CLASS>  <br>[androidJvm]  <br>fun [RecurringPeriodicity](../com.tink.model.budget/index.md#%5Bcom.tink.model.budget%2FRecurringPeriodicity%2F%2F%2FPointingToDeclaration%2F%5D%2FClasslikes%2F-586840090).[toDto]([android-jvm]to-dto.md)(): RecurringPeriodicity  <br>[common]  <br>fun [Budget.Specification.Filter](../com.tink.model.budget/[common]-budget/-specification/-filter/index.md).[toDto]([common]to-dto.md)(): <ERROR CLASS>  <br>[androidJvm]  <br>fun [Budget.Specification.Filter](../com.tink.model.budget/[android-jvm]-budget/-specification/-filter/index.md).[toDto]([android-jvm]to-dto.md)(): Filter  <br><br><br>

