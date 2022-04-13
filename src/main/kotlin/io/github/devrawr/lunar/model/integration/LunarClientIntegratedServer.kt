package io.github.devrawr.lunar.model.integration

import io.github.devrawr.lunar.model.settings.mod.LunarClientModSettings
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@Serializable
data class LunarClientIntegratedServer(
    @SerialName("ip")
    val addresses: List<String>,
    val modSettings: LunarClientModSettings
)