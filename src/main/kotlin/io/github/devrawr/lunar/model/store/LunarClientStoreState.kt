package io.github.devrawr.lunar.model.store

import kotlinx.serialization.Serializable

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@Serializable
data class LunarClientStoreState(
    val success: Boolean
)