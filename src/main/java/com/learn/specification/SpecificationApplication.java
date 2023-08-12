package com.learn.specification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learn.*"})
public class SpecificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpecificationApplication.class, args);
	}

}
