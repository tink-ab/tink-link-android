package com.tink.link.ui.providerlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
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
                        // TODO: Error handling
                    }
                ),
                filter = ProviderFilter(includeDemoProviders = true)
            )
        }
    }

    val loading: LiveData<Boolean> = Transformations.map(providers) { it == null }
}
