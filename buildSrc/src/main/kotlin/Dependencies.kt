object Dependencies {
    val COMPOSE = listOf(
        "androidx.compose.ui:ui:${Versions.COMPOSE}",
        "androidx.compose.material:material:${Versions.COMPOSE}",
        "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}",
        "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}",
        "androidx.compose.animation:animation:${Versions.COMPOSE}",
        "androidx.compose.compiler:compiler:${Versions.COMPOSE}",
        "androidx.compose.foundation:foundation:${Versions.COMPOSE}",
        "androidx.compose.runtime:runtime-livedata:${Versions.COMPOSE}",
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.COMPOSE_LIFECYCLE}",
        "androidx.navigation:navigation-compose:${Versions.COMPOSE_NAVIGATION}",
        "androidx.hilt:hilt-navigation-compose:${Versions.COMPOSE_HILT_NAVIGATION}",
        "androidx.constraintlayout:constraintlayout-compose:${Versions.COMPOSE_CONSTRAINT}"
    )
    const val ANDROIDX_CORE = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
    const val HILT = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${Versions.HILT}"
    const val HILT_ANDROID_COMPILER = "androidx.hilt:hilt-compiler:${Versions.ANDROID_HILT}"
    const val HILT_PLUGIN = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    val OKHTTP = listOf(
        "com.squareup.okhttp3:okhttp",
        "com.squareup.okhttp3:logging-interceptor"
    )
    const val OKHTTP_BOM = "com.squareup.okhttp3:okhttp-bom:${Versions.OKHTTP}"
    const val COIL = "io.coil-kt:coil-compose:${Versions.COIL}"

    const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT}"
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
}