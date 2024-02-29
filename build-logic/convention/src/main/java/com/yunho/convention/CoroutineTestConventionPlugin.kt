package com.yunho.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class CoroutineTestConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            dependencies {
                add("testImplementation", libs.findLibrary("kotlinx-coroutines-test").get())
                add("androidTestImplementation", libs.findLibrary("kotlinx-coroutines-test").get())
            }
        }
    }
}