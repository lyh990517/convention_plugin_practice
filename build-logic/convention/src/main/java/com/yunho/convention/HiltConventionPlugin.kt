package com.yunho.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class HiltConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            pluginManager.apply {
                apply("kotlin-kapt")
                apply("dagger.hilt.android.plugin")
            }
            dependencies {
                add("implementation", "com.google.dagger:hilt-android:2.50")
                add("kapt","com.google.dagger:hilt-android-compiler:2.50")
            }
        }
    }
}