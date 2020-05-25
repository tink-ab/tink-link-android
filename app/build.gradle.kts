plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(Versions.compileSdk)
    buildToolsVersion(Versions.buildTools)
    defaultConfig {
        applicationId = "com.tink.link"
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

dependencies {
    implementation(project(":link"))

    implementation(Dependencies.kotlin_stdlib)
    implementation(Dependencies.Androidx.appcompat)
    implementation(Dependencies.Androidx.core_ktx)
    implementation(Dependencies.Androidx.constraint_layout)
    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.Androidx.test_runner)
    androidTestImplementation(Dependencies.Androidx.test_espresso)

    implementation(Dependencies.Dagger.core)
    implementation(Dependencies.Dagger.dagger_android)
    implementation(Dependencies.Dagger.dagger_android_support)
    kapt(Dependencies.Dagger.dagger_android_processor)
    kapt(Dependencies.Dagger.dagger_android_compiler)

    implementation(Dependencies.Androidx.navigation_fragment)
    implementation(Dependencies.Androidx.navigation_ui)

    implementation(Dependencies.Androidx.lifecycle_extensions)

    implementation(Dependencies.timber)
    implementation(Dependencies.three_ten_abp)

    implementation(Dependencies.material_components)
    implementation(Dependencies.picasso)
}
