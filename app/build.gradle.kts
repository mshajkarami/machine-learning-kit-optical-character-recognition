plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "ir.hajkarami.mlkitocr"
    compileSdk = 35

    defaultConfig {
        applicationId = "ir.hajkarami.mlkitocr"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    // add any other libraries needed for our app
    implementation ("com.google.android.gms:play-services-mlkit-text-recognition:16.2.0")
    implementation ("com.github.bumptech.glide:glide:4.12.0")
}