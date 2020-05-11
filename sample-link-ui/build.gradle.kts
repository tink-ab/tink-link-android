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
        applicationId = "com.tink.sample"
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(":link"))
    implementation(project(":link-ui"))

    implementation(Dependencies.kotlin_stdlib)
    implementation(Dependencies.Androidx.appcompat)
    implementation(Dependencies.Androidx.core_ktx)
    implementation(Dependencies.Androidx.constraint_layout)

    implementation(Dependencies.Dagger.core)
    implementation(Dependencies.Dagger.dagger_android)
    implementation(Dependencies.Dagger.dagger_android_support)
    kapt(Dependencies.Dagger.dagger_android_processor)
    kapt(Dependencies.Dagger.dagger_android_compiler)

    implementation(Dependencies.Androidx.lifecycle_extensions)

    implementation(Dependencies.timber)
    implementation(Dependencies.three_ten_abp)

    implementation(Dependencies.material_components)
}
