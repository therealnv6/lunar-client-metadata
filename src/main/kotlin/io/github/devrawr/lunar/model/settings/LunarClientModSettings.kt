package io.github.devrawr.lunar.model.settings

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@kotlinx.serialization.Serializable
data class LunarClientModSettings(
    val enabled: Boolean?,
    val properties: Map<String, Boolean>?
)