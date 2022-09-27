plugins {
    id("com.android.library")
    id("module-configurator")
}

dependencies {

    implementation(projects.core.di.library)
    implementation(projects.core.navigation.androidLibrary)
    implementation(projects.core.utils.resourceProvider.androidLibrary)

    implementation(libs.androidx.appcompat)

}