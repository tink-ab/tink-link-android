package com.tink.link.ui.credentials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.link.getUserContext
import com.tink.link.ui.extensions.toFieldMap
import com.tink.model.misc.Field
import com.tink.service.handler.ResultHandler

class SupplementalInformationViewModel : ViewModel() {

    private val credentialsId = MutableLiveData<String>()

    private val _supplementalFields = MutableLiveData<List<Field>>()
    val supplementalFields: LiveData<List<Field>> = _supplementalFields

    private val credentialsRepository: CredentialsRepository

    init {
        val userContext = requireNotNull(Tink.getUserContext())
        credentialsRepository = userContext.credentialsRepository
    }

    fun setData(credentialsId: String, supplementalFields: List<Field>) {
        this.credentialsId.value = credentialsId
        _supplementalFields.value = supplementalFields
    }

    fun sendSupplementalInformation(
        fields: List<Field>,
        onSuccess: (Unit) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        credentialsId.value?.let { id ->
            credentialsRepository.supplementInformation(
                id,
                fields.toFieldMap(),
                ResultHandler(onSuccess, onError)
            )
        }
    }

    fun cancelSupplementalInformation() {
        credentialsId.value?.let {
            credentialsRepository.cancelSupplementalInformation(
                it,
                ResultHandler({}, {})
            )
        }
    }
}