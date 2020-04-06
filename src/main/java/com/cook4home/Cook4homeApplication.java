package com.cook4home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class Cook4homeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cook4homeApplication.class, args);
	}

}
