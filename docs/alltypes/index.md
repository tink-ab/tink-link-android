

### All Types

| Name | Summary |
|---|---|
|

##### [com.tink.rest.apis.AccessApi](../com.tink.rest.apis/-access-api/index.md)


|

##### [com.tink.model.account.Account](../com.tink.model.account/-account/index.md)


|

##### [com.tink.rest.models.Account](../com.tink.rest.models/-account/index.md)

An account could either be a debit account, a credit card, a loan or mortgage.


|

##### [com.tink.rest.apis.AccountApi](../com.tink.rest.apis/-account-api/index.md)


|

##### [com.tink.rest.models.AccountDetails](../com.tink.rest.models/-account-details/index.md)


|

##### [com.tink.rest.models.AccountListResponse](../com.tink.rest.models/-account-list-response/index.md)


|

##### [com.tink.service.account.AccountService](../com.tink.service.account/-account-service/index.md)


|

##### [com.tink.rest.models.ActionableInsight](../com.tink.rest.models/-actionable-insight/index.md)

An actionable insight represent some kind of actionable event or insight derived from user data. It could for instance be that a user has low balance on one of their bank accounts where the action could be to transfer money to that account. Another example could be to encourage a user to save more money by creating a budget for a specific category. Read more about it [here](https://docs.tink.com/resources/pfm/actionable-insights).


|

##### [com.tink.rest.apis.ActionableInsightApi](../com.tink.rest.apis/-actionable-insight-api/index.md)


|

##### [com.tink.model.misc.Amount](../com.tink.model.misc/-amount/index.md)


|

##### [com.tink.model.relations.AmountByCategory](../com.tink.model.relations/-amount-by-category/index.md)


|

##### [com.tink.rest.models.ArchiveBudgetResponse](../com.tink.rest.models/-archive-budget-response/index.md)


|

##### [com.tink.rest.models.ArchivedInsight](../com.tink.rest.models/-archived-insight/index.md)


|

##### [com.tink.rest.models.AuthenticatedUser](../com.tink.rest.models/-authenticated-user/index.md)


|

##### [com.tink.rest.models.AuthenticationContext](../com.tink.rest.models/-authentication-context/index.md)


|

##### [com.tink.model.authentication.AuthenticationMethod](../com.tink.model.authentication/-authentication-method/index.md)


|

##### [com.tink.rest.apis.AuthenticationRequest](../com.tink.rest.apis/-authentication-request/index.md)


|

##### [com.tink.rest.apis.AuthenticationResponse](../com.tink.rest.apis/-authentication-response/index.md)


|

##### [com.tink.model.user.Authorization](../com.tink.model.user/-authorization/index.md)


|

##### [com.tink.rest.apis.AuthorizationRequest](../com.tink.rest.apis/-authorization-request/index.md)


|

##### [com.tink.rest.apis.AuthorizationResponse](../com.tink.rest.apis/-authorization-response/index.md)


|

##### [com.tink.model.budget.Budget](../com.tink.model.budget/-budget/index.md)


|

##### [com.tink.rest.models.Budget](../com.tink.rest.models/-budget/index.md)

A budget represents a financial target for a defined period. The budget itself is identified by certain filter/criteria (such as accounts, categories, tags or free-text) to target expenses. Defining multiple filter properties will yield an AND operation, and specifying multiple values of a filter property will yield an OR operation.Depending on the use case a budget can either be recurring (WEEK, MONTH or YEAR) or be seen as a one-off budget (fixed start and end time period). The amount of the budget will relate to the recurring period defined by the periodicity unit for recurring budgets, or the fixed time window for a one-off budget. A budget could for example be the goal to spend at maximum 10 euros weekly on coffee.


|

##### [com.tink.rest.apis.BudgetApi](../com.tink.rest.apis/-budget-api/index.md)


|

##### [com.tink.model.budget.BudgetCreateOrUpdateDescriptor](../com.tink.model.budget/-budget-create-or-update-descriptor/index.md)

Descriptor for creating or updating a budget.
If we have an id, it means we're updating an already existing budget.


|

##### [com.tink.rest.models.BudgetDetailsResponse](../com.tink.rest.models/-budget-details-response/index.md)


|

##### [com.tink.rest.models.BudgetFilterAccount](../com.tink.rest.models/-budget-filter-account/index.md)


|

##### [com.tink.rest.models.BudgetFilterCategory](../com.tink.rest.models/-budget-filter-category/index.md)


|

##### [com.tink.rest.models.BudgetFilterTag](../com.tink.rest.models/-budget-filter-tag/index.md)


|

##### [com.tink.model.budget.BudgetPeriod](../com.tink.model.budget/-budget-period.md)


|

##### [com.tink.rest.models.BudgetPeriod](../com.tink.rest.models/-budget-period/index.md)


|

##### [com.tink.model.budget.BudgetSpecification](../com.tink.model.budget/-budget-specification.md)


|

##### [com.tink.model.budget.BudgetSummary](../com.tink.model.budget/-budget-summary.md)


|

##### [com.tink.rest.models.BudgetSummary](../com.tink.rest.models/-budget-summary/index.md)


|

##### [com.tink.model.budget.BudgetTransaction](../com.tink.model.budget/-budget-transaction.md)


|

##### [com.tink.rest.models.BudgetTransaction](../com.tink.rest.models/-budget-transaction/index.md)


|

##### [com.tink.rest.models.BudgetTransactionsResponse](../com.tink.rest.models/-budget-transactions-response/index.md)


|

##### [com.tink.rest.models.BusinessDaysResponse](../com.tink.rest.models/-business-days-response/index.md)


|

##### [com.tink.rest.apis.CalendarApi](../com.tink.rest.apis/-calendar-api/index.md)


|

##### [com.tink.rest.models.CallbackRelayedRequest](../com.tink.rest.models/-callback-relayed-request/index.md)


|

##### [com.tink.rest.models.CategorizeTransactionsListRequest](../com.tink.rest.models/-categorize-transactions-list-request/index.md)


|

##### [com.tink.rest.models.CategorizeTransactionsRequest](../com.tink.rest.models/-categorize-transactions-request/index.md)


|

##### [com.tink.model.category.Category](../com.tink.model.category/-category/index.md)


|

##### [com.tink.rest.models.Category](../com.tink.rest.models/-category/index.md)

Categories are used for categorization of transactions. They are structured as a category tree, and are available as a flat list of categories with parent/child relationships using their id and parent fields. Category information is used for pre-computed statistics, making aggregated spending and income data available for all the different nodes in the category tree. However, a transaction itself, can only be assigned to a leaf category. Both the `INCOME` and `EXPENSES` categories represent users' regular income and spending, while the `TRANSFER` categories are special in the sense that they represent transfers between accounts (potentially across banks), such as regular bank transfers, credit-card payments, mortgage amortizations and other transactions that should not add to the users' actual spending.


|

##### [com.tink.rest.apis.CategoryApi](../com.tink.rest.apis/-category-api/index.md)


|

##### [com.tink.service.category.CategoryRetrofitService](../com.tink.service.category/-category-retrofit-service.md)


|

##### [com.tink.model.category.CategoryTree](../com.tink.model.category/-category-tree/index.md)


|

##### [com.tink.rest.models.Client](../com.tink.rest.models/-client/index.md)


|

##### [com.tink.rest.models.ClientMessage](../com.tink.rest.models/-client-message/index.md)


|

##### [com.tink.link.consent.ConsentContext](../com.tink.link.consent/-consent-context/index.md)

Context for handling things around user consent.


|

##### [com.tink.service.consent.ConsentService](../com.tink.service.consent/-consent-service/index.md)


|

##### [com.tink.rest.apis.CreateAnonymousUserRequest](../com.tink.rest.apis/-create-anonymous-user-request/index.md)


|

##### [com.tink.rest.apis.CreateAnonymousUserResponse](../com.tink.rest.apis/-create-anonymous-user-response/index.md)


|

##### [com.tink.rest.models.CreateBudgetResponse](../com.tink.rest.models/-create-budget-response/index.md)


|

##### [com.tink.rest.models.CreateCredentialsRequest](../com.tink.rest.models/-create-credentials-request/index.md)


|

##### [com.tink.rest.models.CreateOneOffBudgetRequest](../com.tink.rest.models/-create-one-off-budget-request/index.md)


|

##### [com.tink.rest.models.CreateRecurringBudgetRequest](../com.tink.rest.models/-create-recurring-budget-request/index.md)


|

##### [com.tink.rest.models.CreateUserRequest](../com.tink.rest.models/-create-user-request/index.md)


|

##### [com.tink.rest.models.CreateUserResponse](../com.tink.rest.models/-create-user-response/index.md)


|

##### [com.tink.model.credentials.Credentials](../com.tink.model.credentials/-credentials/index.md)

This model represents how users are connected to a [Provider](../com.tink.model.provider/-provider/index.md) to access their financial data.


|

##### [com.tink.rest.models.Credentials](../com.tink.rest.models/-credentials/index.md)

The credentials model represents a user's connected providers from where financial data is accessed.


|

##### [com.tink.rest.apis.CredentialsApi](../com.tink.rest.apis/-credentials-api/index.md)


|

##### [com.tink.service.credentials.CredentialsAuthenticateDescriptor](../com.tink.service.credentials/-credentials-authenticate-descriptor/index.md)


|

##### [com.tink.service.credentials.CredentialsCreationDescriptor](../com.tink.service.credentials/-credentials-creation-descriptor/index.md)


|

##### [com.tink.rest.models.CredentialsListResponse](../com.tink.rest.models/-credentials-list-response/index.md)


|

##### [com.tink.service.credentials.CredentialsRefreshDescriptor](../com.tink.service.credentials/-credentials-refresh-descriptor/index.md)


|

##### [com.tink.link.core.credentials.CredentialsRepository](../com.tink.link.core.credentials/-credentials-repository/index.md)

Repository for creating, accessing and modifying credentials.


|

##### [com.tink.service.credentials.CredentialsService](../com.tink.service.credentials/-credentials-service/index.md)


|

##### [com.tink.service.credentials.CredentialsUpdateDescriptor](../com.tink.service.credentials/-credentials-update-descriptor/index.md)


|

##### [com.tink.rest.tools.CSV](../com.tink.rest.tools/-c-s-v/index.md)


|

##### [com.tink.rest.models.Currency](../com.tink.rest.models/-currency/index.md)


|

##### [com.tink.rest.models.CurrencyDenominatedAmount](../com.tink.rest.models/-currency-denominated-amount/index.md)


|

##### [com.tink.model.time.DayPeriod](../com.tink.model.time/-day-period/index.md)


|

##### [com.tink.rest.models.DeleteTransactionPartResponse](../com.tink.rest.models/-delete-transaction-part-response/index.md)


|

##### [com.tink.rest.models.DeleteUserRequest](../com.tink.rest.models/-delete-user-request/index.md)


|

##### [com.tink.rest.apis.DescribeOAuth2ClientRequest](../com.tink.rest.apis/-describe-o-auth2-client-request/index.md)


|

##### [com.tink.rest.apis.DescribeOAuth2ClientResponse](../com.tink.rest.apis/-describe-o-auth2-client-response/index.md)


|

##### [com.tink.service.network.Environment](../com.tink.service.network/-environment/index.md)


|

##### [com.tink.model.misc.ExactNumber](../com.tink.model.misc/-exact-number/index.md)


|

##### [com.tink.model.misc.Field](../com.tink.model.misc/-field/index.md)

This model represents a specific input, usually as a text field) that the user needs to fill during the authentication flow.


