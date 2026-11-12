package com.example.interview;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

	@GetMapping("/hello")
	public Greeting hello() {
		return new Greeting("Hello, world!");
	}

	public record Greeting(String message) {
	}
}
