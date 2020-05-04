[link](../index.md) / [com.tink.rest.models](./index.md)

## Package com.tink.rest.models

### Types

| Name | Summary |
|---|---|
| [Account](-account/index.md) | An account could either be a debit account, a credit card, a loan or mortgage.`data class Account` |
| [AccountDetails](-account-details/index.md) | `data class AccountDetails` |
| [AccountListResponse](-account-list-response/index.md) | `data class AccountListResponse` |
| [ActionableInsight](-actionable-insight/index.md) | An actionable insight represent some kind of actionable event or insight derived from user data. It could for instance be that a user has low balance on one of their bank accounts where the action could be to transfer money to that account. Another example could be to encourage a user to save more money by creating a budget for a specific category. Read more about it [here](https://docs.tink.com/resources/pfm/actionable-insights).`data class ActionableInsight` |
| [ArchiveBudgetResponse](-archive-budget-response/index.md) | `data class ArchiveBudgetResponse` |
| [ArchivedInsight](-archived-insight/index.md) | `data class ArchivedInsight` |
| [AuthenticatedUser](-authenticated-user/index.md) | `data class AuthenticatedUser` |
| [AuthenticationContext](-authentication-context/index.md) | `data class AuthenticationContext` |
| [Budget](-budget/index.md) | A budget represents a financial target for a defined period. The budget itself is identified by certain filter/criteria (such as accounts, categories, tags or free-text) to target expenses. Defining multiple filter properties will yield an AND operation, and specifying multiple values of a filter property will yield an OR operation.Depending on the use case a budget can either be recurring (WEEK, MONTH or YEAR) or be seen as a one-off budget (fixed start and end time period). The amount of the budget will relate to the recurring period defined by the periodicity unit for recurring budgets, or the fixed time window for a one-off budget. A budget could for example be the goal to spend at maximum 10 euros weekly on coffee.`data class Budget` |
| [BudgetDetailsResponse](-budget-details-response/index.md) | `data class BudgetDetailsResponse` |
| [BudgetFilterAccount](-budget-filter-account/index.md) | `data class BudgetFilterAccount` |
| [BudgetFilterCategory](-budget-filter-category/index.md) | `data class BudgetFilterCategory` |
| [BudgetFilterTag](-budget-filter-tag/index.md) | `data class BudgetFilterTag` |
| [BudgetPeriod](-budget-period/index.md) | `data class BudgetPeriod` |
| [BudgetSummary](-budget-summary/index.md) | `data class BudgetSummary` |
| [BudgetTransaction](-budget-transaction/index.md) | `data class BudgetTransaction` |
| [BudgetTransactionsResponse](-budget-transactions-response/index.md) | `data class BudgetTransactionsResponse` |
| [BusinessDaysResponse](-business-days-response/index.md) | `data class BusinessDaysResponse` |
| [CallbackRelayedRequest](-callback-relayed-request/index.md) | `data class CallbackRelayedRequest` |
| [CategorizeTransactionsListRequest](-categorize-transactions-list-request/index.md) | `data class CategorizeTransactionsListRequest` |
| [CategorizeTransactionsRequest](-categorize-transactions-request/index.md) | `data class CategorizeTransactionsRequest` |
| [Category](-category/index.md) | Categories are used for categorization of transactions. They are structured as a category tree, and are available as a flat list of categories with parent/child relationships using their id and parent fields. Category information is used for pre-computed statistics, making aggregated spending and income data available for all the different nodes in the category tree. However, a transaction itself, can only be assigned to a leaf category. Both the `INCOME` and `EXPENSES` categories represent users' regular income and spending, while the `TRANSFER` categories are special in the sense that they represent transfers between accounts (potentially across banks), such as regular bank transfers, credit-card payments, mortgage amortizations and other transactions that should not add to the users' actual spending.`data class Category` |
| [Client](-client/index.md) | `data class Client` |
| [ClientMessage](-client-message/index.md) | `data class ClientMessage` |
| [CreateBudgetResponse](-create-budget-response/index.md) | `data class CreateBudgetResponse` |
| [CreateCredentialsRequest](-create-credentials-request/index.md) | `data class CreateCredentialsRequest` |
| [CreateOneOffBudgetRequest](-create-one-off-budget-request/index.md) | `data class CreateOneOffBudgetRequest` |
| [CreateRecurringBudgetRequest](-create-recurring-budget-request/index.md) | `data class CreateRecurringBudgetRequest` |
| [CreateUserRequest](-create-user-request/index.md) | `data class CreateUserRequest` |
| [CreateUserResponse](-create-user-response/index.md) | `data class CreateUserResponse` |
| [Credentials](-credentials/index.md) | The credentials model represents a user's connected providers from where financial data is accessed.`data class Credentials` |
| [CredentialsListResponse](-credentials-list-response/index.md) | `data class CredentialsListResponse` |
| [Currency](-currency/index.md) | `data class Currency` |
| [CurrencyDenominatedAmount](-currency-denominated-amount/index.md) | `data class CurrencyDenominatedAmount` |
| [DeleteTransactionPartResponse](-delete-transaction-part-response/index.md) | `data class DeleteTransactionPartResponse` |
| [DeleteUserRequest](-delete-user-request/index.md) | `data class DeleteUserRequest` |
| [Field](-field/index.md) | `data class Field` |
| [Filter](-filter/index.md) | `data class Filter` |
| [ImageUrls](-image-urls/index.md) | `data class ImageUrls` |
| [InsightActionData](-insight-action-data/index.md) | `data class InsightActionData` |
| [InsightData](-insight-data/index.md) | `data class InsightData` |
| [InsightProposedAction](-insight-proposed-action/index.md) | `data class InsightProposedAction` |
| [LinkTransactionsRequest](-link-transactions-request/index.md) | `data class LinkTransactionsRequest` |
| [LinkTransactionsResponse](-link-transactions-response/index.md) | `data class LinkTransactionsResponse` |
| [ListBudgetSpecificationsResponse](-list-budget-specifications-response/index.md) | `data class ListBudgetSpecificationsResponse` |
| [ListBudgetSummariesResponse](-list-budget-summaries-response/index.md) | `data class ListBudgetSummariesResponse` |
| [ManualAuthenticationRequest](-manual-authentication-request/index.md) | `data class ManualAuthenticationRequest` |
| [Market](-market/index.md) | `data class Market` |
| [MarketListResponse](-market-list-response/index.md) | `data class MarketListResponse` |
| [NotificationSettings](-notification-settings/index.md) | `data class NotificationSettings` |
| [OAuth2AuthenticationTokenResponse](-o-auth2-authentication-token-response/index.md) | `data class OAuth2AuthenticationTokenResponse` |
| [OAuth2AuthorizeResponse](-o-auth2-authorize-response/index.md) | `data class OAuth2AuthorizeResponse` |
| [OAuth2Client](-o-auth2-client/index.md) | `data class OAuth2Client` |
| [OneOffPeriodicity](-one-off-periodicity/index.md) | `data class OneOffPeriodicity` |
| [Period](-period/index.md) | `data class Period` |
| [Provider](-provider/index.md) | The provider model represents financial institutions to where Tink can connect. It specifies how Tink accesses the financial institution, metadata about the financialinstitution, and what financial information that can be accessed.`data class Provider` |
| [ProviderListResponse](-provider-list-response/index.md) | The provider list response object.`data class ProviderListResponse` |
| [ProviderMarketListResponse](-provider-market-list-response/index.md) | `data class ProviderMarketListResponse` |
| [RecurringPeriodicity](-recurring-periodicity/index.md) | `data class RecurringPeriodicity` |
| [RefreshCredentialsRequest](-refresh-credentials-request/index.md) | `data class RefreshCredentialsRequest` |
| [SearchQuery](-search-query/index.md) | `data class SearchQuery` |
| [SearchResponse](-search-response/index.md) | `data class SearchResponse` |
| [SearchResult](-search-result/index.md) | `data class SearchResult` |
| [SelectInsightActionRequest](-select-insight-action-request/index.md) | `data class SelectInsightActionRequest` |
| [SimilarTransactionsResponse](-similar-transactions-response/index.md) | `data class SimilarTransactionsResponse` |
| [StatisticQuery](-statistic-query/index.md) | `data class StatisticQuery` |
| [Statistics](-statistics/index.md) | Statistics contain derived data from different types of information which is available for a user. This calculated data is stored for a certain period of time with a certain time resolution, and could be based on information such as expenses, incomes or balances. As an example, statistics could be a time series of travel expenses calculated monthly for the last six months.`data class Statistics` |
| [StringDoublePair](-string-double-pair/index.md) | `data class StringDoublePair` |
| [SuggestTransactionsResponse](-suggest-transactions-response/index.md) | `data class SuggestTransactionsResponse` |
| [SupplementalInformation](-supplemental-information/index.md) | `data class SupplementalInformation` |
| [Transaction](-transaction/index.md) | An account usually contains multiple transactions (except for certain types of accounts where Tink can't access the underlying transactions, for example, certain `INVESTMENT` accounts). The transaction model represents any operation on an account, and could represent both the actual credit-card purchase on a `CREDIT_CARD` account, but also represent the transaction when you paid your credit-card bill. Most commonly, the transactions in an account should represent what the end-user typically regards as a transaction with its amount, description and date, etc.`data class Transaction` |
| [TransactionCluster](-transaction-cluster/index.md) | `data class TransactionCluster` |
| [TransactionLinkSuggestionResponse](-transaction-link-suggestion-response/index.md) | `data class TransactionLinkSuggestionResponse` |
| [TransactionPart](-transaction-part/index.md) | `data class TransactionPart` |
| [TransactionResponse](-transaction-response/index.md) | `data class TransactionResponse` |
| [TransferDestination](-transfer-destination/index.md) | `data class TransferDestination` |
| [UpdateBudgetRequest](-update-budget-request/index.md) | `data class UpdateBudgetRequest` |
| [UpdateBudgetResponse](-update-budget-response/index.md) | `data class UpdateBudgetResponse` |
| [UpdateCredentialsRequest](-update-credentials-request/index.md) | `data class UpdateCredentialsRequest` |
| [UpdateTransactionLinkRequest](-update-transaction-link-request/index.md) | `data class UpdateTransactionLinkRequest` |
| [User](-user/index.md) | The user model represents a unique Tink end-user and includes properties that defines the user, user profile information and user-modifiable settings. The user information can primarily be used whenever a Tink user signs up for a 3rd party service using her Tink account, or when user-modifiable settings, such as locale or currency, are needed in order to display or calculate the correct data in the 3rd party service.`data class User` |
| [UserProfile](-user-profile/index.md) | `data class UserProfile` |
