plugins {
    kotlin("jvm") version "1.9.0"
    application
}

description = "Torrent client written in Kotlin"
group = "ru.kapybarin"
version = "1.0-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}


application {
    mainClass.set("ru.kapybarin.kultorrent.MainKt")
}