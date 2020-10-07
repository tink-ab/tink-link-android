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
import com.tink.link.ui.ProviderSelection
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.link.ui.credentials.CredentialsOperationType
import com.tink.link.ui.extensions.getColorFromAttr
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.synthetic.main.tink_fragment_provider_list.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

const val FRAGMENT_ARG_PROVIDER_SELECTION = "providerSelectionArg"

/**
 * Fragment responsible for displaying a list of financial institution groups.
 * This is the root level of the tree.
 */
internal class ProviderListFragment : Fragment(R.layout.tink_fragment_provider_list) {

    private var providerAdapter: ProviderListRecyclerAdapter? = null

    private val viewModel: ProviderListViewModel by viewModels()

    private var queryString: String = ""

    private val path: ProviderListPath by lazy {
        arguments?.getParcelable<ProviderListPath>(ARG_PATH) ?: ProviderListPath()
    }

    private val providerSelection: ProviderSelection by lazy {
        requireNotNull(arguments?.getParcelable<ProviderSelection>(FRAGMENT_ARG_PROVIDER_SELECTION))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        queryString = savedInstanceState?.getString(QUERY) ?: ""
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(providers) {
            layoutManager = LinearLayoutManager(requireContext())
            providerAdapter = ProviderListRecyclerAdapter().apply {
                onItemClickedListener = { navigateToNode(it) }
            }
            adapter = providerAdapter
        }

        viewModel.setPath(path)

        viewModel.providers.observe(
            viewLifecycleOwner,
            Observer {
                providerAdapter?.providers = it
                if (it.size == 1) {
                    // The list consists only of a single provider.
                    val node = it.first()
                    navigateToNode(node, providerSelection is ProviderSelection.SingleProvider)
                }
            }
        )

        viewModel.loading.observe(
            viewLifecycleOwner,
            Observer {
                loader?.visibility = if (it != false) View.VISIBLE else View.GONE
            }
        )

        viewModel.isError.observe(
            viewLifecycleOwner,
            Observer {
                errorGroup?.visibility = if (it == true) View.VISIBLE else View.GONE
            }
        )

        viewModel.updateProvidersFromSelection(providerSelection)

        retryButton.setOnClickListener {
            viewModel.updateProvidersFromSelection(providerSelection)
        }

        setupToolbar()
    }

    private fun setupToolbar() {
        toolbar.title = if (providerSelection is ProviderSelection.SingleProvider) {
            ""
        } else {
            getToolbarTitleFromPath(path)
        }
        toolbar.inflateMenu(R.menu.tink_menu_search)
        val searchMenuItem = toolbar.menu.findItem(R.id.search_button)
        DrawableCompat.setTint(
            searchMenuItem.icon,
            requireContext().getColorFromAttr(R.attr.tink_colorOnPrimary)
        )
        if (!providerAdapter?.providers.isNullOrEmpty() && path.shouldShowSearch()) {
            setupSearch(toolbar.menu.findItem(R.id.search_button).actionView as SearchView)
        } else {
            toolbar.menu.findItem(R.id.search_button).actionView.visibility = View.GONE
        }

        toolbar.setNavigationOnClickListener {
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(
                TinkLinkUiActivity.RESULT_CANCELLED
            )
        }
    }

    private fun setupSearch(searchView: SearchView) {
        searchView.apply {
            queryHint = getString(R.string.tink_provider_list_search_hint)
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

    private fun search(searchText: String) {
        queryString = searchText
        viewModel.search(searchText)
    }

    /**
     * Navigate to the next node.
     */
    private fun navigateToNode(node: ProviderTreeNode, singleProvider: Boolean = false) {
        val newPath = path.append(node)
        if (newPath.isFullPathToProvider) {
            val action = if (singleProvider) {
                ProviderListFragmentDirections.actionProviderListFragmentToCredentialsFragmentSingleProvider(
                    operationType = CredentialsOperationType.CREATE,
                    provider = newPath.providerNodeByProvider!!
                )
            } else {
                ProviderListFragmentDirections.actionProviderListFragmentToCredentialsFragment(
                    operationType = CredentialsOperationType.CREATE,
                    provider = newPath.providerNodeByProvider!!
                )
            }
            findNavController().navigate(action)
        } else {
            findNavController().navigate(
                R.id.action_providerListFragment_next,
                bundleOf(
                    ARG_PATH to newPath,
                    FRAGMENT_ARG_PROVIDER_SELECTION to providerSelection
                )
            )
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.apply {
            putString(QUERY, queryString)
        }
        super.onSaveInstanceState(outState)
    }

    companion object {
        internal const val QUERY = "query"
        internal const val ARG_PATH = "arg_path"
    }

    private fun getToolbarTitleFromPath(path: ProviderListPath): String =
        when {
            path.credentialsTypeNodeByType != null ->
                path.financialInstitutionNodeByFinancialInstitution?.name ?: ""

            path.accessTypeNodeByType != null ->
                getString(R.string.tink_provider_select_credentials_type_title)

            path.authenticationUserTypeNodeByType != null ->
                getString(R.string.tink_provider_select_access_type_title)

            path.financialInstitutionNodeByFinancialInstitution != null ->
                getString(R.string.tink_provider_select_authentication_user_type_title)

            path.financialInstitutionGroupNodeByName != null ->
                path.financialInstitutionGroupNodeByName

            else -> getString(R.string.tink_provider_list_title)
        }
}

/**
 * Only show search for the first two levels
 */
private fun ProviderListPath.shouldShowSearch() =
    financialInstitutionNodeByFinancialInstitution == null &&
        authenticationUserTypeNodeByType == null &&
        accessTypeNodeByType == null &&
        credentialsTypeNodeByType == null &&
        providerNodeByProvider == null
