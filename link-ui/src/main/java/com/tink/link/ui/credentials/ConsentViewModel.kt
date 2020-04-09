package com.tink.link.ui.credentials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.link.consent.ConsentContext
import com.tink.link.getConsentContext

internal class ConsentViewModel() : ViewModel() {

    private val consentContext: ConsentContext = requireNotNull(Tink.getConsentContext())

    val termsAndConditionsUrl = consentContext.termsAndConditions()
    val privacyPolicyUrl = consentContext.privacyPolicy()

    //TODO: Update this view model once the OAuth2ClientDescription endpoint is implemented

    val user: LiveData<String> = MutableLiveData<String>().apply { value = "John Doe" }

    val showConsentInformation: LiveData<Boolean> = MutableLiveData<Boolean>().apply { value = true }

    val showTermsAndConditions: LiveData<Boolean> = MutableLiveData<Boolean>().apply { value = true }
}