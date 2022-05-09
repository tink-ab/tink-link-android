package com.tink.link.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tink.core.Tink
import com.tink.core.provider.ProviderRepository
import com.tink.link.consent.ConsentContext
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.link.core.user.UserContext
import com.tink.link.errorhandler.TinkLinkErrorHandler
import com.tink.link.getConsentContext
import com.tink.link.getErrorHandler
import com.tink.link.getUserContext
import com.tink.link.ui.extensions.toTinkLinkErrorInfo
import com.tink.model.credentials.Credentials
import com.tink.model.provider.Provider
import com.tink.model.user.Scope
import com.tink.service.handler.ResultHandler
import kotlinx.coroutines.launch

enum class ClientConfigurationCheck {
    SUCCESS, GENERIC_ERROR, AUTHENTICATION_ERROR
}

internal class MainViewModel : ViewModel() {

    private val consentContext: ConsentContext = requireNotNull(Tink.getConsentContext())
    private val userContext: UserContext by lazy { requireNotNull(Tink.getUserContext()) }
    private val credentialsRepository: CredentialsRepository by lazy { userContext.credentialsRepository }
    private val providerRepository: ProviderRepository by lazy { userContext.providerRepository }
    private val errorHandler: TinkLinkErrorHandler by lazy { Tink.getErrorHandler() }

    private val _clientConfigurationObservable = MutableLiveData<ClientConfigurationCheck>()
    val clientConfigurationObservable: LiveData<ClientConfigurationCheck> = _clientConfigurationObservable

    internal fun checkClientConfiguration(scopes: List<Scope>) {
        consentContext.describeClient(
            scopes = scopes.toSet(),
            resultHandler = ResultHandler(
                {
                    _clientConfigurationObservable.postValue(ClientConfigurationCheck.SUCCESS)
                }
            ) {
                val errorStatus = when (val tinkLinkErrorInfo = it.toTinkLinkErrorInfo()) {
                    is TinkLinkErrorInfo.HttpError -> {
                        errorHandler.handleHttpError(
                            errorCode = tinkLinkErrorInfo.code,
                            fatalErrorCode = 401,
                            fatalErrorMessage = "Redirect URI is wrong. Please make sure to use the same 'redirect' URI defined in the Tink console",
                            nonFatalErrorMessage = "Error from api/v1/oauth/describe",
                            t = it
                        )
                        ClientConfigurationCheck.AUTHENTICATION_ERROR
                    }
                    is TinkLinkErrorInfo.InternalError -> {
                        errorHandler.handleNonHttpError("Non HTTP error from api/v1/oauth/describe")
                        ClientConfigurationCheck.GENERIC_ERROR
                    }
                }
                _clientConfigurationObservable.postValue(errorStatus)
            }
        )
    }

    fun setCredentialsId(
        credentialsId: String,
        onSuccess: (CredentialsToProvider) -> Unit,
        onError: (TinkLinkError) -> Unit
    ) {
        viewModelScope.launch {
            credentialsRepository.getCredentials(
                credentialsId,
                ResultHandler(
                    { credentials ->
                        providerRepository.getProvider(
                            credentials.providerName,
                            ResultHandler(
                                { provider ->
                                    if (provider != null) {
                                        onSuccess(CredentialsToProvider(credentials, provider))
                                    } else {
                                        onError(TinkLinkError.ProviderNotFound(credentials.providerName))
                                    }
                                },
                                {
                                    onError(TinkLinkError.ProviderNotFound(credentials.providerName))
                                }
                            )
                        )
                    },
                    {
                        onError(TinkLinkError.CredentialsNotFound(credentialsId))
                    }
                )
            )
        }
    }
}

internal data class CredentialsToProvider(
    val credentials: Credentials,
    val provider: Provider
)
