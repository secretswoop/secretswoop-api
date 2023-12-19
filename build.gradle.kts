import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "3.2.0"
  id("io.spring.dependency-management") version "1.1.4"
  kotlin("jvm") version "1.9.21"
  kotlin("kapt") version "1.9.21"
  kotlin("plugin.spring") version "1.9.21"
}

group = "com.secretswoop"
version = "0.0.1-SNAPSHOT"

java {
  sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
  mavenCentral()
}

dependencies {
  val mapstructVersion = "1.5.5.Final"

  implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
//  implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.4")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")
  implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.10")
  implementation("org.mapstruct:mapstruct:$mapstructVersion")
  kapt("org.mapstruct:mapstruct-processor:$mapstructVersion")
  developmentOnly("org.springframework.boot:spring-boot-devtools:3.0.4")
  testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.0")
}

kapt {
  arguments {
    // Set Mapstruct Configuration options here
    // https://kotlinlang.org/docs/reference/kapt.html#annotation-processor-arguments
    // https://mapstruct.org/documentation/stable/reference/html/#configuration-options
    arg("mapstruct.defaultComponentModel", "spring")
  }
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs += "-Xjsr305=strict"
    jvmTarget = "21"
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}
