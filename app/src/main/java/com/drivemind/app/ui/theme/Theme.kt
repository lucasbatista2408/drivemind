package com.drivemind.app.ui.theme

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = DriveMindPrimaryGreen,
    secondary = DriveMindEarningGreen,
    background = DriveMindBackground,
    surface = DriveMindCardBackground,
    surfaceVariant = DriveMindInnerCard,
    onBackground = TextWhite,
    onSurface = TextWhite,
    onSurfaceVariant = TextGray
)

@Composable
fun DriveMindTheme(
    darkTheme: Boolean = true, // Força o tema escuro como padrão da aplicação
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme
    val view = LocalView.current

    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            // Ajusta a barra de status do sistema para acompanhar o tema escuro
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}