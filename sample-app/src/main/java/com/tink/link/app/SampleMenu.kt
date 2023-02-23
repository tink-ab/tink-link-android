package com.tink.link.app

import android.app.Activity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
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

@Composable
fun HomeScreenApp(activity: Activity) {
    var launchModeName by remember { mutableStateOf(LaunchModeName.FULL_SCREEN) }

    Column(modifier = Modifier.padding(top = 30.dp)) {
        ExpandableCardWithRadio(
            "Launch Mode",
            LaunchModeName.values()
        ) { selectedMode ->
            launchModeName = selectedMode
        }

        FlowOptions(activity, launchModeName)
    }
}

@Composable
fun FlowOptions(activity: Activity, selectedLaunchMode: LaunchModeName) {
    Column(
        modifier = Modifier.padding(top = 30.dp)
    ) {
        TitleText("Flows: ")

        ExpandableCard(
            "Transaction",
            FlowDetails.transactionOptions,
            activity,
            selectedLaunchMode
        )

        ExpandableCard(
            "Payment",
            FlowDetails.paymentOptions,
            activity,
            selectedLaunchMode
        )

        ExpandableCard(
            "Report",
            FlowDetails.reportOptions,
            activity,
            selectedLaunchMode
        )
    }
}
