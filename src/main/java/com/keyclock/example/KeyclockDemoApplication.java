package com.keyclock.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.keyclock.example")
public class KeyclockDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeyclockDemoApplication.class, args);
	}

}
