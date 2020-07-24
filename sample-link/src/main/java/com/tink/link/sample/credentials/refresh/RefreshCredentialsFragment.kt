package com.tink.link.sample.credentials.refresh

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.core.view.children
import androidx.core.view.setPadding
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.tink.link.sample.R
import com.tink.link.sample.credentials.CredentialsField
import com.tink.link.sample.credentials.toView
import com.tink.link.sample.extensions.dpToPixels
import com.tink.link.sample.extensions.launch
import com.tink.model.credentials.Credentials
import kotlinx.android.synthetic.main.fragment_refresh_credentials.*

class RefreshCredentialsFragment : Fragment(R.layout.fragment_refresh_credentials) {

    private val viewModel: RefreshCredentialsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = RefreshCredentialsAdapter()

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter

        viewModel.refreshInfo.observe(
            viewLifecycleOwner,
            Observer { list ->
                adapter.models = list
            }
        )

        viewModel.infoRequiredEvent.observe(
            viewLifecycleOwner,
            Observer { event ->

                event?.getContentIfNotHandled()?.let { credentials ->
                    when (credentials.status) {
                        Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION,
                        Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION ->
                            credentials.thirdPartyAppAuthentication?.launch(requireActivity()) {
                                // User cancelled authorization
                            }

                        Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION ->
                            showSupplementalInfoDialog(credentials)

                        else -> {
                            // Event handling not applicable
                        }
                    }
                }
            }
        )

        refreshButton.setOnClickListener { viewModel.refreshAll() }
    }

    private fun showSupplementalInfoDialog(credentials: Credentials) {

        val credentialsFields = LinearLayout(requireContext())

        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        credentialsFields.layoutParams = params
        credentialsFields.setPadding(50)
        credentialsFields.orientation = LinearLayout.VERTICAL

        for (field in credentials.supplementalInformation) {
            credentialsFields
                .addView(
                    field.toView(requireContext())
                        .also { it.updatePadding(bottom = resources.dpToPixels(32)) }
                )
        }

        AlertDialog.Builder(requireContext())
            .setPositiveButton("Send") { _, _ ->

                val filledFields = credentialsFields.children
                    .filterIsInstance(CredentialsField::class.java)
                    .map { it.getFilledField() }
                    .toList()

                viewModel.sendSupplementalInformation(credentials.id, filledFields)
            }
            .setNegativeButton("Cancel") { _, _ ->
                viewModel.cancelSupplementalInformation(credentials.id)
            }
            .setView(credentialsFields)
            .show()
    }
}
