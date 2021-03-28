package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			int num1 = 10;
			int num2 = 20;
			int sum = num1 + num2;
			String sumText = String.valueOf(sum);
			log.info("ok");
			log.info(sumText);
			System.out.println("x");
		};
	}

}
