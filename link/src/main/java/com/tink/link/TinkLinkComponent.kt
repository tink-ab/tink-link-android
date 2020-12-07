package com.tink.link

import android.net.Uri
import com.tink.core.Tink
import com.tink.core.TinkComponent
import com.tink.core.provider.ProviderRepository
import com.tink.link.consent.ConsentContext
import com.tink.link.core.access.AccessRepository
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.link.core.user.UserContext
import com.tink.model.user.Scope
import com.tink.model.user.User
import com.tink.model.user.UserInfo
import com.tink.service.authorization.UserService
import com.tink.service.handler.ResultHandler
import dagger.Component
import dagger.Subcomponent

@Component(
    dependencies = [TinkComponent::class]
)
@TinkLinkScope
internal abstract class TinkLinkComponent {

    internal abstract val repositoryComponent: RepositoryComponent

    private val repositories: Repositories
        get() = repositoryComponent

    internal abstract val userService: UserService

    internal abstract val thirdPartyCallbackHandler: ThirdPartyCallbackHandler

    internal abstract val consentContext: ConsentContext

    internal abstract val accessRepository: AccessRepository

    private val _userContext = object : UserContext {
        override val providerRepository: ProviderRepository
            get() = repositories.providerRepository
        override val credentialsRepository: CredentialsRepository
            get() = repositories.credentialsRepository

        override fun handleUri(uri: Uri, resultHandler: ResultHandler<Unit>?) =
            thirdPartyCallbackHandler.handleUri(uri, resultHandler)

        override fun authorize(scopes: Set<Scope>, resultHandler: ResultHandler<String>) {
            accessRepository.authorize(scopes, resultHandler)
        }
    }

    internal fun getUserContext(): UserContext? = Tink.getUser()?.let { _userContext }

    internal fun requireUserContext(): UserContext = checkNotNull(getUserContext()) {
        "User was not set. Call Tink.setUser to set the user before calling this."
    }

    internal fun createTemporaryUser(
        market: String,
        locale: String,
        resultHandler: ResultHandler<User>
    ) {
        accessRepository.createAnonymousUser(market, locale, resultHandler)
    }

    internal fun authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) {
        accessRepository.authenticate(authenticationCode, resultHandler)
    }

    internal fun getUserInfo(resultHandler: ResultHandler<UserInfo>) {
        accessRepository.getUserInfo(resultHandler)
    }

    companion object {
        private fun create(): TinkLinkComponent {
            return DaggerTinkLinkComponent.builder()
                .tinkComponent(Tink.requireComponent())
                .build()
        }

        internal val instance by lazy { create() }
    }

    @Component.Builder
    internal interface Builder {
        fun tinkComponent(tinkComponent: TinkComponent): Builder
        fun build(): TinkLinkComponent
    }
}

@Subcomponent
internal interface RepositoryComponent : Repositories

internal interface Repositories {
    val providerRepository: ProviderRepository
    val credentialsRepository: CredentialsRepository
}

@javax.inject.Scope
internal annotation class TinkLinkScope
