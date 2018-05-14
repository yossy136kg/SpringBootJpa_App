package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaAppApplication {

	public static void main(String[] args) {
		final Logger logger = LoggerFactory.getLogger(SpringBootJpaAppApplication.class);
		logger.info("START");
		SpringApplication.run(SpringBootJpaAppApplication.class, args);
		logger.info("END");
	}
}
