package io.github.devrawr.lunar.model.blog

import kotlinx.serialization.SerialName

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
    @SerialName("link")
    val twitterPost: String
)