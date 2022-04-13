package io.github.devrawr.lunar.model

import java.net.URL

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

    val endpoint by lazy {
        URL("https://api.lunarclient${name.lowercase()}.com/game/metadata")
    }
}
