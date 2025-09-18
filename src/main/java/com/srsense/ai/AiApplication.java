package com.srsense.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.srsense.ai.repository")
public class AiApplication {
	public static void main(String[] args) {
		SpringApplication.run(AiApplication.class, args);
	}

}
