package com.tink.link.ui.providerlist

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.tink.link.ui.financialinstitution.FinancialInstitutionListFragment
import com.tink.link.ui.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.ui.providertree.ARG_PROVIDER_TREE
import com.tink.link.ui.providertree.ProviderTreeNodeFragment
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.link.ui.extensions.toArrayList
import com.tink.model.provider.Provider
import com.tink.model.provider.ProviderTreeNode
import com.tink.model.provider.toProviderTree
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

/**
 * Fragment responsible for displaying a list of financial institution groups.
 * This is the root level of the tree.
 */
class ProviderListFragment : ProviderTreeNodeFragment(R.layout.tink_fragment_provider_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.setTitle(R.string.tink_provider_list_title)
        toolbar.setNavigationOnClickListener { (activity as? TinkLinkUiActivity)?.finish() }
    }

    /**
     * Navigate to the [FinancialInstitutionListFragment].
     */
    override fun navigateToNode(node: ProviderTreeNode) {
        findNavController().navigate(
            R.id.action_providerListFragment_to_financialInstitutionListFragment,
            bundleOf(
                ARG_PROVIDER_TREE to (node as ProviderTreeNode.FinancialInstitutionGroupNode).financialInstitutions.toArrayList(),
                ARG_PROVIDER_TOOLBAR_TITLE to node.name
            )
        )
    }

    companion object {
        /**
         * Create an arguments bundle.
         *
         * This transforms the [providers] list into a list of [ProviderTreeNode] objects.
         */
        fun getBundle(providers: List<Provider>) =
            bundleOf(ARG_PROVIDER_TREE to providers.toProviderTree().toArrayList())
    }
}