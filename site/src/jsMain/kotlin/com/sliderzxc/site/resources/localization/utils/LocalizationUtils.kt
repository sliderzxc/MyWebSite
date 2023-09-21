package com.sliderzxc.site.resources.localization.utils

import kotlinx.browser.window

fun getLanguage(): String {
    return window.navigator.language.substringBefore("-").also { println(it) }
}