package com.mrprateek.smarthealth.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.patrykandpatrick.vico.compose.component.marker.rememberMarker
import com.patrykandpatrick.vico.compose.chart.line.lineChart
import com.patrykandpatrick.vico.core.entry.entryModelOf

@Composable
fun GraphScreen(dataPoints: List<Float>) {
    val chartData = entryModelOf(*dataPoints.mapIndexed { index, value -> index to value }.toTypedArray())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("7-Day Health Data", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))

        val marker = rememberMarker()
        lineChart(
            chart = chartData,
            marker = marker()
        )
    }
}