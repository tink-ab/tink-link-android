package com.tink.link.model.provider

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import com.tink.link.model.Images
import com.tink.link.model.credential.Credential
import com.tink.link.model.misc.Field

/**
 * The provider model represents a way of connecting to different banks or other financial institutions in Tink.
 * Multiple providers can exist for the same financial institution, each representing a different type of access the user can choose from.
 * The model contains metadata about the provider which can be used to group and properly display the representations,
 * thus helping the end user make the correct decision on which provider to choose.
 *
 * @constructor creates a new provider object. This is usually done inside the Tink framework. It should normally not be necessary to create your own provider objects.
 *
 * @property name the name of this provider. This serves as a human readable identifier
 * @property displayName the formatted name of this provider, meant for display to the end user
 * @property type The type of the provider. See [Type]
 * @property status The status of the provider. See [Status]
 * @property credentialType Indicates which method will be used to connect this provider, for example with username/password or a third party app.
 * @property helpText a small help text that you can display to the user for further information on how to connect this provider
 * @property isPopular Indicates whether the provider is one of the major providers in a market. This can be used to provide shortcuts for the end user, for example by putting this provider on the top of the list.
 * @property fields the list of inputs that need to be filled to connect to this provider. See also [Credential.fields]
 * @property groupDisplayName this can for example be used as a label for groups of providers
 * @property displayDescription a short displayable description of the authentication type used
 * @property images a wrapper class for images describing the provider, for example a bank logo
 * @property financialInstitution The financial institution the provider belongs to. See [FinancialInstitution]
 * @property accessType The access type of the provider. See [AccessType]
 *
 */
@Parcelize
data class Provider(
    val name: String,
    val displayName: String,
    val type: Type,
    val status: Status,
    val credentialType: Credential.Type,
    val helpText: String,
    val isPopular: Boolean = false,
    val fields: List<Field>,
    val groupDisplayName: String,
    val displayDescription: String,
    val images: Images? = null,
    val financialInstitution: FinancialInstitution,
    val accessType: AccessType
) : Comparable<Provider>, Parcelable {

    /**
     * Indicates what type of financial institution the provider represents.
     */
    enum class Type {
        UNKNOWN,
        BANK,
        CREDIT_CARD,
        BROKER,
        OTHER,
        TEST,
        FRAUD
    }

    /**
     * Indicates the current status of the provider. It is only possible to perform credentials create or refresh actions on providers which are enabled. See [Provider.status]
     */
    enum class Status {
        UNKNOWN,
        ENABLED,
        DISABLED,
        TEMPORARY_DISABLED,
        OBSOLETE
    }

    /**
     * Describes how Tink will access a provider, for example whether open banking apis are used or not. See [Provider.accessType]
     */
    enum class AccessType {
        UNKNOWN,
        OPEN_BANKING,
        OTHER
    }


    /**
     * Indicates which financial institution a provider belongs to. This can be used for grouping providers together:
     * the [id] should be used as a selector, whereas the [name] should be used as the label for the group.
     * See [Provider.financialInstitution]
     */
    @Parcelize
    data class FinancialInstitution(val id: String, val name: String) : Parcelable

    override fun compareTo(other: Provider): Int = name.compareTo(other.name)
}
