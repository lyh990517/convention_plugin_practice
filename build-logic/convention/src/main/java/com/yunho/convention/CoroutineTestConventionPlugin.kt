package com.yunho.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class CoroutineTestConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            dependencies {
                add("testImplementation", "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
                add("androidTestImplementation", "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
            }
        }
    }
}