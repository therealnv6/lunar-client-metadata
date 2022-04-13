package io.github.devrawr.lunar

import java.net.URL

val url = URL("https://api.lunarclientprod.com/game/metadata")

fun readLunarMetadata(): String
{
    return url.readText()
}