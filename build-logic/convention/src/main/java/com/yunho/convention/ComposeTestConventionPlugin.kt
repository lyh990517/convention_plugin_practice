package com.yunho.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class ComposeTestConventionPlugin  : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            dependencies {
                add("androidTestImplementation", libs.findLibrary("compose-ui-test-junit4").get())
                add("testImplementation", libs.findLibrary("compose-ui-test-junit4").get())
                add("debugImplementation", libs.findLibrary("compose-ui-test-manifest").get())
            }
        }
    }
}