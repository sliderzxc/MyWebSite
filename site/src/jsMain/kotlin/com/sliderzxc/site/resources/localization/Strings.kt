package com.sliderzxc.site.resources.localization

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import com.sliderzxc.site.resources.localization.articles.Article
import com.sliderzxc.site.resources.localization.projects.ProjectInformation

interface Strings {
    val blogLink: String
    val courseLink: String

    val titleLightTheme: String
    val titleDarkTheme: String

    val fullName: String
    val description: String

    val titleAllMyProjects: String
    val titleMyProjects: String
    val subtitleMyProjects: String

    val subtitleNothingHere: String

    val titleKotlinCourse: String
    val subtitleKotlinCourse: String

    val titleTimeMates: String
    val subtitleTimeMates: String

    val titleConstrukt: String
    val subtitleConstrukt: String

    val titleImplier: String
    val subtitleImplier: String

    val titleScriptKt: String
    val subtitleScriptKt: String

    val titleHome: String

    val titleCourse: String
    val subtitleCourse: String

    val titleExplore: String
    val titleOnlyPlanned: String

    val cinematicaProjectInfo: ProjectInformation

    val timeMatesProjectInfo: ProjectInformation
    val gameMatesProjectInfo: ProjectInformation

    val kotlinCourseProjectInfo: ProjectInformation
    val construktProjectInfo: ProjectInformation

    val scriptKtProjectInfo: ProjectInformation
    val implierProjectInfo: ProjectInformation

    val lookingForJobOpportunities: String
    val seekingJobDescription: String

    val myArticles: String
    val myArticlesDescription: String

    val gradleForBeginners: Article
    val coroutinesAreNotAboutConcurrency: Article
    val extensionOrientedDesign: Article

    val sketchcodeTitle: String
}

/**
 * Current localized strings of the site.
 * [EnglishStrings] by default.
 */
val LocalStrings: ProvidableCompositionLocal<Strings> = staticCompositionLocalOf { EnglishStrings }