plugins {
    id("lithic.kotlin")
    id("lithic.publish")
}

dependencies {
    api(project(":lithic-kotlin-client-okhttp"))
}
