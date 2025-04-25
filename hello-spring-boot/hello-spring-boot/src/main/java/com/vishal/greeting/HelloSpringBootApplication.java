package com.vishal.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		// Print a message before the application starts
		System.out.println("Starting the Hello Spring Boot application...");

		// Start the Spring Boot application
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

}
