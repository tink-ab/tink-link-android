package com.tink.sample.credentialstype

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.layout_provider_tree_node_list.*
import kotlinx.android.synthetic.main.layout_toolbar.*
import com.tink.sample.extensions.toArrayList
import com.tink.sample.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.sample.providertree.ARG_PROVIDER_TREE
import com.tink.sample.providertree.ProviderTreeNodeFragment
import com.tink.sample.providernode.ProviderNodeFragment
import com.tink.model.provider.ProviderTreeNode
import com.tink.sample.R

/**
 * Fragment responsible for displaying a list of credentials types that belongs to the same access type.
 *
 * @see [ProviderTreeNode.AccessTypeNode]
 */
class CredentialsTypeListFragment :
    ProviderTreeNodeFragment(R.layout.fragment_credentials_type_list) {

    private val toolbarTitle: String by lazy {
        requireNotNull(arguments?.getString(ARG_PROVIDER_TOOLBAR_TITLE))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title.setText(R.string.credentials_type_fragment_title)
        toolbar.title = toolbarTitle
        toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
    }

    /**
     * Navigate to the [ProviderNodeFragment]
     */
    override fun navigateToNode(node: ProviderTreeNode) {
        findNavController().navigate(
            R.id.providerNodeFragment,
            bundleOf(
                ARG_PROVIDER_TOOLBAR_TITLE to toolbarTitle,
                ARG_PROVIDER_TREE to (node as ProviderTreeNode.CredentialsTypeNode).providers.toArrayList()
            )
        )
    }
}