package io.github.devrawr.lunar

import io.github.devrawr.lunar.model.LunarClientMetadataContext
import java.net.URL

val LUNAR_METADATA_ENDPOINTS = mapOf(
    LunarClientMetadataContext.Prod.createEndpointPair(),
    LunarClientMetadataContext.Dev.createEndpointPair()
)

fun LunarClientMetadataContext.createEndpointPair(): Pair<LunarClientMetadataContext, URL>
{
    return this to this.lowercase.toLunarEndpoint()
}

fun String.toLunarEndpoint(): URL
{
    return URL("https://api.lunarclient${this}.com/game/metadata")
}