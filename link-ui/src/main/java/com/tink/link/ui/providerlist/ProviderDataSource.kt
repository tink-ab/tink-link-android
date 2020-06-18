package com.tink.link.ui.providerlist

import androidx.lifecycle.LiveData
import com.tink.core.Tink
import com.tink.link.getUserContext
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler

// TODO: Scope to activity lifecycle (with dagger)
internal object ProviderDataSource : LiveData<List<Provider>>() {

    override fun onActive() {
        super.onActive()

        Tink.getUserContext()?.providerRepository?.listProviders(
            handler = ResultHandler(
                {
                    postValue(it)
                },
                {
                    // TODO: Error handling
                }),
            includeDemoProviders = true
        )
    }
}