plugins {
    id("java")
}

// Варіант 6 (CI/CD + Gradle). Створіть Gradle-проєкт з одним класом і тестом. Напишіть workflow
// .github/workflows/ci.yml, який на push і pull_request встановлює JDK 21,
// виконує gradlew build та test.

group = "ua.edu.ukma"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
