package com.tink.link.app.navToFlows

object FlowDetails {
    val transactionOptions = listOf(
        "Connect account: one-time-access",
        "Connect account: one-time-access for business",
        "Connect account: continuous-access",
        "Connect account: continuous-access for business",
        "Update consent",
        "Update consent for business",
        "Extend consent",
        "Extend consent for business"
    )

    val paymentOptions = listOf(
        "One-time payment",
        "One-time payment with permanent user",
        "Bulk payment",
        "Bulk payment with permanent user",
        "Variable recurring payment"
    )

    val reportOptions = listOf(
        "Create account report",
        "Create account report for business",
        "Create income report",
        "Create expense report",
        "Create risk insights report",
        "Reports: account & transaction"
    )

    val accountAggregationOptions = listOf(
        "Authorize for one-time-access",
        "Add credentials",
        "Refresh credentials",
        "Authenticate credentials",
        "Extend consent"
    )
}
