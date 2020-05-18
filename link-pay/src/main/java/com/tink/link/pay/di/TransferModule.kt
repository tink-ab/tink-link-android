package com.tink.link.pay.di

import com.tink.link.pay.TransferContext
import com.tink.link.pay.TransferContextImpl
import dagger.Binds
import dagger.Module

@Module
abstract class TransferModule {

    @Binds
    internal abstract fun bindsTransferContext(implementation: TransferContextImpl): TransferContext
}
