package com.lcwd.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		System.out.println("Started.......");
		SpringApplication.run(TodoApplication.class, args);
	}

}
