package com.sliderzxc.site.components.widgets.dom

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.toAttrs
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLSpanElement

@Composable
fun StyledDiv(style: ComponentStyle, content: ContentBuilder<HTMLDivElement>) = Div(style.toAttrs(), content)

@Composable
fun StyledSpan(style: ComponentStyle, content: ContentBuilder<HTMLSpanElement>) = Span(style.toAttrs(), content)