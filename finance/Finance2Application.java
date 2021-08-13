package com.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.finance")
public class Finance2Application {

	public static void main(String[] args) {
		SpringApplication.run(Finance2Application.class, args);
	}

}
