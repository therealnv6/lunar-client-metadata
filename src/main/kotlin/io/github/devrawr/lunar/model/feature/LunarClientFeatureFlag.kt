package io.github.devrawr.lunar.model.feature

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@kotlinx.serialization.Serializable
data class LunarClientFeatureFlag(
    val identifier: String,
    val value: Boolean
)