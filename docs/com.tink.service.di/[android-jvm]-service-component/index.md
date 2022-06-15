---
title: [androidJvm]ServiceComponent -
---
//[link](../../index.md)/[com.tink.service.di](../index.md)/[[androidJvm]ServiceComponent](index.md)



# ServiceComponent  
 [androidJvm] @Component(modules = [NetworkModule::class, ServiceModule::class])  
  
abstract class [ServiceComponent](index.md)   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.di/ServiceComponent.Builder///PointingToDeclaration/"></a>[Builder](-builder/index.md)| <a name="com.tink.service.di/ServiceComponent.Builder///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Component.Builder()  <br>  <br>interface [Builder](-builder/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.di/ServiceComponent/accountService/#/PointingToDeclaration/"></a>[accountService](account-service.md)| <a name="com.tink.service.di/ServiceComponent/accountService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [accountService](account-service.md): [AccountService](../../com.tink.service.account/[android-jvm]-account-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/budgetService/#/PointingToDeclaration/"></a>[budgetService](budget-service.md)| <a name="com.tink.service.di/ServiceComponent/budgetService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [budgetService](budget-service.md): [BudgetService](../../com.tink.service.budget/[android-jvm]-budget-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/categoryService/#/PointingToDeclaration/"></a>[categoryService](category-service.md)| <a name="com.tink.service.di/ServiceComponent/categoryService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [categoryService](category-service.md): [CategoryService](../../com.tink.service.category/[android-jvm]-category-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/consentService/#/PointingToDeclaration/"></a>[consentService](consent-service.md)| <a name="com.tink.service.di/ServiceComponent/consentService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [consentService](consent-service.md): [ConsentService](../../com.tink.service.consent/[android-jvm]-consent-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/credentialsService/#/PointingToDeclaration/"></a>[credentialsService](credentials-service.md)| <a name="com.tink.service.di/ServiceComponent/credentialsService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [credentialsService](credentials-service.md): [CredentialsService](../../com.tink.service.credentials/[android-jvm]-credentials-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/insightService/#/PointingToDeclaration/"></a>[insightService](insight-service.md)| <a name="com.tink.service.di/ServiceComponent/insightService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [insightService](insight-service.md): [InsightService](../../com.tink.service.insight/[android-jvm]-insight-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/periodService/#/PointingToDeclaration/"></a>[periodService](period-service.md)| <a name="com.tink.service.di/ServiceComponent/periodService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [periodService](period-service.md): [PeriodService](../../com.tink.service.time/[android-jvm]-period-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/providerService/#/PointingToDeclaration/"></a>[providerService](provider-service.md)| <a name="com.tink.service.di/ServiceComponent/providerService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [providerService](provider-service.md): [ProviderService](../../com.tink.service.provider/[android-jvm]-provider-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/statisticsService/#/PointingToDeclaration/"></a>[statisticsService](statistics-service.md)| <a name="com.tink.service.di/ServiceComponent/statisticsService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [statisticsService](statistics-service.md): [StatisticsService](../../com.tink.service.statistics/[android-jvm]-statistics-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/tinkConfiguration/#/PointingToDeclaration/"></a>[tinkConfiguration](tink-configuration.md)| <a name="com.tink.service.di/ServiceComponent/tinkConfiguration/#/PointingToDeclaration/"></a> [androidJvm] abstract val [tinkConfiguration](tink-configuration.md): [TinkConfiguration](../../com.tink.service.network/[android-jvm]-tink-configuration/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/transactionService/#/PointingToDeclaration/"></a>[transactionService](transaction-service.md)| <a name="com.tink.service.di/ServiceComponent/transactionService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [transactionService](transaction-service.md): [TransactionService](../../com.tink.service.transaction/[android-jvm]-transaction-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/transferService/#/PointingToDeclaration/"></a>[transferService](transfer-service.md)| <a name="com.tink.service.di/ServiceComponent/transferService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [transferService](transfer-service.md): [TransferService](../../com.tink.service.transfer/[android-jvm]-transfer-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/userEventBus/#/PointingToDeclaration/"></a>[userEventBus](user-event-bus.md)| <a name="com.tink.service.di/ServiceComponent/userEventBus/#/PointingToDeclaration/"></a> [androidJvm] abstract val [userEventBus](user-event-bus.md): [UserEventBus](../../com.tink.service.authentication/[android-jvm]-user-event-bus/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/userProfileService/#/PointingToDeclaration/"></a>[userProfileService](user-profile-service.md)| <a name="com.tink.service.di/ServiceComponent/userProfileService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [userProfileService](user-profile-service.md): [UserProfileService](../../com.tink.service.user/[android-jvm]-user-profile-service/index.md)   <br>
| <a name="com.tink.service.di/ServiceComponent/userService/#/PointingToDeclaration/"></a>[userService](user-service.md)| <a name="com.tink.service.di/ServiceComponent/userService/#/PointingToDeclaration/"></a> [androidJvm] abstract val [userService](user-service.md): [UserService](../../com.tink.service.authorization/[android-jvm]-user-service/index.md)   <br>

