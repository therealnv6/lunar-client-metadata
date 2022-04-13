package io.github.devrawr.lunar.model

import java.net.URL

/**
 * The targeted endpoint's
 * server context.
 *
 * @author GrowlyX
 * @since 4/12/2022
 */
enum class LunarClientMetadataContext(val endpoint: URL)
{
    Prod("prod".lunarEndpoint),
    Dev("dev".lunarEndpoint);
}

private val String.lunarEndpoint: URL
    get()
    {
        return URL("https://api.lunarclient${this.lowercase()}.com/game/metadata")
    }