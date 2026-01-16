plugins {
    id("lithic.kotlin")
    application
}

dependencies {
    implementation(project(":lithic-kotlin-core"))
    implementation(project(":lithic-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :lithic-kotlin-example:run` to run `Main`
    // Use `./gradlew :lithic-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.lithic.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
