pluginManagement {
    repositories.gradlePluginPortal()
    plugins {
        id("de.undercouch.download") version "4.1.2"
    }
    includeBuild("../my-build-logic")
}

dependencyResolutionManagement {
    repositories.mavenCentral()
    includeBuild("../my-other-project")
}

rootProject.name = "my-project"

include("app")
include("business-logic")
include("data-model")
