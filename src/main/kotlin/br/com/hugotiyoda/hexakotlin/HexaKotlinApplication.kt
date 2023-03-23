package br.com.hugotiyoda.hexakotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["br.com.hugotiyoda.hexakotlin"])
class HexaKotlinApplication

fun main(args: Array<String>) {
	runApplication<HexaKotlinApplication>(*args)
}
