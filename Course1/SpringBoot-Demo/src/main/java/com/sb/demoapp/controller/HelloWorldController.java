package com.sb.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String getMessage() {
		return "Welcome to Spring Boot !!!";
	}
}
