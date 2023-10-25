package com.tink.link.app.navToFlows

import android.app.Activity
import android.util.Log
import com.tink.link.app.NecessaryIds
import com.tink.link.app.TAG
import com.tink.link.core.base.Tink
import com.tink.link.core.data.request.accountAggregation.AddCredentials
import com.tink.link.core.data.request.accountAggregation.AuthenticateCredentials
import com.tink.link.core.data.request.accountAggregation.AuthorizeForOneTimeAccess
import com.tink.link.core.data.request.accountAggregation.RefreshCredentials
import com.tink.link.core.data.request.accountcheck.AccountCheckCreateReport
import com.tink.link.core.data.request.bundleReports.AccountDialogType
import com.tink.link.core.data.request.bundleReports.ReportType
import com.tink.link.core.data.request.bundleReports.ReportsCreateReport
import com.tink.link.core.data.request.bundleReports.ReportsRefreshableItem
import com.tink.link.core.data.request.businessAccountCheck.BusinessAccountCheckCreateReport
import com.tink.link.core.data.request.businessTransactions.BusinessConnectAccountsForContinuousAccess
import com.tink.link.core.data.request.businessTransactions.BusinessConnectAccountsForOneTimeAccess
import com.tink.link.core.data.request.businessTransactions.BusinessExtendConsent
import com.tink.link.core.data.request.businessTransactions.BusinessUpdateConsent
import com.tink.link.core.data.request.common.Scope
import com.tink.link.core.data.request.configuration.Configuration
import com.tink.link.core.data.request.expensecheck.ExpenseCheckCreateReport
import com.tink.link.core.data.request.incomecheck.IncomeCheckCreateReport
import com.tink.link.core.data.request.payment.InitiateBulkPayment
import com.tink.link.core.data.request.payment.InitiateBulkPaymentWithPermanentUser
import com.tink.link.core.data.request.payment.InitiateOneTimePayment
import com.tink.link.core.data.request.payment.InitiateOneTimePaymentWithPermanentUser
import com.tink.link.core.data.request.riskInsights.RiskInsightsCreateReport
import com.tink.link.core.data.request.transactions.ConnectAccountsForContinuousAccess
import com.tink.link.core.data.request.transactions.ConnectAccountsForOneTimeAccess
import com.tink.link.core.data.request.transactions.UpdateConsent
import com.tink.link.core.data.response.error.TinkError
import com.tink.link.core.data.response.success.accountAggregation.TinkAccountAggregationSuccess
import com.tink.link.core.data.response.success.accountCheck.TinkAccountCheckSuccess
import com.tink.link.core.data.response.success.bundleReports.TinkReportsSuccess
import com.tink.link.core.data.response.success.businessAccountCheck.TinkBusinessAccountCheckSuccess
import com.tink.link.core.data.response.success.businessTransactions.TinkBusinessTransactionsSuccess
import com.tink.link.core.data.response.success.expensecheck.TinkExpenseCheckSuccess
import com.tink.link.core.data.response.success.incomecheck.TinkIncomeCheckSuccess
import com.tink.link.core.data.response.success.payments.TinkPaymentsSuccess
import com.tink.link.core.data.response.success.riskInsights.TinkRiskInsightsSuccess
import com.tink.link.core.data.response.success.transactions.TinkTransactionsSuccess
import com.tink.link.core.navigator.LaunchMode

/**
 * This file is to show examples about how to launch each flow
 *
 * */

