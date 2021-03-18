plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("org.jetbrains.dokka").version(Versions.dokka)
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
    api(Dependencies.Tink.core)

    implementation(Dependencies.kotlin_stdlib)

    implementation(Dependencies.Dagger.core)
    implementation(Dependencies.Dagger.dagger_android)
    implementation(Dependencies.Dagger.dagger_android_support)
    kapt(Dependencies.Dagger.dagger_android_processor)
    kapt(Dependencies.Dagger.dagger_android_compiler)

    implementation(Dependencies.rxjava)

    testImplementation(Dependencies.Testing.test_assertj)
    testImplementation(Dependencies.Testing.test_junit_api)
    testRuntimeOnly(Dependencies.Testing.test_junit_engine)
    testImplementation(Dependencies.Testing.test_mockk)
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
        doFirst {
            println("Deleting old /docs")
            delete("../docs")
        }
        doLast {
            // Link
            println("Copying docs from /docs/link to /docs")
            copy {
                from("../docs/link")
                into("../docs")
            }
            println("Deleting /docs/link")
            delete("../docs/link")

            // Link-Payments
            println("Copying docs from /docs/link-payments to /docs")
            copy {
                from("../docs/link-payments")
                into("../docs")
            }
            println("Deleting /docs/link-payments")
            delete("../docs/link-payments")

            // Link-UI
            println("Copying docs from /docs/link-ui to /docs")
            copy {
                from("../docs/link-ui")
                into("../docs")
            }
            println("Deleting /docs/link-ui")
            delete("../docs/link-ui")
        }
    }
}