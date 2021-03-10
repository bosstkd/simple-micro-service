package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class StudiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudiesApplication.class, args);
	}



}
