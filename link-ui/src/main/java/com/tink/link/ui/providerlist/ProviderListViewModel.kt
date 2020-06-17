package com.tink.link.ui.providerlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.link.getUserContext
import com.tink.model.provider.ProviderTreeNode
import com.tink.model.provider.toProviderTree
import com.tink.service.handler.ResultHandler

class ProviderListViewModel : ViewModel() {

    private var allProviders: List<ProviderTreeNode> = emptyList()

    private val _providers = MutableLiveData<List<ProviderTreeNode>>()
    val providers: LiveData<List<ProviderTreeNode>> = _providers

    init {
        Tink.getUserContext()?.providerRepository?.listProviders(
            handler = ResultHandler({
                allProviders = it.toProviderTree()
                _providers.postValue(allProviders)
            },
                {
                    // TODO: Error handling
                }),
            includeDemoProviders = true
        )
    }

    fun search(query: String) {

        val filteredProviders = if (query.isNotBlank() && query.length >= 3) {
            allProviders.filter { it.name?.contains(query, ignoreCase = true) ?: false }
        } else {
            allProviders
        }

        _providers.postValue(filteredProviders)
    }
}
