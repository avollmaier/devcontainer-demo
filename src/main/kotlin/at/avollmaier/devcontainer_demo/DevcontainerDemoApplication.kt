package at.avollmaier.devcontainer_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DevcontainerDemoApplication

fun main(args: Array<String>) {
	runApplication<DevcontainerDemoApplication>(*args)
}
