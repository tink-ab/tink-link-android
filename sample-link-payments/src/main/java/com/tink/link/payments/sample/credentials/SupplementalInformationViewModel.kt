package com.tink.link.payments.sample.credentials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.link.authentication.AuthenticationTask
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.link.getUserContext
import com.tink.model.misc.Field
import com.tink.service.handler.ResultHandler

class SupplementalInformationViewModel : ViewModel() {

    private lateinit var authenticationTask: AuthenticationTask.SupplementalInformation

    private val _supplementalFields = MutableLiveData<List<Field>>()
    val supplementalFields: LiveData<List<Field>> = _supplementalFields

    private val credentialsRepository: CredentialsRepository

    init {
        val userContext = requireNotNull(Tink.getUserContext())
        credentialsRepository = userContext.credentialsRepository
    }

    fun setData(authenticationTask: AuthenticationTask.SupplementalInformation) {
        this.authenticationTask = authenticationTask
    }

    fun sendSupplementalInformation(
        fields: List<Field>,
        onSuccess: (Unit) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        authenticationTask.submit(fields.toFieldMap(), ResultHandler(onSuccess, onError))
    }

    fun cancelSupplementalInformation() {
        authenticationTask.cancel(ResultHandler({}, {}))
    }
}