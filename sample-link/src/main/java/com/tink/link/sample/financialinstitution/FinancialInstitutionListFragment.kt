package com.tink.link.sample.financialinstitution

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.layout_provider_tree_node_list.*
import kotlinx.android.synthetic.main.layout_toolbar.*
import com.tink.link.sample.R
import com.tink.link.sample.accesstype.AccessTypeListFragment
import com.tink.link.sample.extensions.toArrayList
import com.tink.link.sample.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.sample.providertree.ARG_PROVIDER_TREE
import com.tink.link.sample.providertree.ProviderTreeNodeFragment
import com.tink.model.provider.ProviderTreeNode

/**
 * Fragment responsible for displaying a list of financial institutions that belongs to the same financial institution group.
 *
 * @see [ProviderTreeNode.FinancialInstitutionGroupNode]
 */
class FinancialInstitutionListFragment :
    ProviderTreeNodeFragment(R.layout.fragment_financial_institution_list) {

    private val toolbarTitle: String by lazy {
        requireNotNull(arguments?.getString(ARG_PROVIDER_TOOLBAR_TITLE))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title.setText(R.string.financial_institution_fragment_title)
        toolbar.title = toolbarTitle
        toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
    }

    /**
     * Navigate to the [AccessTypeListFragment].
     */
    override fun navigateToNode(node: ProviderTreeNode) {
        val selectedInstitution = node as ProviderTreeNode.FinancialInstitutionNode
        findNavController().navigate(
            R.id.accessTypeListFragment,
            bundleOf(
                ARG_PROVIDER_TREE to selectedInstitution.accessTypes.toArrayList(),
                ARG_PROVIDER_TOOLBAR_TITLE to selectedInstitution.name
            )
        )
    }
}