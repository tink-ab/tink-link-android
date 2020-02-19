package com.tink.link

import android.net.Uri
import com.tink.core.Tink
import com.tink.core.TinkComponent
import com.tink.core.provider.ProviderRepository
import com.tink.link.core.credentials.CredentialRepository
import com.tink.link.core.user.User
import com.tink.link.core.user.UserContext
import com.tink.service.authorization.Scope
import com.tink.service.authorization.UserService
import com.tink.service.handler.ResultHandler
import dagger.Component
import dagger.Subcomponent

/**
 * Starting point for using Tink Link in your application.
 * Call [TinkLink.create] to obtain an instance, then use [setUser] to add authorization capabilities to that instance.
 * After that you can get further access to specific repositories with the context fetched from [getUserContext].
 */
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

    private var user: User? = null
    private val _userContext = object : UserContext {
        override val providerRepository: ProviderRepository
            get() = repositories.providerRepository
        override val credentialRepository: CredentialRepository
            get() = repositories.credentialRepository

        /**
         * Handle a third-party callback.
         *
         * Call this method when identifying a third-party callback from the registered
         * [redirectUri][TinkLinkConfiguration.redirectUri]
         *
         * Example:
         * ```
         * private fun redirectIfAppropriate(intent: Intent?) {
         *      intent?.data?.let { uri ->
         *          tinkLink.getUserContext()?.handleUri(uri)
         *      }
         * }
         * ```
         */
        override fun handleUri(uri: Uri, resultHandler: ResultHandler<Unit>?) =
            thirdPartyCallbackHandler.handleUri(uri, resultHandler)

        /**
         * Authorize your user towards a new set of scopes.
         * These scopes needs to be enabled for your [clientId][TinkLinkConfiguration.oAuthClientId].
         */
        override fun authorize(scopes: Set<Scope>, resultHandler: ResultHandler<String>) =
            userService.authorize(scopes, resultHandler)

    }

    /**
     * Fetches the [UserContext] for this TinkLink instance if a user is set.
     *
     * If no user is set, this will return `null`
     */
    internal fun getUserContext(): UserContext? = user?.let { _userContext }

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

    /**
     * Authenticate an existing user with an authentication code.
     *
     * On a successful result, your resultHandler should call [setUser] to set this user to the TinkLink instance.
     */
    internal fun authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) {
        userService.authenticate(
            authenticationCode,
            ResultHandler(
                { accessToken -> resultHandler.onSuccess(User(accessToken)) },
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

@JvmSynthetic
fun Tink.getUserContext(): UserContext? = TinkLinkComponent.instance.getUserContext()

@JvmSynthetic
fun Tink.authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) =
    TinkLinkComponent.instance.authenticateUser(authenticationCode, resultHandler)
