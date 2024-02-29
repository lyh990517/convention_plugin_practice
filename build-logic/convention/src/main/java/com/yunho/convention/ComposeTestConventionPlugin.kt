package com.yunho.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class ComposeTestConventionPlugin  : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            dependencies {
                add("androidTestImplementation", "androidx.compose.ui:ui-test-junit4:1.6.0")
                add("debugImplementation", "androidx.compose.ui:ui-test-manifest:1.6.0")
                add("testImplementation", "androidx.compose.ui:ui-test-junit4:1.6.0")
            }
        }
    }
}