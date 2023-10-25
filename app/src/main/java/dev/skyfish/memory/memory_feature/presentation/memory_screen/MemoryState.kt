package dev.skyfish.memory.memory_feature.presentation.memory_screen

import dev.skyfish.memory.memory_feature.domain.model.MemoryCard
import dev.skyfish.memory.memory_feature.domain.util.generateCardsArray
import dev.skyfish.memory.ui.theme.HolidayTheme
import dev.skyfish.memory.ui.theme.ThanksgivingTheme

data class MemoryState(
    val cards: Array<MemoryCard> = generateCardsArray(6),
    val card1: Int? = null,
    val card2: Int? = null,
    val pairCount: Int = 6,
    val pairsMatched: Int = 0,
    val clickCount: Int = 0,
    val currentTheme: HolidayTheme = ThanksgivingTheme()
)
