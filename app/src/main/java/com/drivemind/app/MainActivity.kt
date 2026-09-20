package com.drivemind.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.drivemind.app.screens.home.HomeScreen
import com.drivemind.app.ui.theme.DriveMindTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            DriveMindTheme {
                HomeScreen()
            }
        }
    }
}