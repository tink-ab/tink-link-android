package com.tink.link.ui.providerlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.tink.model.provider.ProviderTreeNode
import com.tink.model.provider.toProviderTree

internal class ProviderListViewModel : ViewModel() {

    private val query = MutableLiveData<String>()
    private val path = MutableLiveData<ProviderListPath>()

    private val allProviders = Transformations.map(ProviderDataSource.providers) {
        it?.toProviderTree()
    }

    val loading: LiveData<Boolean> = ProviderDataSource.loading

    val isError: LiveData<Boolean> = ProviderDataSource.isError

    private val providersByPath = MediatorLiveData<List<ProviderTreeNode>>().apply {
        fun update() {
            val allProviders = allProviders.value ?: return
            val path = path.value ?: return

            val filtered = applyPath(allProviders, path)

            postValue(filtered)
        }
        addSource(path) { update() }
        addSource(allProviders) { update() }
    }

    private val filteredProviders = MediatorLiveData<List<ProviderTreeNode>>().apply {
        fun update() {
            val providers = providersByPath.value ?: return
            val query = query.value ?: ""

            val filteredProviders =
                if (query.isNotBlank() && query.length >= 3) {
                    providers.filter { it.name?.contains(query, ignoreCase = true) ?: false }
                } else {
                    providers
                }

            if (filteredProviders != value) {
                value = filteredProviders
            }
        }
        addSource(providersByPath) { update() }
        addSource(query) { update() }
    }

    val providers: LiveData<List<ProviderTreeNode>> = filteredProviders

    fun search(query: String) = this.query.postValue(query)

    fun setPath(path: ProviderListPath) = this.path.postValue(path)

    fun refresh() = ProviderDataSource.providers.update()

    private fun applyPath(
        providers: List<ProviderTreeNode>,
        path: ProviderListPath
    ): List<ProviderTreeNode> {

        val financialInstitutions = path.financialInstitutionGroupNodeByName?.let {
            providers.findFinancialInstitutionGroupNode(it)?.financialInstitutions
        } ?: return providers

        val authenticationUserTypes = path.financialInstitutionNodeByFinancialInstitution?.let { pathItem ->
            financialInstitutions.firstOrNull { it.financialInstitution == pathItem }?.authenticationUserTypes
        } ?: return financialInstitutions

        val accessTypes = path.authenticationUserTypeNodeByType?.let { pathItem ->
            authenticationUserTypes.firstOrNull { it.authenticationUserType == pathItem }?.accessTypes
        } ?: return authenticationUserTypes

        val credentialsTypes = path.accessTypeNodeByType?.let { pathItem ->
            accessTypes.firstOrNull { it.type == pathItem }?.credentialsTypes
        } ?: return accessTypes

        return path.credentialsTypeNodeByType?.let { pathItem ->
            credentialsTypes.firstOrNull { it.type == pathItem }?.providers
        } ?: credentialsTypes
    }

    private fun List<ProviderTreeNode>.findFinancialInstitutionGroupNode(
        name: String?
    ): ProviderTreeNode.FinancialInstitutionGroupNode? {
        for (element in this) {
            if (element is ProviderTreeNode.FinancialInstitutionGroupNode && element.name == name) {
                return element
            }
        }
        return null
    }
}
