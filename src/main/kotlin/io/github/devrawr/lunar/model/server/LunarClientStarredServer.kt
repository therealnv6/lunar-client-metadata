package io.github.devrawr.lunar.model.server

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@kotlinx.serialization.Serializable
data class LunarClientStarredServer(
    val pattern: String,
    val resource: String?
)