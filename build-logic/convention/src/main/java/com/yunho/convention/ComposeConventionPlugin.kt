package com.yunho.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class ComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            pluginManager.apply {
                plugins.apply("kotlin-android")
                plugins.apply("kotlin-kapt")
                plugins.apply("org.jetbrains.kotlin.android")
            }

            configureAndroidCompose(extensions.getByType<ApplicationExtension>())

            dependencies {
                add("implementation", libs.findLibrary("activity-compose").get())
                add("implementation", libs.findLibrary("compose-bom").get())
                add("implementation", libs.findLibrary("compose-ui").get())
                add("implementation", libs.findLibrary("compose-ui-graphics").get())
                add("implementation", libs.findLibrary("compose-ui-tooling-preview").get())
                add("implementation", libs.findLibrary("material3").get())
                add("implementation", libs.findLibrary("hilt-navigation-compose").get())
                add("implementation", libs.findLibrary("kotlin-bom").get())
                add("implementation", libs.findLibrary("core-ktx").get())
                add("implementation", libs.findLibrary("lifecycle-runtime-ktx").get())
                add("implementation", libs.findLibrary("lifecycle-viewmodel-ktx").get())

                add("testImplementation", libs.findLibrary("junit").get())

                add("androidTestImplementation", libs.findLibrary("androidx-junit").get())
                add("androidTestImplementation", libs.findLibrary("espresso-core").get())
                add("androidTestImplementation", libs.findLibrary("compose-ui-test-junit4").get())

                add("debugImplementation", libs.findLibrary("compose-ui-tooling").get())
                add("debugImplementation", libs.findLibrary("compose-ui-test-manifest").get())
            }
        }
    }
    private fun Project.configureAndroidCompose(
        commonExtension: CommonExtension<*, *, *, *, *>,
    ) {
        commonExtension.apply {
            buildFeatures {
                compose = true
            }

            composeOptions {
                kotlinCompilerExtensionVersion = libs.findVersion("composeUi").get().toString()
            }
        }
    }
}