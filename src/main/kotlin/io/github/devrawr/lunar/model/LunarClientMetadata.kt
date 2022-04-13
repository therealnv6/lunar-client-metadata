package io.github.devrawr.lunar.model

import io.github.devrawr.lunar.model.blog.LunarClientBlogPost
import io.github.devrawr.lunar.model.settings.LunarClientModSettings

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
data class LunarClientMetadata(
    val blogPosts: List<LunarClientBlogPost>,
    val modSettings: Map<String, LunarClientModSettings>
)