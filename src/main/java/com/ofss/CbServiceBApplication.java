package com.ofss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CbServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbServiceBApplication.class, args);
		System.out.println("Service B is up and running");
	}
	
	
}
