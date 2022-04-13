package io.github.devrawr.lunar.model.server

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@kotlinx.serialization.Serializable
data class LunarClientPinnedServer(
    val name: String,
    val ip: String,
    val expirationDate: Long,
    val versions: List<String>,
    val removable: Boolean
)