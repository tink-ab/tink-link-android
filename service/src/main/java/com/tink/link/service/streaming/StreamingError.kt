package com.tink.link.service.streaming

import io.grpc.Status

enum class StreamingError {
    UNAUTHENTICATED,
    UNKNOWN;

    companion object {
        fun fromThrowable(throwable: Throwable) =
            when (Status.fromThrowable(throwable)) {
                Status.UNAUTHENTICATED -> UNAUTHENTICATED
                else -> UNKNOWN
            }
    }
}