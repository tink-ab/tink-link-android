package com.tink.link.payments.di

import com.tink.link.payments.TransferRepository
import com.tink.link.payments.TransferRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class TransferModule {

    @Binds
    internal abstract fun bindsTransferRepository(implementation: TransferRepositoryImpl): TransferRepository
}
