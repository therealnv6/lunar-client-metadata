package io.github.devrawr.lunar

import io.github.devrawr.lunar.model.LunarClientMetadataContext
import java.net.URL

val LUNAR_METADATA_ENDPOINTS = mapOf(
    LunarClientMetadataContext.Prod to "prod".toLunarEndpoint(),
    LunarClientMetadataContext.Dev to "dev".toLunarEndpoint()
)

fun String.toLunarEndpoint(): URL
{
    return URL("https://api.lunarclient${this}.com/game/metadata")
}