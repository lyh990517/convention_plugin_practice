package com.yunho.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class ComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            pluginManager.apply {
                plugins.apply("kotlin-android")
                plugins.apply("kotlin-kapt")
                plugins.apply("org.jetbrains.kotlin.android")
            }
            dependencies {
                add("implementation", "androidx.activity:activity-compose:1.8.2")
                add("implementation", platform("androidx.compose:compose-bom:2023.03.00"))
                add("implementation", "androidx.compose.ui:ui")
                add("implementation", "androidx.compose.ui:ui-graphics")
                add("implementation", "androidx.compose.ui:ui-tooling-preview")
                add("implementation", "androidx.compose.material3:material3:1.2.0-beta01")
                add("implementation", "androidx.hilt:hilt-navigation-compose:1.1.0")

                add("implementation", platform("org.jetbrains.kotlin:kotlin-bom:1.9.0"))
                add("implementation", "androidx.core:core-ktx:1.9.0")

                add("implementation", "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
                add("implementation", "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")

                add("testImplementation", "junit:junit:4.13.2")
                add("androidTestImplementation", "androidx.test.ext:junit:1.1.5")
                add("androidTestImplementation", "androidx.test.espresso:espresso-core:3.5.1")
                add("androidTestImplementation", "androidx.compose.ui:ui-test-junit4:1.5.4")
                add("debugImplementation", "androidx.compose.ui:ui-tooling:1.5.4")
                add("debugImplementation", "androidx.compose.ui:ui-test-manifest:1.5.4")
            }
        }
    }
}