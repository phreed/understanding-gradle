plugins {
    id("my-java-application")
    id("de.undercouch.download")
}

val yqVersion = "4.13.2"

myApp {
    mainClass.set("myproject.MyApplication")
}

dependencies {
    implementation(project(":business-logic"))

}

tasks {

    register<de.undercouch.gradle.tasks.download.Download>("downloadYq") {
        group = "download"
        src("https://github.com/mikefarah/yq/releases/download/v${yqVersion}/yq_linux_amd64")
        dest(layout.buildDirectory.file("image/usr/bin/yq"))
        onlyIfModified(true)
    }
}
