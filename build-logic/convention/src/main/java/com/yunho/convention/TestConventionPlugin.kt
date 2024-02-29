package com.yunho.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class TestConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            dependencies {
                add("testImplementation", libs.findLibrary("mockk").get())
                add("androidTestImplementation", libs.findLibrary("mockk-android").get())
                add("testImplementation", libs.findLibrary("junit-jupiter").get())
                add("testImplementation", libs.findLibrary("robolectric").get())
            }
        }
    }
}