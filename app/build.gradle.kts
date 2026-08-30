plugins {
    id("com.android.application")
}

android {
    namespace = "com.daren.scraply"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.daren.scraply"
        minSdk = 24
        targetSdk = 35
        versionCode = 114
        versionName = "1.1.4"

        ndk {
            abiFilters.add("arm64-v8a")
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/java")
            res.srcDirs("src/main/res")
            assets.srcDirs("src/main/assets")
            jniLibs.srcDirs("src/main/jniLibs")
        }
    }

    packaging {
        jniLibs {
            useLegacyPackaging = true
        }
    }
}

tasks.withType<JavaCompile> {
    options.compilerArgs.addAll(listOf("-nowarn", "-Xmaxerrs", "500", "-Xmaxwarns", "0", "-g:none"))
    options.isFork = true
    options.forkOptions.jvmArgs = listOf("-Xmx6g", "-XX:+UseParallelGC")
}

dependencies {
    // Exact versions extracted from META-INF/*.version
    implementation("androidx.core:core:1.16.0")
    implementation("androidx.core:core-ktx:1.16.0")
    implementation("androidx.core:core-splashscreen:1.0.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.activity:activity:1.10.1")
    implementation("androidx.activity:activity-compose:1.10.1")
    
    // Jetpack Compose
    implementation("androidx.compose.ui:ui:1.9.0-alpha01")
    implementation("androidx.compose.runtime:runtime:1.9.0-alpha01")
    implementation("androidx.compose.foundation:foundation:1.8.3")
    implementation("androidx.compose.material3:material3:1.3.2")
    implementation("androidx.compose.animation:animation:1.8.3")
    
    // Lifecycle & Datastore & WorkManager & Room
    implementation("androidx.lifecycle:lifecycle-runtime:2.9.1")
    implementation("androidx.lifecycle:lifecycle-common:2.9.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel:2.9.1")
    implementation("androidx.datastore:datastore-preferences:1.0.0")
    implementation("androidx.work:work-runtime:2.9.1")
    implementation("androidx.room:room-runtime:2.8.4")
    
    // AndroidX Ink
    implementation("androidx.ink:ink-authoring:1.1.0-alpha05")
    implementation("androidx.ink:ink-rendering:1.1.0-alpha05")
    implementation("androidx.ink:ink-geometry:1.1.0-alpha05")
    implementation("androidx.ink:ink-brush:1.1.0-alpha05")
    implementation("androidx.ink:ink-strokes:1.1.0-alpha05")
    implementation("androidx.ink:ink-storage:1.1.0-alpha05")
    
    // Privacy Sandbox
    implementation("androidx.privacysandbox.ads:ads-adservices-java:1.0.0-beta05")
    implementation("androidx.privacysandbox.ads:ads-adservices:1.0.0-beta05")

    // Kotlin & Coroutines
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.9.0")
    
    // Filament Android (Material v53 / release 1.53.4)
    implementation("com.google.android.filament:filament-android:1.53.4")
    implementation("com.google.android.filament:filament-utils-android:1.53.4")
    implementation("com.google.android.filament:gltfio-android:1.53.4")
    
    // ML Kit Digital Ink Recognition
    implementation("com.google.mlkit:digital-ink-recognition:18.1.0")
    
    // Facebook Audience Network SDK
    implementation("com.facebook.android:audience-network-sdk:6.18.0")
    
    // OkHttp & Okio
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okio:okio:3.9.0")
}
