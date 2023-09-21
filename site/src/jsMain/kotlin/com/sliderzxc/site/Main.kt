package com.sliderzxc.site

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import com.sliderzxc.site.resources.UKRAINIAN
import com.sliderzxc.site.resources.localization.EnglishStrings
import com.sliderzxc.site.resources.localization.LocalStrings
import com.sliderzxc.site.resources.localization.UkrainianStrings
import com.sliderzxc.site.resources.localization.utils.getLanguage
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.AnimatedColorSurfaceVariant
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerBaseStyle
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.localStorage
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.vh

private const val COLOR_MODE_KEY = "app:colorMode"
private const val LANGUAGE_KEY = "app:language"

@InitSilk
fun initSilk(ctx: InitSilkContext) {
    ctx.config.initialColorMode = localStorage.getItem(COLOR_MODE_KEY)?.let { ColorMode.valueOf(it) } ?: ColorMode.DARK

    ctx.stylesheet.apply {
        registerBaseStyle("body") {
            Modifier.fontFamily(
                "-apple-system", "BlinkMacSystemFont", "Segoe UI", "Roboto", "Oxygen", "Ubuntu",
                "Cantarell", "Fira Sans", "Droid Sans", "Helvetica Neue", "sans-serif"
            )
        }

        val headerCommon = Modifier.fontWeight(FontWeight.Bold).textAlign(TextAlign.Center).margin(bottom = 1.cssRem)
        registerBaseStyle("h1") {
            headerCommon.fontSize(3.5.cssRem)
        }

        registerBaseStyle("h2") {
            headerCommon.fontSize(2.5.cssRem)
        }

        registerBaseStyle("h3") {
            headerCommon.fontSize(1.5.cssRem)
        }
    }
}

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        val colorMode = ColorMode.current
        val language = getLanguage()
        LaunchedEffect(colorMode) {
            localStorage.setItem(COLOR_MODE_KEY, colorMode.name)
            localStorage.setItem(LANGUAGE_KEY, language)
        }

        CompositionLocalProvider(LocalStrings provides if(language == UKRAINIAN) UkrainianStrings else EnglishStrings) {
            Surface(Modifier.fillMaxWidth().minHeight(100.vh), variant = AnimatedColorSurfaceVariant) {
                content()
            }
        }
    }
}