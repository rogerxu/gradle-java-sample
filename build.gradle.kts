allprojects {
    version = "1.0.0"
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "jacoco")

    val jacocoTestReport by tasks.existing(JacocoReport::class) {
        reports {
            xml.required.set(true)
            csv.required.set(true)
        }
    }

    val test by tasks.existing {
        finalizedBy(jacocoTestReport)
    }
}
