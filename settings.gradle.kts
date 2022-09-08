enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "WeTalk"

include(":app")

// DI
include(":core:di:library")

// Navigation
include(":core:navigation:android-library")

// MVVM
include(":core:mvvm:android-library")
include(":core:mvvm:android-utils")
include(":core:mvvm:res")

include(":core:exceptions:library")
include(":common:network:library")

include(":core:utils:reaction:library")

include(":common:persistence:database:android-library")
include(":core:utils:mapper:library")
