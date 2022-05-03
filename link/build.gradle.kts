plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("com.github.ben-manes.versions") version "0.38.0"
    id("org.jetbrains.dokka")
}

android {
    buildToolsVersion = Versions.buildTools
    compileSdk = Versions.compileSdk

    defaultConfig {
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

}

dependencies {
    api(Dependencies.Tink.core)

    implementation(Dependencies.kotlin_stdlib)

    implementation(Dependencies.Dagger.dagger_android)
    kapt(Dependencies.Dagger.dagger_android_processor)
    kapt(Dependencies.Dagger.dagger_android_compiler)

    testImplementation(Dependencies.Testing.test_assertj)
    testImplementation(Dependencies.Testing.test_junit_api)
    testRuntimeOnly(Dependencies.Testing.test_junit_engine)
    testImplementation(Dependencies.Testing.test_mockk)

//    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.6.21")
}

// Force jsoup 1.14.2 for security updates
configurations.all {
    resolutionStrategy.dependencySubstitution {
        substitute(module("org.jsoup:jsoup:1.13.1"))
            .using(module("org.jsoup:jsoup:1.14.2"))
    }
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

tasks.withType<org.jetbrains.dokka.gradle.DokkaTask>().configureEach {
    outputDirectory.set(rootDir.resolve("docs"))

    dokkaSourceSets {
        configureEach {
            sourceRoots
                .from(rootDir.resolve("link/src"))
                .from(rootDir.resolve("link-ui/src"))
                .from(rootDir.resolve("../tink-sdk-core-android/core/src"))
                .from(rootDir.resolve("../tink-sdk-core-android/models/src"))
                .from(rootDir.resolve("../tink-sdk-core-android/service/src"))

            //samples
            //    .from(rootDir.resolve("link-ui/src/main/java/com/tink/link/ui/codeexamples"))
        }
    }

    doFirst {
        println("Deleting old /docs")
        delete("../docs")
    }
//    doLast {
//        println("Copying docs from /docs/link to /docs")
//        copy {
//            from("../docs/link")
//            into("../docs")
//        }
//        println("Deleting /docs/link")
//        delete("../docs/link")
//    }
}
