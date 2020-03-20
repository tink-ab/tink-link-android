package com.tink.link.ui.providerlist

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
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

    private var queryString: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        queryString = savedInstanceState?.getString(QUERY) ?: ""
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(providers) {
            layoutManager = LinearLayoutManager(requireContext())
            providerAdapter = ProviderListRecyclerAdapter().also {
                it.providers = providerList
                it.onItemClickedListener = ::navigateToNode
            }
            adapter = providerAdapter
        }
        setupToolbar()
    }

    private fun setupToolbar() {
        toolbar.setTitle(R.string.tink_provider_list_title)
        toolbar.inflateMenu(R.menu.tink_menu_search_close)
        setupSearch(toolbar.menu.findItem(R.id.search_button).actionView as SearchView)
        toolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.close_button -> {
                    (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(TinkLinkUiActivity.RESULT_CANCELLED)
                    true
                }

                else -> false
            }
        }
        toolbar.setNavigationOnClickListener {
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(TinkLinkUiActivity.RESULT_CANCELLED)
        }
    }

    private fun setupSearch(searchView: SearchView) {
        searchView.apply {
            maxWidth = resources.getDimensionPixelSize(R.dimen.tink_search_view_width)
            queryHint = getString(R.string.tink_search_provider_hint)
            if (queryString.isNotEmpty()) {
                setQuery(queryString, false)
                isIconified = false
            }
            setOnQueryTextListener(object: SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String): Boolean {
                    search(query)
                    return true
                }

                override fun onQueryTextChange(newText: String): Boolean {
                    search(newText)
                    return true
                }
            })
        }
    }

    private fun search(searchText: String) {
        queryString = searchText
        val filteredProviders =
                queryString
                    .takeIf { it.isNotBlank() && it.length >= 3 }
                    ?.let { query ->
                        providerList.filter {
                            it.name?.contains(query, ignoreCase = true) ?: false
                        }
                    }
                    ?: providerList
        providerAdapter?.apply {
            providers = filteredProviders
        }
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

    override fun onSaveInstanceState(outState: Bundle) {
        outState.apply {
            putString(QUERY, queryString)
        }
        super.onSaveInstanceState(outState)
    }

    companion object {
        internal const val QUERY = "query"
        /**
         * Create an arguments bundle.
         *
         * This transforms the [providers] list into a list of [ProviderTreeNode] objects.
         */
        fun getBundle(providers: List<Provider>) =
            bundleOf(ARG_PROVIDER_TREE to providers.toProviderTree().toArrayList())
    }
}