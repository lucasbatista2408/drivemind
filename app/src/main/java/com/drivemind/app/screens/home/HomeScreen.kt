package com.drivemind.app.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.drivemind.app.screens.home.components.*

@Composable
fun HomeScreen() {
    // Estado para controlar qual aba da BottomBar está selecionada
    var currentRoute by remember { mutableStateOf(NavItem.Home.route) }

    Scaffold(
        containerColor = Color(0xFF121212), // Fundo escuro do app
        bottomBar = {
            BottomNavigationBar(
                currentRoute = currentRoute,
                onItemSelected = { selectedItem ->
                    currentRoute = selectedItem.route
                    // Aqui faremos a navegação entre as telas no futuro
                }
            )
        }
    ) { innerPadding ->
        // O innerPadding garante que o conteúdo não fique em cima da barra inferior
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding) // Aplica os espaçamentos automáticos do Scaffold
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState()), // Permite rolar a tela se o conteúdo for grande
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 1. Seu Cabeçalho / Banner de Ganho
            Header()

            // 2. Card de Desempenho / Ganhos
            EarningCard()

            // 3. Card de Configurações Rápidas
            QuickSettingsCard()

            // 4. Botão Principal "Começar / Parar"
            StartButton(
                modifier = Modifier.padding(bottom = 24.dp)
            )
        }
    }
}