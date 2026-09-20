package com.drivemind.app.screens.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drivemind.app.ui.theme.TextGray
import com.drivemind.app.ui.theme.TextWhite
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
fun Header(modifier: Modifier = Modifier) {
    // Formata a data atual no padrão: "20 setembro 2026"
    val currentDateFormatted = remember {
        val formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", Locale("pt", "BR"))
        LocalDate.now().format(formatter)
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "DriveMind",
            style = MaterialTheme.typography.titleLarge,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = TextWhite
        )

        Text(
            text = "Seu parceiro de estrada",
            fontSize = 14.sp,
            color = TextGray
        )

        Text(
            text = currentDateFormatted,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            color = TextWhite,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}