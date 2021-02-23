package com.tink.link.ui.providerlist

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.widget.SearchView
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tink.link.ui.ProviderSelection
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkError
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.link.ui.analytics.TinkLinkTracker
import com.tink.link.ui.analytics.models.InteractionEvent
import com.tink.link.ui.analytics.models.ScreenEvent
import com.tink.link.ui.credentials.CredentialsOperationArgs
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

    private val viewModel: ProviderListViewModel by activityViewModels()

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
                updateSearchView()
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
                if (it == true) {
                    (activity as? TinkLinkUiActivity)?.let { activity ->
                        activity.linkError = TinkLinkError.UnableToFetchProviders
                    }
                    errorGroup?.visibility = View.VISIBLE
                    TinkLinkTracker.trackScreen(ScreenEvent.ERROR_SCREEN)
                } else {
                    (activity as? TinkLinkUiActivity)?.let { activity ->
                        activity.linkError = null
                    }
                    errorGroup?.visibility = View.GONE
                }
            }
        )

        viewModel.updateProvidersFromSelection(providerSelection)

        retryButton.setOnClickListener {
            viewModel.updateProvidersFromSelection(providerSelection)
        }

        setupToolbar()

        TinkLinkTracker.trackScreen(getScreenEventFromPath(path))

        activity
            ?.onBackPressedDispatcher
            ?.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    TinkLinkTracker.trackInteraction(
                        InteractionEvent.BACK,
                        getScreenEventFromPath(path)
                    )
                    isEnabled = false
                    activity?.onBackPressed()
                }
            })
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
        updateSearchView()

        toolbar.setNavigationOnClickListener {
            TinkLinkTracker.trackInteraction(
                InteractionEvent.CLOSE,
                getScreenEventFromPath(path)
            )
            (activity as? TinkLinkUiActivity)?.let { activity ->
                val resultCode = if (activity.linkError == TinkLinkError.UnableToFetchProviders) {
                    TinkLinkUiActivity.RESULT_FAILURE
                } else {
                    TinkLinkUiActivity.RESULT_CANCELLED
                }
                activity.closeTinkLinkUi(resultCode)
            }
        }
    }

    private fun updateSearchView() {
        if (!providerAdapter?.providers.isNullOrEmpty() && path.shouldShowSearch()) {
            setupSearch(toolbar.menu.findItem(R.id.search_button).actionView as SearchView)
            toolbar.menu.findItem(R.id.search_button).actionView.visibility = View.VISIBLE
        } else {
            toolbar.menu.findItem(R.id.search_button).actionView.visibility = View.GONE
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
                    CredentialsOperationArgs.Create(newPath.providerNodeByProvider!!)
                )
            } else {
                ProviderListFragmentDirections.actionProviderListFragmentToCredentialsFragment(
                    CredentialsOperationArgs.Create(newPath.providerNodeByProvider!!)
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

    private fun getScreenEventFromPath(path: ProviderListPath): ScreenEvent =
        when {
            path.credentialsTypeNodeByType != null ->
                ScreenEvent.PROVIDER_SELECTION_SCREEN

            path.accessTypeNodeByType != null ->
                ScreenEvent.CREDENTIALS_TYPE_SELECTION_SCREEN

            path.authenticationUserTypeNodeByType != null ->
                ScreenEvent.ACCESS_TYPE_SELECTION_SCREEN

            path.financialInstitutionNodeByFinancialInstitution != null ->
                ScreenEvent.AUTHENTICATION_USER_TYPE_SELECTION_SCREEN

            path.financialInstitutionGroupNodeByName != null ->
                ScreenEvent.FINANCIAL_INSTITUTION_SELECTION_SCREEN

            else -> ScreenEvent.PROVIDER_SELECTION_SCREEN
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
