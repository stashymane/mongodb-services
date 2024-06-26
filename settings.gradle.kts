enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://repo.stashy.dev/releases")
    }
}


rootProject.name = "mongodb-services"
include(":model", ":services")
