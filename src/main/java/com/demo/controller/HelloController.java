package com.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String sayHelloFromGet() {
		return "Hello from GET using Spring's REST Controller with Spring Boot";
	}
	
	@GetMapping("/{name}")
	public String sayHelloFromGet(@PathVariable String name) {
		return "Hello "+name+"! from GET using Spring's REST Controller with Spring Boot";
	}
	
	@PostMapping("/")
	public String sayHelloFromPost() {
		return "Hello from Post using Spring's REST Controller with Spring Boot";
	}
	
	@PutMapping("/")
	public String sayHelloFromPut() {
		return "Hello from Put using Spring's REST Controller with Spring Boot";
	}
	
	@DeleteMapping("/")
	public String sayHelloFromDelete() {
		return "Hello from Delete using Spring's REST Controller with Spring Boot";
	}
}
