package com.tink.link.errorhandler

import com.tink.link.TinkLinkException
import timber.log.Timber

interface TinkLinkErrorHandler {
    fun handleHttpError(
        errorCode: Int,
        fatalErrorCode: Int,
        fatalErrorMessage: String,
        nonFatalErrorMessage: String,
        t: Throwable
    )
    fun handleInternalError(message: String)
}

class TinkLinkReleaseErrorHandler : TinkLinkErrorHandler {
    override fun handleHttpError(
        errorCode: Int,
        fatalErrorCode: Int,
        fatalErrorMessage: String,
        nonFatalErrorMessage: String,
        t: Throwable
    ) {
        // left empty intentionally. Don't throw exceptions or log in production
    }

    override fun handleInternalError(message: String) {
        // left empty intentionally.
    }
}

class TinkLinkDebugErrorHandler : TinkLinkErrorHandler {
    override fun handleHttpError(
        errorCode: Int,
        fatalErrorCode: Int,
        fatalErrorMessage: String,
        nonFatalErrorMessage: String,
        t: Throwable
    ) {
        if (errorCode == fatalErrorCode) {
            throw TinkLinkException(fatalErrorMessage, t)
        } else {
            Timber.e(nonFatalErrorMessage)
        }
    }
    override fun handleInternalError(message: String) {
        Timber.e(message)
    }
}
