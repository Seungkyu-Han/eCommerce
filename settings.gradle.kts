plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "eCommerce"
include("product")
include("product:persistence")
findProject(":product:persistence")?.name = "persistence"
include("product:presentation")
findProject(":product:presentation")?.name = "presentation"
