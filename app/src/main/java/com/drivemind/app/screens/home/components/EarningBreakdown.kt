package com.drivemind.app.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drivemind.app.data.DailyEarning
import com.drivemind.app.ui.theme.DriveMindInnerCard
import com.drivemind.app.ui.theme.TextGray
import com.drivemind.app.ui.theme.TextWhite

val ChartOrange = Color(0xFFFF9900)

@Composable
fun EarningBreakdown(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(180.dp), // Restaurada a altura fixa de 180dp
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = DriveMindInnerCard)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Lado Esquerdo: Gráfico dos últimos 5 dias
            ChartSection(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            )

            // Divisória Vertical Central
            VerticalDivider(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 12.dp),
                thickness = 1.dp,
                color = TextGray.copy(alpha = 0.3f)
            )

            // Lado Direito: Lista dos valores por Plataforma
            PlatformBreakdownList(
                modifier = Modifier
                    .weight(1.1f)
                    .fillMaxHeight()
            )
        }
    }
}

@Composable
private fun ChartSection(
    modifier: Modifier = Modifier,
    earningsData: List<DailyEarning> = listOf(
        DailyEarning("S", 0.8f, 0.5f),
        DailyEarning("T", 0.4f, 0.55f),
        DailyEarning("Q", 0.65f, 0.9f),
        DailyEarning("Q", 0.35f, 0.5f),
        DailyEarning("S", 0.85f, 0.6f)
    )
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.Start
    ) {
        // 1. Título do Gráfico
        Text(
            text = "ULT. 5 DIAS",
            style = MaterialTheme.typography.titleMedium.copy(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = TextWhite
            ),
        )

        // 2. Gráfico e Letras integrados por coluna (Responsivo e Proporcional)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            earningsData.forEach { data ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Par de Barras do Dia
                    Row(
                        modifier = Modifier.height(60.dp), // Altura interna expandida proporcionalmente
                        horizontalArrangement = Arrangement.spacedBy(1.5.dp),
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Box(
                            modifier = Modifier
                                .width(5.dp)
                                .fillMaxHeight(data.progressFirstBar)
                                .background(
                                    color = TextWhite,
                                    shape = RoundedCornerShape(topStart = 2.dp, topEnd = 2.dp)
                                )
                        )
                        Box(
                            modifier = Modifier
                                .width(5.dp)
                                .fillMaxHeight(data.progressSecondBar)
                                .background(
                                    color = ChartOrange,
                                    shape = RoundedCornerShape(topStart = 2.dp, topEnd = 2.dp)
                                )
                        )
                    }

                    // Linha Horizontal de base
                    HorizontalDivider(
                        modifier = Modifier
                            .width(16.dp)
                            .padding(vertical = 4.dp),
                        thickness = 1.dp,
                        color = TextGray.copy(alpha = 0.3f)
                    )

                    // Letra correspondente ao dia
                    Text(
                        text = data.dayInitial,
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontSize = 10.sp,
                            color = TextGray
                        )
                    )
                }
            }
        }
    }
}

@Composable
private fun PlatformBreakdownList(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        PlatformRow(
            platformName = "Uber",
            amount = "R$ 100,00",
            backgroundColor = Color.Black,
            textColor = TextWhite
        )
        Spacer(modifier = Modifier.height(36.dp))
        PlatformRow(
            platformName = "99",
            amount = "R$  50,54",
            backgroundColor = ChartOrange,
            textColor = Color.Black
        )
    }
}

@Composable
private fun PlatformRow(
    platformName: String,
    amount: String,
    backgroundColor: Color,
    textColor: Color
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(width = 42.dp, height = 34.dp)
                .background(backgroundColor, shape = RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = platformName,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = textColor
                )
            )
        }

        Text(
            text = amount,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = TextWhite
            )
        )
    }
}