package com.tink.link.app

import android.app.Activity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tink.link.app.components.ExpandableCard
import com.tink.link.app.components.ExpandableCardWithRadio
import com.tink.link.app.components.TitleText
import com.tink.link.app.navToFlows.FlowDetails
import com.tink.link.app.navToFlows.LaunchModeName
import com.tink.link.core.data.request.configuration.Configuration

@Composable
fun HomeScreenApp(activity: Activity, configuration: Configuration) {
    var launchModeName by remember { mutableStateOf(LaunchModeName.FULL_SCREEN) }

    Column(
        modifier = Modifier
            .verticalScroll(
                rememberScrollState()
            )
    ) {
        ExpandableCardWithRadio(
            "Launch Mode",
            LaunchModeName.values()
        ) { selectedMode ->
            launchModeName = selectedMode
        }

        FlowOptions(activity, configuration, launchModeName)
    }
}

@Composable
fun FlowOptions(activity: Activity, configuration: Configuration, selectedLaunchMode: LaunchModeName) {
    Column(
        modifier = Modifier.padding(top = 30.dp)
    ) {
        TitleText("Flows: ")

        ExpandableCard(
            "Transaction",
            FlowDetails.transactionOptions,
            activity,
            configuration,
            selectedLaunchMode
        )

        ExpandableCard(
            "Payment",
            FlowDetails.paymentOptions,
            activity,
            configuration,
            selectedLaunchMode
        )

        ExpandableCard(
            "Report",
            FlowDetails.reportOptions,
            activity,
            configuration,
            selectedLaunchMode
        )

        ExpandableCard(
            "Account Aggregation",
            FlowDetails.accountAggregationOptions,
            activity,
            configuration,
            selectedLaunchMode
        )
    }
}
