

### All Types

| Name | Summary |
|---|---|
|

##### [com.tink.model.account.Account](../com.tink.model.account/-account/index.md)


| (extensions in package com.tink.service.account)

##### [com.tink.rest.models.Account](../com.tink.service.account/com.tink.rest.models.-account/index.md)


|

##### [com.tink.model.account.AccountDetails](../com.tink.model.account/-account-details/index.md)


|

##### [com.tink.service.account.AccountService](../com.tink.service.account/-account-service/index.md)


|

##### [com.tink.service.account.AccountServiceImpl](../com.tink.service.account/-account-service-impl/index.md)


|

##### [com.tink.link.payments.AddBeneficiaryFailure](../com.tink.link.payments/-add-beneficiary-failure/index.md)


|

##### [com.tink.link.payments.AddBeneficiaryStatus](../com.tink.link.payments/-add-beneficiary-status/index.md)

The status of a transfer.
Possible values are [Success](../com.tink.link.payments/-add-beneficiary-status/-success/index.md), [Loading](../com.tink.link.payments/-add-beneficiary-status/-loading/index.md), and [AwaitingAuthentication](../com.tink.link.payments/-add-beneficiary-status/-awaiting-authentication/index.md)


|

##### [com.tink.model.misc.Amount](../com.tink.model.misc/-amount/index.md)


|

##### [com.tink.model.relations.AmountByCategory](../com.tink.model.relations/-amount-by-category/index.md)


|

##### [com.tink.model.authentication.AuthenticationMethod](../com.tink.model.authentication/-authentication-method/index.md)


|

##### [com.tink.link.authentication.AuthenticationTask](../com.tink.link.authentication/-authentication-task/index.md)

Represents an authentication that needs to be completed by the user.


|

##### [com.tink.model.user.Authorization](../com.tink.model.user/-authorization/index.md)


|

##### [com.tink.model.transfer.Beneficiary](../com.tink.model.transfer/-beneficiary/index.md)

A beneficiary is a payment or transfer destination account which has been authorized by the bank.
Each beneficiary belongs to an account, which means that the given account can send money to that beneficiary.


|

##### [com.tink.model.budget.Budget](../com.tink.model.budget/-budget/index.md)


| (extensions in package com.tink.service.budget)

##### [com.tink.rest.models.Budget](../com.tink.service.budget/com.tink.rest.models.-budget/index.md)


|

##### [com.tink.model.budget.BudgetCreateOrUpdateDescriptor](../com.tink.model.budget/-budget-create-or-update-descriptor/index.md)

Descriptor for creating or updating a budget.
If we have an id, it means we're updating an already existing budget.


|

##### [com.tink.model.budget.BudgetFilter](../com.tink.model.budget/-budget-filter.md)


|

##### [com.tink.model.budget.BudgetPeriod](../com.tink.model.budget/-budget-period.md)


| (extensions in package com.tink.service.budget)

##### [com.tink.rest.models.BudgetPeriod](../com.tink.service.budget/com.tink.rest.models.-budget-period/index.md)


|

##### [com.tink.model.budget.BudgetPeriodicity](../com.tink.model.budget/-budget-periodicity.md)


|

##### [com.tink.service.budget.BudgetService](../com.tink.service.budget/-budget-service/index.md)


|

##### [com.tink.service.budget.BudgetServiceImpl](../com.tink.service.budget/-budget-service-impl/index.md)


|

##### [com.tink.model.budget.BudgetSpecification](../com.tink.model.budget/-budget-specification.md)


|

##### [com.tink.model.budget.BudgetSummary](../com.tink.model.budget/-budget-summary.md)


| (extensions in package com.tink.service.budget)

##### [com.tink.rest.models.BudgetSummary](../com.tink.service.budget/com.tink.rest.models.-budget-summary/index.md)


|

##### [com.tink.model.budget.BudgetTransaction](../com.tink.model.budget/-budget-transaction.md)


| (extensions in package com.tink.service.budget)

##### [com.tink.rest.models.BudgetTransaction](../com.tink.service.budget/com.tink.rest.models.-budget-transaction/index.md)


|

##### [com.tink.model.category.Category](../com.tink.model.category/-category/index.md)


|

##### [com.tink.service.category.CategoryRetrofitService](../com.tink.service.category/-category-retrofit-service.md)


