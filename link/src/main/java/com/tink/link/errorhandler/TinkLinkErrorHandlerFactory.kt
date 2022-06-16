package com.tink.link.errorhandler

import com.tink.link.BuildConfig

object TinkLinkErrorHandlerFactory {
    fun createErrorHandler(): TinkLinkErrorHandler {
        return if (BuildConfig.DEBUG) TinkLinkDebugErrorHandler() else TinkLinkReleaseErrorHandler()
    }
}
