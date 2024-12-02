package com.uriel.authserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class AuthserverdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthserverdemoApplication.class, args);
	}

}
