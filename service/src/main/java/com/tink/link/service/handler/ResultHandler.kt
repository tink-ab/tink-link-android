package com.tink.link.service.handler

import androidx.core.util.Consumer

/**
 * This is the basic wrapper for asynchronous callbacks in TinkLink.
 *
 * @constructor Creates a new result handler with success and error callbacks. Use this default constructor from Kotlin.
 * From Java it is recommended to use the secondary constructor.
 */
class ResultHandler<T>(
    val onSuccess: (T) -> Unit,
    val onError: (Throwable) -> Unit
) {
    /**
     * Convenience constructor for use in Java.
     * Example usage:
     * ```
     * new ResultHandler<String>(
     *     value -> { handle value },
     *     error -> { handle error }
     * )
     * ```
     */
    constructor(onSuccess: Consumer<T>, onError: Consumer<Throwable>) :
            this(onSuccess::accept, onError::accept)
}
