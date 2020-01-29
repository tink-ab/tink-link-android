package com.tink.link.service

import com.tink.link.service.authentication.AuthenticationService
import com.tink.link.service.authentication.AuthenticationServiceImpl
import com.tink.link.service.authorization.UserService
import com.tink.link.service.authorization.UserServiceImpl
import com.tink.link.service.credential.CredentialService
import com.tink.link.service.credential.CredentialServiceImpl
import com.tink.link.service.provider.ProviderService
import com.tink.link.service.provider.ProviderServiceImpl
import dagger.Binds
import dagger.Module

@Module
abstract class ServiceModule {

    @Binds
    abstract fun providerService(implementation: ProviderServiceImpl): ProviderService

    @Binds
    abstract fun credentialService(implementation: CredentialServiceImpl): CredentialService

    @Binds
    internal abstract fun authenticationService(implementation: AuthenticationServiceImpl): AuthenticationService

    @Binds
    internal abstract fun authorizationService(implementation: UserServiceImpl): UserService
}
