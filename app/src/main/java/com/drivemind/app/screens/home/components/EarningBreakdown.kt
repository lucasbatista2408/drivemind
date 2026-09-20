package com.drivemind.app.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EarningBreakdown() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            // Verde suave para o fundo do card (pode alterar o hex se preferir)
            containerColor = Color(0xFF4CAF50)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Coluna 1: Gráfico (Ocupa 50% da largura)
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Gráfico ult. 5 dias",
                    fontSize = 14.sp
                )

                Text(
                    text = "[ gráfico ]",
                    modifier = Modifier.padding(top = 16.dp),
                    fontSize = 14.sp
                )
            }

            // Divisor vertical no centro
            Box(
                modifier = Modifier
                    .height(80.dp)
                    .width(1.dp)
                    .background(MaterialTheme.colorScheme.outlineVariant)
            )

            // Coluna 2: Apps (Ocupa 50% da largura)
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Linha Uber
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Uber",
                        fontSize = 14.sp
                    )
                    Text(
                        text = "R$ 35,50",
                        fontSize = 14.sp
                    )
                }

                // Linha 99
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "99",
                        fontSize = 14.sp
                    )
                    Text(
                        text = "R$ 0,00",
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}