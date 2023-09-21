package com.sliderzxc.site.components.sections.home

import androidx.compose.runtime.Composable
import com.sliderzxc.site.components.style.boxShadow
import com.sliderzxc.site.components.widgets.GradientBox
import com.sliderzxc.site.components.widgets.KotlinCode
import com.sliderzxc.site.components.widgets.LinkButton
import com.sliderzxc.site.components.widgets.Section
import com.sliderzxc.site.resources.ABOUT_ME_CODE
import com.sliderzxc.site.resources.GITHUB_LINK
import com.sliderzxc.site.resources.LINKEDIN_LINK
import com.sliderzxc.site.resources.TELEGRAM_LINK
import com.sliderzxc.site.resources.localization.LocalStrings
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.columnGap
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.rowGap
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowRight
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.FaTelegram
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.background
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.B
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text

val AboutMeButton by ComponentStyle {
    base {
        Modifier.width(300.px)
    }

    Breakpoint.MD {
        Modifier.width(150.px)
    }
}

val AlertStyle by ComponentStyle {
    base {
        Modifier.fillMaxWidth().margin(1.em)
    }

    Breakpoint.MD {
        Modifier.width(70.percent).margin(0.em)
    }
}


@Composable
fun AboutMe() {
    GradientBox(contentAlignment = Alignment.Center) {
        Section {
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .width(70.percent)
                        .borderRadius(16.px)
                        .boxShadow(ColorMode.current)
                        .padding(1.em)
                        .margin(top = 2.em)
                        .displayIfAtLeast(Breakpoint.MD),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center) {
                        B {
                            Text(LocalStrings.current.lookingForJobOpportunities)
                        }
                        SpanText(
                            LocalStrings.current.seekingJobDescription,
                            modifier = Modifier.color(Color.gray).fontSize(16.px).textAlign(TextAlign.Start),
                        )
                    }

                    Box(modifier = Modifier.padding(left = 1.em)) {
                        LinkButton(
                            path = LINKEDIN_LINK,
                        ) {
                            FaArrowRight()
                        }
                    }
                }

                Row(
                    modifier = Modifier
                        .width(90.percent)
                        .borderRadius(16.px)
                        .boxShadow(ColorMode.current)
                        .padding(1.em)
                        .margin(top = 2.em)
                        .displayUntil(Breakpoint.MD),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center) {
                        B {
                            Text(LocalStrings.current.lookingForJobOpportunities)
                        }
                        SpanText(
                            LocalStrings.current.seekingJobDescription,
                            modifier = Modifier.color(Color.gray).fontSize(16.px).textAlign(TextAlign.Start),
                        )
                    }

                    Box(modifier = Modifier.padding(left = 1.em)) {
                        LinkButton(
                            path = LINKEDIN_LINK,
                        ) {
                            FaArrowRight()
                        }
                    }
                }

                Column(
                    modifier = Modifier.fillMaxWidth().padding(2.em),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {

                    Image(
                        "images/logo.png",
                        modifier = Modifier.size(16.em).margin(top = 2.em)
                    )

                    H1 {
                        SpanText(
                            LocalStrings.current.fullName,
                            Modifier.textAlign(TextAlign.Center)
                        )
                    }
                    SpanText(
                        text = LocalStrings.current.description,
                        Modifier.lineHeight(1.5).fontSize(1.25.cssRem)
                            .textAlign(TextAlign.Center)
                    )
                }

                Column(
                    Modifier.margin(top = 1.em, 1.em).displayIfAtLeast(Breakpoint.MD),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    KotlinCode(
                        // Set the color explicitly to opt-out of color mode for this section, which will always be on a grey
                        // background
                        modifier = Modifier
                            // Choose a background color that's dark-ish but not as dark as the hero example itself, so it
                            // stands out
                            .color(Colors.White)
                            .lineHeight(1.5.cssRem)
                            .padding(0.75.cssRem)
                            .styleModifier { background("radial-gradient(circle at top, rgba(41,41,46,1) 0%, rgba(25,25,28,1) 100%)") }
                            .borderRadius(12.px),
                        code = ABOUT_ME_CODE
                    )

                    SimpleGrid(
                        numColumns(1, md = 3),
                        Modifier.margin(top = 1.em).rowGap(1.cssRem).columnGap(16.px),
                    ) {
                        LinkButton(GITHUB_LINK, AboutMeButton.toModifier(), "GitHub") {
                            FaGithub(Modifier.margin(right = 8.px))
                        }
                        LinkButton(TELEGRAM_LINK, AboutMeButton.toModifier(), "Telegram") {
                            FaTelegram(Modifier.margin(right = 8.px))
                        }
                        LinkButton(LINKEDIN_LINK, AboutMeButton.toModifier(), "LinkedIn") {
                            FaLinkedin(Modifier.margin(right = 8.px))
                        }
                    }
                }
            }
        }
    }
}