|

##### [com.tink.service.category.CategoryService](../com.tink.service.category/-category-service/index.md)


|

##### [com.tink.service.category.CategoryServiceImpl](../com.tink.service.category/-category-service-impl/index.md)


|

##### [com.tink.model.category.CategoryTree](../com.tink.model.category/-category-tree/index.md)


|

##### [com.tink.service.observer.ChangeObserver](../com.tink.service.observer/-change-observer/index.md)


|

##### [com.tink.link.consent.ConsentContext](../com.tink.link.consent/-consent-context/index.md)

Context for handling things around user consent.


|

##### [com.tink.service.consent.ConsentService](../com.tink.service.consent/-consent-service/index.md)


|

##### [com.tink.service.transfer.CreateBeneficiaryDescriptor](../com.tink.service.transfer/-create-beneficiary-descriptor/index.md)

Descriptor to create a beneficiary of a transfer


|

##### [com.tink.service.transfer.CreateTransferDescriptor](../com.tink.service.transfer/-create-transfer-descriptor/index.md)


|

##### [com.tink.model.credentials.Credentials](../com.tink.model.credentials/-credentials/index.md)

This model represents how users are connected to a [Provider](../com.tink.model.provider/-provider/index.md) to access their financial data.


|

##### [com.tink.service.credentials.CredentialsAuthenticateDescriptor](../com.tink.service.credentials/-credentials-authenticate-descriptor/index.md)


|

##### [com.tink.service.credentials.CredentialsCreationDescriptor](../com.tink.service.credentials/-credentials-creation-descriptor/index.md)


|

##### [com.tink.link.core.credentials.CredentialsFailure](../com.tink.link.core.credentials/-credentials-failure/index.md)


|

##### [com.tink.link.ui.CredentialsOperation](../com.tink.link.ui/-credentials-operation/index.md)

Used as an argument for the [TinkLinkUiActivity](../com.tink.link.ui/-tink-link-ui-activity/index.md) to specify the type of credentials operation
to be performed using Tink Link UI.
Possible values are [Create](../com.tink.link.ui/-credentials-operation/-create/index.md), [Update](../com.tink.link.ui/-credentials-operation/-update/index.md), [Refresh](../com.tink.link.ui/-credentials-operation/-refresh/index.md) and [Authenticate](../com.tink.link.ui/-credentials-operation/-authenticate/index.md).
Please note that you need to have permanent users enabled for [Update](../com.tink.link.ui/-credentials-operation/-update/index.md), [Refresh](../com.tink.link.ui/-credentials-operation/-refresh/index.md)
and [Authenticate](../com.tink.link.ui/-credentials-operation/-authenticate/index.md) operations.


|

##### [com.tink.service.credentials.CredentialsRefreshDescriptor](../com.tink.service.credentials/-credentials-refresh-descriptor/index.md)


|

##### [com.tink.link.core.credentials.CredentialsRepository](../com.tink.link.core.credentials/-credentials-repository/index.md)

Repository for creating, accessing and modifying credentials.


|

##### [com.tink.service.credentials.CredentialsService](../com.tink.service.credentials/-credentials-service/index.md)


|

##### [com.tink.link.core.credentials.CredentialsStatus](../com.tink.link.core.credentials/-credentials-status/index.md)

The status of a Credentials.
Possible values are [Success](../com.tink.link.core.credentials/-credentials-status/-success/index.md), [Loading](../com.tink.link.core.credentials/-credentials-status/-loading/index.md), and [AwaitingAuthentication](../com.tink.link.core.credentials/-credentials-status/-awaiting-authentication/index.md)


|

##### [com.tink.service.credentials.CredentialsUpdateDescriptor](../com.tink.service.credentials/-credentials-update-descriptor/index.md)


| (extensions in package com.tink.service.misc)

##### [com.tink.rest.models.CurrencyDenominatedAmount](../com.tink.service.misc/com.tink.rest.models.-currency-denominated-amount/index.md)


|

##### [com.tink.model.time.DayPeriod](../com.tink.model.time/-day-period/index.md)


|

##### [com.tink.service.network.Environment](../com.tink.service.network/-environment/index.md)

Represents the environment you want to connect to.


|

##### [com.tink.model.misc.ExactNumber](../com.tink.model.misc/-exact-number/index.md)


|

