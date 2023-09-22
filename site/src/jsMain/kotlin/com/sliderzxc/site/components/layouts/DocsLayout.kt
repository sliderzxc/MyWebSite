package com.sliderzxc.site.components.layouts

import androidx.compose.runtime.Composable

@Composable
fun DocsLayout(title: String? = null, content: @Composable () -> Unit) {
    PageLayout(title?.let { "Docs: $it" } ?: "Docs", content)
}