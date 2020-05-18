package com.tink.link.pay

import com.tink.core.Tink
import com.tink.core.TinkComponent
import dagger.Component

@TinkLinkPaymentsScope
@Component(dependencies = [TinkComponent::class])
abstract class TinkLinkPaymentsComponent {

    abstract val transferContext: TransferContext

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
