package io.github.devrawr.lunar.model.settings.mod

import kotlinx.serialization.Contextual
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.jsonPrimitive

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@Serializable
data class LunarClientModSetting(
    val enabled: Boolean = true,
    val properties: Map<String, @Contextual @Serializable(with = LunarClientModAnySerializer::class) Any> = mapOf()
)

/**
 * This serializer is needed because by default, kotlinx serialization does not offer a
 * deserializer for the [Any] type.
 *
 * Usually, this should be fine. But considering the [LunarClientModSetting.properties] field
 * within the metadata api can be several types, we need it to support Any.
 *
 * For more information on this, look into the production metadata endpoint:
 * https://api.lunarclientprod.com/game/metadata
 */
class LunarClientModAnySerializer : KSerializer<Any>
{
    override val descriptor = PrimitiveSerialDescriptor(
        "Any", PrimitiveKind.STRING
    )

    override fun deserialize(decoder: Decoder): Any
    {
        if (decoder !is JsonDecoder)
        {
            throw RuntimeException("The Lunar Metadata server is JSON, but the decoder was of a different type.")
        }

        return decoder.decodeJsonElement()
            .jsonPrimitive
            .content
    }

    override fun serialize(encoder: Encoder, value: Any)
    {
        throw RuntimeException("We do not serialize. Do not call this.")
    }
}
