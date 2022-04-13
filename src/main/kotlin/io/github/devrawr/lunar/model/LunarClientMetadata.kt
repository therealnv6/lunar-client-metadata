package io.github.devrawr.lunar.model

import io.github.devrawr.lunar.model.blog.LunarClientBlogPost
import io.github.devrawr.lunar.model.feature.LunarClientFeatureFlag
import io.github.devrawr.lunar.model.integration.LunarClientIntegratedServer
import io.github.devrawr.lunar.model.sentry.SentryFilteredException
import io.github.devrawr.lunar.model.server.LunarClientPinnedServer
import io.github.devrawr.lunar.model.server.LunarClientStarredServer
import io.github.devrawr.lunar.model.settings.LunarClientClientSettings
import io.github.devrawr.lunar.model.settings.mod.LunarClientModSetting
import io.github.devrawr.lunar.model.store.LunarClientStoreState
import kotlinx.serialization.SerialName

/**
 * @author GrowlyX
 * @since 4/12/2022
 */
@kotlinx.serialization.Serializable
data class LunarClientMetadata(
    val blogPosts: List<LunarClientBlogPost>,
    // settings
    val modSettings: Map<String, LunarClientModSetting>,
    val clientSettings: Map<String, LunarClientClientSettings>,
    // servers
    val pinnedServers: List<LunarClientPinnedServer>,
    val starServers: List<LunarClientStarredServer>,
    @SerialName("serverIntegration")
    val integratedServers: List<LunarClientIntegratedServer>,
    val knownServersHash: String,
    // features
    @SerialName("featureFlag")
    val featureFlags: List<LunarClientFeatureFlag>,
    // misc
    @SerialName("store")
    val storeState: LunarClientStoreState,
    val sentryFilteredExceptions: List<SentryFilteredException>
)