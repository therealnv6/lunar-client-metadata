package io.github.devrawr.lunar

import io.github.devrawr.lunar.model.LunarClientMetadataContext
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.net.URL

object LunarClientMetadataRetriever
{
    @JvmStatic
    fun readMetadataAsText(
        context: LunarClientMetadataContext
    ): String
    {
        val url = URL(
            String.format(
                LUNAR_METADATA_ENDPOINT,
                context.lowercase
            )
        )

        return url.readText()
    }

    /**
     * Read the metadata from the [LUNAR_METADATA_ENDPOINT] endpoint.
     *
     * This method will automatically try to parse the
     * retrieved data from the server using the provided
     * generic type of [T].
     *
     * @param T the generic type to serialize to
     * @param context the metadata context
     * @return the parsed data
     */
    inline fun <reified T> readMetadata(
        context: LunarClientMetadataContext
    ): T
    {
        return Json.decodeFromString(
            readMetadataAsText(context)
        )
    }
}
