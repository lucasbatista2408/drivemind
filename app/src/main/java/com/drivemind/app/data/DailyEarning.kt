package com.drivemind.app.data

data class DailyEarning(
    val dayInitial: String,        // Ex: "S", "T", "Q", "Q", "S"[cite: 7, 8]
    val progressFirstBar: Float,   // Altura proporcional da 1ª barra (0.0f a 1.0f)[cite: 8]
    val progressSecondBar: Float  // Altura proporcional da 2ª barra (0.0f a 1.0f)[cite: 8]
)