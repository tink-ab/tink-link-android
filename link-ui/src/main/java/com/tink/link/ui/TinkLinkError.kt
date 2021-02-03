package com.tink.link.ui

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Represents errors that happen during the Tink Link UI flow.
 */
sealed class TinkLinkError : Parcelable {

    /**
     * Tink Link UI is unable to fetch providers.
     */
    @Parcelize
    object UnableToFetchProviders : TinkLinkError()

    /**
     * Tink Link UI is unable to fetch the provider with the specified [providerName].
     */
    @Parcelize
    data class ProviderNotFound(val providerName: String) : TinkLinkError()

    /**
     * Tink Link UI is unable to fetch the credentials with the specified [credentialsId].
     */
    @Parcelize
    data class CredentialsNotFound(val credentialsId: String) : TinkLinkError()

    /**
     * Tink Link UI failed to add one or more credentials.
     *
     * @property errorsByCredentialsId A map of failed credentials ids to [errors][TinkLinkErrorInfo]
     */
    @Parcelize
    data class FailedToAddCredentials(val errorsByCredentialsId: Map<String, TinkLinkErrorInfo>) :
        TinkLinkError()

    /**
     * An internal error occurred in the Tink Link UI flow.
     */
    @Parcelize
    object InternalError : TinkLinkError()
}

/**
 * A wrapper class that provides information about the underlying error causing the [TinkLinkError]
 *
 * @property message The error message
 */
sealed class TinkLinkErrorInfo : Parcelable {

    abstract val message: String

    /**
     * This represents an HTTP exception that may have occurred.
     *
     * @property code The HTTP error code
     * @property message The error message
     */
    @Parcelize
    data class HttpError(val code: Int, override val message: String) : TinkLinkErrorInfo()

    /**
     * This represents a generic error that may have occurred.
     *
     * @property message The error message
     */
    @Parcelize
    data class InternalError(override val message: String) : TinkLinkErrorInfo()
}
