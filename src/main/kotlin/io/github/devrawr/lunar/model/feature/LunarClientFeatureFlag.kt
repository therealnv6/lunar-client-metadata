package io.github.devrawr.lunar.model.feature

import kotlinx.serialization.Serializable

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@Serializable
data class LunarClientFeatureFlag(
    val identifier: String,
    val value: Boolean
)