/**
 * This is an example for the Expense Check: create report flow.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showCreateReportForExpenseCheck(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to ExpenseCheckCreateReport().
    val request = ExpenseCheckCreateReport("SE")

    // Call this method to trigger the flow.
    Tink.ExpenseCheck.createReport(
        activity,
        configuration,
        request,
        launchMode,
        { success: TinkExpenseCheckSuccess ->
            Log.d(TAG, "expenseCheckId = ${success.expenseCheckId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for the Income Check: create report flow.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showCreateReportForIncomeCheck(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to IncomeCheckCreateReport().
    val request = IncomeCheckCreateReport("SE")

    // Call this method to trigger the flow.
    Tink.IncomeCheck.createReport(
        activity,
        configuration,
        request,
        launchMode,
        { success: TinkIncomeCheckSuccess ->
            Log.d(TAG, "incomeCheckId = ${success.incomeCheckId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for the Risk Insights: create report flow.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showCreateReportForRiskInsights(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to RiskInsightsCreateReport().
    val request = RiskInsightsCreateReport("SE")

    // Call this method to trigger the flow.
    Tink.RiskInsights.createReport(
        activity,
        configuration,
        request,
        launchMode,
        { success: TinkRiskInsightsSuccess ->
            Log.d(TAG, "riskInsightsId = ${success.riskInsightsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for the Account Check: create report flow.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showCreateReportForAccountCheck(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to AccountCheckCreateReport().
    val request = AccountCheckCreateReport("SE")

    // Call this method to trigger the flow.
    Tink.AccountCheck.createReport(
        activity,
        configuration,
        request,
        launchMode,
        { success: TinkAccountCheckSuccess ->
            Log.d(TAG, "accountVerificationReportId = ${success.accountVerificationReportId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for the Business Account Check: create report flow.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showCreateReportForBusinessAccountCheck(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to BusinessAccountCheckCreateReport().
    val request = BusinessAccountCheckCreateReport("SE")

    // Call this method to trigger the flow.
    Tink.BusinessAccountCheck.createReport(
        activity,
        configuration,
        request,
        launchMode,
        { success: TinkBusinessAccountCheckSuccess ->
            Log.d(TAG, "businessAccountVerificationReportId = ${success.businessAccountVerificationReportId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for the ReportsCreateReport: create-report flow (Fetch account and transaction data in one flow).
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showCreateReportForReports(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    val request = ReportsCreateReport(
        /**
         * Required, can be selected from [ReportType]
         * */
        reportTypes = listOf(ReportType.TRANSACTION_REPORT, ReportType.ACCOUNT_VERIFICATION_REPORT),

        /**
         * Required, can be selected from [ReportsRefreshableItem]
         * */
        refreshableItems = listOf(ReportsRefreshableItem.IDENTITY_DATA, ReportsRefreshableItem.CHECKING_ACCOUNTS),

        /**
         * Required, can be selected from [AccountDialogType]
         * */
        accountDialogType = AccountDialogType.SINGLE
    )

    // Call this method to trigger the flow.
    Tink.Reports.createReport(
        activity,
        configuration,
        request,
        launchMode,
        { success: TinkReportsSuccess ->
            Log.d(TAG, "accountVerificationReportId = ${success.accountVerificationReportId}")
            Log.d(TAG, "transactionReportId = ${success.transactionReportId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for one-time payment.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showOneTimePayment(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to InitiateOneTimePayment()
    val oneTimePayment = InitiateOneTimePayment(paymentRequestId = NecessaryIds.paymentRequestId, "SE")

    // Call this method to trigger the flow.
    Tink.Payments.initiateOneTimePayment(
        activity,
        configuration,
        oneTimePayment,
        launchMode,
        { success: TinkPaymentsSuccess ->
            Log.d(TAG, "payment_request_id = ${success.paymentRequestId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for Initiate One-time payment with permanent user.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showOneTimePaymentWithPermanentUser(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to InitiateOneTimePaymentWithPermanentUser()
    val oneTimePaymentWithPermanentUser = InitiateOneTimePaymentWithPermanentUser(
        paymentRequestId = NecessaryIds.paymentRequestId,
        authorizationCode = NecessaryIds.authorizationCode,
        market = "SE"
    )

    // Call this method to trigger the flow.
    Tink.Payments.initiateOneTimePayment(
        activity,
        configuration,
        oneTimePaymentWithPermanentUser,
        launchMode,
        { success: TinkPaymentsSuccess ->
            Log.d(TAG, "payment_request_id = ${success.paymentRequestId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for one-time bulk payment.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showBulkPayment(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to InitiateBulkPayment()
    val bulkPayment = InitiateBulkPayment(paymentRequestId = NecessaryIds.paymentRequestId, "SE")

    // Call this method to trigger the flow.
    Tink.Payments.initiateBulkPayment(
        activity,
        configuration,
        bulkPayment,
        launchMode,
        { success: TinkPaymentsSuccess ->
            Log.d(TAG, "payment_request_id = ${success.paymentRequestId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for initiating a one-time bulk payment with permanent users.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showBulkPaymentWithPermanentUser(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to InitiateBulkPaymentWithPermanentUser()
    val bulkPaymentWithPermanentUser = InitiateBulkPaymentWithPermanentUser(
        paymentRequestId = NecessaryIds.paymentRequestId,
        authorizationCode = NecessaryIds.authorizationCode,
        market = "SE"
    )

    // Call this method to trigger the flow.
    Tink.Payments.initiateBulkPayment(
        activity,
        configuration,
        bulkPaymentWithPermanentUser,
        launchMode,
        { success: TinkPaymentsSuccess ->
            Log.d(TAG, "payment_request_id = ${success.paymentRequestId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for one time access to Transactions.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showConnectAccountsForOneTimeAccess(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to ConnectAccountsForOneTimeAccess().
    val oneTimeAccess = ConnectAccountsForOneTimeAccess("SE")

    // Call this method to trigger the flow.
    Tink.Transactions.connectAccountsForOneTimeAccess(
        activity,
        configuration,
        oneTimeAccess,
        launchMode,
        { success: TinkTransactionsSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
            Log.d(TAG, "code = ${success.code}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for one time access to Business Transactions.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showConnectAccountsForBusinessOneTimeAccess(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to ConnectAccountsForOneTimeAccess().
    val oneTimeAccess = BusinessConnectAccountsForOneTimeAccess("SE")

    // Call this method to trigger the flow.
    Tink.BusinessTransactions.connectAccountsForOneTimeAccess(
        activity,
        configuration,
        oneTimeAccess,
        launchMode,
        { success: TinkBusinessTransactionsSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
            Log.d(TAG, "code = ${success.code}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for connecting continuous access to Transactions.
 * authorizationCode is required, it can be retrieved by following this link:[authorization code](https://docs.tink.com/api#general/oauth/create-authorization).
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showConnectAccountsForContinuousAccess(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    val continuousAccessConnect =
        ConnectAccountsForContinuousAccess(
            authorizationCode = NecessaryIds.authorizationCode, // Required (Replace with your value).
            market = "SE" // Required
        )

    // Call this method to trigger the flow.
    Tink.Transactions.connectAccountsForContinuousAccess(
        activity,
        configuration,
        continuousAccessConnect,
        launchMode,
        { success: TinkTransactionsSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for connecting continuous access to Business Transactions.
 * authorizationCode is required, it can be retrieved by following this link:[authorization code](https://docs.tink.com/api#general/oauth/create-authorization).
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showConnectAccountsForBusinessContinuousAccess(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    val continuousAccessConnect =
        BusinessConnectAccountsForContinuousAccess(
            authorizationCode = NecessaryIds.authorizationCode, // Required (Replace with your value).
            market = "SE" // Required
        )

    // Call this method to trigger the flow.
    Tink.BusinessTransactions.connectAccountsForContinuousAccess(
        activity,
        configuration,
        continuousAccessConnect,
        launchMode,
        { success: TinkBusinessTransactionsSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for updating consent on continuous access to Transactions.
 * Both authorizationCode and credentialsId are required for starting this flow.
 * authorizationCode can be retrieved by following this link:[authorization code](https://docs.tink.com/api#general/oauth/create-authorization).
 * credentialsId can be retrieved from callback from previous flow -- Connecting continuous access to Transactions:  Tink.Transactions.connectContinuousAccess.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showUpdateConsent(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    val continuousAccessUpdate = UpdateConsent(
        authorizationCode = NecessaryIds.authorizationCode, // Required (Replace with your value).
        credentialsId = NecessaryIds.credentialsId // Required (Replace with your value).
    )

    // Call this method to trigger the flow.
    Tink.Transactions.updateConsent(
        activity,
        configuration,
        continuousAccessUpdate,
        launchMode,
        { success: TinkTransactionsSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for updating consent on continuous access to Business Transactions.
 * Both authorizationCode and credentialsId are required for starting this flow.
 * authorizationCode can be retrieved by following this link:[authorization code](https://docs.tink.com/api#general/oauth/create-authorization).
 * credentialsId can be retrieved from callback from previous flow -- Connecting continuous access to Transactions:  Tink.Transactions.connectContinuousAccess.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showBusinessUpdateConsent(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    val continuousAccessUpdate = BusinessUpdateConsent(
        authorizationCode = NecessaryIds.authorizationCode, // Required (Replace with your value).
        credentialsId = NecessaryIds.credentialsId // Required (Replace with your value).
    )

    // Call this method to trigger the flow.
    Tink.BusinessTransactions.updateConsent(
        activity,
        configuration,
        continuousAccessUpdate,
        launchMode,
        { success: TinkBusinessTransactionsSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for extending consent on continuous access to Transactions.
 * Both authorizationCode and credentialsId are required for starting this flow.
 * authorizationCode can be retrieved by following this link:[authorization code](https://docs.tink.com/api#general/oauth/create-authorization).
 * credentialsId can be retrieved from callback from previous flow -- Connecting continuous access to Transactions:  Tink.Transactions.connectContinuousAccess.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showExtendConsent(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    val continuousAccessExtend = com.tink.link.core.data.request.transactions.ExtendConsent(
        authorizationCode = NecessaryIds.authorizationCode, // Required (Replace with your value).
        credentialsId = NecessaryIds.credentialsId // Required (Replace with your value).
    )

    // Call this method to trigger the flow.
    Tink.Transactions.extendConsent(
        activity,
        configuration,
        continuousAccessExtend,
        launchMode,
        { success: TinkTransactionsSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for extending consent on continuous access to Business Transactions.
 * Both authorizationCode and credentialsId are required for starting this flow.
 * authorizationCode can be retrieved by following this link:[authorization code](https://docs.tink.com/api#general/oauth/create-authorization).
 * credentialsId can be retrieved from callback from previous flow -- Connecting continuous access to Transactions:  Tink.Transactions.connectContinuousAccess.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showBusinessExtendConsent(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    val continuousAccessExtend = BusinessExtendConsent(
        authorizationCode = NecessaryIds.authorizationCode, // Required (Replace with your value).
        credentialsId = NecessaryIds.credentialsId // Required (Replace with your value).
    )

    // Call this method to trigger the flow.
    Tink.BusinessTransactions.extendConsent(
        activity,
        configuration,
        continuousAccessExtend,
        launchMode,
        { success: TinkBusinessTransactionsSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example of Account Aggregation with one-time-access.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showAccountAggregationAuthorizeForOneTimeAccess(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to AuthorizeForOneTimeAccess()
    val authorizeForOneTimeAccess = AuthorizeForOneTimeAccess(
        market = "SE",

        // The scopes present in this example is what is needed for aggregation.
        scope = listOf(
            Scope.USER_CREATE,
            Scope.AUTHORIZATION_GRANT
        )
    )

    // Call this method to trigger the flow.
    Tink.AccountAggregation.authorizeForOneTimeAccess(
        activity,
        configuration,
        authorizeForOneTimeAccess,
        launchMode,
        { success: TinkAccountAggregationSuccess ->
            Log.d(TAG, "code = ${success.code}")
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for adding the credentials of Account Aggregation with continuous-access.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showAccountAggregationAddCredentials(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to AddCredentials()
    val addCredentials = AddCredentials(
        authorizationCode = NecessaryIds.authorizationCode,
        market = "SE"
    )

    // Call this method to trigger the flow.
    Tink.AccountAggregation.addCredentials(
        activity,
        configuration,
        addCredentials,
        launchMode,
        { success: TinkAccountAggregationSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for refreshing the credentials of Account Aggregation with continuous-access.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showAccountAggregationRefreshCredentials(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to RefreshCredentials()
    val refreshCredentials = RefreshCredentials(
        authorizationCode = NecessaryIds.authorizationCode,
        credentialsId = NecessaryIds.credentialsId,
        market = "SE"
    )

    // Call this method to trigger the flow.
    Tink.AccountAggregation.refreshCredentials(
        activity,
        configuration,
        refreshCredentials,
        launchMode,
        { success: TinkAccountAggregationSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for authenticating the credentials of Account Aggregation with continuous-access.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showAccountAggregationAuthenticateCredentials(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to AuthenticateCredentials()
    val authenticateCredentials = AuthenticateCredentials(
        authorizationCode = NecessaryIds.authorizationCode,
        credentialsId = NecessaryIds.credentialsId,
        market = "SE"
    )

    // Call this method to trigger the flow.
    Tink.AccountAggregation.authenticateCredentials(
        activity,
        configuration,
        authenticateCredentials,
        launchMode,
        { success: TinkAccountAggregationSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for extending the consent of Account Aggregation with continuous-access.
 * @param activity
 * @param configuration The Tink Link [Configuration] for this flow.
 * @param launchMode The [LaunchMode] for this flow.
 * */
fun showAccountAggregationExtendConsent(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to ExtendConsent()
    val extendConsent = com.tink.link.core.data.request.accountAggregation.ExtendConsent(
        authorizationCode = NecessaryIds.authorizationCode,
        credentialsId = NecessaryIds.credentialsId,
        market = "SE"
    )

    // Call this method to trigger the flow.
    Tink.AccountAggregation.extendConsent(
        activity,
        configuration,
        extendConsent,
        launchMode,
        { success: TinkAccountAggregationSuccess ->
            Log.d(TAG, "credentials_id = ${success.credentialsId}")
        },
        { error: TinkError ->
            Log.d(TAG, "error message = ${error.errorDescription}")
        }
    )
}
