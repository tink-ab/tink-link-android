package com.tink.link.ui.extensions

import androidx.test.platform.app.InstrumentationRegistry
import com.tink.link.ui.R
import com.tink.model.credentials.Credentials
import com.tink.model.provider.Provider
import com.tink.model.provider.ProviderTreeNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

internal class ProviderExtTest {

    private val context = InstrumentationRegistry.getInstrumentation().context

    private fun accessTypeNodeWithCapabilities(capabilities: List<Provider.Capability>) =
        ProviderTreeNode.AccessTypeNode(
            type = Provider.AccessType.OTHER,
            credentialsTypes = listOf(
                ProviderTreeNode.CredentialsTypeNode(
                    name = "",
                    type = Credentials.Type.MOBILE_BANKID,
                    providers = listOf(
                        ProviderTreeNode.ProviderNode(providerWithCapabilities(capabilities))
                    )
                )
            )
        )

    private fun providerWithCapabilities(capabilities: List<Provider.Capability>) =
        Provider(
            name = "nordea-bankid",
            displayName = "Nordea",
            type = Provider.Type.BANK,
            status = Provider.Status.ENABLED,
            credentialsType = Credentials.Type.MOBILE_BANKID,
            helpText = "",
            isPopular = true,
            fields = emptyList(),
            groupDisplayName = "Nordea",
            images = null,
            displayDescription = "Mobile BankID",
            marketCode = "SE",
            accessType = Provider.AccessType.OTHER,
            financialInstitution = Provider.FinancialInstitution(
                id = "dde2463acf40501389de4fca5a3693a4",
                name = "Nordea"
            ),
            capabilities = capabilities,
            authenticationUserType = Provider.AuthenticationUserType.PERSONAL
        )

    @Test
    fun capability_matches_display_text() {
        val accessTypeNode =
            accessTypeNodeWithCapabilities(listOf(Provider.Capability.CHECKING_ACCOUNTS))
        val checkingAccountsText =
            context.getString(R.string.tink_provider_capability_checking_accounts).capitalize()
        assertThat(accessTypeNode.capabilitiesText(context)).isEqualTo(checkingAccountsText)
    }

    @Test
    fun capability_display_text_uses_specified_separator() {
        val accessTypeNode = accessTypeNodeWithCapabilities(
            listOf(
                Provider.Capability.CHECKING_ACCOUNTS,
                Provider.Capability.CREDIT_CARDS
            )
        )
        val separator = " | "
        val displayText: String =
            listOf(
                context.getString(R.string.tink_provider_capability_checking_accounts),
                context.getString(R.string.tink_provider_capability_credit_cards)
            )
                .joinToString(separator)
                .capitalize()
        assertThat(
            accessTypeNode.capabilitiesText(context, separator)
        ).isEqualTo(displayText)
    }

    @Test
    fun single_capability_does_not_have_separator_in_display_text() {
        val accessTypeNode =
            accessTypeNodeWithCapabilities(listOf(Provider.Capability.CHECKING_ACCOUNTS))
        val separator = " | "
        val checkingAccountsText =
            context.getString(R.string.tink_provider_capability_checking_accounts).capitalize()
        assertThat(
            accessTypeNode.capabilitiesText(context, separator)
        ).isEqualTo(checkingAccountsText)
    }

    @Test
    fun display_text_for_each_capability_in_list_is_not_repeated() {
        val accessTypeNode = accessTypeNodeWithCapabilities(
            listOf(
                Provider.Capability.CHECKING_ACCOUNTS,
                Provider.Capability.CHECKING_ACCOUNTS
            )
        )
        val checkingAccountsText =
            context.getString(R.string.tink_provider_capability_checking_accounts).capitalize()
        val separator = " | "
        assertThat(
            accessTypeNode.capabilitiesText(context, separator)
        ).isEqualTo(checkingAccountsText)
    }

    @Test
    fun capability_display_text_uses_sort_order() {
        val accessTypeNode = accessTypeNodeWithCapabilities(
            listOf(
                Provider.Capability.CREDIT_CARDS, // Testing with different order than expected display text order
                Provider.Capability.CHECKING_ACCOUNTS
            )
        )
        val separator = " | "
        val displayText =
            listOf(
                context.getString(R.string.tink_provider_capability_checking_accounts),
                context.getString(R.string.tink_provider_capability_credit_cards)
            )
                .joinToString(separator)
                .capitalize()
        assertThat(
            accessTypeNode.capabilitiesText(context, separator)
        ).isEqualTo(displayText)
    }

    @Test
    fun filtered_capabilities_do_not_appear_in_display_text() {
        val accessTypeNode = accessTypeNodeWithCapabilities(
            listOf(
                Provider.Capability.TRANSFERS, // Blacklisted capability
                Provider.Capability.CHECKING_ACCOUNTS
            )
        )
        val checkingAccountsText =
            context.getString(R.string.tink_provider_capability_checking_accounts).capitalize()
        val separator = " | "
        assertThat(
            accessTypeNode.capabilitiesText(context, separator)
        ).isEqualTo(checkingAccountsText)
    }

    @Test
    fun empty_display_text_shown_for_provider_with_only_black_listed_capabilities() {
        val accessTypeNode = accessTypeNodeWithCapabilities(
            listOf(
                Provider.Capability.TRANSFERS, // Blacklisted capability
                Provider.Capability.PAYMENTS // Blacklisted capability
            )
        )
        val separator = " | "
        assertThat(
            accessTypeNode.capabilitiesText(context, separator)
        ).isEmpty()
    }

    @Test
    fun first_capability_in_list_has_uppercase_starting_character() {
        val accessTypeNode = accessTypeNodeWithCapabilities(
            listOf(
                Provider.Capability.CHECKING_ACCOUNTS, // Testing with different order than expected display text order
                Provider.Capability.CREDIT_CARDS
            )
        )
        val separator = " | "
        assertThat(accessTypeNode.capabilitiesText(context, separator).first()).isUpperCase()
    }

    @Test
    fun non_first_capabilities_in_list_has_lowercase_starting_characters() {
        val accessTypeNode = accessTypeNodeWithCapabilities(
            listOf(
                Provider.Capability.CHECKING_ACCOUNTS, // Testing with different order than expected display text order
                Provider.Capability.CREDIT_CARDS
            )
        )
        val separator = " | "
        val capabilitiesTextMinusFirst =
            accessTypeNode
                .capabilitiesText(context, separator)
                .split(separator)
                .drop(1)
        assertThat(capabilitiesTextMinusFirst.all { it.first().isLowerCase() })
    }
}
