package com.drivemind.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.foundation.isSystemInDarkTheme

private val LightColorScheme = lightColorScheme(
    primary = DriveMindPrimary,
    secondary = DriveMindSecondary,
    background = DriveMindBackground
)

private val DarkColorScheme = darkColorScheme(
    primary = DriveMindPrimary,
    secondary = DriveMindSecondary
)

@Composable
fun DriveMindTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}