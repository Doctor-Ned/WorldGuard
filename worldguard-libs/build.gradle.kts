tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

tasks.register("build") {
    dependsOn(subprojects.map { it.tasks.named("build") })
}