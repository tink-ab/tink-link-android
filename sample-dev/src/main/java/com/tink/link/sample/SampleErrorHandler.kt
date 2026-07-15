package com.tink.link.sample

import com.tink.link.core.data.response.error.AccountInformationErrorReason
import com.tink.link.core.data.response.error.AuthenticationErrorType
import com.tink.link.core.data.response.error.AuthorizationErrorReason
import com.tink.link.core.data.response.error.ErrorStatus
import com.tink.link.core.data.response.error.ProviderErrorReason
import com.tink.link.core.data.response.error.TinkError
import com.tink.link.core.data.response.error.TinkSideErrorReason
import com.tink.link.core.data.response.error.UserLoginErrorReason


/**
 * Sample class that shows how to parse a [TinkError] obj
 * For detailed explanation, please refer to [handle-transactions-error-codes](https://docs.tink.com/resources/transactions/handle-transactions-error-codes)
 */
object SampleErrorHandler {

    private const val TAG = "tink-sdk-sample"

    fun parseError(error: TinkError) {
        Logger.d(TAG, "error status = ${error.errorStatus}")
        Logger.d(TAG, "error type = ${error.errorType}")
        Logger.d(TAG, "error reason = ${error.errorReason}")
        Logger.d(TAG, "error message = ${error.errorDescription}")
        Logger.d(TAG, "error trackingId = ${error.trackingId}")
        when (val status = error.code) {
            is ErrorStatus.AuthenticationError -> {
                Logger.d(TAG, "error type = ${status.errorType}")
                when (val type = status.errorType) {
                    is AuthenticationErrorType.AccountInformationError -> {
                        Logger.d(TAG, "error reason = ${type.reason}")
                        when (type.reason) {
                            AccountInformationErrorReason.NO_ACCOUNTS -> Unit
                            AccountInformationErrorReason.UNDEFINED -> Unit
                        }
                    }

                    is AuthenticationErrorType.AuthorizationError -> when (type.reason) {
                        AuthorizationErrorReason.ACTION_NOT_PERMITTED,
                        AuthorizationErrorReason.SESSION_EXPIRED,
                        AuthorizationErrorReason.USER_ACTION_REQUIRED -> Logger.d(
                            TAG,
                            "error reason = ${type.reason}"
                        )

                        AuthorizationErrorReason.UNDEFINED -> Unit
                    }

                    is AuthenticationErrorType.ProviderError -> when (type.reason) {
                        ProviderErrorReason.PROVIDER_UNAVAILABLE,
                        ProviderErrorReason.LICENSED_PARTY_REJECTED -> Logger.d(
                            TAG,
                            "error reason = ${type.reason}"
                        )

                        ProviderErrorReason.UNDEFINED -> Unit
                    }

                    is AuthenticationErrorType.TinkSideError -> when (type.reason) {
                        TinkSideErrorReason.UNKNOWN_ERROR,
                        TinkSideErrorReason.TINK_INTERNAL_SERVER_ERROR,
                        TinkSideErrorReason.AUTHENTICATION_METHOD_NOT_SUPPORTED -> Logger.d(
                            TAG,
                            "error reason = ${type.reason}"
                        )

                        TinkSideErrorReason.UNDEFINED -> Unit
                    }

                    is AuthenticationErrorType.UserLoginError -> when (type.reason) {
                        UserLoginErrorReason.THIRD_PARTY_AUTHENTICATION_UNAVAILABLE,
                        UserLoginErrorReason.STATIC_CREDENTIALS_INCORRECT,
                        UserLoginErrorReason.DYNAMIC_CREDENTIALS_INCORRECT,
                        UserLoginErrorReason.DYNAMIC_CREDENTIALS_FLOW_CANCELLED,
                        UserLoginErrorReason.DYNAMIC_CREDENTIALS_FLOW_TIMEOUT,
                        UserLoginErrorReason.USER_NOT_A_CUSTOMER,
                        UserLoginErrorReason.USER_BLOCKED,
                        UserLoginErrorReason.USER_CONCURRENT_LOGINS -> Logger.d(
                            TAG,
                            "error reason = ${type.reason}"
                        )

                        UserLoginErrorReason.UNDEFINED -> Unit
                    }

                    AuthenticationErrorType.Undefined -> Unit
                }
            }

            is ErrorStatus.BadRequest -> Unit
            is ErrorStatus.InternalError -> Unit
            is ErrorStatus.TemporaryError -> Unit
            is ErrorStatus.UserCancelled -> Unit
            ErrorStatus.Undefined -> Unit
        }
    }
}
