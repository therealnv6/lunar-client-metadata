package io.github.devrawr.lunar.model.server

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@Serializable
data class LunarClientPinnedServer(
    val name: String,
    @SerialName("ip")
    val address: String,
    val expirationDate: Long,
    val versions: List<String>,
    val removable: Boolean
)