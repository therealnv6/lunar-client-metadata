package io.github.devrawr.lunar.model.sentry

import kotlinx.serialization.Serializable

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@Serializable
data class SentryFilteredException(
    val identifier: String,
    val regex: String
)