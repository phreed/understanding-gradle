rootProject.name = "07_implementing_Tasks_and_Extensions"


pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("my-build-logic")
}

includeBuild("my-project")
