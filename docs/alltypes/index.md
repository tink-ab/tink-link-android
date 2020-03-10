

### All Types

| Name | Summary |
|---|---|
|

##### [com.tink.model.account.Account](../com.tink.model.account/-account/index.md)


|

##### [com.tink.service.account.AccountService](../com.tink.service.account/-account-service/index.md)


|

##### [com.tink.model.misc.Amount](../com.tink.model.misc/-amount/index.md)


|

##### [com.tink.model.relations.AmountByCategory](../com.tink.model.relations/-amount-by-category/index.md)


|

##### [com.tink.model.authentication.AuthenticationMethod](../com.tink.model.authentication/-authentication-method/index.md)


|

##### [com.tink.service.authentication.AuthenticationService](../com.tink.service.authentication/-authentication-service/index.md)


|

##### [com.tink.service.authentication.user.Authorization](../com.tink.service.authentication.user/-authorization/index.md)


|

##### [com.tink.model.budget.Budget](../com.tink.model.budget/-budget/index.md)


|

##### [com.tink.model.budget.BudgetCreateOrUpdateDescriptor](../com.tink.model.budget/-budget-create-or-update-descriptor/index.md)

Descriptor for creating or updating a budget.
If we have an id, it means we're updating an already existing budget.


|

##### [com.tink.model.budget.BudgetPeriod](../com.tink.model.budget/-budget-period.md)


|

##### [com.tink.model.budget.BudgetSpecification](../com.tink.model.budget/-budget-specification.md)


|

##### [com.tink.model.budget.BudgetSummary](../com.tink.model.budget/-budget-summary.md)


|

##### [com.tink.model.budget.BudgetTransaction](../com.tink.model.budget/-budget-transaction.md)


|

##### [com.tink.model.category.Category](../com.tink.model.category/-category/index.md)


|

##### [com.tink.model.category.CategoryTree](../com.tink.model.category/-category-tree/index.md)


|

##### [com.tink.service.observer.ChangeObserver](../com.tink.service.observer/-change-observer/index.md)


|

##### [com.tink.service.network.ChannelConnector](../com.tink.service.network/-channel-connector/index.md)


|

##### [com.tink.link.consent.ConsentContext](../com.tink.link.consent/-consent-context/index.md)

Context for handling things around user consent.


|

##### [com.tink.service.consent.ConsentService](../com.tink.service.consent/-consent-service/index.md)


|

##### [com.tink.service.consent.ConsentServiceImpl](../com.tink.service.consent/-consent-service-impl/index.md)


|

##### [com.tink.model.credential.Credential](../com.tink.model.credential/-credential/index.md)

This model represents how users are connected to a [Provider](../com.tink.model.provider/-provider/index.md) to access their financial data.


|

##### [com.tink.service.credential.CredentialCreationDescriptor](../com.tink.service.credential/-credential-creation-descriptor/index.md)


|

##### [com.tink.link.core.credentials.CredentialRepository](../com.tink.link.core.credentials/-credential-repository/index.md)

Repository for creating, accessing and modifying credentials.


|

##### [com.tink.service.credential.CredentialService](../com.tink.service.credential/-credential-service/index.md)


|

##### [com.tink.service.credential.CredentialServiceImpl](../com.tink.service.credential/-credential-service-impl/index.md)


|

##### [com.tink.service.credential.CredentialUpdateDescriptor](../com.tink.service.credential/-credential-update-descriptor/index.md)


|

##### [com.tink.model.time.DayPeriod](../com.tink.model.time/-day-period/index.md)


|

##### [com.tink.service.network.Environment](../com.tink.service.network/-environment/index.md)


|

##### [com.tink.model.misc.ExactNumber](../com.tink.model.misc/-exact-number/index.md)


|

##### [com.tink.model.misc.Field](../com.tink.model.misc/-field/index.md)

This model represents a specific input, usually as a text field) that the user needs to fill during the authentication flow.


|

##### [com.tink.model.Images](../com.tink.model/-images/index.md)


|

##### [com.tink.model.insights.Insight](../com.tink.model.insights/-insight/index.md)


|

##### [com.tink.model.insights.InsightAction](../com.tink.model.insights/-insight-action/index.md)


|

##### [com.tink.model.insights.InsightData](../com.tink.model.insights/-insight-data/index.md)

All subclasses should be data classes or provide a meaningful `equals()` function


|

##### [com.tink.model.insights.InsightState](../com.tink.model.insights/-insight-state/index.md)


|

##### [com.tink.model.insights.InsightType](../com.tink.model.insights/-insight-type/index.md)


| (extensions in package com.tink.model.provider)

##### [kotlin.collections.List](../com.tink.model.provider/kotlin.collections.-list/index.md)


| (extensions in package com.tink.service.misc)

##### [kotlin.collections.List](../com.tink.service.misc/kotlin.collections.-list/index.md)


|

##### [com.tink.model.time.MonthPeriod](../com.tink.model.time/-month-period/index.md)


|

##### [com.tink.service.network.NetworkModule](../com.tink.service.network/-network-module/index.md)


|

##### [com.tink.model.budget.OneOffPeriodicity](../com.tink.model.budget/-one-off-periodicity.md)


|

##### [com.tink.model.insights.PerformedInsightAction](../com.tink.model.insights/-performed-insight-action/index.md)


|

##### [com.tink.model.time.Period](../com.tink.model.time/-period/index.md)


|

##### [com.tink.service.streaming.PollingHandler](../com.tink.service.streaming/-polling-handler/index.md)


