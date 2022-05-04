---
title: [androidJvm]ServiceComponent
---
//[link](../../../index.html)/[com.tink.service.di](../index.html)/[[androidJvm]ServiceComponent](index.html)



# ServiceComponent



[androidJvm]\
@Component(modules = [NetworkModule::class, ServiceModule::class])



abstract class [ServiceComponent](index.html)



## Constructors


| | |
|---|---|
| [ServiceComponent](-service-component.html) | [androidJvm]<br>fun [ServiceComponent](-service-component.html)() |


## Types


| Name | Summary |
|---|---|
| [Builder](-builder/index.html) | [androidJvm]<br>@Component.Builder<br>interface [Builder](-builder/index.html) |


## Properties


| Name | Summary |
|---|---|
| [accountService](account-service.html) | [androidJvm]<br>abstract val [accountService](account-service.html): [AccountService](../../com.tink.service.account/[android-jvm]-account-service/index.html) |
| [budgetService](budget-service.html) | [androidJvm]<br>abstract val [budgetService](budget-service.html): [BudgetService](../../com.tink.service.budget/[android-jvm]-budget-service/index.html) |
| [categoryService](category-service.html) | [androidJvm]<br>abstract val [categoryService](category-service.html): [CategoryService](../../com.tink.service.category/[android-jvm]-category-service/index.html) |
| [consentService](consent-service.html) | [androidJvm]<br>abstract val [consentService](consent-service.html): [ConsentService](../../com.tink.service.consent/[android-jvm]-consent-service/index.html) |
| [credentialsService](credentials-service.html) | [androidJvm]<br>abstract val [credentialsService](credentials-service.html): [CredentialsService](../../com.tink.service.credentials/[android-jvm]-credentials-service/index.html) |
| [insightService](insight-service.html) | [androidJvm]<br>abstract val [insightService](insight-service.html): [InsightService](../../com.tink.service.insight/[android-jvm]-insight-service/index.html) |
| [periodService](period-service.html) | [androidJvm]<br>abstract val [periodService](period-service.html): [PeriodService](../../com.tink.service.time/[android-jvm]-period-service/index.html) |
| [providerService](provider-service.html) | [androidJvm]<br>abstract val [providerService](provider-service.html): [ProviderService](../../com.tink.service.provider/[android-jvm]-provider-service/index.html) |
| [statisticsService](statistics-service.html) | [androidJvm]<br>abstract val [statisticsService](statistics-service.html): [StatisticsService](../../com.tink.service.statistics/[android-jvm]-statistics-service/index.html) |
| [tinkConfiguration](tink-configuration.html) | [androidJvm]<br>abstract val [tinkConfiguration](tink-configuration.html): [TinkConfiguration](../../com.tink.service.network/[android-jvm]-tink-configuration/index.html) |
| [transactionService](transaction-service.html) | [androidJvm]<br>abstract val [transactionService](transaction-service.html): [TransactionService](../../com.tink.service.transaction/[android-jvm]-transaction-service/index.html) |
| [transferService](transfer-service.html) | [androidJvm]<br>abstract val [transferService](transfer-service.html): [TransferService](../../com.tink.service.transfer/[android-jvm]-transfer-service/index.html) |
| [userEventBus](user-event-bus.html) | [androidJvm]<br>abstract val [userEventBus](user-event-bus.html): [UserEventBus](../../com.tink.service.authentication/[android-jvm]-user-event-bus/index.html) |
| [userProfileService](user-profile-service.html) | [androidJvm]<br>abstract val [userProfileService](user-profile-service.html): [UserProfileService](../../com.tink.service.user/[android-jvm]-user-profile-service/index.html) |
| [userService](user-service.html) | [androidJvm]<br>abstract val [userService](user-service.html): [UserService](../../com.tink.service.authorization/[android-jvm]-user-service/index.html) |

