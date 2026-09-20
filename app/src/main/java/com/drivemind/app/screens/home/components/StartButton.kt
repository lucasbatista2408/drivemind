package com.drivemind.app.screens.home.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drivemind.app.ui.theme.TextWhite

// Cor verde de ativação
val DriveMindActionGreen = Color(0xFF34C759)

@Composable
fun StartButton(
    isStarted: Boolean = false,
    onStatusChange: (Boolean) -> Unit = {},
    modifier: Modifier = Modifier
) {
    // Estado interno para alternar o texto e cor ao clicar
    var running by remember { mutableStateOf(isStarted) }

    Button(
        onClick = {
            running = !running
            onStatusChange(running)
        },
        modifier = modifier
            .fillMaxWidth()
            .height(68.dp)
            .padding(top = 24.dp),
        shape = CircleShape, // Formato pílula
        colors = ButtonDefaults.buttonColors(
            containerColor = if (running) Color(0xFFFF3B30) else DriveMindActionGreen,
            contentColor = TextWhite
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 4.dp,
            pressedElevation = 2.dp
        )
    ) {
        Text(
            text = if (running) "ENCERRAR" else "INICIAR DIA DE TRABALHO",
            style = MaterialTheme.typography.titleMedium.copy(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}