package com.sliderzxc.site.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSPosition
import com.varabyte.kobweb.compose.css.functions.RadialGradient
import com.varabyte.kobweb.compose.css.functions.radialGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.BoxScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.ComponentVariant
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent

val GradientBoxStyle by ComponentStyle.base {
   Modifier
       .backgroundImage(
           radialGradient(RadialGradient.Shape.Circle, CSSPosition(60.percent)) {
               add(Color.rgba(0, 121, 242, 0.5f))
               add(Colors.Transparent, 45.percent)
           }
       )
}

/**
 * Create a [Box] with a fancy, color aware gradient behind it.
 */
@Composable
fun GradientBox(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    variant: ComponentVariant? = null,
    content: @Composable BoxScope.() -> Unit = {}
) {
    Box(GradientBoxStyle.toModifier(variant).then(modifier), contentAlignment, content = content)
}