##### [com.tink.model.relations.ExpensesByDay](../com.tink.model.relations/-expenses-by-day/index.md)


|

##### [com.tink.model.misc.Field](../com.tink.model.misc/-field/index.md)

This model represents a specific input, usually as a text field) that the user needs to fill during the authentication flow.


| (extensions in package com.tink.service.budget)

##### [com.tink.rest.models.Filter](../com.tink.service.budget/com.tink.rest.models.-filter/index.md)


|

##### [com.tink.model.Images](../com.tink.model/-images/index.md)


|

##### [com.tink.model.insights.Insight](../com.tink.model.insights/-insight/index.md)


|

##### [com.tink.model.insights.InsightAction](../com.tink.model.insights/-insight-action/index.md)


|

##### [com.tink.service.insight.InsightActionConvertersTest](../com.tink.service.insight/-insight-action-converters-test/index.md)


|

##### [com.tink.model.insights.InsightData](../com.tink.model.insights/-insight-data/index.md)

All subclasses should be data classes or provide a meaningful `equals()` function


| (extensions in package com.tink.service.insight)

##### [com.tink.rest.models.InsightProposedAction](../com.tink.service.insight/com.tink.rest.models.-insight-proposed-action/index.md)


|

##### [com.tink.service.insight.InsightService](../com.tink.service.insight/-insight-service/index.md)


|

##### [com.tink.service.insight.InsightServiceImpl](../com.tink.service.insight/-insight-service-impl/index.md)


|

##### [com.tink.model.insights.InsightState](../com.tink.model.insights/-insight-state/index.md)


|

##### [com.tink.model.insights.InsightType](../com.tink.model.insights/-insight-type/index.md)


|

##### [com.tink.link.ui.LinkUser](../com.tink.link.ui/-link-user/index.md)

Use this to let Tink Link UI know if it should use an [existing user](../com.tink.link.ui/-link-user/-existing-user/index.md) or
create a [temporary user](../com.tink.link.ui/-link-user/-temporary-user/index.md).


| (extensions in package com.tink.model.provider)

##### [kotlin.collections.List](../com.tink.model.provider/kotlin.collections.-list/index.md)


| (extensions in package com.tink.service.category)

##### [kotlin.collections.List](../com.tink.service.category/kotlin.collections.-list/index.md)


|

##### [com.tink.model.time.MonthPeriod](../com.tink.model.time/-month-period/index.md)


|

##### [com.tink.model.consent.OAuthClientDescription](../com.tink.model.consent/-o-auth-client-description/index.md)

A description of the OAuth client and the data it will collect from the user.


|

##### [com.tink.model.budget.OneOffPeriodicity](../com.tink.model.budget/-one-off-periodicity.md)


|

##### [com.tink.service.transaction.Pageable](../com.tink.service.transaction/-pageable/index.md)


|

##### [com.tink.model.insights.PerformedInsightAction](../com.tink.model.insights/-performed-insight-action/index.md)


|

##### [com.tink.model.time.Period](../com.tink.model.time/-period/index.md)


|

##### [com.tink.service.time.PeriodService](../com.tink.service.time/-period-service/index.md)


|

##### [com.tink.service.streaming.PollingHandler](../com.tink.service.streaming/-polling-handler/index.md)


|

##### [com.tink.model.provider.Provider](../com.tink.model.provider/-provider/index.md)

The provider model represents a way of connecting to different banks or other financial institutions in Tink.
Multiple providers can exist for the same financial institution, each representing a different type of access the user can choose from.
The model contains metadata about the provider which can be used to group and properly display the representations,
thus helping the end user make the correct decision on which provider to choose.


|

##### [com.tink.service.provider.ProviderFilter](../com.tink.service.provider/-provider-filter/index.md)

A filter to describe which providers should be included in the response


|

##### [com.tink.core.provider.ProviderRepository](../com.tink.core.provider/-provider-repository/index.md)

Repository for retrieving [Provider](../com.tink.model.provider/-provider/index.md)s


|

##### [com.tink.link.ui.ProviderSelection](../com.tink.link.ui/-provider-selection/index.md)

Used as an argument for the [TinkLinkUiActivity](../com.tink.link.ui/-tink-link-ui-activity/index.md) to specify if you want to select a
[single provider](../com.tink.link.ui/-provider-selection/-single-provider/index.md) or a [list of providers](../com.tink.link.ui/-provider-selection/-provider-list/index.md).


