package io.github.devrawr.lunar

import java.net.URL

// TODO: 4/12/2022 allow lunarclientdev.com as well
val url = URL("https://api.lunarclientprod.com/game/metadata")

fun readLunarMetadata(): String
{
    return url.readText()
}