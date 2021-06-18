---
title: [common]Budget -
---
//[link](../../index.md)/[com.tink.model.budget](../index.md)/[[common]Budget](index.md)



# Budget  
 [common] class [Budget](index.md)   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.budget/Budget.Period///PointingToDeclaration/"></a>[Period](-period/index.md)| <a name="com.tink.model.budget/Budget.Period///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Period](-period/index.md)(**start**: <ERROR CLASS>, **end**: <ERROR CLASS>, **spentAmount**: [Amount](../../com.tink.model.misc/[common]-amount/index.md), **budgetAmount**: [Amount](../../com.tink.model.misc/[common]-amount/index.md))  <br><br><br>
| <a name="com.tink.model.budget/Budget.Periodicity///PointingToDeclaration/"></a>[Periodicity](-periodicity/index.md)| <a name="com.tink.model.budget/Budget.Periodicity///PointingToDeclaration/"></a>[common]  <br>Content  <br>sealed class [Periodicity](-periodicity/index.md)  <br><br><br>
| <a name="com.tink.model.budget/Budget.Specification///PointingToDeclaration/"></a>[Specification](-specification/index.md)| <a name="com.tink.model.budget/Budget.Specification///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Specification](-specification/index.md)(**id**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **created**: <ERROR CLASS>, **amount**: [Amount](../../com.tink.model.misc/[common]-amount/index.md), **periodicity**: [Budget.Periodicity](-periodicity/index.md), **archived**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **filter**: [Budget.Specification.Filter](-specification/-filter/index.md))  <br><br><br>
| <a name="com.tink.model.budget/Budget.Summary///PointingToDeclaration/"></a>[Summary](-summary/index.md)| <a name="com.tink.model.budget/Budget.Summary///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Summary](-summary/index.md)(**budgetSpecification**: [Budget.Specification](-specification/index.md), **budgetPeriod**: [Budget.Period](-period/index.md))  <br><br><br>
| <a name="com.tink.model.budget/Budget.Transaction///PointingToDeclaration/"></a>[Transaction](-transaction/index.md)| <a name="com.tink.model.budget/Budget.Transaction///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Transaction](-transaction/index.md)(**id**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **accountId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **amount**: [Amount](../../com.tink.model.misc/[common]-amount/index.md), **dispensableAmount**: [Amount](../../com.tink.model.misc/[common]-amount/index.md), **categoryCode**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **description**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **date**: <ERROR CLASS>)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

