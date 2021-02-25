package com.tink.link.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.core.provider.ProviderRepository
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.link.core.user.UserContext
import com.tink.link.getUserContext
import com.tink.model.credentials.Credentials
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler

internal class MainViewModel : ViewModel() {

    private val userContext: UserContext = requireNotNull(Tink.getUserContext())
    private val credentialsRepository: CredentialsRepository = userContext.credentialsRepository
    private val providerRepository: ProviderRepository = userContext.providerRepository

    private val _credentialsToProvider: MutableLiveData<CredentialsToProvider> = MutableLiveData()
    val credentialsToProvider: LiveData<CredentialsToProvider> = _credentialsToProvider

    private val _onError: MutableLiveData<TinkLinkError> = MutableLiveData()
    val onError: LiveData<TinkLinkError> = _onError

    fun setCredentialsId(credentialsId: String) {
        credentialsRepository.getCredentials(
            credentialsId,
            ResultHandler(
                { credentials ->
                    providerRepository.getProvider(
                        credentials.providerName,
                        ResultHandler(
                            { provider ->
                                if (provider != null) {
                                    _credentialsToProvider.postValue(
                                        CredentialsToProvider(credentials, provider)
                                    )
                                } else {
                                    _onError.postValue(TinkLinkError.ProviderNotFound(credentials.providerName))
                                }
                            },
                            {
                                _onError.postValue(TinkLinkError.ProviderNotFound(credentials.providerName))
                            }
                        )
                    )
                },
                {
                    _onError.postValue(TinkLinkError.CredentialsNotFound(credentialsId))
                }
            )
        )
    }
}

internal data class CredentialsToProvider(
    val credentials: Credentials,
    val provider: Provider
)
