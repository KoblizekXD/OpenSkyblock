plugins {
    id("java")
    // id("org.springframework.boot") version "3.2.3"
    // id("io.spring.dependency-management") version "1.1.4"
}

group = "lol.koblizek"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.3")
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.3")
    runtimeOnly("org.xerial:sqlite-jdbc:3.45.1.0")

    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor:3.2.3")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}