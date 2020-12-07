package com.tink.link.ui.analytics.models

import com.tink.link.ui.CredentialsOperation
import com.tink.link.ui.ProviderSelection

internal enum class AnalyticsFlow {
    CREDENTIALS_AUTHENTICATE,
    CREDENTIALS_ADD,
    CREDENTIALS_REFRESH,
    CREDENTIALS_UPDATE
}

internal data class AnalyticsFlowInfo(
    val flow: AnalyticsFlow,
    val credentialsId: String? = null,
    val isTest: Boolean
)

internal fun CredentialsOperation.toFlowInfo(): AnalyticsFlowInfo =
    when (this) {
        is CredentialsOperation.Create -> {
            AnalyticsFlowInfo(
                flow = AnalyticsFlow.CREDENTIALS_ADD,
                credentialsId = null,
                isTest = providerSelection
                    .takeIf { it is ProviderSelection.ProviderList }
                    ?.let {
                        (it as ProviderSelection.ProviderList).filter.includeDemoProviders
                    }
                    ?: false
            )
        }
        is CredentialsOperation.Authenticate -> {
            AnalyticsFlowInfo(
                flow = AnalyticsFlow.CREDENTIALS_AUTHENTICATE,
                credentialsId = credentialsId,
                isTest = false
            )
        }
        is CredentialsOperation.Refresh -> {
            AnalyticsFlowInfo(
                flow = AnalyticsFlow.CREDENTIALS_REFRESH,
                credentialsId = credentialsId,
                isTest = false
            )
        }
        is CredentialsOperation.Update -> {
            AnalyticsFlowInfo(
                flow = AnalyticsFlow.CREDENTIALS_UPDATE,
                credentialsId = credentialsId,
                isTest = false
            )
        }
    }
