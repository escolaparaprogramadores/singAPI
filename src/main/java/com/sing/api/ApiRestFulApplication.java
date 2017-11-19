package com.sing.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.sing.api.config.property.SingApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(SingApiProperty.class)
public class ApiRestFulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestFulApplication.class, args);
	}
}