|

##### [com.tink.rest.models.Field](../com.tink.rest.models/-field/index.md)


|

##### [com.tink.rest.models.Filter](../com.tink.rest.models/-filter/index.md)


|

##### [com.tink.rest.tools.GeneratedCodeConverters](../com.tink.rest.tools/-generated-code-converters/index.md)


|

##### [com.tink.model.Images](../com.tink.model/-images/index.md)


|

##### [com.tink.rest.models.ImageUrls](../com.tink.rest.models/-image-urls/index.md)


|

##### [com.tink.model.insights.Insight](../com.tink.model.insights/-insight/index.md)


|

##### [com.tink.model.insights.InsightAction](../com.tink.model.insights/-insight-action/index.md)


|

##### [com.tink.rest.models.InsightActionData](../com.tink.rest.models/-insight-action-data/index.md)


|

##### [com.tink.model.insights.InsightData](../com.tink.model.insights/-insight-data/index.md)

All subclasses should be data classes or provide a meaningful `equals()` function


|

##### [com.tink.rest.models.InsightData](../com.tink.rest.models/-insight-data/index.md)


|

##### [com.tink.rest.models.InsightProposedAction](../com.tink.rest.models/-insight-proposed-action/index.md)


|

##### [com.tink.model.insights.InsightState](../com.tink.model.insights/-insight-state/index.md)


