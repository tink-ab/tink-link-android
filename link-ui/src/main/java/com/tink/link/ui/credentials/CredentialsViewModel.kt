package com.tink.link.ui.credentials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.link.ui.CombinedLiveData
import com.tink.link.ui.Event
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.link.core.user.UserContext
import com.tink.link.getUserContext
import com.tink.link.ui.extensions.toFieldMap
import com.tink.model.authentication.ThirdPartyAppAuthentication
import com.tink.model.credentials.Credentials
import com.tink.model.misc.Field
import com.tink.model.provider.Provider
import com.tink.model.user.Scope
import com.tink.service.handler.ResultHandler
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import org.threeten.bp.Instant

class CredentialsViewModel : ViewModel() {

    private val _credentials = MutableLiveData<List<Credentials>>()
    val credentials: LiveData<List<Credentials>> = _credentials

    private val _credentialsId = MutableLiveData<String>()
    val credentialsId: LiveData<String> = _credentialsId

    private val credentialsRepository: CredentialsRepository

    private val userContext: UserContext = requireNotNull(Tink.getUserContext())

    private val _authorizationCode = MutableLiveData<String>()
    val authorizationCode: LiveData<String> = _authorizationCode

    private var scopes: List<Scope> = emptyList()

    internal var authorizationCodeSaved: Boolean = false
    internal var authorizeUser: Boolean = false

    init {
        credentialsRepository = userContext.credentialsRepository
    }

    private var credentialsStatus: CredentialsStatusModel? = null

    /**
     * Combines the output of [credentialsId] and [credentials] to a [LiveData] that holds the
     * [Credentials] with the id held in [credentialsId].
     *
     * As a side-effect, it also updates our view state based on the status of the credentials.
     */
    val createdCredentials = CombinedLiveData(credentialsId, credentials) { id, list ->
        list.firstOrNull { it.id == id }
            ?.also { credentials ->
                val newStatusModel = credentials.toStatusModel()
                val oldStatusModel = credentialsStatus
                if (oldStatusModel == null || oldStatusModel.isNewStatus(newStatusModel)) {
                    credentialsStatus = newStatusModel
                    when (credentials.status) {
                        Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION -> {
                            credentials.thirdPartyAppAuthentication
                                ?.let { _mobileBankIdAuthenticationEvent.postValue(Event(it)) }
                                ?.also {
                                    _viewState.postValue(ViewState.WAITING_FOR_AUTHENTICATION)
                                }
                        }
                        Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION -> {
                            credentials.thirdPartyAppAuthentication
                                ?.let { _thirdPartyAuthenticationEvent.postValue(Event(it)) }
                                ?.also {
                                    _viewState.postValue(ViewState.WAITING_FOR_AUTHENTICATION)
                                }
                        }

                        Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION -> {
                            _supplementalInformationEvent.postValue(Event(credentials.supplementalInformation))
                            _viewState.postValue(ViewState.NOT_LOADING)
                        }

                        Credentials.Status.AUTHENTICATION_ERROR,
                        Credentials.Status.TEMPORARY_ERROR,
                        Credentials.Status.PERMANENT_ERROR -> {
                            _viewState.postValue(ViewState.NOT_LOADING)
                            credentials.statusPayload?.let { _errorEvent.postValue(Event(it)) }
                        }

                        Credentials.Status.UPDATING -> {
                            _viewState.postValue(ViewState.UPDATING)
                            if (authorizeUser && !authorizationCodeSaved) {
                                authorizeUser(scopes)
                            }
                        }
                        Credentials.Status.UPDATED -> _viewState.postValue(ViewState.UPDATED)
                        else -> {}
                    }
                }
            }
    }

    fun updateViewState(viewState: ViewState) = _viewState.postValue(viewState)

    private val _viewState = MutableLiveData<ViewState>().also { it.value = ViewState.NOT_LOADING }
    val viewState: LiveData<ViewState> = _viewState

    private val _mobileBankIdAuthenticationEvent =
        MutableLiveData<Event<ThirdPartyAppAuthentication>>()
    val mobileBankIdAuthenticationEvent: LiveData<Event<ThirdPartyAppAuthentication>> =
        _mobileBankIdAuthenticationEvent

    private val _thirdPartyAuthenticationEvent =
        MutableLiveData<Event<ThirdPartyAppAuthentication>>()
    val thirdPartyAuthenticationEvent: LiveData<Event<ThirdPartyAppAuthentication>> =
        _thirdPartyAuthenticationEvent

    private val _supplementalInformationEvent =
        MutableLiveData<Event<List<Field>>>()
    val supplementalInformationEvent: LiveData<Event<List<Field>>> =
        _supplementalInformationEvent

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
        credentialsRepository.create(
            provider.name,
            provider.credentialsType,
            fields.toFieldMap(),
            ResultHandler(
                { credentials ->
                    fetchCredentials() // Start streaming credentials
                    _credentialsId.postValue(credentials.id)
                },
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
        fields: List<Field>,
        onError: (Throwable) -> Unit
    ) {

        _credentialsId.value = id

        credentialsRepository.update(
            id,
            "", //TODO: provider name
            fields.toFieldMap(),
            ResultHandler(
                {
                    fetchCredentials() // Start streaming credentials
                },
                {
                    _viewState.postValue(ViewState.NOT_LOADING)
                    onError(it)
                }
            )
        )
    }

    fun setScopes(scopes: List<Scope>) {
        this.scopes = scopes
    }

    private fun authorizeUser(scopes: List<Scope>) {
        userContext.authorize(
            scopes.toSet(),
            ResultHandler(
                { authorizationCode ->
                    _authorizationCode.postValue(authorizationCode)
                },
                { }
            )
        )
    }

    enum class ViewState {
        NOT_LOADING,
        WAITING_FOR_AUTHENTICATION,
        UPDATING,
        UPDATED,
    }
}

data class CredentialsStatusModel(
    val status: Credentials.Status?,
    val statusUpdated: Instant
)

private fun Credentials.toStatusModel() =
    CredentialsStatusModel(status, statusUpdated)

private fun CredentialsStatusModel.isNewStatus(other: CredentialsStatusModel) =
    status != other.status || statusUpdated < other.statusUpdated
