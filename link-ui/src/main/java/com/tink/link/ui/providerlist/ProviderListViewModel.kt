package com.tink.link.ui.providerlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.tink.link.ui.ProviderSelection
import com.tink.model.provider.Provider
import com.tink.model.provider.ProviderTreeNode
import com.tink.model.provider.toProviderTree

internal class ProviderListViewModel : ViewModel() {

    private val query = MutableLiveData<String>()
    private val path = MutableLiveData<ProviderListPath>()

    init {
        ProviderDataSource.clear()
    }

    val allEnabledProviders: LiveData<List<ProviderTreeNode>?> = Transformations.map(ProviderDataSource.providers) { allProviders ->
        allProviders?.filter { provider ->
            provider.status == Provider.Status.ENABLED
        }?.toProviderTree()
    }

    val loading: LiveData<Boolean> = ProviderDataSource.loading

    val isError: LiveData<Boolean> = ProviderDataSource.isError

    private val providersByPath = MediatorLiveData<List<ProviderTreeNode>>().apply {
        fun update() {
            val allEnabledProviders = allEnabledProviders.value ?: return
            val path = path.value ?: return

            val filtered = applyPath(allEnabledProviders, path)

            postValue(filtered)
        }
        addSource(path) { update() }
        addSource(allEnabledProviders) { update() }
    }

    private val filteredProviders = MediatorLiveData<List<ProviderTreeNode>>().apply {
        fun update() {
            val providersByPath = providersByPath.value ?: return

            val query = query.value.orEmpty()
            val providers = if (query.isEmpty()) providersByPath else providersForSearch(providersByPath)

            val filteredProviders =
                providers.filter { providerTreeNode ->
                    providerTreeNode is ProviderTreeNode.AuthenticationUserTypeNode ||
                        providerTreeNode is ProviderTreeNode.AccessTypeNode ||
                        providerTreeNode is ProviderTreeNode.CredentialsTypeNode ||
                        providerTreeNode.name?.contains(query, ignoreCase = true) ?: false

                }

            if (filteredProviders != value) {
                value = filteredProviders
            }
        }
        addSource(providersByPath) { update() }
        addSource(query) { update() }
    }

    private fun providersForSearch(
        providersByPath: List<ProviderTreeNode>
    ): List<ProviderTreeNode> {
        return providersByPath.flatMap { provider ->
            if (provider is ProviderTreeNode.FinancialInstitutionGroupNode &&
                provider.financialInstitutions.isNotEmpty()) {
                provider.financialInstitutions
            } else {
                listOf(provider)
            }
        }
    }

    val providers: LiveData<List<ProviderTreeNode>> = filteredProviders

    fun search(query: String) = this.query.postValue(query)

    fun getFinancialInstitutionGroupNode(
        financialInstitutionNode: ProviderTreeNode.FinancialInstitutionNode)
    : ProviderTreeNode.FinancialInstitutionGroupNode? {
        val providers = providersByPath.value ?: return null
        return providers
            .filterIsInstance<ProviderTreeNode.FinancialInstitutionGroupNode>()
            .first { it.financialInstitutions.contains(financialInstitutionNode) }
    }

    fun setPath(path: ProviderListPath) = this.path.postValue(path)

    private fun applyPath(
        providers: List<ProviderTreeNode>,
        path: ProviderListPath
    ): List<ProviderTreeNode> {

        val financialInstitutions = path.financialInstitutionGroupNodeByName?.let {
            providers.findFinancialInstitutionGroupNode(it)?.financialInstitutions
        } ?: return providers

        val authenticationUserTypes =
            path.financialInstitutionNodeByFinancialInstitution?.let { pathItem ->
                financialInstitutions
                    .firstOrNull { it.financialInstitution == pathItem }
                    ?.authenticationUserTypes
                    ?.filterNot { it.authenticationUserType == Provider.AuthenticationUserType.UNKNOWN }
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

    fun updateProvidersFromSelection(selection: ProviderSelection) =
        ProviderDataSource.updateProvidersFromSelection(selection)
}
