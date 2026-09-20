package com.drivemind.app.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.drivemind.app.screens.home.components.EarningCard
import com.drivemind.app.screens.home.components.Header


@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(
                top = 60.dp,
                start = 24.dp,
                end = 24.dp,
                bottom = 24.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Header()
        EarningCard()
        Button(
            onClick = {
                // Vamos colocar uma ação aqui depois
            },
            modifier = Modifier
                .padding(top = 24.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text("Começar")
        }
    }
}