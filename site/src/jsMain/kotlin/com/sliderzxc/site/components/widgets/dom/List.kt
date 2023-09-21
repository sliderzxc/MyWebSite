package com.sliderzxc.site.components.widgets.dom

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.listStyle
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.px

// Remove list indentation
// See also: https://stackoverflow.com/a/13939142/17966710
val NoListIndentationModifier = Modifier.listStyle("none").padding(left = 0.px)