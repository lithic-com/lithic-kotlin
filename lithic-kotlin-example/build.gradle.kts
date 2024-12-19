plugins {
    id("lithic.kotlin")
    application
}

dependencies {
    implementation(project(":lithic-kotlin"))
}

application {
    mainClass = "com.lithic.api.example.MainKt"
}
