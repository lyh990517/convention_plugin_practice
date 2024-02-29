package com.yunho.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class BaseAndroidPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            pluginManager.apply {
                plugins.apply("kotlin-android")
                plugins.apply("org.jetbrains.kotlin.android")
            }
            dependencies {
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