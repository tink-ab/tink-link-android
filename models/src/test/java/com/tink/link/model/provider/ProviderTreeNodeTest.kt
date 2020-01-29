package com.tink.link.model.provider

import com.tink.link.model.credential.Credential
import com.tink.link.model.provider.ProviderTreeNode.FinancialInstitutionGroupNode
import com.tink.link.model.provider.ProviderTreeNode.FinancialInstitutionNode
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Condition
import org.junit.jupiter.api.Test
import java.util.function.Predicate

internal class ProviderTreeNodeTest {

    private val nordeaBankId = Provider(
        name = "nordea-bankid",
        displayName = "Nordea",
        type = Provider.Type.BANK,
        status = Provider.Status.ENABLED,
        credentialType = Credential.Type.MOBILE_BANKID,
        helpText = "",
        isPopular = true,
        fields = emptyList(),
        groupDisplayName = "Nordea",
        images = null,
        displayDescription = "Mobile BankID",
        accessType = Provider.AccessType.OTHER,
        financialInstitution = Provider.FinancialInstitution(
            id = "dde2463acf40501389de4fca5a3693a4",
            name = "Nordea"
        )
    )

    private val nordeaPassword = Provider(
        name = "nordea-password",
        displayName = "Nordea",
        type = Provider.Type.BANK,
        status = Provider.Status.ENABLED,
        credentialType = Credential.Type.PASSWORD,
        helpText = "",
        isPopular = true,
        fields = emptyList(),
        groupDisplayName = "Nordea",
        images = null,
        displayDescription = "Password",
        accessType = Provider.AccessType.OTHER,
        financialInstitution = Provider.FinancialInstitution(
            id = "dde2463acf40501389de4fca5a3693a4",
            name = "Nordea"
        )
    )

    private val nordeaOpenBanking = Provider(
        name = "se-nordea-ob",
        displayName = "Nordea Open Banking",
        type = Provider.Type.BANK,
        status = Provider.Status.ENABLED,
        credentialType = Credential.Type.MOBILE_BANKID,
        helpText = "",
        isPopular = true,
        fields = emptyList(),
        groupDisplayName = "Nordea",
        images = null,
        displayDescription = "Mobile BankID",
        accessType = Provider.AccessType.OPEN_BANKING,
        financialInstitution = Provider.FinancialInstitution(
            id = "dde2463acf40501389de4fca5a3693a4",
            name = "Nordea"
        )
    )

    private val sparbankernaBankID = Provider(
        name = "savingsbank-bankid",
        displayName = "Sparbankerna",
        type = Provider.Type.BANK,
        status = Provider.Status.ENABLED,
        credentialType = Credential.Type.MOBILE_BANKID,
        helpText = "",
        isPopular = true,
        fields = emptyList(),
        groupDisplayName = "Swedbank och Sparbankerna",
        images = null,
        displayDescription = "Mobile BankID",
        accessType = Provider.AccessType.OTHER,
        financialInstitution = Provider.FinancialInstitution(
            id = "a0afa9bbc85c52aba1b1b8d6a04bc57c",
            name = "Sparbankerna"
        )
    )
    private val sparbankernaPassword = Provider(
        name = "savingsbank-token",
        displayName = "Sparbankerna",
        type = Provider.Type.BANK,
        status = Provider.Status.ENABLED,
        credentialType = Credential.Type.PASSWORD,
        helpText = "",
        isPopular = true,
        fields = emptyList(),
        groupDisplayName = "Swedbank och Sparbankerna",
        images = null,
        displayDescription = "Security token",
        accessType = Provider.AccessType.OTHER,
        financialInstitution = Provider.FinancialInstitution(
            id = "a0afa9bbc85c52aba1b1b8d6a04bc57c",
            name = "Sparbankerna"
        )
    )

    private val swedbankBankID = Provider(
        name = "swedbank-bankid",
        displayName = "Swedbank",
        type = Provider.Type.BANK,
        status = Provider.Status.ENABLED,
        credentialType = Credential.Type.MOBILE_BANKID,
        helpText = "",
        isPopular = true,
        fields = emptyList(),
        groupDisplayName = "Swedbank och Sparbankerna",
        images = null,
        displayDescription = "Mobile BankID",
        accessType = Provider.AccessType.OTHER,
        financialInstitution = Provider.FinancialInstitution(
            id = "6c1749b4475e5677a83e9fa4bb60a18a",
            name = "Swedbank"
        )
    )
    private val swedbankPassword = Provider(
        name = "swedbank-token",
        displayName = "Swedbank",
        type = Provider.Type.BANK,
        status = Provider.Status.ENABLED,
        credentialType = Credential.Type.PASSWORD,
        helpText = "",
        isPopular = true,
        fields = emptyList(),
        groupDisplayName = "Swedbank och Sparbankerna",
        images = null,
        displayDescription = "Security token",
        accessType = Provider.AccessType.OTHER,
        financialInstitution = Provider.FinancialInstitution(
            id = "6c1749b4475e5677a83e9fa4bb60a18a",
            name = "Swedbank"
        )
    )

