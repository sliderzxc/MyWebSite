package com.y9vad9.site.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.sliderzxc.site.components.style.boxShadow
import com.sliderzxc.site.components.widgets.ButtonShape
import com.sliderzxc.site.components.widgets.ThemedButton
import com.sliderzxc.site.resources.localization.LocalStrings
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.css.functions.saturate
import com.varabyte.kobweb.compose.dom.ElementTarget
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backdropFilter
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.textDecorationLine
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.Anchor
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.overlay.Tooltip
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.components.style.link
import com.varabyte.kobweb.silk.components.style.toAttrs
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.style.visited
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.toSilkPalette
import kotlinx.browser.window
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.rgba
import org.jetbrains.compose.web.dom.Img

val NavHeaderStyle by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth()
            .backgroundColor(getNavBackgroundColor(colorMode))
            .position(Position.Sticky)
            .top(0.percent)
            .backdropFilter(saturate(180.percent), blur(5.px))
            .boxShadow(colorMode)
    }
}

val LogoTextStyle = ComponentStyle("bs-nav-title") {
    val linkColor = colorMode.toSilkPalette().color

    base { Modifier.margin(topBottom = 0.px, leftRight = 15.px).fontWeight(FontWeight.Bold) }

    link { Modifier.color(linkColor).textDecorationLine(TextDecorationLine.None) }
    visited { Modifier.color(linkColor) }
    hover { Modifier.textDecorationLine(TextDecorationLine.None) }
}

@Composable
private fun HomeLogo() {
    Anchor(
        href = "/",
        attrs = LogoTextStyle.toAttrs()
    ) {
        Row(Modifier.margin(4.px), verticalAlignment = Alignment.CenterVertically) {
            Img(
                "images/logo.png",
                attrs = Modifier.height(32.px).toAttrs()
            )
            SpanText(LocalStrings.current.fullName, LogoTextStyle.toModifier())
        }
    }
}

private fun getNavBackgroundColor(colorMode: ColorMode): CSSColorValue {
    return when (colorMode) {
        ColorMode.DARK -> rgba(0.0, 0.0, 0.0, 0.65)
        ColorMode.LIGHT -> rgba(255, 255, 255, 0.65)
    }
}

private val BUTTON_MARGIN = Modifier.margin(0.px, 16.px)

val NavLinkStyle = ComponentStyle("bs-nav-link") {
    val linkColor = colorMode.toSilkPalette().color

    base { Modifier.margin(topBottom = 0.px, leftRight = 15.px) }

    link { Modifier.color(linkColor) }
    visited { Modifier.color(linkColor) }
    hover { Modifier.textDecorationLine(TextDecorationLine.None) }
}

@Composable
fun NavHeader() {
    var colorMode by ColorMode.currentState

    val selectedColor = rgb(0, 210, 0)

    Box(NavHeaderStyle.toModifier().height(72.px), contentAlignment = Alignment.Center) {
        Row(
            Modifier.fillMaxWidth(90.percent).margin(1.em),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if(window.location.pathname != "/")
                HomeLogo()
            Spacer()
            Row(
                modifier = Modifier.margin(0.px, 12.px),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Link(
                    modifier = BUTTON_MARGIN
                        .then(NavLinkStyle.toModifier())
                        .then(if(window.location.pathname == "/") Modifier.color(selectedColor) else Modifier),
                    path = "/",
                    text = LocalStrings.current.titleHome,
                )

                Link(
                    modifier = NavLinkStyle
                        .toModifier()
                        .then(if(window.location.pathname.contains("/course")) Modifier.color(selectedColor) else Modifier),
                    path = LocalStrings.current.blogLink,
                    text = LocalStrings.current.titleCourse,
                )

                ThemedButton(
                    onClick = { colorMode = colorMode.opposite },
                    BUTTON_MARGIN,
                    shape = ButtonShape.CIRCLE
                ) {
                    when (colorMode) {
                        ColorMode.DARK -> FaSun()
                        ColorMode.LIGHT -> FaMoon()
                    }
                }

                Tooltip(
                    ElementTarget.PreviousSibling,
                    if(colorMode == ColorMode.DARK)
                        LocalStrings.current.titleLightTheme
                    else LocalStrings.current.titleDarkTheme
                )
            }
        }
    }
}