package com.yunho.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class BaseAndroidPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            pluginManager.apply {
                plugins.apply("kotlin-android")
                plugins.apply("kotlin-kapt")
                plugins.apply("org.jetbrains.kotlin.android")
            }
            dependencies {
                add("implementation", libs.findLibrary("kotlin-bom").get())
                add("implementation", libs.findLibrary("core-ktx").get())
                add("implementation", libs.findLibrary("lifecycle-runtime-ktx").get())
                add("implementation", libs.findLibrary("lifecycle-viewmodel-ktx").get())

                add("testImplementation", libs.findLibrary("junit").get())

                add("androidTestImplementation", libs.findLibrary("androidx-junit").get())
                add("androidTestImplementation", libs.findLibrary("espresso-core").get())
            }
        }
    }
}