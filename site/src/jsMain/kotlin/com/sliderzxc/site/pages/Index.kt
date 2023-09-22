package com.sliderzxc.site.pages

import androidx.compose.runtime.Composable
import com.sliderzxc.site.components.layouts.PageLayout
import com.sliderzxc.site.components.sections.ProjectsSection
import com.sliderzxc.site.components.sections.home.AboutMe
import com.sliderzxc.site.resources.localization.LocalStrings
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowDown
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.percent

@Page
@Composable
fun HomePage() {
    PageLayout(LocalStrings.current.titleHome) {
        Column(
            Modifier.width(100.percent),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            AboutMe()
            FaArrowDown(
                modifier = Modifier.margin(top = 2.em).displayUntil(Breakpoint.MD),
                size = IconSize.XL,
            )
            FaArrowDown(
                modifier = Modifier.margin(top = 3.em).displayIfAtLeast(Breakpoint.MD),
                size = IconSize.XL,
            )
            ProjectsSection()
        }
    }
}