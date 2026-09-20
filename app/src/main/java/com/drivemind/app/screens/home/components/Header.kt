package com.drivemind.app.screens.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drivemind.app.ui.theme.TextGray
import com.drivemind.app.ui.theme.TextWhite

@Composable
fun Header(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "DriveMind",
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
            text = "31 de agosto de 2026", // Data dinâmica a ser implementada depois
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = TextWhite,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}