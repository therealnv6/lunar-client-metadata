package io.github.devrawr.lunar.model

/**
 * The targeted endpoint's
 * server context.
 *
 * @author GrowlyX
 * @since 4/12/2022
 */
enum class LunarClientMetadataContext
{
    Prod, Dev;

    val lowercase: String
        get() = this.name.lowercase()
}
