package com.learning.First;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);

//		@Value("${server.DATABASE_URI}")
//		String database;


	}
	@GetMapping("/")
	public String hello() {

		return String.format("Hello World");
	}
}