    private val nordeaFinancialInstitution = Condition<FinancialInstitutionNode>(
        Predicate<FinancialInstitutionNode> { it.name == "Nordea" },
        "FinancialInstitution is 'Nordea'"
    )

    private val swedbankFinancialInstitution = Condition<FinancialInstitutionNode>(
        Predicate<FinancialInstitutionNode> { it.name == "Swedbank" },
        "FinancialInstitution is 'Swedbank'"
    )

    private val sparbankernaFinancialInstitution = Condition<FinancialInstitutionNode>(
        Predicate<FinancialInstitutionNode> { it.name == "Sparbankerna" },
        "FinancialInstitution is 'Sparbankerna'"
    )

    @Test
    fun `test credential types grouping`() {
        val providers = listOf(nordeaBankId, nordeaPassword)
        val groups = providers.toProviderTree()
        assertThat(groups).hasSize(1)

        val groupDisplayNameNode = groups.first()
        assertThat(groupDisplayNameNode)
            .isInstanceOf(FinancialInstitutionGroupNode::class.java)

        val financialInstitutions =
            (groupDisplayNameNode as FinancialInstitutionGroupNode).financialInstitutions
        assertThat(financialInstitutions).hasSize(1)

        val accessTypes = financialInstitutions.first().accessTypes
        assertThat(accessTypes).hasSize(1)

        val credentialTypes = accessTypes.first().credentialTypes
        assertThat(credentialTypes)
            .hasSize(2)
            .anySatisfy { assertThat(it.type).isEqualTo(Credential.Type.MOBILE_BANKID) }
            .anySatisfy { assertThat(it.type).isEqualTo(Credential.Type.PASSWORD) }
    }

    @Test
    fun `test access type grouping`() {
        val providers = listOf(nordeaBankId, nordeaPassword, nordeaOpenBanking)
        val groups = providers.toProviderTree()
        assertThat(groups).hasSize(1)

        val groupDisplayNameNode = groups.first()
        assertThat(groupDisplayNameNode)
            .isInstanceOf(FinancialInstitutionGroupNode::class.java)

        val financialInstitutions =
            (groupDisplayNameNode as FinancialInstitutionGroupNode).financialInstitutions
        assertThat(financialInstitutions).hasSize(1)

        val accessTypes = financialInstitutions.first().accessTypes
        assertThat(accessTypes)
            .hasSize(2)
            .anySatisfy { assertThat(it.type).isEqualTo(Provider.AccessType.OPEN_BANKING) }
            .anySatisfy { assertThat(it.type).isEqualTo(Provider.AccessType.OTHER) }
    }

    @Test
    fun `test group display name grouping`() {
        val providers = listOf(nordeaBankId, nordeaPassword, swedbankBankID, swedbankPassword)
        val groups = providers.toProviderTree()
        assertThat(groups)
            .hasSize(2)
            .allSatisfy { it is FinancialInstitutionGroupNode }

        val nordeaGroup = groups[0] as FinancialInstitutionGroupNode
        val swedbankGroup = groups[1] as FinancialInstitutionGroupNode

        assertThat(nordeaGroup.financialInstitutions)
            .hasSize(1)
            .haveExactly(1, nordeaFinancialInstitution)

        assertThat(swedbankGroup.financialInstitutions)
            .hasSize(1)
            .haveExactly(1, swedbankFinancialInstitution)
    }

    @Test
    fun `test group display name and financial institution grouping`() {
        val providers = listOf(
            nordeaBankId,
            nordeaPassword,
            swedbankBankID,
            swedbankPassword,
            sparbankernaBankID,
            sparbankernaPassword
        )
        val groups = providers.toProviderTree()
        assertThat(groups)
            .describedAs("Check that we have two GroupDisplayName groups")
            .hasSize(2)
            .allMatch { it is FinancialInstitutionGroupNode }

        val nordeaGroup = groups[0] as FinancialInstitutionGroupNode
        val swedbankAndSparbankernaGroup = groups[1] as FinancialInstitutionGroupNode

        assertThat(nordeaGroup.financialInstitutions)
            .hasSize(1)
            .haveExactly(1, nordeaFinancialInstitution)

        assertThat(swedbankAndSparbankernaGroup.financialInstitutions)
            .describedAs("Check that Swedbank and Sparbankerna group contains both financialInstitutions")
            .hasSize(2)
            .haveExactly(1, swedbankFinancialInstitution)
            .haveExactly(1, sparbankernaFinancialInstitution)
    }
}