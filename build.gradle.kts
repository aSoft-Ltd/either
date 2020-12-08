plugins {
    id("com.android.library") version vers.agp
    kotlin("multiplatform") version vers.kotlin
    kotlin("plugin.serialization") version vers.kotlin
    id("tz.co.asoft.library") version vers.asoft.builders
    id("io.codearte.nexus-staging") version vers.nexus_staging
    signing
}

kotlin {
    universalLib()
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("org.jetbrains.kotlinx:kotlinx-serialization-json:${vers.kotlinx.serialization}")
            }
        }

        val commonTest by getting {
            dependencies {
                api(asoft("test", vers.asoft.test))
            }
        }
    }
}

aSoftLibrary(
    version = vers.asoft.either,
    description = "An Either<L,R> multiplatform serializable datatype"
)