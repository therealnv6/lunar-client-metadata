package io.github.devrawr.lunar.model.sentry

import kotlinx.serialization.Serializable

/**
 * I really have no idea who will
 * ever need this, but added it anyway!
 *
 * @author GrowlyX
 * @since 4/12/2022
 */
@Serializable
data class SentryFilteredException(
    val identifier: String,
    val regex: String
)
