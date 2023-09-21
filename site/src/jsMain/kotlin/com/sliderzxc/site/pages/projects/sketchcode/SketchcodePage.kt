package com.sliderzxc.site.pages.projects.sketchcode

import androidx.compose.runtime.Composable
import com.sliderzxc.site.components.layouts.PageLayout
import com.sliderzxc.site.resources.localization.LocalStrings
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.percent

@Composable
@Page("/projects/sketchcode")
fun SketchcodePage() {
    PageLayout(LocalStrings.current.sketchcodeTitle) {
        Column(
            Modifier.width(100.percent),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row {  }
        }
    }
}