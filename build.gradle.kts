buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter() // Remove jcenter when we can, currently blocked by this https://youtrack.jetbrains.com/issue/KT-44730
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

    apply { from("../ktlint.gradle") }
}