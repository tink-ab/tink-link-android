package com.tink.link.ui.credentials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.link.ui.CombinedLiveData
import com.tink.link.ui.Event
import com.tink.link.core.credentials.CredentialRepository
import com.tink.model.authentication.ThirdPartyAppAuthentication
import com.tink.model.credential.Credential
import com.tink.model.misc.Field
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler
import com.tink.service.misc.toFieldMap
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription

class CredentialViewModel : ViewModel() {

    private val _credentials = MutableLiveData<List<Credential>>()
    val credentials: LiveData<List<Credential>> = _credentials

    private val credentialId = MutableLiveData<String>()

    /**
     * Combines the output of [credentialId] and [credentials] to a [LiveData] that holds the
     * [Credential] with the id held in [credentialId].
     *
     * As a side-effect, it also updates our view state based on the status of the credential.
     */
    val createdCredential = CombinedLiveData(credentialId, credentials) { id, list ->
        list.firstOrNull { it.id == id }
            ?.also { credential ->
                when (credential.status) {
                    Credential.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION,
                    Credential.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION -> {
                        credential.thirdPartyAppAuthentication
                            ?.let { _thirdPartyAuthenticationEvent.postValue(Event(it)) }
                            ?.also {
                                _viewState.postValue(ViewState.UPDATING)
                            }
                    }

                    Credential.Status.AWAITING_SUPPLEMENTAL_INFORMATION -> {
                        setFields(credential.supplementalInformation)
                        _viewState.postValue(ViewState.NOT_LOADING)
                    }

                    Credential.Status.AUTHENTICATION_ERROR,
                    Credential.Status.TEMPORARY_ERROR,
                    Credential.Status.PERMANENT_ERROR -> {
                        _viewState.postValue(ViewState.NOT_LOADING)
                        credential.statusPayload?.let { _errorEvent.postValue(Event(it)) }
                    }

                    Credential.Status.UPDATING -> _viewState.postValue(ViewState.UPDATING)
                    Credential.Status.UPDATED -> _viewState.postValue(ViewState.UPDATED)
                    else -> {}
                }
            }
    }

    fun updateViewState(viewState: ViewState) = _viewState.postValue(viewState)

    private val _viewState = MutableLiveData<ViewState>().also { it.value = ViewState.NOT_LOADING }
    val viewState: LiveData<ViewState> = _viewState

    private val _thirdPartyAuthenticationEvent =
        MutableLiveData<Event<ThirdPartyAppAuthentication>>()
    val thirdPartyAuthenticationEvent: LiveData<Event<ThirdPartyAppAuthentication>> =
        _thirdPartyAuthenticationEvent

    private val _errorEvent = MutableLiveData<Event<String>>()
    val errorEvent: LiveData<Event<String>> = _errorEvent

    private val _fields = MutableLiveData<List<Field>>()
    val fields: LiveData<List<Field>> = _fields

    fun setFields(fields: List<Field>) = _fields.postValue(fields)

    private var streamSubscription: StreamSubscription? = null

    /**
     * Stream credentials from the repository and post updates to [_credentials].
     */
    private fun fetchCredentials(credentialRepository: CredentialRepository) {
        streamSubscription?.unsubscribe()
        streamSubscription = credentialRepository.listStream().subscribe(
            object : StreamObserver<List<Credential>> {
                override fun onNext(value: List<Credential>) {
                    if (_credentials.value != value) {
                        _credentials.postValue(value)
                    }
                }
            }
        )
    }

    /**
     * Pass the filled [fields] to the [credentialRepository] to authorize the user.
     */
    fun createCredential(
        provider: Provider,
        fields: List<Field>,
        credentialRepository: CredentialRepository,
        onError: (Throwable) -> Unit
    ) {
        createdCredential.value
            ?.takeIf { it.status == Credential.Status.AWAITING_SUPPLEMENTAL_INFORMATION }
            ?.let {
                supplementalInformation(
                    credentialId = it.id,
                    fields = fields,
                    credentialRepository = credentialRepository,
                    onError = onError
                )
                return
            }
        credentialRepository.create(
            provider.name,
            provider.credentialType,
            fields.toFieldMap(),
            ResultHandler(
                { credential ->
                    fetchCredentials(credentialRepository) // Start streaming credentials
                    credentialId.postValue(credential.id)
                },
                {
                    _viewState.postValue(ViewState.NOT_LOADING)
                    onError(it)
                }
            )
        )
    }

    private fun supplementalInformation(
        credentialId: String,
        fields: List<Field>,
        credentialRepository: CredentialRepository,
        onError: (Throwable) -> Unit
    ) {
        credentialRepository.supplementInformation(
            credentialId,
            fields.toFieldMap(),
            ResultHandler(
                {},
                {
                    _viewState.postValue(ViewState.NOT_LOADING)
                    onError(it)
                }
            )
        )
    }

    override fun onCleared() {
        super.onCleared()
        streamSubscription?.unsubscribe()
    }

    fun updateCredential(
        id: String,
        fields: List<Field>,
        credentialRepository: CredentialRepository,
        onError: (Throwable) -> Unit
    ) {

        credentialId.value = id

        createdCredential.value
            ?.takeIf { it.status == Credential.Status.AWAITING_SUPPLEMENTAL_INFORMATION }
            ?.let {
                supplementalInformation(
                    credentialId = it.id,
                    fields = fields,
                    credentialRepository = credentialRepository,
                    onError = onError
                )
                return
            }
        credentialRepository.update(
            id,
            fields.toFieldMap(),
            ResultHandler(
                { credential ->
                    fetchCredentials(credentialRepository) // Start streaming credentials
                },
                {
                    _viewState.postValue(ViewState.NOT_LOADING)
                    onError(it)
                }
            )
        )
    }

    enum class ViewState { NOT_LOADING, UPDATING, UPDATED }
}
