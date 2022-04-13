package io.github.devrawr.lunar.model.integration

import io.github.devrawr.lunar.model.settings.LunarClientModSettings

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@kotlinx.serialization.Serializable
data class LunarClientIntegratedServer(
    val ip: List<String>,
    val modSettings: LunarClientModSettings
)