package br.com.foodcommander

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FoodCommanderApplication

fun main(args: Array<String>) {
	runApplication<FoodCommanderApplication>(*args)
}
