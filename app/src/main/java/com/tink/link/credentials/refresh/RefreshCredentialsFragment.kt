package com.tink.link.credentials.refresh

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
import com.tink.link.MainActivity
import com.tink.link.R
import com.tink.link.credentials.CredentialField
import com.tink.link.extensions.dpToPixels
import com.tink.link.extensions.launch
import com.tink.link.model.credential.Credential
import kotlinx.android.synthetic.main.fragment_refresh_credentials.*

class RefreshCredentialsFragment : Fragment(R.layout.fragment_refresh_credentials) {

    private val viewModel: RefreshCredentialsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userContext = (activity as MainActivity).tinkLink.getUserContext()!!
        viewModel.initialize(userContext.credentialRepository, userContext.providerRepository)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = RefreshCredentialsAdapter()

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter

        viewModel.refreshInfo.observe(viewLifecycleOwner, Observer { list ->
            adapter.models = list
        })

        viewModel.infoRequiredEvent.observe(viewLifecycleOwner, Observer { event ->

            event?.getContentIfNotHandled()?.let { credential ->
                when (credential.status) {
                    Credential.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION,
                    Credential.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION ->
                        credential.thirdPartyAppAuthentication?.launch(requireActivity()) {
                            // User cancelled authorization
                        }

                    Credential.Status.AWAITING_SUPPLEMENTAL_INFORMATION ->
                        showSupplementalInfoDialog(credential)

                    else -> {
                        // Event handling not applicable
                    }
                }
            }
        })

        refreshButton.setOnClickListener { viewModel.refreshAll() }
    }


    private fun showSupplementalInfoDialog(credential: Credential) {

        val credentialFields = LinearLayout(requireContext())


        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )


        credentialFields.layoutParams = params
        credentialFields.setPadding(50)
        credentialFields.orientation = LinearLayout.VERTICAL

        for (field in credential.supplementalInformation) {
            credentialFields
                .addView(
                    CredentialField(requireContext())
                        .also {
                            it.updatePadding(bottom = resources.dpToPixels(32))
                            it.setupField(field)
                        })
        }

        AlertDialog.Builder(requireContext())
            .setPositiveButton("Send") { _, _ ->

                val filledFields = credentialFields.children
                    .filterIsInstance(CredentialField::class.java)
                    .map { it.getFilledField() }
                    .toList()

                viewModel.sendSupplementalInformation(credential.id, filledFields)
            }
            .setNegativeButton("Cancel") { _, _ ->
                viewModel.cancelSupplementalInformation(credential.id)
            }
            .setView(credentialFields)
            .show()
    }
}
