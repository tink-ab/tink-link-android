package com.tink.link.pay

import com.tink.core.Tink
import com.tink.link.getUserContext


/**
 * This is for Java compatibility only. Use extensions on [Tink] when using Kotlin
 */
@kotlin.SinceKotlin(version = "999999999.0.0")
object TinkLinkPayments {

    /**
     * Fetches the [TransferContext] from Tink.
     *
     */
    @JvmStatic
    fun getTransferContext() = Tink.getUserContext()

}

// For Kotlin

/**
 * Fetches the [TransferContext] from Tink.
 *
 */
@JvmSynthetic
fun Tink.getTransferContext(): TransferContext = TinkLinkPaymentsComponent.instance.transferContext
