[![License](https://img.shields.io/badge/License-BSD_3--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)

[![Maven Central](https://img.shields.io/maven-central/v/org.eclipse.jgit/org.eclipse.jgit.svg?label=Maven%20Central)](https://search.maven.org/artifact/org.eclipse.jgit/org.eclipse.jgit)
[![javadoc](https://javadoc.io/badge2/org.eclipse.jgit/org.eclipse.jgit/javadoc.svg)](https://javadoc.io/doc/org.eclipse.jgit/org.eclipse.jgit)
[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://adoptium.net/temurin/releases?version=17&os=any&arch=any)

[![Issues](https://img.shields.io/github/issues-raw/eclipse-jgit/jgit.svg?maxAge=25000)](https://github.com/eclipse-jgit/jgit/issues)
[![Discussions](https://img.shields.io/github/discussions/eclipse-jgit/jgit.svg?maxAge=25000)](https://github.com/eclipse-jgit/jgit/discussions)

[![Contributors](https://img.shields.io/github/contributors/eclipse-jgit/jgit.svg?style=flat)]()
[![Last commit](https://img.shields.io/github/last-commit/eclipse-jgit/jgit.svg?style=flat)]()
[![Commit activity the past week, 4 weeks](https://img.shields.io/github/commit-activity/y/eclipse-jgit/jgit.svg?style=flat)]()
[![Commits since](https://img.shields.io/github/commits-since/eclipse-jgit/jgit/v7.4.0.202509020913-r.svg)]()
[Git website](http://git-scm.com/).



## build.gradle.kts code
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = ""
    compileSdk = 37

    defaultConfig {
        applicationId = ""
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("org.eclipse.jgit:org.eclipse.jgit:7.4.0.202509020913-r")
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
}


## build.gradle.kts (clean)
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = ""
    compileSdk = 37

    defaultConfig {
        applicationId = ""
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation("org.eclipse.jgit:org.eclipse.jgit:7.4.0.202509020913-r")
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
}

this src code build.gradle.kts
this open src code
