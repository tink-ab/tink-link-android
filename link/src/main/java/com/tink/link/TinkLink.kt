package com.tink.link

import android.content.Context
import android.net.Uri
import com.tink.link.core.credentials.CredentialRepository
import com.tink.link.core.provider.ProviderRepository
import com.tink.link.core.user.User
import com.tink.link.core.user.UserContext
import com.tink.service.ServiceModule
import com.tink.service.authentication.AccessTokenEventBus
import com.tink.service.authorization.Scope
import com.tink.service.authorization.UserService
import com.tink.service.handler.ResultHandler
import com.tink.service.network.NetworkModule
import com.tink.service.network.TinkConfiguration
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * Starting point for using Tink Link in your application.
 * Call [TinkLink.create] to obtain an instance, then use [setUser] to add authorization capabilities to that instance.
 * After that you can get further access to specific repositories with the context fetched from [getUserContext].
 */
@Component(
    modules = [
        ServiceModule::class,
        NetworkModule::class
    ]
)
@Singleton
abstract class TinkLink {

    internal abstract val accessTokenEventBus: AccessTokenEventBus

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
    fun getUserContext(): UserContext? = user?.let { _userContext }

    /**
     * Set the user to the TinkLink instance. This enables you to fetch the [UserContext] with
     * [getUserContext].
     */
    fun setUser(user: User) {
        this.user = user
        accessTokenEventBus.postAccessToken(user.accessToken)
    }

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
    fun authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) {
        userService.authenticate(
            authenticationCode,
            ResultHandler(
                { accessToken -> resultHandler.onSuccess(User(accessToken)) },
                resultHandler.onError
            )
        )
    }

    companion object {
        /**
         * Create an instance of TinkLink. This operation is expensive and should not be called to often.
         * Make sure to save a reference to your instance and manage it accordingly.
         *
         * @param tinkLinkConfiguration Your configuration
         * @param context An Android [Context]. This should have application scope.
         */
        @JvmStatic
        fun create(
            tinkLinkConfiguration: TinkConfiguration,
            context: Context
        ): TinkLink =
            DaggerTinkLink.builder()
                .tinkLinkConfiguration(tinkLinkConfiguration)
                .applicationContext(context.applicationContext)
                .build()
    }

    @Component.Builder
    internal interface Builder {

        @BindsInstance
        fun tinkLinkConfiguration(tinkLinkConfiguration: TinkConfiguration): Builder

        @BindsInstance
        fun applicationContext(applicationContext: Context): Builder

        fun networkModule(networkModule: NetworkModule): Builder

        fun build(): TinkLink
    }
}

@Subcomponent
internal interface RepositoryComponent : Repositories

internal interface Repositories {
    val providerRepository: ProviderRepository
    val credentialRepository: CredentialRepository
}