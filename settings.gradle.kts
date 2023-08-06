rootProject.name = "camel.demo"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        val bmuschkoVersion: String by settings
        kotlin("jvm") version kotlinVersion apply false
        id("com.bmuschko.docker-java-application") version bmuschkoVersion apply false
        id("com.bmuschko.docker-remote-api") version bmuschkoVersion apply false
    }
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}



