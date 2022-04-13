package io.github.devrawr.lunar.model.blog

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@Serializable
data class LunarClientBlogPost(
    val title: String,
    val author: String,
    val image: String,
    val excerpt: String,
    @SerialName("link")
    val twitterPost: String
)