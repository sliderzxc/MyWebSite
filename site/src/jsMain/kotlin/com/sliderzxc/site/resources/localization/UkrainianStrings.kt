package com.sliderzxc.site.resources.localization

import com.sliderzxc.site.resources.localization.articles.Article
import com.sliderzxc.site.resources.localization.projects.ProjectInformation

object UkrainianStrings : Strings {
    override val blogLink: String = "https://course.sliderzxc.com/"
    override val courseLink: String = "https://course.sliderzxc.com/"
    override val titleLightTheme: String = "Світла тема"
    override val titleDarkTheme: String = "Темна тема"
    override val fullName: String = "Вадим Гриник"
    override val description: String =
        "\uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDCBB 0x10-річний Котлін розробник та викладач \uD83D\uDC68\uD83C\uDFFB\u200D\uD83C\uDFEB"
    override val titleAllMyProjects: String = "Всі проєкти"
    override val titleMyProjects: String = "Проєкти"
    override val subtitleMyProjects: String = "Мої великі та невеликі проєкти на Kotlin"
    override val subtitleNothingHere: String = "Тут поки нічого немає."
    override val titleKotlinCourse: String = "Kotlin курс"
    override val subtitleKotlinCourse: String = "Котлін курс для зовсім зелених українською та англійською"
    override val titleTimeMates: String = "TimeMates"
    override val subtitleTimeMates: String = "Платформа для тайм-менеджменту між командою."
    override val titleConstrukt: String = "Construkt"
    override val subtitleConstrukt: String = "Пет-ліба для генерації DSL з Android View системи"
    override val titleImplier: String = "Implier"
    override val subtitleImplier: String = "Бібліотека для кодогенерації задля" +
            " створення Mutable, Immutable, Builders реалізацій інтерфейсів & абстрактних класів"
    override val titleScriptKt: String = "Script.kt"
    override val subtitleScriptKt: String = "Обгортка над Kotlin Scripting для кращого вивчення та використання"
    override val titleHome: String = "Головна"
    override val titleCourse: String = "Курси"
    override val subtitleCourse: String = "Збірник моїх знань й не тільки"
    override val titleExplore: String = "Ознайомитись"
    override val titleOnlyPlanned: String = "Тільки заплановано"

    override val cinematicaProjectInfo: ProjectInformation = ProjectInformation(
        name = "Cinematica",
        description = "Додаток для перегляду фільмів. " +
                "З Cinematica ви можете дивитися фільми самостійно або разом з друзями на вечірці. " +
                "Додаток повністю безкоштовний і зараз знаходиться в розробці. " +
                "Cinematica - це не просто ще один додаток для перегляду фільмів. " +
                "Він абсолютно безкоштовний, і у нас є майже 70 000 найкращих фільмів у світі з російською, " +
                "українською та англійською озвучкою."
    )

    override val timeMatesProjectInfo: ProjectInformation = ProjectInformation(
        name = "TimeMates",
        description = "Застосунок для управління часом та колаборації. За допомогою TimeMates ви можете налаштовувати" +
                " таймери, які будуть визначати час, коли ви працюєте, а коли відпочиваєте. Діліться" +
                " сесіями з друзями, колегами й не тільки. Визначайте чітко, коли" +
                " ви працюєте, а коли відпочиваєте."
    )
    override val gameMatesProjectInfo: ProjectInformation = ProjectInformation(
        name = "GameMates",
        description = "Застосунок для пошуку товаришів по команді для гри у ваші улюблені ігри. " +
                "Використовуючи систему оцінки підбирай найкращих гравців та оминай тих, хто не підходять вам."
    )
    override val kotlinCourseProjectInfo: ProjectInformation = ProjectInformation(
        name = "Kotlin Курс",
        description = "Курс для новачків українською та англійською. На даний момент, доступно лише два треки: Kotlin" +
                " та система збірки Gradle. Наразі, лише два блоки доступні про Котлін та один про Gradle (не завершений). " +
                "Також, там є деякі статті про Котлін."
    )
    override val construktProjectInfo: ProjectInformation = ProjectInformation(
        name = "Construkt",
        description = "Кодогенерація stateless DSL функцій задля опису дизайну на базі Android View " +
                "системи. Просто невеличкий пет-проєкт задля ознайомлення як подібне могло працювати, нічого серйозного."
    )
    override val scriptKtProjectInfo: ProjectInformation = ProjectInformation(
        name = "Script.kt",
        description = "Надлаштування над Kotlin Scripting задля покращення ознайомлення та роботи."
    )
    override val implierProjectInfo: ProjectInformation = ProjectInformation(
        name = "Implier",
        description = "Кодогенерація Mutable, Immutable, Builder (Java-styled, DSL) з інтерфейсів та абстрактних" +
                " класів. Проєкт створений задля того, щоб оминати бойлерплейт під час написання коду, та фокусу" +
                " на розробці функціоналу."
    )
    override val lookingForJobOpportunities: String = "👨🏻‍💻Шукаю можливості для роботи"
    override val seekingJobDescription: String = "Я - інженер-програміст на Kotlin із досвідом у розробці Android і Multiplatform. Активно шукаю цікаві можливості для роботи. Ви можете переглянути мій профіль на LinkedIn для деталей."
    override val gradleForBeginners: Article = Article(
        preview = "images/gradle-from-newbie-to-strong-fundamentals.webp",
        title = "Gradle: від новачка до міцних основ",
        description = "Поглибіться у світ Gradle, де я розповідаю про плагіни, залежності, репозиторії, структури проектів та навіть проекти з декількома модулями (із їх нюансами!). Якщо ви новачок у Gradle або хочете закріпити свої основи, це для вас!",
        url = "https://dev.to/y9vad9/gradle-from-newbie-to-strong-fundamentals-mdf"
    )

    override val coroutinesAreNotAboutConcurrency: Article = Article(
        preview = "images/coroutines-are-not-about-concurrency.webp",
        title = "Kotlin Coroutines не лише про паралельність",
        description = "Дізнайтеся всі деталі про Kotlin Coroutines, починаючи з основ. У цій статті я розкриваю основи та глибоко вдаваюся у їхню роботу. Я показую кілька цікавих прикладів, як їх можна використовувати поза межами паралельності.",
        url = "https://dev.to/y9vad9/coroutines-are-not-just-about-concurrency-4bfe"
    )

    override val extensionOrientedDesign: Article = Article(
        preview = "images/extension-oriented-design.webp",
        title = "Дизайн орієнтований на розширення",
        description = "Дізнайтеся, як розширювальні функції пропонують рішення для доступу до класів, обхід обмежень на вбудовані функції та організації коду більш ефективно. Відкрийте переваги цього підходу та покращте свій код.",
        url = "https://dev.to/y9vad9/extension-oriented-design-3d41"
    )

    override val myArticles: String = "Мої статті"
    override val myArticlesDescription: String = "Перегляньте мої статті на dev.to"

    override val sketchcodeTitle: String = "sketchcodeTitle"
}