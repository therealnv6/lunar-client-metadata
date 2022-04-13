package io.github.devrawr.lunar

import io.github.devrawr.lunar.model.LunarClientMetadata
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.net.URL

val LUNAR_METADATA_ENDPOINT = URL("https://api.lunarclientprod.com/game/metadata")

object LunarMetadataRetriever
{
    @JvmStatic
    fun readMetadataAsText(): String
    {
        return LUNAR_METADATA_ENDPOINT.readText()
    }

    /**
     * Read the metadata from the [LUNAR_METADATA_ENDPOINT] endpoint.
     *
     * This method will automatically try to parse the
     * retrieved data from the server using the provided
     * generic type of [T].
     *
     * @param T the generic type to serialize to
     * @return the parsed data
     */
    inline fun <reified T> readMetadata(): T
    {
        return Json.decodeFromString(
            readMetadataAsText()
        )
    }
}