|

##### [com.tink.model.insights.InsightType](../com.tink.model.insights/-insight-type/index.md)


|

##### [com.tink.rest.models.LinkTransactionsRequest](../com.tink.rest.models/-link-transactions-request/index.md)


|

##### [com.tink.rest.models.LinkTransactionsResponse](../com.tink.rest.models/-link-transactions-response/index.md)


| (extensions in package com.tink.model.provider)

##### [kotlin.collections.List](../com.tink.model.provider/kotlin.collections.-list/index.md)


|

##### [com.tink.rest.models.ListBudgetSpecificationsResponse](../com.tink.rest.models/-list-budget-specifications-response/index.md)


|

##### [com.tink.rest.models.ListBudgetSummariesResponse](../com.tink.rest.models/-list-budget-summaries-response/index.md)


|

##### [com.tink.rest.models.ManualAuthenticationRequest](../com.tink.rest.models/-manual-authentication-request/index.md)


|

##### [com.tink.rest.models.Market](../com.tink.rest.models/-market/index.md)


|

##### [com.tink.rest.models.MarketListResponse](../com.tink.rest.models/-market-list-response/index.md)


|

##### [com.tink.model.time.MonthPeriod](../com.tink.model.time/-month-period/index.md)


|

##### [com.tink.rest.models.NotificationSettings](../com.tink.rest.models/-notification-settings/index.md)


