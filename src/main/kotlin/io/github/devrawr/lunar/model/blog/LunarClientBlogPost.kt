package io.github.devrawr.lunar.model.blog

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@kotlinx.serialization.Serializable
data class LunarClientBlogPost(
    val title: String,
    val author: String,
    val image: String,
    val excerpt: String,
    // TODO: 4/12/2022 @SerializedName("link")
    val twitterPost: String
)