package com.axioma.courserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CourserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourserServiceApplication.class, args);
	}

}
