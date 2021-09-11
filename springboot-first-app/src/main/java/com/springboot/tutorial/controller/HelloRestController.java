package com.springboot.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@RequestMapping("/helloRest")
	public String sayHello() {
		return "Hello from Rest Controller, Rishab!";
	}
}
