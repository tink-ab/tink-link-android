package com.tink.link.ui.providertree

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tink.link.ui.providerlist.ProviderListRecyclerAdapter
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.synthetic.main.tink_layout_provider_tree_node_list.*

internal const val ARG_PROVIDER_TREE = "ARG_PROVIDER_TREE"
internal const val ARG_PROVIDER_TOOLBAR_TITLE = "ARG_PROVIDER_TOOLBAR_TITLE"

/**
 * Abstract helper class for declaring a fragment used to display a list of [ProviderTreeNode] objects.
 */
abstract class ProviderTreeNodeFragment(@LayoutRes layoutRes: Int) : Fragment(layoutRes) {

    private var providerAdapter: ProviderListRecyclerAdapter? = null

    private val providerList: List<ProviderTreeNode> by lazy {
        requireNotNull(arguments?.getParcelableArrayList<ProviderTreeNode>(ARG_PROVIDER_TREE))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (providerList.size == 1) {
            // Skip this level and go directly to the child,
            // instead of displaying a list of only one possible selection.
            findNavController().popBackStack()
            navigateToNode(providerList.first())
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    internal open fun setupViews() {
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
    }

    abstract fun navigateToNode(node: ProviderTreeNode)
}