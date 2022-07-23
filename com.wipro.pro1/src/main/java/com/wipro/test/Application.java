package com.wipro.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class Application {

	@GetMapping("/")
	public String test() {
		return "Hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
