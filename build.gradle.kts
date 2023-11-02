plugins {
    kotlin("jvm") version "1.9.20"
    id("com.google.devtools.ksp") version "1.9.20-1.0.13"
    id("io.gitlab.arturbosch.detekt") version "1.23.3"
}


repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup.moshi:moshi:1.15.0")
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.15.0")
}
