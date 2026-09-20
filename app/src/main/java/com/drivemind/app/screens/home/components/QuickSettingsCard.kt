package com.drivemind.app.screens.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drivemind.app.ui.theme.DriveMindInnerCard
import com.drivemind.app.ui.theme.TextGray
import com.drivemind.app.ui.theme.TextWhite

// Verde característico do botão/ativação do DriveMind
val DriveMindGreen = Color(0xFF34C759)

@Composable
fun QuickSettingsCard(
    modifier: Modifier = Modifier
) {
    // Estados independentes para cada uma das opções
    var isCopilotEnabled by remember { mutableStateOf(false) }
    var isAutoPrintEnabled by remember { mutableStateOf(false) }
    var isSecretCamEnabled by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = DriveMindInnerCard)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Título da seção
            Text(
                text = "Configurações Rápidas",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextWhite
                ),
                modifier = Modifier.padding(bottom = 4.dp)
            )

            // Opção 1: Copiloto
            SettingToggleRow(
                title = "Copiloto",
                description = "Análise inteligente de corridas",
                isChecked = isCopilotEnabled,
                onCheckedChange = { isCopilotEnabled = it }
            )

            HorizontalDivider(
                thickness = 1.dp,
                color = TextGray.copy(alpha = 0.15f)
            )

            // Opção 2: Print Automático
            SettingToggleRow(
                title = "Print Automático",
                description = "Captura tela ao aceitar corrida",
                isChecked = isAutoPrintEnabled,
                onCheckedChange = { isAutoPrintEnabled = it }
            )

            HorizontalDivider(
                thickness = 1.dp,
                color = TextGray.copy(alpha = 0.15f)
            )

            // Opção 3: Câmera Secreta
            SettingToggleRow(
                title = "Câmera Secreta",
                description = "Gravação em segundo plano",
                isChecked = isSecretCamEnabled,
                onCheckedChange = { isSecretCamEnabled = it }
            )
        }
    }
}

@Composable
private fun SettingToggleRow(
    title: String,
    description: String,
    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextWhite
                )
            )
            Text(
                text = description,
                style = MaterialTheme.typography.bodySmall.copy(
                    fontSize = 11.sp,
                    color = TextGray
                )
            )
        }

        Switch(
            checked = isChecked,
            onCheckedChange = onCheckedChange,
            modifier = Modifier.scale(0.85f),
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.White,
                checkedTrackColor = DriveMindGreen,
                checkedBorderColor = Color.Transparent,

                uncheckedThumbColor = TextGray,
                uncheckedTrackColor = Color.Black.copy(alpha = 0.4f),
                uncheckedBorderColor = Color.Transparent
            )
        )
    }
}