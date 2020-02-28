plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("org.jetbrains.dokka").version("0.10.0")
    id("com.jfrog.bintray")
}

android {
    compileSdkVersion(Versions.compileSdk)
    buildToolsVersion(Versions.buildTools)

    defaultConfig {
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = TinkLinkVersion.code
        versionName = TinkLinkVersion.name

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

}

apply {
    from("../dokka-config.gradle")
}

dependencies {
    implementation(Dependencies.kotlin_stdlib)
}

// Workaround for https://youtrack.jetbrains.com/issue/KT-32804
// See thread: https://github.com/google/dagger/issues/1449
if (project.hasProperty("kapt")) {
    // Reference for 'kapt' DSL: https://kotlinlang.org/docs/reference/kapt.html#java-compiler-options
    kapt {
        // we expect this closure to run over a org.jetbrains.kotlin.gradle.plugin.KaptExtension
        javacOptions {
            option("-source", "8")
            option("-target", "8")
        }
    }
}

apply(from = "../publishing.gradle")

tasks {
    dokka {
        doLast {
            println("Copying docs from /docs/link to /docs")
            copy {
                from("../docs/link")
                into("../docs")
            }
            println("Deleting /docs/link")
            delete("../docs/link")
        }
    }
}