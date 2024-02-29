package com.yunho.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class TestConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            configureRobolectric(extensions.getByType<ApplicationExtension>())
            dependencies {
                add("testImplementation", libs.findLibrary("mockk").get())
                add("androidTestImplementation", libs.findLibrary("mockk-android").get())
                add("testImplementation", libs.findLibrary("junit-jupiter").get())
                add("testImplementation", libs.findLibrary("robolectric").get())
            }
        }
    }

    private fun configureRobolectric(
        commonExtension: CommonExtension<*, *, *, *, *>,
    ) {
        commonExtension.apply {
            testOptions {
                unitTests {
                    // For Robolectric
                    isIncludeAndroidResources = true
                }
            }
        }
    }
}