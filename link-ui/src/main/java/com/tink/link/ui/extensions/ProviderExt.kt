package com.tink.link.ui.extensions

import android.content.Context
import com.tink.link.ui.R
import com.tink.model.provider.Provider
import com.tink.model.provider.ProviderTreeNode
import java.util.Locale

internal fun ProviderTreeNode.AccessTypeNode.capabilitiesText(
    context: Context,
    separator: CharSequence = ", "
): String =
    capabilities()
        .toDisplayText(context)
        .joinToString(separator = separator) { it.text }
        .capitalize()

internal fun ProviderTreeNode.AccessTypeNode.capabilities() =
    credentialsTypes
        .flatMap { credentialTypeNode ->
            credentialTypeNode
                .providers
                .flatMap { providerNode ->
                    providerNode.provider.capabilities
                }
        }
        .filterCapabilities()
        .distinct()

internal fun List<Provider.Capability>.filterCapabilities() =
    this.filterNot {
        it == Provider.Capability.TRANSFERS
                || it == Provider.Capability.PAYMENTS
                || it == Provider.Capability.MORTGAGE_AGGREGATION
                || it == Provider.Capability.UNKNOWN
    }

internal fun List<Provider.Capability>.toDisplayText(context: Context) =
    map { it.toDisplayText(context) }.sortedBy { it.sortOrder }

internal fun Provider.Capability.toDisplayText(context: Context): CapabilityDisplayText =
    when (this) {
        Provider.Capability.TRANSFERS ->
            CapabilityDisplayText(1, context.getString(R.string.tink_provider_capability_transfers))

        Provider.Capability.MORTGAGE_AGGREGATION ->
            CapabilityDisplayText(
                2,
                context.getString(R.string.tink_provider_capability_mortgage_aggregation)
            )

        Provider.Capability.CHECKING_ACCOUNTS ->
            CapabilityDisplayText(
                3,
                context.getString(R.string.tink_provider_capability_checking_accounts)
            )

        Provider.Capability.SAVINGS_ACCOUNTS ->
            CapabilityDisplayText(
                4,
                context.getString(R.string.tink_provider_capability_savings_accounts)
            )

        Provider.Capability.CREDIT_CARDS ->
            CapabilityDisplayText(
                5,
                context.getString(R.string.tink_provider_capability_credit_cards)
            )

        Provider.Capability.INVESTMENTS ->
            CapabilityDisplayText(
                6,
                context.getString(R.string.tink_provider_capability_investments)
            )

        Provider.Capability.LOANS ->
            CapabilityDisplayText(7, context.getString(R.string.tink_provider_capability_loans))

        Provider.Capability.PAYMENTS ->
            CapabilityDisplayText(8, context.getString(R.string.tink_provider_capability_payments))

        Provider.Capability.IDENTITY_DATA ->
            CapabilityDisplayText(
                9,
                context.getString(R.string.tink_provider_capability_identity_data)
            )

        Provider.Capability.EINVOICES ->
            CapabilityDisplayText(
                10,
                context.getString(R.string.tink_provider_capability_e_invoices)
            )

        Provider.Capability.UNKNOWN -> CapabilityDisplayText(11, "")
    }

internal data class CapabilityDisplayText(val sortOrder: Int, val text: String)