package com.tink.link.ui.providerlist

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tink.link.ui.R
import com.tink.link.ui.extensions.getColorFromAttr
import com.tink.link.ui.extensions.toArrayList
import com.tink.link.ui.financialinstitution.FinancialInstitutionListFragment
import com.tink.link.ui.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.ui.providertree.ARG_PROVIDER_TREE
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.synthetic.main.tink_fragment_provider_list.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

/**
 * Fragment responsible for displaying a list of financial institution groups.
 * This is the root level of the tree.
 */
internal class ProviderListFragment : Fragment(R.layout.tink_fragment_provider_list) {

    private var providerAdapter: ProviderListRecyclerAdapter? = null

    private val viewModel: ProviderListViewModel by viewModels()

    private var queryString: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        queryString = savedInstanceState?.getString(QUERY) ?: ""
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(providers) {
            layoutManager = LinearLayoutManager(requireContext())
            providerAdapter = ProviderListRecyclerAdapter().apply {
                onItemClickedListener = ::navigateToNode
            }
            adapter = providerAdapter
        }

        viewModel.providers.observe(viewLifecycleOwner, Observer {
            providerAdapter?.providers = it
        })

        setupToolbar()
    }

    private fun setupToolbar() {
        toolbar.setTitle(R.string.tink_provider_list_title)
        toolbar.inflateMenu(R.menu.tink_menu_search)
        val searchMenuItem = toolbar.menu.findItem(R.id.search_button)
        DrawableCompat.setTint(
            searchMenuItem.icon,
            requireContext().getColorFromAttr(R.attr.tink_colorOnPrimary)
        )
        setupSearch(toolbar.menu.findItem(R.id.search_button).actionView as SearchView)
    }

    private fun setupSearch(searchView: SearchView) {
        searchView.apply {
            queryHint = getString(R.string.tink_search_provider_hint)
            if (queryString.isNotEmpty()) {
                setQuery(queryString, false)
                isIconified = false
            }
            setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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

    private fun search(searchText: String) = viewModel.search(searchText)

    /**
     * Navigate to the [FinancialInstitutionListFragment].
     */
    private fun navigateToNode(node: ProviderTreeNode) {
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
    }
}