package com.learning.spring.microservices;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope // This annotation will help change the configuration properties on the fly
public class SpringMicroservicesConfigClientApplication {

	@Value("${message}")
	private String message;
	
	@RequestMapping (value="/message")
	public String message () {
		return message;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesConfigClientApplication.class, args);
	}
}
