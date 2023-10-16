plugins {
    id("java")
}

group = "org.helloWorld"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.rabbitmq:amqp-client:5.16.0")
}

tasks.test {
    useJUnitPlatform()
}