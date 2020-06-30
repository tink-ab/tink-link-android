package com.tink.link.ui.providerlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.tink.core.Tink
import com.tink.link.getUserContext
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler
import com.tink.service.provider.ProviderFilter

// TODO: Scope to activity lifecycle (with dagger)
internal object ProviderDataSource {
    val providers = object : LiveData<List<Provider>>() {

        override fun onActive() {
            super.onActive()

            Tink.getUserContext()?.providerRepository?.listProviders(
                handler = ResultHandler(
                    {
                        postValue(it)
                    },
                    {
                        isError.postValue(true)
                    }
                ),
                filter = ProviderFilter(includeDemoProviders = true)
            )
        }
    }

    val isError: MutableLiveData<Boolean> = MutableLiveData(false)

    val loading: LiveData<Boolean> = MediatorLiveData<Boolean>().apply {
        fun update() {
            value = providers.value == null && isError.value == false
        }
        addSource(providers) { update() }
        addSource(isError) { update() }
    }
}
