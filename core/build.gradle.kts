plugins {
    id("java")
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dm)
}

group = "com.aimtupsu"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(libs.spring.cloud.depends))
    implementation(libs.spring.boot.web)
    implementation(libs.spring.cloud.stream.kafka)

    implementation(libs.graphql.kickstart.starter)

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}