package com.tink.sample.credentials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.link.getUserContext
import com.tink.model.authentication.ThirdPartyAppAuthentication
import com.tink.model.credentials.Credentials
import com.tink.model.misc.Field
import com.tink.model.provider.Provider
import com.tink.sample.CombinedLiveData
import com.tink.sample.Event
import com.tink.service.handler.ResultHandler
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription

class CredentialsViewModel : ViewModel() {

    private val credentialsRepository = requireNotNull(Tink.getUserContext()?.credentialsRepository)

    private val _credentials = MutableLiveData<List<Credentials>>()
    val credentials: LiveData<List<Credentials>> = _credentials

    private val credentialsId = MutableLiveData<String>()

    /**
     * Combines the output of [credentialsId] and [credentials] to a [LiveData] that holds the
     * [Credentials] with the id held in [credentialsId].
     *
     * As a side-effect, it also updates our view state based on the status of the credentials.
     */
    val createdCredentials = CombinedLiveData(
        credentialsId,
        credentials
    ) { id, list ->
        list.firstOrNull { it.id == id }
            ?.also { credentials ->
                when (credentials.status) {
                    Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION,
                    Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION -> {
                        credentials.thirdPartyAppAuthentication
                            ?.let { _thirdPartyAuthenticationEvent.postValue(Event(it)) }
                            ?.also {
                                _viewState.postValue(ViewState.UPDATING)
                            }
                    }

                    Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION -> {
                        setFields(credentials.supplementalInformation)
                        _viewState.postValue(ViewState.NOT_LOADING)
                    }

                    Credentials.Status.AUTHENTICATION_ERROR,
                    Credentials.Status.TEMPORARY_ERROR,
                    Credentials.Status.PERMANENT_ERROR -> {
                        _viewState.postValue(ViewState.NOT_LOADING)
                        credentials.statusPayload?.let { _errorEvent.postValue(Event(it)) }
                    }

                    Credentials.Status.UPDATING -> _viewState.postValue(ViewState.UPDATING)
                    Credentials.Status.UPDATED -> _viewState.postValue(ViewState.UPDATED)
                    else -> {
                    }
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
    private fun fetchCredentials() {
        streamSubscription?.unsubscribe()
        streamSubscription = credentialsRepository.listStream().subscribe(
            object : StreamObserver<List<Credentials>> {
                override fun onNext(value: List<Credentials>) {
                    if (_credentials.value != value) {
                        _credentials.postValue(value)
                    }
                }
            }
        )
    }

    /**
     * Pass the filled [fields] to the [credentialsRepository] to authorize the user.
     */
    fun createCredentials(
        provider: Provider,
        fields: List<Field>,
        onError: (Throwable) -> Unit
    ) {
        createdCredentials.value
            ?.takeIf { it.status == Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION }
            ?.let {
                supplementalInformation(
                    credentialsId = it.id,
                    fields = fields,
                    onError = onError
                )
                return
            }
        credentialsRepository.create(
            provider.name,
            provider.credentialsType,
            fields.toFieldMap(),
            ResultHandler(
                { credentials ->
                    fetchCredentials() // Start streaming credentials
                    credentialsId.postValue(credentials.id)
                },
                {
                    _viewState.postValue(ViewState.NOT_LOADING)
                    onError(it)
                }
            )
        )
    }

    private fun supplementalInformation(
        credentialsId: String,
        fields: List<Field>,
        onError: (Throwable) -> Unit
    ) {
        credentialsRepository.supplementInformation(
            credentialsId,
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

    fun updateCredentials(
        id: String,
        provider: Provider,
        fields: List<Field>,
        onError: (Throwable) -> Unit
    ) {

        credentialsId.value = id

        createdCredentials.value
            ?.takeIf { it.status == Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION }
            ?.let {
                supplementalInformation(
                    credentialsId = it.id,
                    fields = fields,
                    onError = onError
                )
                return
            }
        credentialsRepository.update(
            id,
            provider.name,
            fields.toFieldMap(),
            ResultHandler(
                { credentials ->
                    fetchCredentials() // Start streaming credentials
                },
                {
                    _viewState.postValue(ViewState.NOT_LOADING)
                    onError(it)
                }
            )
        )
    }

    fun authenticateCredentials(
        id: String,
        onError: (Throwable) -> Unit
    ) {
        credentialsId.postValue(id)
        credentialsRepository.authenticate(id,
            ResultHandler(
                { fetchCredentials() }, // Start streaming credentials
                {
                    _viewState.postValue(ViewState.NOT_LOADING)
                    onError(it)
                }
            ))
    }

    enum class ViewState { NOT_LOADING, UPDATING, UPDATED }
}

private fun List<Field>.toFieldMap() = map { it.name to it.value }.toMap()
