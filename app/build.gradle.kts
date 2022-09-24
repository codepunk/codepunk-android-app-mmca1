@Suppress(
    "DSL_SCOPE_VIOLATION"
)
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlin)
}

android {
    namespace = "com.codepunk.mmca1"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.codepunk.mmca1"
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = false
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
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
        freeCompilerArgs = listOf(
            "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi"
        )
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.1"
    }

    packagingOptions {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {
    implementation(libs.bundles.common)
    implementation(libs.composeActivity)
    implementation(libs.bundles.compose)
    implementation(libs.material3)

    testImplementation(libs.testJunit)

    androidTestImplementation(libs.bundles.commonTestAndroid)
    debugImplementation(libs.bundles.commonDebug)
}