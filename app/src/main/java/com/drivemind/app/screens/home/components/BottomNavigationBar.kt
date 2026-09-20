package com.drivemind.app.screens.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drivemind.app.ui.theme.DriveMindInnerCard
import com.drivemind.app.ui.theme.TextGray

val NavSelectedGreen = Color(0xFF34C759)

// --- ÍCONES CUSTOMIZADOS 100% COMPATÍVEIS COM COMPOSE ---

private val HomeVector: ImageVector
    get() = ImageVector.Builder(
        name = "Home",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.White)) {
            moveTo(10f, 20f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(3f)
            lineTo(12f, 3f)
            lineTo(2f, 12f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(8f)
            close()
        }
    }.build()

private val RidesVector: ImageVector
    get() = ImageVector.Builder(
        name = "Rides",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.White)) {
            moveTo(3f, 13f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-2f)
            lineTo(3f, 11f)
            verticalLineToRelative(2f)
            close()
            moveTo(3f, 17f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-2f)
            lineTo(3f, 15f)
            verticalLineToRelative(2f)
            close()
            moveTo(3f, 9f)
            horizontalLineToRelative(2f)
            lineTo(5f, 7f)
            lineTo(3f, 7f)
            verticalLineToRelative(2f)
            close()
            moveTo(7f, 13f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(-2f)
            lineTo(7f, 11f)
            verticalLineToRelative(2f)
            close()
            moveTo(7f, 17f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(-2f)
            lineTo(7f, 15f)
            verticalLineToRelative(2f)
            close()
            moveTo(7f, 7f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(14f)
            lineTo(21f, 7f)
            lineTo(7f, 7f)
            close()
        }
    }.build()

private val SettingsVector: ImageVector
    get() = ImageVector.Builder(
        name = "Settings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.White)) {
            moveTo(12f, 15.5f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            close()
            moveTo(19.43f, 12.97f)
            curveToRelative(0.04f, -0.32f, 0.07f, -0.64f, 0.07f, -0.97f)
            curveToRelative(0f, -0.33f, -0.03f, -0.66f, -0.07f, -0.97f)
            lineToRelative(2.11f, -1.65f)
            lineToRelative(-2f, -3.46f)
            lineToRelative(-2.49f, 1f)
            curveToRelative(-0.52f, -0.4f, -1.08f, -0.73f, -1.69f, -0.98f)
            lineTo(15f, 3.5f)
            horizontalLineToRelative(-6f)
            lineToRelative(-0.38f, 2.65f)
            curveToRelative(-0.61f, 0.25f, -1.17f, 0.59f, -1.69f, 0.98f)
            lineToRelative(-2.49f, -1f)
            lineToRelative(-2f, 3.46f)
            lineToRelative(2.11f, 1.65f)
            curveToRelative(-0.04f, 0.32f, -0.07f, 0.65f, -0.07f, 0.97f)
            curveToRelative(0f, 0.32f, 0.03f, 0.65f, 0.07f, 0.97f)
            lineToRelative(-2.11f, 1.65f)
            lineToRelative(2f, 3.46f)
            lineToRelative(2.49f, -1f)
            curveToRelative(0.52f, 0.4f, 1.08f, 0.73f, 1.69f, 0.98f)
            lineTo(9f, 20.5f)
            horizontalLineToRelative(6f)
            lineToRelative(0.38f, -2.65f)
            curveToRelative(0.61f, -0.25f, 1.17f, -0.59f, 1.69f, -0.98f)
            lineToRelative(2.49f, 1f)
            lineToRelative(2f, -3.46f)
            lineToRelative(-2.13f, -1.44f)
            close()
        }
    }.build()

private val ProfileVector: ImageVector
    get() = ImageVector.Builder(
        name = "Profile",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.White)) {
            moveTo(12f, 12f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            close()
            moveTo(12f, 14f)
            curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.66f, -5.33f, -4f, -8f, -4f)
            close()
        }
    }.build()

// --- COMPONENTE DA NAVEGAÇÃO INFERIOR ---

sealed class NavItem(val route: String, val title: String, val icon: ImageVector) {
    object Home : NavItem("home", "Início", HomeVector)
    object Rides : NavItem("rides", "Corridas", RidesVector)
    object Settings : NavItem("settings", "Ajustes", SettingsVector)
    object Profile : NavItem("profile", "Perfil", ProfileVector)
}

@Composable
fun BottomNavigationBar(
    currentRoute: String = NavItem.Home.route,
    onItemSelected: (NavItem) -> Unit = {},
    modifier: Modifier = Modifier
) {
    val items = listOf(
        NavItem.Home,
        NavItem.Rides,
        NavItem.Settings,
        NavItem.Profile
    )

    Surface(
        modifier = modifier.fillMaxWidth(),
        color = DriveMindInnerCard,
        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 20.dp, start = 8.dp, end = 8.dp), // Aumentamos o bottom padding para descolar da barra
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEach { item ->
                val isSelected = item.route == currentRoute
                val contentColor = if (isSelected) NavSelectedGreen else TextGray

                IconButton(
                    onClick = { onItemSelected(item) },
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = contentColor,
                            modifier = Modifier.size(22.dp)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = item.title,
                            fontSize = 10.sp,
                            color = contentColor
                        )
                    }
                }
            }
        }
    }
}