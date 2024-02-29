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
    }
}

