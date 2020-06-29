package com.tink.link.sample.credentials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.link.authentication.AuthenticationTask
import com.tink.link.core.credentials.CredentialsStatus
import com.tink.link.getUserContext
import com.tink.model.misc.Field
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription

class CredentialsViewModel : ViewModel() {

    private val credentialsRepository = requireNotNull(Tink.getUserContext()?.credentialsRepository)

    fun updateViewState(viewState: ViewState) = _viewState.postValue(viewState)

    private val _viewState = MutableLiveData<ViewState>().also { it.value = ViewState.NOT_LOADING }
    val viewState: LiveData<ViewState> = _viewState

    private val _statusText = MutableLiveData<String>()
    val statusText: LiveData<String> = _statusText

    private val _fields = MutableLiveData<List<Field>>()
    val fields: LiveData<List<Field>> = _fields

    fun setFields(fields: List<Field>) = _fields.postValue(fields)

    private var streamSubscription: StreamSubscription? = null
        set(value) {
            field?.unsubscribe()
            field = value
        }

    private fun getCredentialsStreamObserver(
        onAwaitingAuthentication: (AuthenticationTask) -> Unit,
        onError: (Throwable) -> Unit
    ): StreamObserver<CredentialsStatus> {
        return object : StreamObserver<CredentialsStatus> {
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
        streamSubscription = credentialsRepository.create(
            provider.name,
            provider.credentialsType,
            fields.toFieldMap(),
            getCredentialsStreamObserver(onAwaitingAuthentication, onError)
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
        onAwaitingAuthentication: (AuthenticationTask) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        streamSubscription = credentialsRepository.update(
            id,
            provider.name,
            fields.toFieldMap(),
            getCredentialsStreamObserver(onAwaitingAuthentication, onError)
        )
    }

    fun authenticateCredentials(
        id: String,
        onAwaitingAuthentication: (AuthenticationTask) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        streamSubscription = credentialsRepository.authenticate(
            id,
            getCredentialsStreamObserver(onAwaitingAuthentication, onError)
        )
    }

    enum class ViewState { NOT_LOADING, UPDATING, UPDATED }
}
