package io.github.devrawr.lunar.model.integration

import io.github.devrawr.lunar.model.settings.mod.LunarClientModSetting
import kotlinx.serialization.SerialName

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@kotlinx.serialization.Serializable
data class LunarClientIntegratedServer(
    @SerialName("ip")
    val addresses: List<String>,
    val modSettings: Map<String, LunarClientModSetting>
)