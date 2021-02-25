package com.tink.link.ui.extensions

import com.tink.link.ui.TinkLinkErrorInfo
import retrofit2.HttpException

internal fun Throwable.toTinkLinkErrorInfo(): TinkLinkErrorInfo =
    if (this is HttpException) {
        TinkLinkErrorInfo.HttpError(code(), localizedMessage ?: message())
    } else {
        TinkLinkErrorInfo.InternalError(localizedMessage ?: message ?: "")
    }
