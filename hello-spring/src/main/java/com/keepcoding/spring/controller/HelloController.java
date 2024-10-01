package com.keepcoding.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hola")
	public String hello() {
		return "Que chimba esto de Spring";
	}
}
