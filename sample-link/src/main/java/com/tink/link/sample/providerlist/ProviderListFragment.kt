package com.tink.link.sample.providerlist

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.tink.link.sample.R
import com.tink.link.sample.extensions.toArrayList
import com.tink.link.sample.financialinstitution.FinancialInstitutionListFragment
import com.tink.link.sample.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.sample.providertree.ARG_PROVIDER_TREE
import com.tink.link.sample.providertree.ProviderTreeNodeFragment
import com.tink.model.provider.Provider
import com.tink.model.provider.ProviderTreeNode
import com.tink.model.provider.toProviderTree
import kotlinx.android.synthetic.main.layout_provider_tree_node_list.*

/**
 * Fragment responsible for displaying a list of financial institution groups.
 * This is the root level of the tree.
 */
class ProviderListFragment : ProviderTreeNodeFragment(R.layout.layout_provider_tree_node_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        title.setText(R.string.provider_list_title)
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
