plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("org.jlleitschuh.gradle.ktlint")
    id("com.github.ben-manes.versions") version "0.38.0"
}

android {
    compileSdk = Versions.compileSdk
    buildToolsVersion = Versions.buildTools

    defaultConfig {
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk

        buildConfigField("String", "libraryVersion", "\"${TinkLinkVersion.name}\"")

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
    }

    sourceSets {
        val sharedTestDir = "src/sharedTest/java"
        getByName("test") {
            java.srcDir(sharedTestDir)
        }
        getByName("androidTest") {
            java.srcDirs(sharedTestDir)
        }
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    resourcePrefix("tink_")
    namespace = "com.tink.link.ui"
}

dependencies {
    api(project(":link"))

    coreLibraryDesugaring(Dependencies.desugar)

    implementation(Dependencies.kotlin_stdlib)
    implementation(Dependencies.Androidx.appcompat)
    implementation(Dependencies.Androidx.core_ktx)
    implementation(Dependencies.Androidx.constraint_layout)

    implementation(Dependencies.Dagger.dagger_android)
    kapt(Dependencies.Dagger.dagger_android_processor)
    kapt(Dependencies.Dagger.dagger_android_compiler)

    implementation(Dependencies.Androidx.navigation_fragment)
    implementation(Dependencies.Androidx.navigation_ui)

    implementation(Dependencies.timber)

    implementation(Dependencies.material_components)
    implementation(Dependencies.picasso)

    implementation(Dependencies.Androidx.browser)

    implementation(Dependencies.zxing)

    testImplementation(Dependencies.junit)
    testImplementation(Dependencies.Testing.test_assertj)
    testImplementation(Dependencies.Testing.test_mockk)

    androidTestImplementation(Dependencies.Testing.test_assertj)
    androidTestImplementation(Dependencies.Testing.test_coroutines)
    androidTestImplementation(Dependencies.Testing.test_mockk_android)
    androidTestImplementation(Dependencies.Testing.test_mockwebserver)
    androidTestImplementation(Dependencies.Androidx.test_espresso)
    androidTestImplementation(Dependencies.Androidx.test_runner)

    debugImplementation(Dependencies.Androidx.test_espresso_idling_resource)
    debugImplementation(Dependencies.Androidx.test_fragment)
}

apply(from = "../publishing.gradle")
