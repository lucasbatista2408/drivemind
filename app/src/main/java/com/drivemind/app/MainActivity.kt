package com.drivemind.app

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.drivemind.app.ui.theme.DriveMindTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            DriveMindTheme {
                DriveMindScreen()
            }
        }
    }
}

@Composable
fun DriveMindScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
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