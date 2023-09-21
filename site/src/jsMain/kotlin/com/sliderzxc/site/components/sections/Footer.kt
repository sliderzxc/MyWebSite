package com.sliderzxc.site.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.sliderzxc.site.components.style.boxShadow
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Composable
fun Footer(modifier: Modifier = Modifier) {
    val colorMode by ColorMode.currentState
    Box(
        Modifier.fillMaxWidth().minHeight(100.px).boxShadow(colorMode).then(modifier),
        contentAlignment = Alignment.Center
    ) {
        Column(
            Modifier.fillMaxWidth(70.percent).margin(1.em),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpanText(
                "Copyright © 2023 Vadym Hrynyk. All rights reserved.",
                Modifier.fontSize(0.75.em).opacity(70.percent).textAlign(TextAlign.Center)
            )
        }
    }
}