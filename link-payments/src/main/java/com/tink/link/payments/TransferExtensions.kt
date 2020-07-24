package com.tink.link.payments

import com.tink.core.Tink
import com.tink.link.payments.di.TinkLinkPaymentsComponent

/**
 * This is for Java compatibility only. Use extensions on [Tink] when using Kotlin
 */
@kotlin.SinceKotlin(version = "999999999.0.0")
object TinkLinkPayments {

    /**
     * Fetches the [TransferRepository] from Tink.
     *
     */
    @JvmStatic
    fun getTransferRepository() = Tink.getTransferRepository()
}

// For Kotlin

/**
 * Fetches the [TransferRepository] from Tink.
 *
 */
@JvmSynthetic
fun Tink.getTransferRepository(): TransferRepository = TinkLinkPaymentsComponent.instance.transferRepository
