package com.sliderzxc.site.pages

import androidx.compose.runtime.Composable
import com.sliderzxc.site.components.layouts.PageLayout
import com.sliderzxc.site.resources.localization.LocalStrings
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.WhiteSpace
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.whiteSpace
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Page("/course")
@Composable
fun PostsPage() {
    PageLayout(LocalStrings.current.titleCourse) {
        Column(
            modifier = Modifier.fillMaxSize().margin(4.em),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpanText(
                LocalStrings.current.titleCourse,
                Modifier.fontSize(2.25.cssRem).fontWeight(FontWeight.Bolder)
            )

            Span(Modifier.whiteSpace(WhiteSpace.PreWrap).margin(top = 2.cssRem).toAttrs()) {
                Text(LocalStrings.current.subtitleNothingHere)
            }
        }
    }
}