package com.tink.link.payments.di

import com.tink.core.Tink
import com.tink.core.TinkComponent
import com.tink.link.payments.TransferRepository
import dagger.Component

@TinkLinkPaymentsScope
@Component(dependencies = [TinkComponent::class], modules = [TransferModule::class])
internal abstract class TinkLinkPaymentsComponent {

    abstract val transferRepository: TransferRepository

    companion object {
        private fun create(): TinkLinkPaymentsComponent {
            return DaggerTinkLinkPaymentsComponent.builder()
                .tinkComponent(Tink.requireComponent())
                .build()
        }

        internal val instance by lazy { create() }
    }
}

@javax.inject.Scope
internal annotation class TinkLinkPaymentsScope
