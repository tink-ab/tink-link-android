package com.tink.link.payments.di

import com.tink.link.payments.TransferContext
import com.tink.link.payments.TransferContextImpl
import dagger.Binds
import dagger.Module

@Module
abstract class TransferModule {

    @Binds
    internal abstract fun bindsTransferContext(implementation: TransferContextImpl): TransferContext
}
