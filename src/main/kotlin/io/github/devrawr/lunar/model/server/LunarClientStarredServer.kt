package io.github.devrawr.lunar.model.server

import kotlinx.serialization.Serializable

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@Serializable
data class LunarClientStarredServer(
    val pattern: String,
    val resource: String?
)