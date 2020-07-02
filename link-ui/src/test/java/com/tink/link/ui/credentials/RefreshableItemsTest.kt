package com.tink.link.ui.credentials

import com.tink.model.credentials.RefreshableItem
import com.tink.model.credentials.plus
import com.tink.model.provider.Provider
import com.tink.model.user.Scope
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

internal class RefreshableItemsTest {

    private val scopeAccounts = listOf(Scope.AccountsRead)
    private val scopesAccountsTransactions =
        listOf(Scope.AccountsRead, Scope.TransactionsRead)

    private val capabilityAll =
        listOf(
            Provider.Capability.CHECKING_ACCOUNTS,
            Provider.Capability.SAVINGS_ACCOUNTS,
            Provider.Capability.EINVOICES,
            Provider.Capability.TRANSFERS
        )
    private val capabilityAccountsOnly =
        listOf(
            Provider.Capability.CHECKING_ACCOUNTS,
            Provider.Capability.SAVINGS_ACCOUNTS
        )

    @Test
    fun `scope with only account access creates refreshable item set with only accounts and defaults`() {
        assertThat(
            createRefreshableItems(scopeAccounts, capabilityAll)
        ).containsOnlyElementsOf(
            RefreshableItem.CHECKING_ACCOUNTS +
                    RefreshableItem.SAVING_ACCOUNTS +
                    RefreshableItem.EINVOICES +
                    RefreshableItem.TRANSFER_DESTINATIONS
        )
    }

    @Test
    fun `scopes with account and transactions access creates matching refreshable item set`() {
        assertThat(
            createRefreshableItems(scopesAccountsTransactions, capabilityAll)
        ).containsOnlyElementsOf(
            RefreshableItem.CHECKING_ACCOUNTS +
                    RefreshableItem.SAVING_ACCOUNTS +
                    RefreshableItem.CHECKING_TRANSACTIONS +
                    RefreshableItem.SAVING_TRANSACTIONS +
                    RefreshableItem.EINVOICES +
                    RefreshableItem.TRANSFER_DESTINATIONS
        )
    }

    @Test
    fun `refreshable item set contains only items supported by provider capability`() {
        assertThat(
            createRefreshableItems(scopesAccountsTransactions, capabilityAccountsOnly)
        ).containsOnlyElementsOf(
            RefreshableItem.CHECKING_ACCOUNTS +
                    RefreshableItem.SAVING_ACCOUNTS +
                    RefreshableItem.CHECKING_TRANSACTIONS +
                    RefreshableItem.SAVING_TRANSACTIONS
        )
    }
}
