package io.github.devrawr.lunar.model.sentry

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@kotlinx.serialization.Serializable
data class SentryFilteredException(
    val identifier: String,
    val regex: String
)