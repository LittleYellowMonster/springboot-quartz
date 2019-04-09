package com.laiai.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
public class JobApplication {


	public static void main(String[] args) {
		SpringApplication.run(JobApplication.class, args);
	}
}
