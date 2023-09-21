package com.sliderzxc.site.components.widgets.blog

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobwebx.markdown.markdown
import org.jetbrains.compose.web.css.cssRem

@Composable
fun ArticleMetadata() {
    val mdCtx = rememberPageContext().markdown!!
    AuthorDate(
        mdCtx.frontMatter.getValue("author").single(),
        mdCtx.frontMatter.getValue("date").single(),
        mdCtx.frontMatter["updated"]?.singleOrNull(),
        Modifier.margin(top = 0.8.cssRem, bottom = 1.cssRem)
    )
}