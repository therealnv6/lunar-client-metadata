package io.github.devrawr.lunar

import io.github.devrawr.lunar.model.LunarClientMetadata
import io.github.devrawr.lunar.model.LunarClientMetadataContext
import io.github.devrawr.lunar.model.blog.LunarClientBlogPost

/**
 * Example use cases of
 * lunar client's game metadata.
 *
 * @author GrowlyX
 * @since 4/12/2022
 */
object LunarClientMetadataHelper
{
    /**
     * Retrieve the latest blog post
     * from the metadata with context [context].
     *
     * @param context our metadata context
     * @return the latest blog post
     */
    @JvmStatic
    fun getLatestBlogPost(
        context: LunarClientMetadataContext =
            LunarClientMetadataContext.Prod
    ): LunarClientBlogPost
    {
        return LunarClientMetadata
            .parseMetadata(context)
            .blogPosts.first()
    }
}
