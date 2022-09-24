// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.androidApplication) apply false

    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.androidLibrary) apply false

    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.kotlin) apply false
}
