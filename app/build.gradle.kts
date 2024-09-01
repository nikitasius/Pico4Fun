plugins {
  id("com.android.application")
}

android {
  namespace = "com.evildayz.code.pico4fun"
  compileSdk = 34

  defaultConfig {
    applicationId = "com.evildayz.code.pico4fun"
    minSdk = 29
    targetSdk = 34
    versionCode = 1001
    versionName = "1.0.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  signingConfigs {
    create("release") {
      storeFile = file("../fuckthesystem.jks")
      storePassword = "fuckthesystem"
      keyAlias = "fuckthesystem"
      keyPassword = "fuckthesystem"
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      signingConfig = signingConfigs.get("release")
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
}

dependencies {
  implementation("androidx.appcompat:appcompat:1.7.0")
  implementation("com.google.android.material:material:1.12.0")
  implementation("androidx.constraintlayout:constraintlayout:2.1.4")
  androidTestImplementation("androidx.test.ext:junit:1.2.1")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
}
