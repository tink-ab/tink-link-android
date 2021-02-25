package com.tink.link.ui.analytics.models

internal enum class ScreenEvent {
    ERROR_SCREEN,
    SUCCESS_SCREEN,
    SUPPLEMENTAL_INFORMATION_SCREEN,
    PROVIDER_SELECTION_SCREEN,
    AUTHENTICATION_USER_TYPE_SELECTION_SCREEN,
    FINANCIAL_INSTITUTION_SELECTION_SCREEN,
    ACCESS_TYPE_SELECTION_SCREEN,
    CREDENTIALS_TYPE_SELECTION_SCREEN,
    SUBMIT_CREDENTIALS_SCREEN
}

internal data class ScreenEventData(
    val providerName: String?,
    val credentialsId: String?
)
