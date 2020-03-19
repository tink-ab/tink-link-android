package com.tink.link.ui.providerlist

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.link.ui.extensions.toArrayList
import com.tink.link.ui.financialinstitution.FinancialInstitutionListFragment
import com.tink.link.ui.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.ui.providertree.ARG_PROVIDER_TREE
import com.tink.link.ui.providertree.ProviderTreeNodeFragment
import com.tink.model.provider.Provider
import com.tink.model.provider.ProviderTreeNode
import com.tink.model.provider.toProviderTree
import kotlinx.android.synthetic.main.tink_fragment_provider_list.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

/**
 * Fragment responsible for displaying a list of financial institution groups.
 * This is the root level of the tree.
 */
class ProviderListFragment : ProviderTreeNodeFragment(R.layout.tink_fragment_provider_list) {

    private var providerAdapter: ProviderListRecyclerAdapter? = null

    private val providerList: List<ProviderTreeNode> by lazy {
        requireNotNull(arguments?.getParcelableArrayList<ProviderTreeNode>(ARG_PROVIDER_TREE))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(providers) {
            layoutManager = LinearLayoutManager(requireContext())

            // Declare a RecyclerView.Adapter object that will show the providers,
            // and navigate to a node when the corresponding item in the list is clicked.
            adapter = ProviderListRecyclerAdapter().also {
                it.providers = providerList
                it.onItemClickedListener = ::navigateToNode
                providerAdapter = it
            }
        }
        setupToolbar()
    }

    private fun setupToolbar() {
        toolbar.setTitle(R.string.tink_provider_list_title)
        toolbar.inflateMenu(R.menu.tink_menu_search_close)
        toolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.search_button -> {
                    // TODO: Implement search
                    true
                }

                R.id.close_button -> {
                    (activity as? TinkLinkUiActivity)?.finish()
                    true
                }

                else -> false
            }
        }
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