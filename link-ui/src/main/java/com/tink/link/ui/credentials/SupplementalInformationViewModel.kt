package com.tink.link.ui.credentials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.link.authentication.AuthenticationTask
import com.tink.link.ui.extensions.toFieldMap
import com.tink.model.misc.Field
import com.tink.service.handler.ResultHandler

class SupplementalInformationViewModel : ViewModel() {

    private lateinit var authenticationTask: AuthenticationTask.SupplementalInformation

    private val _supplementalFields = MutableLiveData<List<Field>>()
    val supplementalFields: LiveData<List<Field>> = _supplementalFields

    fun setData(authenticationTask: AuthenticationTask.SupplementalInformation) {
        this.authenticationTask = authenticationTask
        _supplementalFields.value = authenticationTask.fields
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
