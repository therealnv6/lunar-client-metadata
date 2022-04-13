package io.github.devrawr.lunar.model.settings.mod

import kotlinx.serialization.Serializable

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@Serializable
data class LunarClientModSetting(
    val enabled: Boolean = true,
    val properties: Map<String, String> = mapOf()
)