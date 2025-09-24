plugins {
    kotlin("jvm") version "2.2.10"
    id("com.gradleup.shadow") version "9.2.1"
    `java-library`
    `maven-publish`
}

group = "de.aptcode.core-api"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repos.aptcode.de/repository/core-api/")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3") // Async Tasks
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0") // JSON alternative
    implementation("com.google.code.gson:gson:2.10.1") // JSON Parsing
    implementation("com.google.inject:guice:7.0.0") // Dependency Injection
    implementation("org.jline:jline:3.25.0") //Console Handler
    implementation("io.netty:netty-all:4.1.107.Final") //Socket Handler
    implementation("org.mongodb:mongodb-driver-sync:4.11.0") //Database Handler
    testImplementation(kotlin("test"))
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
    repositories {
        maven {
            url = uri("https://repos.aptcode.de/repository/core-api/")
            credentials {
                username = project.findProperty("nexusUsername") as String? ?: ""
                password = project.findProperty("nexusPassword") as String? ?: ""
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}