|

##### [com.tink.rest.models.OAuth2AuthenticationTokenResponse](../com.tink.rest.models/-o-auth2-authentication-token-response/index.md)


|

##### [com.tink.rest.models.OAuth2AuthorizeResponse](../com.tink.rest.models/-o-auth2-authorize-response/index.md)


|

##### [com.tink.rest.models.OAuth2Client](../com.tink.rest.models/-o-auth2-client/index.md)


|

##### [com.tink.rest.apis.OAuthApi](../com.tink.rest.apis/-o-auth-api/index.md)


|

##### [com.tink.model.consent.OAuthClientDescription](../com.tink.model.consent/-o-auth-client-description/index.md)

A description of the OAuth client and the data it will collect from the user.


|

##### [com.tink.model.budget.OneOffPeriodicity](../com.tink.model.budget/-one-off-periodicity.md)


|

##### [com.tink.rest.models.OneOffPeriodicity](../com.tink.rest.models/-one-off-periodicity/index.md)


|

##### [com.tink.model.insights.PerformedInsightAction](../com.tink.model.insights/-performed-insight-action/index.md)


|

##### [com.tink.model.time.Period](../com.tink.model.time/-period/index.md)


|

##### [com.tink.rest.models.Period](../com.tink.rest.models/-period/index.md)


|

##### [com.tink.rest.tools.PIPES](../com.tink.rest.tools/-p-i-p-e-s/index.md)


|

##### [com.tink.service.streaming.PollingHandler](../com.tink.service.streaming/-polling-handler/index.md)


|

##### [com.tink.model.provider.Provider](../com.tink.model.provider/-provider/index.md)

The provider model represents a way of connecting to different banks or other financial institutions in Tink.
Multiple providers can exist for the same financial institution, each representing a different type of access the user can choose from.
The model contains metadata about the provider which can be used to group and properly display the representations,
thus helping the end user make the correct decision on which provider to choose.


|

##### [com.tink.rest.models.Provider](../com.tink.rest.models/-provider/index.md)

The provider model represents financial institutions to where Tink can connect. It specifies how Tink accesses the financial institution, metadata about the financialinstitution, and what financial information that can be accessed.


|

##### [com.tink.rest.apis.ProviderApi](../com.tink.rest.apis/-provider-api/index.md)


|

##### [com.tink.rest.models.ProviderListResponse](../com.tink.rest.models/-provider-list-response/index.md)

The provider list response object.


|

##### [com.tink.rest.models.ProviderMarketListResponse](../com.tink.rest.models/-provider-market-list-response/index.md)


|

##### [com.tink.core.provider.ProviderRepository](../com.tink.core.provider/-provider-repository/index.md)

Repository for retrieving [Provider](../com.tink.model.provider/-provider/index.md)s


|

##### [com.tink.service.provider.ProviderService](../com.tink.service.provider/-provider-service/index.md)


|

##### [com.tink.model.provider.ProviderTreeNode](../com.tink.model.provider/-provider-tree-node/index.md)

This class represents a tree structure of [FinancialInstitutionGroupNode](../com.tink.model.provider/-provider-tree-node/-financial-institution-group-node/index.md) objects with children.
This eventually leads to a leaf object of type [CredentialsTypeNode](../com.tink.model.provider/-provider-tree-node/-credentials-type-node/index.md),
that contains more detailed [Provider](../com.tink.model.provider/-provider/index.md) data.


