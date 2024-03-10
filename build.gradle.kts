import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    `java-library`
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

val compileIn by configurations.creating {
}

configurations.implementation.configure {
    extendsFrom(compileIn)
}

tasks.withType<ShadowJar> {
    minimize()
    archiveClassifier = null
    configurations = listOf(compileIn)
}

allprojects {
    apply(plugin = "java-library")
    version = "1.0.0"
    group = "lol.koblizek"

    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
    }

    dependencies {
        compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
        compileOnly("org.projectlombok:lombok:1.18.30")
        annotationProcessor("org.projectlombok:lombok:1.18.30")

        testCompileOnly("org.projectlombok:lombok:1.18.30")
        testAnnotationProcessor("org.projectlombok:lombok:1.18.30")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    compileIn(project(":openskyblock-api"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "Main"
    }
}

tasks.getByName("build")
    .finalizedBy("shadowJar")

tasks.test {
    useJUnitPlatform()
}