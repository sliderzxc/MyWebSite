package com.sliderzxc.site.pages

import androidx.compose.runtime.Composable
import com.sliderzxc.site.components.layouts.PageLayout
import com.sliderzxc.site.components.style.boxShadow
import com.sliderzxc.site.components.widgets.ThemedButton
import com.sliderzxc.site.resources.localization.LocalStrings
import com.sliderzxc.site.resources.localization.projects.ProjectInformation
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Height
import com.varabyte.kobweb.compose.css.JustifyItems
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gridAutoColumns
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.justifyItems
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaFolder
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.px

@Page("/projects")
@Composable
fun ProjectsPage() {
    val router = rememberPageContext().router
    val projects = getProjects()

    PageLayout(LocalStrings.current.titleMyProjects) {
        FaFolder(modifier = Modifier.margin(top = 1.em), size = IconSize.X4)

        SpanText(
            LocalStrings.current.titleAllMyProjects,
            Modifier.textAlign(TextAlign.Center).fontSize(48.px).margin(top = 16.px).fontWeight(FontWeight.Bolder)
        )

        SpanText(
            LocalStrings.current.subtitleMyProjects,
            Modifier.lineHeight(1.5).fontSize(1.cssRem)
                .textAlign(TextAlign.Center)
        )

        SimpleGrid(
            numColumns = numColumns(1, md = 3),
            modifier = Modifier.margin(bottom = 6.em)
                .gridAutoColumns("1fr")
                .justifyItems(JustifyItems.Center)
        ) {
            projects.forEach { project ->
                Column(
                    modifier = Modifier
                        .margin(1.em)
                        .borderRadius(16.px)
                        .boxShadow(ColorMode.current)
                        .maxWidth(300.px)
                        .padding(16.px)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        project.imagePath?.let {
                            Image(
                                src = it,
                                modifier = Modifier
                                    .size(24.px)
                                    .margin(right = 8.px)
                                    .then(if (project.imageIsRounded) Modifier.borderRadius(6.px) else Modifier)
                            )
                        }

                        SpanText(project.information.name, modifier = Modifier.fontWeight(FontWeight.Bold))
                    }
                    SpanText(
                        project.information.description,
                        modifier = Modifier
                            .fontWeight(FontWeight.Lighter)
                            .height(Height.Inherit)
                            .margin(top = 8.px)
                    )
                    Spacer()
                    Box(modifier = Modifier.padding(top = 16.px).fillMaxWidth(), contentAlignment = Alignment.BottomEnd) {
                        if (project.pointsTo != null) {
                            ThemedButton(
                                onClick = { router.navigateTo(project.pointsTo) },
                                text = LocalStrings.current.titleExplore,
                                modifier = Modifier.fillMaxWidth()
                            )
                        } else {
                            SpanText(
                                text = LocalStrings.current.titleOnlyPlanned,
                                modifier = Modifier.fillMaxWidth().textAlign(TextAlign.Center).padding(16.px)
                            )
                        }
                    }
                }
            }
        }
    }
}

data class Project(
    val information: ProjectInformation,
    val imagePath: String?,
    val pointsTo: String?,
    val imageIsRounded: Boolean = true,
)

@Composable
private fun getProjects(): List<Project> {
    return listOf(
        Project(
            LocalStrings.current.timeMatesProjectInfo,
            "images/timemates.gif",
            "https://timemates.io"
        ),
        Project(
            LocalStrings.current.kotlinCourseProjectInfo,
            "images/course.png",
            "https://course.y9vad9.com",
            imageIsRounded = false
        ),
        Project(
            LocalStrings.current.construktProjectInfo,
            null,
            "https://github.com/y9vad9/construkt"
        ),
        Project(
            LocalStrings.current.implierProjectInfo,
            null,
            "https://github.com/y9vad9/implier"
        ),
        Project(
            LocalStrings.current.scriptKtProjectInfo,
            null,
            "https://github.com/y9vad9/script.kt"
        ),
        Project(
            LocalStrings.current.gameMatesProjectInfo,
            "images/gamemates.gif",
            null
        )
    )
}