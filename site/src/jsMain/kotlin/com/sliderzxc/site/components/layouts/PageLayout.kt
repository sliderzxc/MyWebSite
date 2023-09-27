@file:Suppress("NAME_SHADOWING")

package com.sliderzxc.site.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.sliderzxc.site.components.sections.Footer
import com.sliderzxc.site.resources.localization.LocalStrings
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.gridRowEnd
import com.varabyte.kobweb.compose.ui.modifiers.gridRowStart
import com.varabyte.kobweb.compose.ui.modifiers.gridTemplateRows
import com.sliderzxc.site.components.sections.NavHeader
import kotlinx.browser.document
import kotlinx.browser.window

@Composable
fun PageLayout(title: String, content: @Composable () -> Unit) {
    val webPageTitle = "${LocalStrings.current.fullName} – $title"
    LaunchedEffect(webPageTitle) {
        document.title = webPageTitle
    }

    LaunchedEffect(window.location.href) {
        // See kobweb config in build.gradle.kts which sets up highlight.js
        js("hljs.highlightAll()")
    }

    // Create a box with two rows: the main content (fills as much space as it can) and the footer (which reserves
    // space at the bottom). "auto" means the use the height of the row. "1fr" means give the rest of the space to
    // that row. Since this box is set to *at least* 100%, the footer will always appear at least on the bottom but
    // can be pushed further down if the first row grows beyond the page.
    Box(
        Modifier.fillMaxSize().gridTemplateRows("1fr auto"),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier.fillMaxSize().align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavHeader()
            content()
        }
        // Associate the footer with the row that will get pushed off the bottom of the page if it can't fit.
        Footer(Modifier.gridRowStart(2).gridRowEnd(3))
    }
}