package com.tink.link

import android.net.Uri
import com.tink.core.Tink
import com.tink.core.TinkComponent
import com.tink.core.provider.ProviderRepository
import com.tink.link.consent.ConsentContext
import com.tink.link.core.credentials.CredentialRepository
import com.tink.link.core.user.UserContext
import com.tink.service.authentication.user.User
import com.tink.service.authorization.Scope
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

    private val _userContext = object : UserContext {
        override val providerRepository: ProviderRepository
            get() = repositories.providerRepository
        override val credentialRepository: CredentialRepository
            get() = repositories.credentialRepository

        override fun handleUri(uri: Uri, resultHandler: ResultHandler<Unit>?) =
            thirdPartyCallbackHandler.handleUri(uri, resultHandler)

        override fun authorize(scopes: Set<Scope>, resultHandler: ResultHandler<String>) =
            userService.authorize(scopes, resultHandler)

    }

    internal fun getUserContext(): UserContext? = Tink.getUser()?.let { _userContext }

//    /**
//     * Create a temporary user.
//     * This allows you to launch the flow and fetch data for users without having permanent Tink users.
//     *
//     * On a successful result, your resultHandler should call [setUser] to set this user to the TinkLink instance.
//     */
//    private fun createTemporaryUser(market: String, locale: String, resultHandler: ResultHandler<User>) {
//        authenticationRepository.createAnonymousUser(
//            market,
//            locale,
//            ResultHandler(
//                { accessToken -> resultHandler.onSuccess(User(accessToken)) },
//                resultHandler.onError
//            )
//        )
//    }

    internal fun authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) {
        userService.authenticate(
            authenticationCode,
            ResultHandler(
                { accessToken -> resultHandler.onSuccess(User.fromAccessToken(accessToken)) },
                resultHandler.onError
            )
        )
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
    val credentialRepository: CredentialRepository
}

@javax.inject.Scope
internal annotation class TinkLinkScope

