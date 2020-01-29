package com.tink.link.model.provider

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import com.tink.link.model.credential.Credential
import com.tink.link.model.provider.ProviderTreeNode.AccessTypeNode
import com.tink.link.model.provider.ProviderTreeNode.CredentialTypeNode
import com.tink.link.model.provider.ProviderTreeNode.FinancialInstitutionGroupNode
import com.tink.link.model.provider.ProviderTreeNode.FinancialInstitutionNode

/**
 * This class represents a tree structure of [FinancialInstitutionGroupNode] objects with children.
 * This eventually leads to a leaf object of type [CredentialTypeNode],
 * that contains more detailed [Provider] data.
 *
 * The tree will always follow the structure:
 *
 * [FinancialInstitutionGroupNode] -> [FinancialInstitutionNode] -> [AccessTypeNode] -> [CredentialTypeNode]
 */
sealed class ProviderTreeNode : Parcelable {
    /** A textual description of the node. */
    abstract val name: String?
    /** An optional url linking to a visual description of the node. */
    abstract val icon: String?

    /**
     * The top level node of the tree structure, with a list of [FinancialInstitutionNode] children.
     *
     * @param name The grouping identifier related to the [Provider]'s `groupDisplayName` or
     *              `financialInstitution.name` property
     */
    @Parcelize
    data class FinancialInstitutionGroupNode(
        override val name: String,
        val financialInstitutions: @RawValue List<FinancialInstitutionNode>
    ) : ProviderTreeNode() {
        override val icon: String?
            get() = financialInstitutions.first().icon
    }

    /**
     * A parent node of the tree structure, with a list of [AccessTypeNode] children.
     *
     * @param id The unique identifier of the financial institution.
     */
    @Parcelize
    data class FinancialInstitutionNode(
        val financialInstitution: Provider.FinancialInstitution,
        val accessTypes: @RawValue List<AccessTypeNode>
    ) : ProviderTreeNode() {
        override val name: String get() = financialInstitution.name
        override val icon: String?
            get() = accessTypes.first().icon
    }

    /**
     * A parent node of the tree structure, with a list of [CredentialTypeNode] children.
     *
     * @param type Grouping identifier. See [Provider.AccessType]
     */
    @Parcelize
    data class AccessTypeNode(
        val type: Provider.AccessType,
        val credentialTypes: @RawValue List<CredentialTypeNode>
    ) : ProviderTreeNode() {
        override val name: String? get() = null
        override val icon: String?
            get() = credentialTypes.first().icon
    }

    /**
     * A parent node of the tree structure, with a list of [ProviderNode] children.
     *
     * @param type Grouping identifier. See [Credential.Type]
     */
    @Parcelize
    data class CredentialTypeNode(
        override val name: String?,
        val type: Credential.Type,
        val providers: List<ProviderNode>
    ) : ProviderTreeNode() {
        override val icon
            get() = providers.first().icon
    }

    /**
     * The leaf node of the tree structure, containing the more detailed [Provider] object.
     */
    @Parcelize
    data class ProviderNode(
        val provider: Provider
    ) : ProviderTreeNode() {
        override val name: String
            get() = provider.displayName
        override val icon
            get() = provider.images?.icon
    }
}

/**
 * Groups the providers by a few defining elements, creating a tree structure.
 * Each level in the tree structure may have 1 to `n` children.
 *
 * @return A tree of [ProviderTreeNode] objects that will always follow the structure:
 *
 * [FinancialInstitutionGroupNode] -> [FinancialInstitutionNode] -> [AccessTypeNode] -> [CredentialTypeNode]
 */
fun List<Provider>.toProviderTree(): List<ProviderTreeNode> =
    groupBy { it.groupDisplayName.ifBlank { it.financialInstitution.name } }
        .map { (name, providers) ->
            FinancialInstitutionGroupNode(name, providers.groupByFinancialInstitution())
        }
        .sortedBy { it.name }

private fun List<Provider>.groupByFinancialInstitution(): List<FinancialInstitutionNode> =
    groupBy { it.financialInstitution }
        .map { (financialInstitution, providers) ->
            FinancialInstitutionNode(financialInstitution, providers.groupByAccessType())
        }
        .sortedBy { it.name }

private fun List<Provider>.groupByAccessType(): List<AccessTypeNode> =
    groupBy { it.accessType }
        .map { (type, providers) ->
            AccessTypeNode(type, providers.groupByCredentialType())
        }
        .sortedBy { it.name }

private fun List<Provider>.groupByCredentialType(): List<CredentialTypeNode> =
    groupBy { it.credentialType }
        .flatMap { (type, providers) ->
            /*
             * Group the credential type internally by displayDescription as a first step.
             * This is necessary since we sometimes have providers with same credential type that
             * have different descriptions, for example PASSWORD is used for multiple purposes,
             * and we might have "Pin" and "Password" as two different descriptions.
             *
             * This lets the CredentialTypeNode allow for a better UI where the providers with the
             * same credential type can use different names.
             */
            providers
                .groupBy { it.displayDescription }
                .map { (displayDescription, providerList) ->
                    CredentialTypeNode(
                        name = displayDescription.takeIf { it.isNotEmpty() },
                        type = type,
                        providers = providerList.map { ProviderTreeNode.ProviderNode(it) })
                }
        }
        .sortedBy { it.name }