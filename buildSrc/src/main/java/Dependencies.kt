object Versions {
    const val compileSdk = 30
    const val buildTools = "30.0.3"
    const val minSdk = 21
    const val targetSdk = 30

    const val kotlin = "1.5.0"
    const val dagger = "2.35.1"
    const val androidx_appcompat = "1.2.0"
    const val androidx_core_ktx = "1.3.2"
    const val navigation = "2.3.5"
    const val dokka = "1.4.20"
    const val moshi = "1.12.0"
}

object Dependencies {
    object Androidx {
        const val appcompat = "androidx.appcompat:appcompat:${Versions.androidx_appcompat}"
        const val core_ktx = "androidx.core:core-ktx:${Versions.androidx_core_ktx}"
        const val constraint_layout = "androidx.constraintlayout:constraintlayout:2.0.4"
        const val test_runner = "androidx.test:runner:1.2.0"
        const val test_espresso = "androidx.test.espresso:espresso-core:3.2.0"
        const val navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        const val browser = "androidx.browser:browser:1.3.0"
    }

    object Dagger {
        private const val base_url = "com.google.dagger"
        const val dagger_android = "$base_url:dagger-android:${Versions.dagger}"
        const val dagger_android_processor = "$base_url:dagger-android-processor:${Versions.dagger}"
        const val dagger_android_compiler = "$base_url:dagger-compiler:${Versions.dagger}"
    }

    object Testing {
        const val test_junit_api = "org.junit.jupiter:junit-jupiter-api:5.2.0"
        const val test_junit_engine = "org.junit.jupiter:junit-jupiter-engine:5.2.0"
        const val test_junit_params = "org.junit.jupiter:junit-jupiter-params:5.2.0"
        const val test_mockk = "io.mockk:mockk:1.11.0"
        const val test_assertj = "org.assertj:assertj-core:3.19.0"
    }

    object Moshi {
        const val moshi_codegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
    }

    const val material_components = "com.google.android.material:material:1.3.0"

    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val junit = "junit:junit:4.13.2"
    const val three_ten_abp = "com.jakewharton.threetenabp:threetenabp:1.3.1"
    const val timber = "com.jakewharton.timber:timber:4.7.1"
    const val picasso = "com.squareup.picasso:picasso:2.8"
    const val ktlint = "com.pinterest:ktlint:0.37.1"
    const val zxing = "com.google.zxing:core:3.4.1"

    object Tink {
        private const val coreVersion = "0.8.1"
        const val core = "com.tink:core:$coreVersion"
    }
}
