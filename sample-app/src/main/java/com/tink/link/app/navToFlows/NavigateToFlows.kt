package com.tink.link.app.navToFlows

import android.app.Activity
import android.util.Log
import com.tink.link.core.navigator.LaunchMode

fun navigateToFlows(mode: LaunchMode, selectedFlow: String, activity: Activity) {
    when (selectedFlow) {
        FlowDetails.transactionOptions[0] -> showConnectAccountsForOneTimeAccess(activity, mode)
        FlowDetails.transactionOptions[1] -> showConnectAccountsForContinuousAccess(activity, mode)
        FlowDetails.transactionOptions[2] -> showUpdateConsent(activity, mode)
        FlowDetails.transactionOptions[3] -> showExtendConsent(activity, mode)
        FlowDetails.paymentOptions[0] -> showOneTimePayment(activity, mode)
        FlowDetails.reportOptions[0] -> showCreateReportForAccountCheck(activity, mode)
        FlowDetails.reportOptions[1] -> showCreateReportForIncomeCheck(activity, mode)
        FlowDetails.reportOptions[2] -> showCreateReportForExpenseCheck(activity, mode)
        FlowDetails.reportOptions[3] -> showCreateReportForRiskInsights(activity, mode)
        else -> {
            Log.d(
                "tink-sdk-sample",
                "not matching selection or not yet implemented"
            )
        }
    }
}
