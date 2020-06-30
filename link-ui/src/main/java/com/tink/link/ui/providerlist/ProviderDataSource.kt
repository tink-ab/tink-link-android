package com.tink.link.ui.providerlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Transformations
import com.tink.core.Tink
import com.tink.link.getUserContext
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler
import com.tink.service.provider.ProviderFilter

// TODO: Scope to activity lifecycle (with dagger)
internal object ProviderDataSource {
    val providers = object : RefreshableLiveData<List<Provider>>() {

        override fun onActive() {
            super.onActive()
            fetchData()
        }

        private fun fetchData() {
            Tink.getUserContext()?.providerRepository?.listProviders(
                handler = ResultHandler(
                    {
                        postValue(it)
                    },
                    {
                        postValue(emptyList())
                    }
                ),
                filter = ProviderFilter(includeDemoProviders = true)
            )
        }

        override fun refresh() {
            if (this.hasActiveObservers()) {
                postValue(null)
                fetchData()
            }
        }
    }

    val isError: LiveData<Boolean> = Transformations.map(providers) {
        providers.value?.isEmpty() ?: false
    }

    val loading: LiveData<Boolean> = MediatorLiveData<Boolean>().apply {
        fun update() {
            value = providers.value == null && isError.value == false
        }
        addSource(providers) { update() }
        addSource(isError) { update() }
    }
}

abstract class RefreshableLiveData<T>() : LiveData<T>() {
    abstract fun refresh()
}
