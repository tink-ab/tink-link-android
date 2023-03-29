package com.tink.link.app.navToFlows

import android.app.Activity
import android.util.Log
import com.tink.link.app.NecessaryIds
import com.tink.link.app.TAG
import com.tink.link.core.base.Tink
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
import com.tink.link.core.data.request.common.Market
import com.tink.link.core.data.request.configuration.Configuration
import com.tink.link.core.data.request.expensecheck.ExpenseCheckCreateReport
import com.tink.link.core.data.request.incomecheck.IncomeCheckCreateReport
import com.tink.link.core.data.request.payment.InitiateOneTimePayment
import com.tink.link.core.data.request.riskInsights.RiskInsightsCreateReport
import com.tink.link.core.data.request.transactions.ConnectAccountsForContinuousAccess
import com.tink.link.core.data.request.transactions.ConnectAccountsForOneTimeAccess
import com.tink.link.core.data.request.transactions.ExtendConsent
import com.tink.link.core.data.request.transactions.UpdateConsent
import com.tink.link.core.data.response.error.TinkError
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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showCreateReportForExpenseCheck(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to ExpenseCheckCreateReport().
    val request = ExpenseCheckCreateReport(Market.SE)

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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showCreateReportForIncomeCheck(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to IncomeCheckCreateReport().
    val request = IncomeCheckCreateReport(Market.SE)

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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showCreateReportForRiskInsights(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to RiskInsightsCreateReport().
    val request = RiskInsightsCreateReport(Market.SE)

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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showCreateReportForAccountCheck(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to AccountCheckCreateReport().
    val request = AccountCheckCreateReport(Market.SE)

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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showCreateReportForBusinessAccountCheck(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to BusinessAccountCheckCreateReport().
    val request = BusinessAccountCheckCreateReport(Market.SE)

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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showOneTimePayment(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to InitiateOneTimePayment()
    val oneTimePayment = InitiateOneTimePayment(paymentRequestId = NecessaryIds.paymentRequestId, Market.SE)

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
 * This is an example for one time access to Transactions.
 * @param activity
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showConnectAccountsForOneTimeAccess(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to ConnectAccountsForOneTimeAccess().
    val oneTimeAccess = ConnectAccountsForOneTimeAccess(Market.SE)

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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showConnectAccountsForBusinessOneTimeAccess(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    // More parameters can be added to ConnectAccountsForOneTimeAccess().
    val oneTimeAccess = BusinessConnectAccountsForOneTimeAccess(Market.SE)

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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showConnectAccountsForContinuousAccess(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    val continuousAccessConnect =
        ConnectAccountsForContinuousAccess(
            authorizationCode = NecessaryIds.authorizationCode, // Required (Replace with your value).
            market = Market.SE // Required
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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showConnectAccountsForBusinessContinuousAccess(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    val continuousAccessConnect =
        BusinessConnectAccountsForContinuousAccess(
            authorizationCode = NecessaryIds.authorizationCode, // Required (Replace with your value).
            market = Market.SE // Required
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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showExtendConsent(
    activity: Activity,
    configuration: Configuration,
    launchMode: LaunchMode
) {
    val continuousAccessExtend = ExtendConsent(
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
 * @param configuration [Configuration] Tink Link configuration for this flow
 * @param launchMode can be selected from [LaunchMode]
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
