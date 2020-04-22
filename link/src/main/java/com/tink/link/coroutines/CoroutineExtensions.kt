package com.tink.link.coroutines

import com.tink.service.handler.ResultHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

internal fun <T> CoroutineScope.launchForResult(
    resultHandler: ResultHandler<T>,
    getResult: suspend () -> T
) {
    launch {
        try {
            resultHandler.onSuccess(getResult())
        } catch (error: Throwable) {
            resultHandler.onError(error)
        }
    }
}
