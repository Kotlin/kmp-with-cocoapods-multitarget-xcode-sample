plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
}

group = "org.jetbrains.kotlin.sample.native"
version = "1.0"

kotlin {
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosX64()
    macosArm64()
    tvosX64()
    tvosArm64()
    tvosSimulatorArm64()
    watchosX64()
    watchosArm64()
    watchosSimulatorArm64()

    cocoapods {
        summary = "Kotlin CocoaPods library"
        homepage = "https://github.com/Kotlin/multitarget-xcode-with-kotlin-cocoapods-sample"

        podfile = project.file("../severalTargetsXcodeProject/Podfile")

        ios.deploymentTarget = "13.5"
        osx.deploymentTarget = "10.15"
        tvos.deploymentTarget = "13.4"
        watchos.deploymentTarget = "6.2"

        framework {
            isStatic = true
        }
    }
}
