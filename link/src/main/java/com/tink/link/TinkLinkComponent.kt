package com.tink.link

import android.net.Uri
import com.tink.core.Tink
import com.tink.core.TinkComponent
import com.tink.core.provider.ProviderRepository
import com.tink.link.consent.ConsentContext
import com.tink.link.core.authentication.AuthenticationRepository
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.link.core.user.UserContext
import com.tink.link.coroutines.launchForResult
import com.tink.model.user.Scope
import com.tink.service.authentication.user.User
import com.tink.service.authorization.UserService
import com.tink.service.handler.ResultHandler
import dagger.Component
import dagger.Subcomponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

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

    internal abstract val authenticationRepository: AuthenticationRepository

    private val _userContext = object : UserContext {
        override val providerRepository: ProviderRepository
            get() = repositories.providerRepository
        override val credentialsRepository: CredentialsRepository
            get() = repositories.credentialsRepository

        override fun handleUri(uri: Uri, resultHandler: ResultHandler<Unit>?) =
            thirdPartyCallbackHandler.handleUri(uri, resultHandler)

        override fun authorize(scopes: Set<Scope>, resultHandler: ResultHandler<String>) {
            authenticationRepository.authorize(scopes, resultHandler)
        }

    }

    internal fun getUserContext(): UserContext? = Tink.getUser()?.let { _userContext }

//    /**
//     * Create a temporary user.
//     * This allows you to launch the flow and fetch data for users without having permanent Tink users.
//     *
//     * On a successful result, your resultHandler should call [Tink.setUser] to set this user to the Tink instance.
//     */
//    fun createTemporaryUser(
//        market: String,
//        locale: String,
//        resultHandler: ResultHandler<User>
//    ) {
//        authenticationRepository.createAnonymousUser(market, locale, resultHandler)
//    }

    internal fun authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) {
        authenticationRepository.authenticate(authenticationCode, resultHandler)
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

