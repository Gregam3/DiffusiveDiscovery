package dev.gregmitten

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DiffusiveDiscoveryApplication

fun main(args: Array<String>) {
    runApplication<DiffusiveDiscoveryApplication>(*args)
}
