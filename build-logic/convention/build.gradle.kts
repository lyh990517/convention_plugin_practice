plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

gradlePlugin {
    plugins {
        register("compose") {
            id = "compose"
            implementationClass = "com.yunho.convention.ComposeConventionPlugin"
        }
        register("hilt") {
            id = "hilt"
            implementationClass = "com.yunho.convention.HiltConventionPlugin"
        }
        register("base") {
            id = "base"
            implementationClass = "com.yunho.convention.BaseAndroidPlugin"
        }
        register("coroutineTest"){
            id = "coroutineTest"
            implementationClass = "com.yunho.convention.CoroutineTestConventionPlugin"
        }
        register("composeTest"){
            id = "composeTest"
            implementationClass = "com.yunho.convention.ComposeTestConventionPlugin"
        }
        register("testTool"){
            id = "testTool"
            implementationClass = "com.yunho.convention.TestConventionPlugin"
        }
    }
}

