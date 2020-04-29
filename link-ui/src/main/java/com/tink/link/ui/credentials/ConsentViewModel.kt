package com.tink.link.ui.credentials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.link.consent.ConsentContext
import com.tink.link.getConsentContext
import com.tink.model.consent.OAuthClientDescription
import com.tink.model.consent.ScopeDescription
import com.tink.service.handler.ResultHandler

internal class ConsentViewModel() : ViewModel() {

    private val consentContext: ConsentContext = requireNotNull(Tink.getConsentContext())

    val termsAndConditionsUrl = consentContext.termsAndConditions()
    val privacyPolicyUrl = consentContext.privacyPolicy()

    private val _clientDescription = MutableLiveData<OAuthClientDescription>()

    val scopeDescriptions: MutableList<ScopeDescription> = mutableListOf()

    init {
        consentContext.describeClient(
            scopes = setOf(), // TODO: Get scopes from client
            resultHandler = ResultHandler(
                { clientDescription ->
                    _clientDescription.postValue(clientDescription)
                    scopeDescriptions.clear()
                    scopeDescriptions.addAll(clientDescription.scopeDescriptions)
                },
                { }
            )
        )
    }

    val user: LiveData<String> =
        Transformations.map(_clientDescription) { it?.clientName ?: "" }

    val showConsentInformation: LiveData<Boolean> =
        Transformations.map(_clientDescription) { it?.aggregator == false }

    val showTermsAndConditions: LiveData<Boolean> =
        Transformations.map(_clientDescription) { it?.aggregator == false }
}