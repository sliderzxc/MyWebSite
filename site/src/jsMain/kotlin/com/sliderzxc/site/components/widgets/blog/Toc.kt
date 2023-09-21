package com.sliderzxc.site.components.widgets.blog

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import com.sliderzxc.site.components.widgets.dom.NoListIndentationModifier
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.toSilkPalette
import kotlinx.browser.document
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Ul
import org.w3c.dom.Element
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.HTMLCollection
import org.w3c.dom.HTMLHeadingElement
import org.w3c.dom.HTMLLIElement
import org.w3c.dom.get


val TocStyle = ComponentStyle.base("bs-toc") {
    NoListIndentationModifier
        .fillMaxWidth()
        .borderRadius(5.px)
        .border(1.px, LineStyle.Solid, colorMode.toSilkPalette().border)
        .padding(1.cssRem)
}

private fun HTMLCollection.walk(onEach: (Element) -> Boolean) {
    (0 until length)
        .mapNotNull { i: Int -> this[i] }
        .forEach { child ->
            if (onEach(child)) {
                child.children.walk(onEach)
            }
        }
}

// TODO: Remove this after moving this widget to Silk
/**
 * Generates a table of contents for the current page, by searching the page for header elements with IDs.
 *
 * @param minHeaderLevel The minimum header level to start paying attention to; any lower level headers will be skipped
 *   over. This defaults to 2 and not 1 because `H1` is usually the title of the page and not included in the TOC.
 * @param maxHeaderLevel The maximum header level to pay attention to; any higher level headers will be skipped over.
 */
@Composable
fun Toc(modifier: Modifier = Modifier, minHeaderLevel: Int = 2, maxHeaderLevel: Int = 3) {
    val acceptedHeaderNames = (minHeaderLevel ..maxHeaderLevel).map { level -> "H$level" }
    val colorMode by ColorMode.currentState

    Ul(TocStyle.toModifier().then(modifier).toAttrs()) {
        DisposableEffect(colorMode) {
            val element = scopeElement

            document.body!!.children.walk { child ->
                if (child is HTMLHeadingElement
                    && child.id.isNotBlank()
                    && child.nodeName in acceptedHeaderNames
                ) {
                    val headingText = child.textContent ?: return@walk false

                    val indent = acceptedHeaderNames.indexOf(child.nodeName)

                    val li = document.createElement("li") as HTMLLIElement
                    li.setAttribute("style", "padding-left:${indent}rem")

                    val link = document.createElement("a") as HTMLAnchorElement
                    link.setAttribute("href", "#${child.id}")
                    link.setAttribute("class", "silk-link silk-link_${colorMode.name.lowercase()}")
                    link.appendChild(document.createTextNode(headingText))
                    li.appendChild(link)
                    element.appendChild(li)
                }

                when {
                    child === element -> false
                    else -> true
                }
            }

            onDispose {
                element.children.walk { it.remove(); false }
                check(element.firstChild == null)
            }
        }
    }

}