|

##### [com.tink.service.provider.ProviderService](../com.tink.service.provider/-provider-service/index.md)


|

##### [com.tink.model.provider.ProviderTreeNode](../com.tink.model.provider/-provider-tree-node/index.md)

This class represents a tree structure of [FinancialInstitutionGroupNode](../com.tink.model.provider/-provider-tree-node/-financial-institution-group-node/index.md) objects with children.
This eventually leads to a leaf object of type [ProviderNode](../com.tink.model.provider/-provider-tree-node/-provider-node/index.md),
that contains more detailed [Provider](../com.tink.model.provider/-provider/index.md) data.


|

##### [com.tink.model.budget.RecurringPeriodicity](../com.tink.model.budget/-recurring-periodicity.md)


|

##### [com.tink.model.credentials.RefreshableItem](../com.tink.model.credentials/-refreshable-item/index.md)

Refreshable items are a way to limit which types of data should be aggregated from a provider.


|

##### [com.tink.service.handler.ResultHandler](../com.tink.service.handler/-result-handler/index.md)

This is the basic wrapper for asynchronous callbacks in TinkLink.


|

##### [com.tink.model.user.Scope](../com.tink.model.user/-scope/index.md)


|

##### [com.tink.model.consent.ScopeDescription](../com.tink.model.consent/-scope-description/index.md)

A title and description explaining a specific [Scope](../com.tink.model.user/-scope/index.md).


|

##### [com.tink.service.di.ServiceComponent](../com.tink.service.di/-service-component/index.md)


|

##### [com.tink.service.di.ServiceScope](../com.tink.service.di/-service-scope/index.md)


|

##### [com.tink.model.transfer.SignableOperation](../com.tink.model.transfer/-signable-operation/index.md)


|

##### [com.tink.model.statistics.Statistics](../com.tink.model.statistics/-statistics/index.md)


|

##### [com.tink.service.statistics.StatisticsQueryDescriptor](../com.tink.service.statistics/-statistics-query-descriptor/index.md)


|

##### [com.tink.service.statistics.StatisticsService](../com.tink.service.statistics/-statistics-service/index.md)


| (extensions in package com.tink.service.credentials)

##### [com.tink.rest.models.Credentials.StatusEnum](../com.tink.service.credentials/com.tink.rest.models.-credentials.-status-enum/index.md)


|

##### [com.tink.service.streaming.publisher.Stream](../com.tink.service.streaming.publisher/-stream/index.md)


|

##### [com.tink.service.streaming.publisher.StreamObserver](../com.tink.service.streaming.publisher/-stream-observer/index.md)


|

##### [com.tink.service.streaming.publisher.StreamSubscription](../com.tink.service.streaming.publisher/-stream-subscription/index.md)


|

##### [com.tink.model.transaction.Tag](../com.tink.model.transaction/-tag/index.md)


|

##### [com.tink.model.authentication.ThirdPartyAppAuthentication](../com.tink.model.authentication/-third-party-app-authentication/index.md)

This model contains information required for third party authentication flow.


| (extensions in package com.tink.service.credentials)

##### [com.tink.rest.models.Credentials.ThirdPartyAuthentication](../com.tink.service.credentials/com.tink.rest.models.-credentials.-third-party-authentication/index.md)


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

##### [com.tink.link.ui.TinkLinkError](../com.tink.link.ui/-tink-link-error/index.md)

Represents errors that happen during the Tink Link UI flow.


|

##### [com.tink.link.ui.TinkLinkErrorInfo](../com.tink.link.ui/-tink-link-error-info/index.md)

A wrapper class that provides information about the underlying error causing the [TinkLinkError](../com.tink.link.ui/-tink-link-error/index.md)


|

##### [com.tink.link.payments.TinkLinkPayments](../com.tink.link.payments/-tink-link-payments/index.md)

This is for Java compatibility only. Use extensions on [Tink](../com.tink.core/-tink/index.md) when using Kotlin


|

##### [com.tink.link.ui.TinkLinkResult](../com.tink.link.ui/-tink-link-result/index.md)

The result data that is returned from the Tink Link UI flow.
Possible values are [TemporaryUser](../com.tink.link.ui/-tink-link-result/-temporary-user/index.md) and [PermanentUser](../com.tink.link.ui/-tink-link-result/-permanent-user/index.md)


