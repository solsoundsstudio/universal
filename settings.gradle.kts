/**
 * Open in IntelliJ for birds eye view but limited capabilities.
 */
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("g/gradle/libs.versions.toml"))
        }
    }
}

apply("g/plugins.gradle.kts")

rootProject.name = "UniversalRoot"

include(":g")
include(":g:common")

