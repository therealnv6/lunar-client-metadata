package io.github.devrawr.lunar.model.settings.mod

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@kotlinx.serialization.Serializable
data class LunarClientModSetting(
    val enabled: Boolean = true,
    val properties: Map<String, Boolean>?
)