|

##### [com.tink.link.ui.TinkLinkUiActivity](../com.tink.link.ui/-tink-link-ui-activity/index.md)

Activity used for displaying the full Tink Link UI flow.


|

##### [com.tink.core.TinkScope](../com.tink.core/-tink-scope/index.md)


|

##### [com.tink.model.transaction.Transaction](../com.tink.model.transaction/-transaction/index.md)


| (extensions in package com.tink.service.transaction)

##### [com.tink.rest.models.Transaction](../com.tink.service.transaction/com.tink.rest.models.-transaction/index.md)


| (extensions in package com.tink.service.transaction)

##### [com.tink.rest.models.TransactionResponse](../com.tink.service.transaction/com.tink.rest.models.-transaction-response/index.md)


|

##### [com.tink.service.transaction.TransactionService](../com.tink.service.transaction/-transaction-service/index.md)


|

##### [com.tink.service.transaction.TransactionUpdateDescriptor](../com.tink.service.transaction/-transaction-update-descriptor/index.md)


|

##### [com.tink.link.payments.TransferFailure](../com.tink.link.payments/-transfer-failure/index.md)


|

##### [com.tink.link.payments.TransferMessage](../com.tink.link.payments/-transfer-message/index.md)

The message for a transfer.


|

##### [com.tink.link.payments.di.TransferModule](../com.tink.link.payments.di/-transfer-module/index.md)


|

##### [com.tink.link.payments.TransferRepository](../com.tink.link.payments/-transfer-repository/index.md)

Repository for initiating transfers and retrieving the necessary input for that action.


|

##### [com.tink.service.transfer.TransferService](../com.tink.service.transfer/-transfer-service/index.md)


|

##### [com.tink.link.payments.TransferStatus](../com.tink.link.payments/-transfer-status/index.md)

The status of a transfer.
Possible values are [Success](../com.tink.link.payments/-transfer-status/-success/index.md), [Loading](../com.tink.link.payments/-transfer-status/-loading/index.md), and [AwaitingAuthentication](../com.tink.link.payments/-transfer-status/-awaiting-authentication/index.md)


| (extensions in package com.tink.service.credentials)

##### [com.tink.rest.models.Credentials.TypeEnum](../com.tink.service.credentials/com.tink.rest.models.-credentials.-type-enum/index.md)


|

##### [com.tink.service.account.UpdateAccountDescriptor](../com.tink.service.account/-update-account-descriptor/index.md)


|

##### [com.tink.model.user.User](../com.tink.model.user/-user/index.md)


| (extensions in package com.tink.service.user)

##### [com.tink.rest.models.User](../com.tink.service.user/com.tink.rest.models.-user/index.md)


|

##### [com.tink.link.core.user.UserContext](../com.tink.link.core.user/-user-context/index.md)

Context for functionality that requires a user to be set.


|

##### [com.tink.service.authorization.UserCreationDescriptor](../com.tink.service.authorization/-user-creation-descriptor/index.md)


|

##### [com.tink.service.authentication.UserEventBus](../com.tink.service.authentication/-user-event-bus/index.md)


|

##### [com.tink.model.user.UserInfo](../com.tink.model.user/-user-info/index.md)


|

##### [com.tink.model.user.UserProfile](../com.tink.model.user/-user-profile/index.md)


| (extensions in package com.tink.service.user)

##### [com.tink.rest.models.UserProfile](../com.tink.service.user/com.tink.rest.models.-user-profile/index.md)


|

##### [com.tink.service.user.UserProfileService](../com.tink.service.user/-user-profile-service/index.md)


|

##### [com.tink.service.user.UserProfileServiceImpl](../com.tink.service.user/-user-profile-service-impl/index.md)


|

##### [com.tink.service.authorization.UserService](../com.tink.service.authorization/-user-service/index.md)


|

##### [com.tink.model.time.WeekPeriod](../com.tink.model.time/-week-period/index.md)


|

##### [com.tink.model.time.YearMonth](../com.tink.model.time/-year-month/index.md)


|

##### [com.tink.model.time.YearPeriod](../com.tink.model.time/-year-period/index.md)


|

##### [com.tink.model.time.YearWeek](../com.tink.model.time/-year-week/index.md)