|

##### [com.tink.model.provider.Provider](../com.tink.model.provider/-provider/index.md)

The provider model represents a way of connecting to different banks or other financial institutions in Tink.
Multiple providers can exist for the same financial institution, each representing a different type of access the user can choose from.
The model contains metadata about the provider which can be used to group and properly display the representations,
thus helping the end user make the correct decision on which provider to choose.


|

##### [com.tink.core.provider.ProviderRepository](../com.tink.core.provider/-provider-repository/index.md)

Repository for retrieving [Provider](../com.tink.model.provider/-provider/index.md)s


|

##### [com.tink.service.provider.ProviderService](../com.tink.service.provider/-provider-service/index.md)


|

##### [com.tink.service.provider.ProviderServiceImpl](../com.tink.service.provider/-provider-service-impl/index.md)


|

##### [com.tink.model.provider.ProviderTreeNode](../com.tink.model.provider/-provider-tree-node/index.md)

This class represents a tree structure of [FinancialInstitutionGroupNode](../com.tink.model.provider/-provider-tree-node/-financial-institution-group-node/index.md) objects with children.
This eventually leads to a leaf object of type [CredentialTypeNode](../com.tink.model.provider/-provider-tree-node/-credential-type-node/index.md),
that contains more detailed [Provider](../com.tink.model.provider/-provider/index.md) data.


|

##### [com.tink.model.budget.RecurringPeriodicity](../com.tink.model.budget/-recurring-periodicity.md)


|

##### [com.tink.service.handler.ResultHandler](../com.tink.service.handler/-result-handler/index.md)

This is the basic wrapper for asynchronous callbacks in TinkLink.


|

##### [com.tink.service.authorization.Scope](../com.tink.service.authorization/-scope/index.md)


|

##### [com.tink.service.consent.ScopeDescription](../com.tink.service.consent/-scope-description/index.md)

A title and description explaining a specific [Scope](../com.tink.service.authorization/-scope/index.md).


|

##### [com.tink.service.ServiceModule](../com.tink.service/-service-module/index.md)


|

##### [com.tink.model.statistic.Statistic](../com.tink.model.statistic/-statistic/index.md)


|

##### [com.tink.model.statistic.StatisticTree](../com.tink.model.statistic/-statistic-tree/index.md)


|

##### [com.tink.service.streaming.publisher.Stream](../com.tink.service.streaming.publisher/-stream/index.md)


|

##### [com.tink.service.streaming.StreamingError](../com.tink.service.streaming/-streaming-error/index.md)


|

##### [com.tink.service.streaming.StreamingEvent](../com.tink.service.streaming/-streaming-event/index.md)


|

##### [com.tink.service.streaming.publisher.StreamingHandler](../com.tink.service.streaming.publisher/-streaming-handler/index.md)


|

##### [com.tink.service.streaming.publisher.StreamingHandlerImpl](../com.tink.service.streaming.publisher/-streaming-handler-impl/index.md)


|

##### [com.tink.service.streaming.publisher.StreamObserver](../com.tink.service.streaming.publisher/-stream-observer/index.md)


|

##### [com.tink.service.streaming.publisher.StreamSubscription](../com.tink.service.streaming.publisher/-stream-subscription/index.md)


|

##### [com.tink.model.transaction.Tag](../com.tink.model.transaction/-tag/index.md)


|

##### [com.tink.model.authentication.ThirdPartyAppAuthentication](../com.tink.model.authentication/-third-party-app-authentication/index.md)

This model contains information required for third party authentication flow.


|

##### [com.tink.core.Tink](../com.tink.core/-tink/index.md)


|

##### [com.tink.core.TinkComponent](../com.tink.core/-tink-component/index.md)


|

##### [com.tink.service.network.TinkConfiguration](../com.tink.service.network/-tink-configuration/index.md)

Configuration for Tink Link


|

##### [com.tink.link.TinkLink](../com.tink.link/-tink-link/index.md)

This is for Java compatibility only. Use extensions on [Tink](../com.tink.core/-tink/index.md) when using Kotlin


|

##### [com.tink.service.network.TLSHelper](../com.tink.service.network/-t-l-s-helper/index.md)


|

##### [com.tink.model.transaction.Transaction](../com.tink.model.transaction/-transaction/index.md)


|

##### [com.tink.model.transaction.TransactionDetails](../com.tink.model.transaction/-transaction-details/index.md)


|

##### [com.tink.service.account.UpdateAccountDescriptor](../com.tink.service.account/-update-account-descriptor/index.md)


|

##### [com.tink.service.authentication.user.User](../com.tink.service.authentication.user/-user/index.md)


|

##### [com.tink.link.core.user.UserContext](../com.tink.link.core.user/-user-context/index.md)

Context for functionality that requires a user to be set.


|

##### [com.tink.service.authentication.UserCreationDescriptor](../com.tink.service.authentication/-user-creation-descriptor/index.md)


|

##### [com.tink.service.authentication.UserEventBus](../com.tink.service.authentication/-user-event-bus/index.md)


|

##### [com.tink.model.user.UserProfile](../com.tink.model.user/-user-profile/index.md)


|

##### [com.tink.service.authorization.UserService](../com.tink.service.authorization/-user-service/index.md)


|

##### [com.tink.model.time.YearPeriod](../com.tink.model.time/-year-period/index.md)


|

##### [com.tink.model.time.YearWeek](../com.tink.model.time/-year-week/index.md)


