package com.tink.link.ui.credentials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

internal class ConsentViewModel() : ViewModel() {

    //TODO: Update this view model once the OAuth2ClientDescription endpoint is implemented

    val user: LiveData<String> = MutableLiveData<String>().apply { value = "John Doe" }

    val showConsentInformation: LiveData<Boolean> = MutableLiveData<Boolean>().apply { value = true }
}