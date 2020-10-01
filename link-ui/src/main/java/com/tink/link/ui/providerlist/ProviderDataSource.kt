package com.tink.link.ui.providerlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.tink.core.Tink
import com.tink.link.getUserContext
import com.tink.link.ui.ProviderSelection
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler

// TODO: Scope to activity lifecycle (with dagger)
internal object ProviderDataSource {
    private var selection: ProviderSelection? = null
    val providers = MutableLiveData<List<Provider>?>().also {
        it.postValue(null)
    }

    val isError: LiveData<Boolean> = Transformations.map(providers) {
        it?.isEmpty() ?: false
    }

    val loading: LiveData<Boolean> = MediatorLiveData<Boolean>().apply {
        fun update() {
            value = providers.value == null && isError.value == false
        }
        addSource(providers) { update() }
        addSource(isError) { update() }
    }

    fun updateProvidersFromSelection(selection: ProviderSelection) {
        if (selection == this.selection) return // No new selection. Use same value.
        if (selection is ProviderSelection.SingleProvider) {
            Tink.getUserContext()?.providerRepository?.getProvider(
                resultHandler = ResultHandler(
                    { providers.postValue(if (it != null) listOf(it) else emptyList()) },
                    { providers.postValue(emptyList()) }
                ),
                providerName = selection.name
            )
        } else if (selection is ProviderSelection.ProviderList) {
            Tink.getUserContext()?.providerRepository?.listProviders(
                handler = ResultHandler(
                    { providers.postValue(it) },
                    { providers.postValue(emptyList()) }
                ),
                filter = selection.filter
            )
        }
    }
}
