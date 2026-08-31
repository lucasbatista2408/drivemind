package com.drivemind.app.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "DriveMind"
        )

        Text(
            text = "Seu parceiro de estrada",
            modifier = Modifier.padding(top = 8.dp)
        )

        Surface(
            modifier = Modifier
                .padding(top = 24.dp),
            shape = RoundedCornerShape(16.dp),
            tonalElevation = 4.dp
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp),
            ) {
                Text(
                    text = "Ganhos Hoje",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )

                Text(
                    text = "R$ 0,00",
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .align(Alignment.CenterHorizontally)
                )
            }
        }

        Button(
            onClick = {
                // Vamos colocar uma ação aqui depois
            },
            modifier = Modifier.padding(top = 24.dp)
        ) {
            Text("Começar")
        }
    }
}