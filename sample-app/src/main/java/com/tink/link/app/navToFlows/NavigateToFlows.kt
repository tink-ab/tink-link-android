package com.tink.link.app.navToFlows

import android.app.Activity
import android.util.Log
import com.tink.link.app.TAG
import com.tink.link.core.data.request.configuration.Configuration
import com.tink.link.core.navigator.LaunchMode

fun navigateToFlows(mode: LaunchMode, configuration: Configuration, selectedFlow: String, activity: Activity) {
    when (selectedFlow) {
        FlowDetails.transactionOptions[0] -> showConnectAccountsForOneTimeAccess(activity, configuration, mode)
        FlowDetails.transactionOptions[1] -> showConnectAccountsForBusinessOneTimeAccess(activity, configuration, mode)
        FlowDetails.transactionOptions[2] -> showConnectAccountsForContinuousAccess(activity, configuration, mode)
        FlowDetails.transactionOptions[3] -> showConnectAccountsForBusinessContinuousAccess(activity, configuration, mode)
        FlowDetails.transactionOptions[4] -> showUpdateConsent(activity, configuration, mode)
        FlowDetails.transactionOptions[5] -> showBusinessUpdateConsent(activity, configuration, mode)
        FlowDetails.transactionOptions[6] -> showExtendConsent(activity, configuration, mode)
        FlowDetails.transactionOptions[7] -> showBusinessExtendConsent(activity, configuration, mode)

        FlowDetails.paymentOptions[0] -> showOneTimePayment(activity, configuration, mode)
        FlowDetails.paymentOptions[1] -> showOneTimePaymentWithPermanentUser(activity, configuration, mode)

        FlowDetails.reportOptions[0] -> showCreateReportForAccountCheck(activity, configuration, mode)
        FlowDetails.reportOptions[1] -> showCreateReportForBusinessAccountCheck(activity, configuration, mode)
        FlowDetails.reportOptions[2] -> showCreateReportForIncomeCheck(activity, configuration, mode)
        FlowDetails.reportOptions[3] -> showCreateReportForExpenseCheck(activity, configuration, mode)
        FlowDetails.reportOptions[4] -> showCreateReportForRiskInsights(activity, configuration, mode)
        FlowDetails.reportOptions[5] -> showCreateReportForReports(activity, configuration, mode)

        else -> {
            Log.d(TAG, "not matching selection or not yet implemented")
        }
    }
}
