package com.tink.link.accesstype

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.tink.link.R
import com.tink.link.credentialtype.CredentialTypeListFragment
import com.tink.link.extensions.toArrayList
import com.tink.link.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.providertree.ARG_PROVIDER_TREE
import com.tink.link.providertree.ProviderTreeNodeFragment
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.synthetic.main.layout_provider_tree_node_list.*
import kotlinx.android.synthetic.main.layout_toolbar.*

/**
 * Fragment responsible for displaying a list of access types that belong to the same financial institution.
 *
 * @see [ProviderTreeNode.FinancialInstitutionNode]
 */
class AccessTypeListFragment :
    ProviderTreeNodeFragment(R.layout.fragment_access_type_list) {

    private val toolbarTitle: String by lazy {
        requireNotNull(arguments?.getString(ARG_PROVIDER_TOOLBAR_TITLE))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title.setText(R.string.access_type_fragment_title)
        subtitle.apply {
            setText(R.string.access_type_fragment_subtitle)
            visibility = View.VISIBLE
        }
        toolbar.title = toolbarTitle
        toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
    }

    /**
     * Navigate to the [CredentialTypeListFragment]
     */
    override fun navigateToNode(node: ProviderTreeNode) {
        findNavController().navigate(
            R.id.credentialTypeListFragment,
            bundleOf(
                ARG_PROVIDER_TREE to (node as ProviderTreeNode.AccessTypeNode).credentialTypes.toArrayList(),
                ARG_PROVIDER_TOOLBAR_TITLE to toolbarTitle
            )
        )
    }
}
