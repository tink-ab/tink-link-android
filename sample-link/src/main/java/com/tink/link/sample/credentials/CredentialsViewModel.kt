package com.tink.link.sample.credentials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.link.getUserContext
import com.tink.link.sample.CombinedLiveData
import com.tink.link.sample.Event
import com.tink.model.authentication.ThirdPartyAppAuthentication
import com.tink.model.credentials.Credentials
import com.tink.model.misc.Field
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription

class CredentialsViewModel : ViewModel() {

    private val credentialsRepository = requireNotNull(Tink.getUserContext()?.credentialsRepository)

    private val _credentials = MutableLiveData<List<Credentials>>()
    val credentials: LiveData<List<Credentials>> = _credentials

    private val credentialsId = MutableLiveData<String>()


    fun updateViewState(viewState: ViewState) = _viewState.postValue(viewState)

    private val _viewState = MutableLiveData<ViewState>().also { it.value = ViewState.NOT_LOADING }
    val viewState: LiveData<ViewState> = _viewState

    private val _statusText = MutableLiveData<String>()
    val statusText: LiveData<String> = _statusText

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
        onAwaitingAuthentication: (AuthenticationTask) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        credentialsRepository.create(
            provider.name,
            provider.credentialsType,
            fields.toFieldMap(),
            object : StreamObserver<CredentialsStatus> {
                override fun onNext(value: CredentialsStatus) {
                    when (value) {
                        is CredentialsStatus.Success -> {
                            _statusText.postValue(value.message)
                            _viewState.postValue(ViewState.UPDATED)
                        }
                        is CredentialsStatus.Loading -> {
                            _statusText.postValue(value.message)
                            _viewState.postValue(ViewState.UPDATING)
                        }

                        is CredentialsStatus.AwaitingAuthentication -> {
                            _viewState.postValue(ViewState.UPDATING)
                            onAwaitingAuthentication(value.authenticationTask)
                        }
                    }
                }

                override fun onError(error: Throwable) {
                    _viewState.postValue(ViewState.NOT_LOADING)
                    onError(error)
                }
            }
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
        credentialsRepository.authenticate(
            id,
            ResultHandler(
                { fetchCredentials() }, // Start streaming credentials
                {
                    _viewState.postValue(ViewState.NOT_LOADING)
                    onError(it)
                }
            )
        )
    }

    enum class ViewState { NOT_LOADING, UPDATING, UPDATED }
}
