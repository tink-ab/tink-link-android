package com.tink.link.ui.accesstype

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.tink.link.ui.credentialtype.CredentialTypeListFragment
import com.tink.link.ui.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.ui.providertree.ARG_PROVIDER_TREE
import com.tink.link.ui.providertree.ProviderTreeNodeFragment
import com.tink.link.ui.R
import com.tink.link.ui.extensions.toArrayList
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.synthetic.main.tink_layout_provider_tree_node_list.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

/**
 * Fragment responsible for displaying a list of access types that belong to the same financial institution.
 *
 * @see [ProviderTreeNode.FinancialInstitutionNode]
 */
class AccessTypeListFragment :
    ProviderTreeNodeFragment(R.layout.tink_fragment_access_type_list) {

    private val toolbarTitle: String by lazy {
        requireNotNull(arguments?.getString(ARG_PROVIDER_TOOLBAR_TITLE))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title.setText(R.string.tink_access_type_fragment_title)
        subtitle.apply {
            setText(R.string.tink_access_type_fragment_subtitle)
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
