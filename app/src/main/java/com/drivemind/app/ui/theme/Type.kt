package com.drivemind.app.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.drivemind.app.R

// 1. Definição da FontFamily Sora conectada aos arquivos em res/font
val SoraFontFamily = FontFamily(
    Font(R.font.soraregular, FontWeight.Normal),
    Font(R.font.sorabold, FontWeight.Bold)
)

// 2. Estilos de Tipografia do Material Design ajustados com a Sora
val Typography = Typography(
    // Título Principal (Ex: "DriveMind" no Header)
    titleLarge = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        color = TextWhite
    ),
    // Títulos de Cards e Seções (Ex: "GANHOS HOJE", "CONFIGURAÇÕES RÁPIDAS")
    titleMedium = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = TextWhite
    ),
    // Corpo de texto padrão (Ex: Textos dos Cards, botões)
    bodyLarge = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = TextWhite
    ),
    // Subtítulos e textos secundários (Ex: "Seu parceiro de estrada", datas)
    bodyMedium = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = TextGray
    ),
    // Labels pequenos (Ex: "ULT. 5 DIAS", legendas de botões)
    labelSmall = TextStyle(
        fontFamily = SoraFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        color = TextGray
    )
)