plugins {
    id("com.android.library")
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    universalLib()
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":either-core"))
                api(asoft("expect-core", vers.asoft.expect))
            }
        }
    }
}

aSoftOSSLibrary(
    version = vers.asoft.either,
    description = "An multiplatform extension for asserting Either<L,R> datatypes"
)