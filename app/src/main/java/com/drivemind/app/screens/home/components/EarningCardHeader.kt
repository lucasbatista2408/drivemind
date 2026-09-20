package com.drivemind.app.screens.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EarningCardHeader(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Ganhos hoje",
            fontSize = 16.sp
        )

        Text(
            text = "R$ 0,00",
            modifier = Modifier
                .padding(top = 4.dp),
            fontSize = 32.sp,
            color = MaterialTheme.colorScheme.primary
        )
        }
    }