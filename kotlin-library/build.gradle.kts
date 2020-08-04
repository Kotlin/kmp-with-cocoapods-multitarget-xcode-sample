plugins {
    id("org.jetbrains.kotlin.multiplatform").version("1.4.0-rc")
    id("org.jetbrains.kotlin.native.cocoapods").version("1.4.0-rc")
}

group = "com.example"
version = "1.0"

repositories {
    mavenLocal()
    jcenter()
    maven { setUrl("https://dl.bintray.com/kotlin/kotlinx.html/") }
}

group = "org.jetbrains.kotlin.sample.native"
version = "1.0"

kotlin {
    ios()
    macosX64()
    tvos()
    watchos()

    cocoapods {
        summary = "Kotlin CocoaPods library"
        homepage = "https://github.com/Kotlin/multitarget-xcode-with-kotlin-cocoapods-sample"

        podfile = project.file("../severalTargetsXcodeProject/Podfile")

        ios.deploymentTarget = "13.5"
        osx.deploymentTarget = "10.15"
        tvos.deploymentTarget = "13.4"
        watchos.deploymentTarget = "6.2"
    }
}
