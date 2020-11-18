package com.tink.link.ui.credentials

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.link.ui.extensions.inflate
import com.tink.model.consent.ScopeDescription
import kotlinx.android.synthetic.main.tink_fragment_consent_information.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

private const val TOOLBAR_TITLE_ARG = "TOOLBAR_TITLE_ARG"
private const val SCOPE_LIST_ARG = "SCOPE_LIST_ARG"

internal class ConsentInformationFragment : Fragment(R.layout.tink_fragment_consent_information) {

    private val toolbarTitle by lazy {
        requireNotNull(arguments?.getString(TOOLBAR_TITLE_ARG))
    }

    private val scopeList by lazy {
        requireNotNull(arguments?.getParcelableArrayList<ScopeDescription>(SCOPE_LIST_ARG))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = toolbarTitle
        toolbar.setNavigationOnClickListener {
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(
                TinkLinkUiActivity.RESULT_CANCELLED
            )
        }
        with(scopeInfoList) {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ScopeListAdapter().apply { data = scopeList }
        }
    }

    companion object {
        fun getBundle(toolbarTitle: String, scopeList: ArrayList<ScopeDescription>) =
            bundleOf(TOOLBAR_TITLE_ARG to toolbarTitle, SCOPE_LIST_ARG to scopeList)
    }
}

internal class ScopeListAdapter : RecyclerView.Adapter<ScopeListAdapter.ScopeItemViewHolder>() {

    var data: List<ScopeDescription> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScopeItemViewHolder {
        return ScopeItemViewHolder(parent.inflate(R.layout.tink_item_consent_scope))
    }

    override fun onBindViewHolder(holder: ScopeItemViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    internal class ScopeItemViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val title: TextView = itemView.findViewById(R.id.scopeTitle)
        private val description: TextView = itemView.findViewById(R.id.scopeDescription)

        fun bind(item: ScopeDescription) {
            title.text = item.title
            description.text = item.description
        }
    }
}