|

##### [com.tink.model.budget.RecurringPeriodicity](../com.tink.model.budget/-recurring-periodicity.md)


|

##### [com.tink.rest.models.RecurringPeriodicity](../com.tink.rest.models/-recurring-periodicity/index.md)


|

##### [com.tink.model.credentials.RefreshableItem](../com.tink.model.credentials/-refreshable-item/index.md)

Refreshable items are a way to limit which types of data should be aggregated from a provider.


|

##### [com.tink.rest.models.RefreshCredentialsRequest](../com.tink.rest.models/-refresh-credentials-request/index.md)


| (extensions in package com.tink.rest.tools)

##### [retrofit2.Response](../com.tink.rest.tools/retrofit2.-response/index.md)


|

##### [com.tink.service.handler.ResultHandler](../com.tink.service.handler/-result-handler/index.md)

This is the basic wrapper for asynchronous callbacks in TinkLink.


|

##### [com.tink.model.user.Scope](../com.tink.model.user/-scope/index.md)


|

##### [com.tink.model.consent.ScopeDescription](../com.tink.model.consent/-scope-description/index.md)

A title and description explaining a specific [Scope](../com.tink.model.user/-scope/index.md).


|

##### [com.tink.rest.apis.ScopeDescription](../com.tink.rest.apis/-scope-description/index.md)


|

##### [com.tink.rest.apis.SearchApi](../com.tink.rest.apis/-search-api/index.md)


|

##### [com.tink.rest.models.SearchQuery](../com.tink.rest.models/-search-query/index.md)


|

##### [com.tink.rest.models.SearchResponse](../com.tink.rest.models/-search-response/index.md)


|

##### [com.tink.rest.models.SearchResult](../com.tink.rest.models/-search-result/index.md)


|

##### [com.tink.rest.models.SelectInsightActionRequest](../com.tink.rest.models/-select-insight-action-request/index.md)


|

##### [com.tink.service.di.ServiceComponent](../com.tink.service.di/-service-component/index.md)


|

##### [com.tink.service.di.ServiceScope](../com.tink.service.di/-service-scope/index.md)


|

##### [com.tink.rest.models.SimilarTransactionsResponse](../com.tink.rest.models/-similar-transactions-response/index.md)


|

##### [com.tink.rest.tools.SSV](../com.tink.rest.tools/-s-s-v/index.md)


|

##### [com.tink.model.statistic.Statistic](../com.tink.model.statistic/-statistic/index.md)


|

##### [com.tink.rest.models.StatisticQuery](../com.tink.rest.models/-statistic-query/index.md)


|

##### [com.tink.rest.models.Statistics](../com.tink.rest.models/-statistics/index.md)

Statistics contain derived data from different types of information which is available for a user. This calculated data is stored for a certain period of time with a certain time resolution, and could be based on information such as expenses, incomes or balances. As an example, statistics could be a time series of travel expenses calculated monthly for the last six months.


|

##### [com.tink.rest.apis.StatisticsApi](../com.tink.rest.apis/-statistics-api/index.md)


|

##### [com.tink.model.statistic.StatisticTree](../com.tink.model.statistic/-statistic-tree/index.md)


|

##### [com.tink.service.streaming.publisher.Stream](../com.tink.service.streaming.publisher/-stream/index.md)


|

##### [com.tink.service.streaming.publisher.StreamObserver](../com.tink.service.streaming.publisher/-stream-observer/index.md)


|

##### [com.tink.service.streaming.publisher.StreamSubscription](../com.tink.service.streaming.publisher/-stream-subscription/index.md)


|

##### [com.tink.rest.models.StringDoublePair](../com.tink.rest.models/-string-double-pair/index.md)


|

##### [com.tink.rest.models.SuggestTransactionsResponse](../com.tink.rest.models/-suggest-transactions-response/index.md)


|

##### [com.tink.rest.models.SupplementalInformation](../com.tink.rest.models/-supplemental-information/index.md)


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

##### [com.tink.rest.tools.TinkJsonAdapterFactory](../com.tink.rest.tools/-tink-json-adapter-factory/index.md)


|

##### [com.tink.link.TinkLink](../com.tink.link/-tink-link/index.md)

This is for Java compatibility only. Use extensions on [Tink](../com.tink.core/-tink/index.md) when using Kotlin


|

##### [com.tink.core.TinkScope](../com.tink.core/-tink-scope/index.md)


|

