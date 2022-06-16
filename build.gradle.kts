buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.gradle}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}")
    }
}

plugins {
    id("org.jlleitschuh.gradle.ktlint") version "10.3.0"
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(rootProject.buildDir)
    }
}

subprojects {
    tasks {
        withType(Javadoc::class).all { enabled = false }
    }
}
