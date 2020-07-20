package com.tink.link.ui.providerlist

import android.os.Parcelable
import com.tink.model.credentials.Credentials
import com.tink.model.provider.Provider
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize

@Parcelize
internal data class ProviderListPath(
    val financialInstitutionGroupNodeByName: String? = null,
    val financialInstitutionNodeByFinancialInstitution: Provider.FinancialInstitution? = null,
    val accessTypeNodeByType: Provider.AccessType? = null,
    val credentialsTypeNodeByType: Credentials.Type? = null,
    val providerNodeByProvider: Provider? = null
) : Parcelable {

    @IgnoredOnParcel
    val isFullPathToProvider = financialInstitutionGroupNodeByName != null &&
        financialInstitutionNodeByFinancialInstitution != null &&
        accessTypeNodeByType != null &&
        credentialsTypeNodeByType != null &&
        providerNodeByProvider != null

    private fun appendRecursiveIfOnlyOneChild(
        childList: List<ProviderTreeNode>
    ): ProviderListPath =
        if (childList.size == 1) {
            append(childList.first())
        } else {
            this
        }

    internal fun append(node: ProviderTreeNode): ProviderListPath =
        when (node) {
            is ProviderTreeNode.FinancialInstitutionGroupNode -> {
                copy(financialInstitutionGroupNodeByName = node.name)
                    .appendRecursiveIfOnlyOneChild(node.financialInstitutions)
            }
            is ProviderTreeNode.FinancialInstitutionNode -> {
                copy(financialInstitutionNodeByFinancialInstitution = node.financialInstitution)
                    .appendRecursiveIfOnlyOneChild(node.accessTypes)
            }
            is ProviderTreeNode.AccessTypeNode -> {
                copy(accessTypeNodeByType = node.type)
                    .appendRecursiveIfOnlyOneChild(node.credentialsTypes)
            }
            is ProviderTreeNode.CredentialsTypeNode -> {
                copy(credentialsTypeNodeByType = node.type)
                    .appendRecursiveIfOnlyOneChild(node.providers)
            }
            is ProviderTreeNode.ProviderNode -> {
                copy(providerNodeByProvider = node.provider)
            }
        }
}
