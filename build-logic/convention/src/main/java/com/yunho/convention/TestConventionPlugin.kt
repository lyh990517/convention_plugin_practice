package com.yunho.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class TestConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            dependencies {
                add("testImplementation", "io.mockk:mockk:1.12.0")
                add("androidTestImplementation", "io.mockk:mockk-android:1.12.0")
                add("testImplementation", "org.junit.jupiter:junit-jupiter:5.10.0")

                add("testImplementation", "org.robolectric:robolectric:4.9")
            }
        }
    }
}