package com.sliderzxc.site.components.style

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px

fun Modifier.boxShadow(colorMode: ColorMode) = run {
    boxShadow(spreadRadius = 1.px, color = when (colorMode) {
        ColorMode.DARK -> Color.rgba(238, 238, 238, 0.2f)
        ColorMode.LIGHT -> Color.rgba(17, 17, 17, 0.2f)
    })
}