##### [com.tink.model.transaction.Transaction](../com.tink.model.transaction/-transaction/index.md)


|

##### [com.tink.rest.models.Transaction](../com.tink.rest.models/-transaction/index.md)

An account usually contains multiple transactions (except for certain types of accounts where Tink can't access the underlying transactions, for example, certain `INVESTMENT` accounts). The transaction model represents any operation on an account, and could represent both the actual credit-card purchase on a `CREDIT_CARD` account, but also represent the transaction when you paid your credit-card bill. Most commonly, the transactions in an account should represent what the end-user typically regards as a transaction with its amount, description and date, etc.


|

##### [com.tink.rest.apis.TransactionApi](../com.tink.rest.apis/-transaction-api/index.md)


|

##### [com.tink.rest.models.TransactionCluster](../com.tink.rest.models/-transaction-cluster/index.md)


|

##### [com.tink.model.transaction.TransactionDetails](../com.tink.model.transaction/-transaction-details/index.md)


|

##### [com.tink.rest.models.TransactionLinkSuggestionResponse](../com.tink.rest.models/-transaction-link-suggestion-response/index.md)


|

##### [com.tink.rest.models.TransactionPart](../com.tink.rest.models/-transaction-part/index.md)


|

##### [com.tink.rest.models.TransactionResponse](../com.tink.rest.models/-transaction-response/index.md)


|

##### [com.tink.rest.models.TransferDestination](../com.tink.rest.models/-transfer-destination/index.md)


|

##### [com.tink.rest.tools.TSV](../com.tink.rest.tools/-t-s-v/index.md)


|

##### [com.tink.rest.tools.TypesAdapterFactory](../com.tink.rest.tools/-types-adapter-factory/index.md)

Moshi Factory to handle all the custom types we want to support,
such as [LocalDate](#), [ZonedDateTime](#), [BigDecimal](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html).


|

##### [com.tink.service.account.UpdateAccountDescriptor](../com.tink.service.account/-update-account-descriptor/index.md)


|

##### [com.tink.rest.models.UpdateBudgetRequest](../com.tink.rest.models/-update-budget-request/index.md)


|

##### [com.tink.rest.models.UpdateBudgetResponse](../com.tink.rest.models/-update-budget-response/index.md)


|

##### [com.tink.rest.models.UpdateCredentialsRequest](../com.tink.rest.models/-update-credentials-request/index.md)


|

##### [com.tink.rest.models.UpdateTransactionLinkRequest](../com.tink.rest.models/-update-transaction-link-request/index.md)


|

##### [com.tink.model.user.User](../com.tink.model.user/-user/index.md)


|

##### [com.tink.rest.models.User](../com.tink.rest.models/-user/index.md)

The user model represents a unique Tink end-user and includes properties that defines the user, user profile information and user-modifiable settings. The user information can primarily be used whenever a Tink user signs up for a 3rd party service using her Tink account, or when user-modifiable settings, such as locale or currency, are needed in order to display or calculate the correct data in the 3rd party service.


|

##### [com.tink.rest.apis.UserApi](../com.tink.rest.apis/-user-api/index.md)


|

##### [com.tink.link.core.user.UserContext](../com.tink.link.core.user/-user-context/index.md)

Context for functionality that requires a user to be set.


|

##### [com.tink.service.authorization.UserCreationDescriptor](../com.tink.service.authorization/-user-creation-descriptor/index.md)


|

##### [com.tink.service.authentication.UserEventBus](../com.tink.service.authentication/-user-event-bus/index.md)


|

##### [com.tink.model.user.UserProfile](../com.tink.model.user/-user-profile/index.md)


|

##### [com.tink.rest.models.UserProfile](../com.tink.rest.models/-user-profile/index.md)


|

##### [com.tink.service.authorization.UserService](../com.tink.service.authorization/-user-service/index.md)


|

##### [com.tink.rest.tools.XNullable](../com.tink.rest.tools/-x-nullable/index.md)

Marks an optional variable that will be forcibly serialized as "null" when being transformed
to json. (By default, an optional variable is omitted from the output json string,
for optimisation purposes.)


|

##### [com.tink.rest.tools.XNullableAdapterFactory](../com.tink.rest.tools/-x-nullable-adapter-factory/index.md)


|

##### [com.tink.model.time.YearPeriod](../com.tink.model.time/-year-period/index.md)


|

##### [com.tink.model.time.YearWeek](../com.tink.model.time/-year-week/index.md)


