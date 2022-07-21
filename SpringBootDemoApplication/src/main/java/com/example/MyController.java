package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class MyController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Hello Geetha ok";
	}
}