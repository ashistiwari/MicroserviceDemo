package com.example.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Departmentservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Departmentservice2Application.class, args);
	}

}
