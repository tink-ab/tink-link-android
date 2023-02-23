package com.tink.link.app.navToFlows

import android.app.Activity
import android.util.Log
import com.tink.link.app.NecessaryIds
import com.tink.link.core.base.Tink
import com.tink.link.core.data.request.accountcheck.AccountCheckCreateReport
import com.tink.link.core.data.request.expensecheck.ExpenseCheckCreateReport
import com.tink.link.core.data.request.incomecheck.IncomeCheckCreateReport
import com.tink.link.core.data.request.payment.InitiateOneTimePayment
import com.tink.link.core.data.request.riskInsights.RiskInsightsCreateReport
import com.tink.link.core.data.request.transaction.ConnectAccountsForContinuousAccess
import com.tink.link.core.data.request.transaction.ConnectAccountsForOneTimeAccess
import com.tink.link.core.data.request.transaction.ExtendConsent
import com.tink.link.core.data.request.transaction.UpdateConsent
import com.tink.link.core.data.response.error.TinkError
import com.tink.link.core.data.response.success.accountCheck.TinkAccountCheckSuccess
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
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showCreateReportForExpenseCheck(
    activity: Activity,
    launchMode: LaunchMode
) {
    // More parameters, such as market = Market.SE can be added to ExpenseCheckCreateReport().
    val request = ExpenseCheckCreateReport()

    // Call this method to trigger the flow.
    Tink.ExpenseCheck.createReport(
        activity,
        request,
        launchMode,
        { success: TinkExpenseCheckSuccess ->
            Log.d("tink-sdk-sample", "expenseCheckId = ${success.expenseCheckId}")
        },
        { error: TinkError ->
            Log.d("tink-sdk-sample", "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for the Income Check: create report flow.
 * @param activity
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showCreateReportForIncomeCheck(
    activity: Activity,
    launchMode: LaunchMode
) {
    // More parameters, such as market = Market.SE can be added to IncomeCheckCreateReport().
    val request = IncomeCheckCreateReport()

    // Call this method to trigger the flow.
    Tink.IncomeCheck.createReport(
        activity,
        request,
        launchMode,
        { success: TinkIncomeCheckSuccess ->
            Log.d("tink-sdk-sample", "incomeCheckId = ${success.incomeCheckId}")
        },
        { error: TinkError ->
            Log.d("tink-sdk-sample", "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for the Risk Insights: create report flow.
 * @param activity
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showCreateReportForRiskInsights(
    activity: Activity,
    launchMode: LaunchMode
) {
    // More parameters, such as market = Market.SE can be added to RiskInsightsCreateReport().
    val request = RiskInsightsCreateReport()

    // Call this method to trigger the flow.
    Tink.RiskInsights.createReport(
        activity,
        request,
        launchMode,
        { success: TinkRiskInsightsSuccess ->
            Log.d("tink-sdk-sample", "riskInsightsId = ${success.riskInsightsId}")
        },
        { error: TinkError ->
            Log.d("tink-sdk-sample", "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for the Account Check: create report flow.
 * @param activity
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showCreateReportForAccountCheck(
    activity: Activity,
    launchMode: LaunchMode
) {
    // More parameters, such as market = Market.SE can be added to AccountCheckCreateReport().
    val request = AccountCheckCreateReport()

    // Call this method to trigger the flow.
    Tink.AccountCheck.createReport(
        activity,
        request,
        launchMode,
        { success: TinkAccountCheckSuccess ->
            Log.d("tink-sdk-sample", "accountVerificationReportId = ${success.accountVerificationReportId}")
            Log.d("tink-sdk-sample", "state = ${success.state}")
        },
        { error: TinkError ->
            Log.d("tink-sdk-sample", "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for one-time payment.
 * @param activity
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showOneTimePayment(
    activity: Activity,
    launchMode: LaunchMode
) {
    // More parameters, such as market = Market.SE can be added to InitiateOneTimePayment()
    val oneTimePayment = InitiateOneTimePayment(paymentRequestId = NecessaryIds.paymentRequestId)

    // Call this method to trigger the flow.
    Tink.Payments.initiateOneTimePayment(
        activity,
        oneTimePayment,
        launchMode,
        { success: TinkPaymentsSuccess ->
            Log.d("tink-sdk-sample", "payment_request_id = ${success.paymentRequestId}")
        },
        { error: TinkError ->
            Log.d("tink-sdk-sample", "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for one time access to Transactions.
 * @param activity
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showConnectAccountsForOneTimeAccess(
    activity: Activity,
    launchMode: LaunchMode
) {
    // More parameters, such as market = Market.SE can be added to ConnectAccountsForOneTimeAccess().
    val oneTimeAccess = ConnectAccountsForOneTimeAccess()

    // Call this method to trigger the flow.
    Tink.Transactions.connectAccountsForOneTimeAccess(
        activity,
        oneTimeAccess,
        launchMode,
        { success: TinkTransactionsSuccess ->
            Log.d("tink-sdk-sample", "credentials_id = ${success.credentialsId}")
            Log.d("tink-sdk-sample", "code = ${success.code}")
        },
        { error: TinkError ->
            Log.d("tink-sdk-sample", "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for connecting continuous access to Transactions.
 * authorizationCode is required, it can be retrieved by following this link:[authorization code](https://docs.tink.com/api#general/oauth/create-authorization).
 * @param activity
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showConnectAccountsForContinuousAccess(
    activity: Activity,
    launchMode: LaunchMode
) {
    val continuousAccessConnect =
        ConnectAccountsForContinuousAccess(
            authorizationCode = NecessaryIds.authorizationCode // Required (Replace with your value).
        )

    // Call this method to trigger the flow.
    Tink.Transactions.connectAccountsForContinuousAccess(
        activity,
        continuousAccessConnect,
        launchMode,
        { success: TinkTransactionsSuccess ->
            Log.d("tink-sdk-sample", "credentials_id = ${success.credentialsId}")
            Log.d("tink-sdk-sample", "code = ${success.code}")
        },
        { error: TinkError ->
            Log.d("tink-sdk-sample", "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for updating consent on continuous access to Transactions.
 * Both authorizationCode and credentialsId are required for starting this flow.
 * authorizationCode can be retrieved by following this link:[authorization code](https://docs.tink.com/api#general/oauth/create-authorization).
 * credentialsId can be retrieved from callback from previous flow -- Connecting continuous access to Transactions:  Tink.Transactions.connectContinuousAccess.
 * @param activity
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showUpdateConsent(
    activity: Activity,
    launchMode: LaunchMode
) {
    val continuousAccessUpdate = UpdateConsent(
        authorizationCode = NecessaryIds.authorizationCode, // Required (Replace with your value).
        credentialsId = NecessaryIds.credentialsId // Required (Replace with your value).
    )

    // Call this method to trigger the flow.
    Tink.Transactions.updateConsent(
        activity,
        continuousAccessUpdate,
        launchMode,
        { success: TinkTransactionsSuccess ->
            Log.d("tink-sdk-sample", "credentials_id = ${success.credentialsId}")
            Log.d("tink-sdk-sample", "code = ${success.code}")
        },
        { error: TinkError ->
            Log.d("tink-sdk-sample", "error message = ${error.errorDescription}")
        }
    )
}

/**
 * This is an example for extending consent on continuous access to Transactions.
 * Both authorizationCode and credentialsId are required for starting this flow.
 * authorizationCode can be retrieved by following this link:[authorization code](https://docs.tink.com/api#general/oauth/create-authorization).
 * credentialsId can be retrieved from callback from previous flow -- Connecting continuous access to Transactions:  Tink.Transactions.connectContinuousAccess.
 * @param activity
 * @param launchMode can be selected from [LaunchMode]
 * */
fun showExtendConsent(
    activity: Activity,
    launchMode: LaunchMode
) {
    val continuousAccessExtend = ExtendConsent(
        authorizationCode = NecessaryIds.authorizationCode, // Required (Replace with your value).
        credentialsId = NecessaryIds.credentialsId // Required (Replace with your value).
    )

    // Call this method to trigger the flow.
    Tink.Transactions.extendConsent(
        activity,
        continuousAccessExtend,
        launchMode,
        { success: TinkTransactionsSuccess ->
            Log.d("tink-sdk-sample", "credentials_id = ${success.credentialsId}")
            Log.d("tink-sdk-sample", "code = ${success.code}")
        },
        { error: TinkError ->
            Log.d("tink-sdk-sample", "error message = ${error.errorDescription}")
        }
    )
}
