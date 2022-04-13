package io.github.devrawr.lunar.model.settings

import kotlinx.serialization.Serializable

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@Serializable
data class LunarClientModSettings(
    val enabled: Boolean?,
    val properties: Map<String, Boolean>?
)