package com.sliderzxc.site.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.ComponentVariant
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val SectionStyle by ComponentStyle {
       Modifier.width(100.percent)
           .maxWidth(1024.px)
           .padding(top = 4.cssRem, bottom = 0.cssRem, left = 2.cssRem, right = 2.cssRem)
}

/**
 * Demarcate a new section of content, useful for pages that are a vertical list of sections.
 */
@Composable
fun Section(
    modifier: Modifier = Modifier,
    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    variant: ComponentVariant? = null,
    content: @Composable ColumnScope.() -> Unit = {}
) {
    Column(SectionStyle.toModifier(variant).then(modifier), horizontalAlignment = horizontalAlignment, content = content)
}