package com.sliderzxc.site.components.sections

import androidx.compose.runtime.Composable
import com.sliderzxc.site.components.style.boxShadow
import com.sliderzxc.site.components.widgets.ThemedButton
import com.sliderzxc.site.resources.localization.LocalStrings
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Height
import com.varabyte.kobweb.compose.css.JustifyItems
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gridAutoColumns
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.justifyItems
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ArticlesSection() {
    val router = rememberPageContext().router
    val articles = with(LocalStrings.current) {
        listOf(gradleForBeginners, coroutinesAreNotAboutConcurrency, extensionOrientedDesign)
    }

    SpanText(
        LocalStrings.current.myArticles,
        Modifier.textAlign(TextAlign.Center).fontSize(32.px).margin(top = 2.em).fontWeight(FontWeight.Bolder)
    )

    SpanText(
        LocalStrings.current.myArticlesDescription,
        Modifier.lineHeight(1.5).fontSize(1.25.cssRem).opacity(70.percent)
            .textAlign(TextAlign.Center)
    )

    SimpleGrid(
        numColumns = numColumns(1, md = 3),
        modifier = Modifier.margin(bottom = 6.em, top = 1.em)
            .gridAutoColumns("1fr")
            .justifyItems(JustifyItems.Center)
    ) {
        articles.forEach { article ->
            Column(
                modifier = Modifier
                    .borderRadius(16.px)
                    .boxShadow(ColorMode.current)
                    .maxWidth(300.px)
                    .margin(16.px)
            ) {
                Image(
                    src = article.preview,
                    modifier = Modifier
                        .fillMaxWidth()
                        .borderRadius(topLeft = 16.px, topRight = 16.px, 0.px, 0.px),
                )

                Column(modifier = Modifier.fillMaxSize().padding(16.px)) {
                    SpanText(article.title, modifier = Modifier.fontWeight(FontWeight.Bold))
                    SpanText(
                        article.description,
                        modifier = Modifier
                            .fontWeight(FontWeight.Lighter)
                            .height(Height.Inherit)
                            .margin(top = 8.px)
                    )
                    Spacer()
                    Box(
                        modifier = Modifier.padding(top = 16.px).fillMaxWidth(),
                        contentAlignment = Alignment.BottomEnd
                    ) {
                        ThemedButton(
                            onClick = { router.navigateTo(article.url) },
                            text = LocalStrings.current.titleExplore,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }
    }
}