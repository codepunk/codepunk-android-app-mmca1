@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlin)
}

android {
    namespace = "com.codepunk.mmca1.core"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
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
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    implementation(libs.coreKtx)
    //implementation("androidx.appcompat:appcompat:1.4.1")
    //implementation("com.google.android.material:material:1.6.1")
    implementation(libs.bundles.compose)
    implementation(libs.material3)

    testImplementation(libs.testJunit)

    androidTestImplementation(libs.bundles.commonTestAndroid)
}