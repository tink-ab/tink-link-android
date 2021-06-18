---
title: Data -
---
//[link](../../../index.md)/[com.tink.model.insights](../../index.md)/[[androidJvm]InsightAction](../index.md)/[Data](index.md)



# Data  
 [androidJvm] sealed class [Data](index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

All subclasses should be data classes or provide a meaningful equals() function

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.insights/InsightAction.Data.Acknowledge///PointingToDeclaration/"></a>[Acknowledge](-acknowledge/index.md)| <a name="com.tink.model.insights/InsightAction.Data.Acknowledge///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [Acknowledge](-acknowledge/index.md) : [InsightAction.Data](index.md)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction.Data.CategorizeExpense///PointingToDeclaration/"></a>[CategorizeExpense](-categorize-expense/index.md)| <a name="com.tink.model.insights/InsightAction.Data.CategorizeExpense///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [CategorizeExpense](-categorize-expense/index.md)(**transactionId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [InsightAction.Data](index.md)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction.Data.CategorizeTransactions///PointingToDeclaration/"></a>[CategorizeTransactions](-categorize-transactions/index.md)| <a name="com.tink.model.insights/InsightAction.Data.CategorizeTransactions///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [CategorizeTransactions](-categorize-transactions/index.md)(**transactionIds**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>) : [InsightAction.Data](index.md)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction.Data.CreateBudget///PointingToDeclaration/"></a>[CreateBudget](-create-budget/index.md)| <a name="com.tink.model.insights/InsightAction.Data.CreateBudget///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [CreateBudget](-create-budget/index.md)(**budgetFilter**: [BudgetFilter](../../../com.tink.model.budget/index.md#%5Bcom.tink.model.budget%2FBudgetFilter%2F%2F%2FPointingToDeclaration%2F%5D%2FClasslikes%2F-586840090)?, **amount**: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.md)?, **periodicity**: [BudgetPeriodicity](../../../com.tink.model.budget/index.md#%5Bcom.tink.model.budget%2FBudgetPeriodicity%2F%2F%2FPointingToDeclaration%2F%5D%2FClasslikes%2F-586840090)?) : [InsightAction.Data](index.md)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction.Data.CreateTransfer///PointingToDeclaration/"></a>[CreateTransfer](-create-transfer/index.md)| <a name="com.tink.model.insights/InsightAction.Data.CreateTransfer///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [CreateTransfer](-create-transfer/index.md)(**sourceUri**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **destinationUri**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **amount**: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.md)?, **sourceAccountNumber**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **destinationAccountNumber**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) : [InsightAction.Data](index.md)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction.Data.Dismiss///PointingToDeclaration/"></a>[Dismiss](-dismiss/index.md)| <a name="com.tink.model.insights/InsightAction.Data.Dismiss///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [Dismiss](-dismiss/index.md) : [InsightAction.Data](index.md)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction.Data.NoData///PointingToDeclaration/"></a>[NoData](-no-data/index.md)| <a name="com.tink.model.insights/InsightAction.Data.NoData///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [NoData](-no-data/index.md) : [InsightAction.Data](index.md)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction.Data.ViewBudget///PointingToDeclaration/"></a>[ViewBudget](-view-budget/index.md)| <a name="com.tink.model.insights/InsightAction.Data.ViewBudget///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [ViewBudget](-view-budget/index.md)(**budgetId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **periodStartDate**: Instant) : [InsightAction.Data](index.md)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction.Data.ViewTransactions///PointingToDeclaration/"></a>[ViewTransactions](-view-transactions/index.md)| <a name="com.tink.model.insights/InsightAction.Data.ViewTransactions///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [ViewTransactions](-view-transactions/index.md)(**transactionIds**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>) : [InsightAction.Data](index.md)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction.Data.ViewTransactionsByCategory///PointingToDeclaration/"></a>[ViewTransactionsByCategory](-view-transactions-by-category/index.md)| <a name="com.tink.model.insights/InsightAction.Data.ViewTransactionsByCategory///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [ViewTransactionsByCategory](-view-transactions-by-category/index.md)(**transactionsByCategory**: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>>) : [InsightAction.Data](index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.model.insights/InsightAction.Data.NoData///PointingToDeclaration/"></a>InsightAction.Data
| <a name="com.tink.model.insights/InsightAction.Data.Acknowledge///PointingToDeclaration/"></a>InsightAction.Data
| <a name="com.tink.model.insights/InsightAction.Data.Dismiss///PointingToDeclaration/"></a>InsightAction.Data
| <a name="com.tink.model.insights/InsightAction.Data.ViewBudget///PointingToDeclaration/"></a>InsightAction.Data
| <a name="com.tink.model.insights/InsightAction.Data.CreateBudget///PointingToDeclaration/"></a>InsightAction.Data
| <a name="com.tink.model.insights/InsightAction.Data.CreateTransfer///PointingToDeclaration/"></a>InsightAction.Data
| <a name="com.tink.model.insights/InsightAction.Data.CategorizeExpense///PointingToDeclaration/"></a>InsightAction.Data
| <a name="com.tink.model.insights/InsightAction.Data.CategorizeTransactions///PointingToDeclaration/"></a>InsightAction.Data
| <a name="com.tink.model.insights/InsightAction.Data.ViewTransactions///PointingToDeclaration/"></a>InsightAction.Data
| <a name="com.tink.model.insights/InsightAction.Data.ViewTransactionsByCategory///PointingToDeclaration/"></a>InsightAction.Data

