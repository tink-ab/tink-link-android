package com.tink.link.ui.providerlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Transformations
import com.tink.core.Tink
import com.tink.link.getUserContext
import com.tink.link.ui.AutoFetchLiveData
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler
import com.tink.service.provider.ProviderFilter

// TODO: Scope to activity lifecycle (with dagger)
internal object ProviderDataSource {
    val providers = AutoFetchLiveData<List<Provider>?> { liveData ->
        liveData.postValue(null)
        Tink.getUserContext()?.providerRepository?.listProviders(
            handler = ResultHandler(
                {
                    liveData.postValue(it)
                },
                {
                    liveData.postValue(emptyList())
                }
            ),
            filter = ProviderFilter(includeDemoProviders = true)
        )
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
}
