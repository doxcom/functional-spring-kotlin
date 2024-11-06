package com.example.functional.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class Application{

	fun process(s: String, callback: (String) -> Number){
		println(callback.invoke("hello"))
	}

	init{
       this.process("a") { 42 }
	}
}

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}


