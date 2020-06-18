package com.tink.link.ui.providerlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.tink.model.provider.ProviderTreeNode
import com.tink.model.provider.toProviderTree

internal class ProviderListViewModel : ViewModel() {

    private var allProviders = Transformations.map(ProviderDataSource) {
        it.toProviderTree()
    }

    private var path = MutableLiveData<ProviderListPath>()

    private val _providers = MediatorLiveData<List<ProviderTreeNode>>().apply {

        fun update() {

            val allProviders = allProviders.value ?: return
            val path = path.value ?: return

            val filtered = applyPath(allProviders, path)

            postValue(filtered)
        }
        addSource(path) { update() }
        addSource(allProviders) { update() }

    }
    val providers: LiveData<List<ProviderTreeNode>> = _providers

    fun search(query: String) {
       // TODO
    }

    fun setPath(path: ProviderListPath) = this.path.postValue(path)


    // TODO nicify code
    private fun applyPath(
        providers: List<ProviderTreeNode>,
        path: ProviderListPath
    ): List<ProviderTreeNode> {
        var result = providers

        val financialInstitutionGroupName = path.financialInstitutionGroupNodeByName
        if (financialInstitutionGroupName != null) {
            result = result
                .findFinancialInstitutionGroupNode(path.financialInstitutionGroupNodeByName)
                ?.financialInstitutions ?: return result
        } else {
            return result
        }

        val financialInstitution = path.financialInstitutionNodeByFinancialInstitution
        if (financialInstitution != null) {
            result = result
                .firstOrNull { it.financialInstitution == path.financialInstitutionNodeByFinancialInstitution }
                ?.accessTypes ?: return result
        } else {
            return result
        }

        val accessType = path.accessTypeNodeByType
        if (accessType != null) {
            result = result.firstOrNull { it.type == path.accessTypeNodeByType }
                ?.credentialsTypes ?: return result
        } else {
            return result
        }

        val credentialsType = path.credentialsTypeNodeByType
        return if (credentialsType != null) {
            result.firstOrNull { it.type == credentialsType }
                ?.providers ?: result
        } else {
            result
        }
    }

    private fun List<ProviderTreeNode>.findFinancialInstitutionGroupNode(
        name: String?
    ): ProviderTreeNode.FinancialInstitutionGroupNode? {
        return firstOrNullWithCorrectType { it.name == name }
    }

    private inline fun <A : Any, reified B : A> List<A>.firstOrNullWithCorrectType(predicate: (B) -> Boolean): B? {
        for (element in this) {
            if (element is B && predicate(element)) {
                return element
            }
        }
        return null
    }
}
