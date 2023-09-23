package com.sliderzxc.site.resources.localization

import com.sliderzxc.site.resources.localization.articles.Article
import com.sliderzxc.site.resources.localization.projects.ProjectInformation

object EnglishStrings : Strings {
    override val blogLink: String = "https://course.sliderzxc.com/en/"
    override val courseLink: String = "https://course.sliderzxc.com/en/"
    override val titleLightTheme: String = "Light theme"
    override val titleDarkTheme: String = "Dark Theme"
    override val fullName: String = "Vadym Hrynyk"
    override val description: String =
        "\uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDCBB Kotlin, Android software engineer and a little bit teacher \uD83D\uDC68\uD83C\uDFFB\u200D\uD83C\uDFEB"
    override val titleAllMyProjects: String = "All projects"
    override val titleMyProjects: String = "Projects"
    override val subtitleMyProjects: String = "I'm currently working on the next projects"
    override val subtitleNothingHere: String = "Nothing here for now."
    override val titleKotlinCourse: String = "Kotlin course"
    override val subtitleKotlinCourse: String = "Kotlin course for very-very beginners in Ukrainian & English"
    override val titleTimeMates: String = "TimeMates"
    override val subtitleTimeMates: String = "The platform for time-management and time-boxing within team."
    override val titleConstrukt: String = "Construkt"
    override val subtitleConstrukt: String = "Pet generation library for Android View system based on Kotlin context" +
            " receivers."
    override val titleImplier: String = "Implier"
    override val subtitleImplier: String = "Code-generation library for generating Mutable, Immutable, Builders, " +
            "DTOs, etc. from interfaces & abstract classes"
    override val titleScriptKt: String = "Script.kt"
    override val subtitleScriptKt: String =
        "A convenient wrapper around Kotlin Scripting feature for better experience."
    override val titleHome: String = "Home"
    override val titleCourse: String = "Course"
    override val subtitleCourse: String = "A collection of my thoughts and experience notes."
    override val titleExplore: String = "Explore"
    override val titleOnlyPlanned: String = "Only planned"

    override val cinematicaProjectInfo: ProjectInformation = ProjectInformation(
        name = "Cinematica",
        description = "The application for watching the movies. " +
                "With Cinematica, you can watch the movies solo or with your friends in party. " +
                "The application is fully free and now it's in development. " +
                "Cinematica isn't just another application for watch movies " +
                "it's fully free, and we have almost 70000 the best movies in the world in russian, " +
                "ukrainian, english sound"
    )

    override val timeMatesProjectInfo: ProjectInformation = ProjectInformation(
        name = "TimeMates",
        description = "The application for time-management and collaboration. " +
                "With TimeMates, you can achieve a perfect work-life balance while staying productive and efficient." +
                " Time-boxing feature allows you to easily set up a timer that fits your schedule, whether" +
                " you're working on a project or taking a break. TimeMates isn't just another time-management tool;" +
                " it's a lifestyle change."
    )
    override val gameMatesProjectInfo: ProjectInformation = ProjectInformation(
        name = "GameMates",
        description = "An app to find teammates to play your favorite games with. " +
                "Using the rating system, have the best players and bypass the bad ones."
    )
    override val kotlinCourseProjectInfo: ProjectInformation = ProjectInformation(
        name = "Kotlin Course",
        description = "Kotlin course that's perfect for very-very beginners. " +
                "It's available in both Ukrainian and English versions, and it's divided into two tracks - " +
                "one for Gradle and one for Kotlin."
    )
    override val construktProjectInfo: ProjectInformation = ProjectInformation(
        name = "Construkt",
        description = "Android View DSL generation playground based on kotlin context-receivers and KSP."
    )
    override val scriptKtProjectInfo: ProjectInformation = ProjectInformation(
        name = "Script.kt",
        description = "Convenient Kotlin Script wrapper. The main goal of this library is to simplify " +
                "work with kotlin scripting."
    )
    override val implierProjectInfo: ProjectInformation = ProjectInformation(
        name = "Implier",
        description = "Kotlin Symbol Processor library for creating Mutable, Immutable, Builders, " +
                "DSL Builders from interfaces & abstract classes with properties."
    )
    override val lookingForJobOpportunities: String = "👨🏻‍💻 Looking for Job Opportunities"
    override val seekingJobDescription: String = "I'm a Kotlin software engineer with expertise in Android and Multiplatform development, actively seeking exciting job opportunities. You can refer to the my LinkedIn profile for details about me."
    override val myArticles: String = "My articles"
    override val myArticlesDescription: String = "Explore my articles on dev.to"

    override val gradleForBeginners: Article = Article(
        preview = "images/gradle-from-newbie-to-strong-fundamentals.webp",
        title = "Gradle: from newbie to strong fundamentals",
        description = "Dive into the world of Gradle as I explore plugins, dependencies, repositories, project structures, and even multi-module projects (with their quirks!). Whether you're new to Gradle or aiming to solidify your basics, this one's for you!",
        url = "https://dev.to/y9vad9/gradle-from-newbie-to-strong-fundamentals-mdf"
    )
    override val coroutinesAreNotAboutConcurrency: Article = Article(
        preview = "images/coroutines-are-not-about-concurrency.webp",
        title = "Kotlin Coroutines are not just about concurrency",
        description = "Discover the ins and outs of Kotlin Coroutines, from the ground up. In this piece, I break down the fundamentals and delve into their inner workings. Plus, I share some cool examples of how they can be used beyond the realm of concurrency.",
        url = "https://dev.to/y9vad9/coroutines-are-not-just-about-concurrency-4bfe"
    )
    override val extensionOrientedDesign: Article = Article(
        preview = "images/extension-oriented-design.webp",
        title = "Kotlin Coroutines are not just about concurrency",
        description = "Learn how extension functions offer solutions for accessing classes, bypassing restrictions on inline functions, and organizing code more efficiently. Discover the benefits of this approach and improve your code today.",
        url = "https://dev.to/y9vad9/extension-oriented-design-3d41"
    )

    override val sketchcodeTitle: String = "sketchcodeTitle"
}