allprojects {
    version = "1.0.0"
}

subprojects {
    apply(plugin = "jacoco")
    apply(plugin = "java")

    tasks {
        named<JacocoReport>("jacocoTestReport") {
            reports {
                xml.required.set(true)
                csv.required.set(true)
            }
        }

        named("test") {
            finalizedBy("jacocoTestReport")
        }
    }
}
